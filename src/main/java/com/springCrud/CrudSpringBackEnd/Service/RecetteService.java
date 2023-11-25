package com.springCrud.CrudSpringBackEnd.Service;

import com.springCrud.CrudSpringBackEnd.Model.Recette;
import com.springCrud.CrudSpringBackEnd.Model.User;
import com.springCrud.CrudSpringBackEnd.Repositories.RecetteRepository;
import com.springCrud.CrudSpringBackEnd.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service

public class RecetteService {

    @Autowired
    private RecetteRepository recetteRepository;
    @Autowired
    private UserRepository userRepository;
    public Recette ajouterRecette(Recette recette, long user_id)
    {
        User user = userRepository.findById(user_id).orElseThrow();
        recette.setUser(user);
        return recetteRepository.save(recette);
    }
    public ResponseEntity<String> DeleteRecette(long id)
    {
        if(recetteRepository.findRecetteById(id).isPresent()){
            recetteRepository.deleteById(id);
            return ResponseEntity.ok("Recette has been deleted");
        }else{
            return ResponseEntity.ok("No Recette found with the id : "+id);
         }
    }
    public Recette Update(Recette recette, long id)
    {

        Recette recette1 = recetteRepository.findById(id).orElseThrow();
        recette1.setNom(recette.getNom());
        recette1.setDuree(recette.getDuree());
        recette1.setEtapes(recette.getEtapes());
        recette1.setPhoto(recette.getPhoto());
        recette1.setIngredients(recette.getIngredients());
        return recetteRepository.save(recette1);
    }
}
