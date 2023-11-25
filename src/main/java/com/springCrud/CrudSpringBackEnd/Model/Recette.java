package com.springCrud.CrudSpringBackEnd.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Recette")
public class Recette {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "Nom")
    private String Nom;
    @Column(name = "duree")
    private double duree;
    @Column(name="photo")
    private String photo;
    @Column(name="etapes", length = 2000)
    private String etapes;
    @Column(name="Ingredients", length = 2000)
    private String Ingredients;


    @ManyToOne
    @JoinTable(name= "recettes_User",
            joinColumns = @JoinColumn(name = "recette_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private User user;
}
