package com.example.demo.entities;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Produit {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idProduit;
private String nomProduit;
private Double prixProduit;
private LocalDate dateCreation;
@ManyToOne
private Categorie categorie;
public Produit() {
super();
}
public Produit(String nomProduit, Double prixProduit, LocalDate dateCreation) {
super();
this.nomProduit = nomProduit;
this.prixProduit = prixProduit;
this.dateCreation = dateCreation;
}

public Categorie getCategorie() {
return categorie;
}
public void setCategorie(Categorie categorie) {
this.categorie = categorie;
}
public Long getIdProduit() {
return idProduit;
}
public void setIdProduit(Long idProduit) {
this.idProduit = idProduit;
}
public String getNomProduit() {
return nomProduit;
}
public void setNomProduit(String nomProduit) {
this.nomProduit = nomProduit;
}
public Double getPrixProduit() {
return prixProduit;
}
public void setPrixProduit(Double prixProduit) {
this.prixProduit = prixProduit;
}
public LocalDate getDateCreation() {
return dateCreation;
}
public void setDateCreation(LocalDate  dateCreation) {
this.dateCreation = dateCreation;
}
@Override
public String toString() {
return "Produit [idProduit=" + idProduit + ", nomProduit=" +
nomProduit + ", prixProduit=" + prixProduit
+ ", dateCreation=" + dateCreation + "]";
}
}