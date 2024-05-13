package com.example.demo.entities;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Categorie {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idCat;
private String nomCat;
private String descriptionCat;
//l’annotation @JsonIgnore au-dessus de l’attribut produits, 
//permet d'éviter les références croisées (une boucle infinie lors de lasérialisation).
@JsonIgnore
@OneToMany(mappedBy = "categorie")
private List<Produit> produits;
}