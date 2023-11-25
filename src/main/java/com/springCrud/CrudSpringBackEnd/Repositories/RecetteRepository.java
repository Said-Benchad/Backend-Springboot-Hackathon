package com.springCrud.CrudSpringBackEnd.Repositories;

import com.springCrud.CrudSpringBackEnd.Model.Recette;
import com.springCrud.CrudSpringBackEnd.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RecetteRepository extends JpaRepository<Recette,Long> {
    public Optional<Recette> findRecetteById(long id);

}
