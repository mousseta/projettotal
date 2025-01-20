package com.parkauto.ui.dto;

public class VehiculeDTO {
    private Long idvehicule;  // Correspond à `idvehicule` dans l'entité
    private Integer anneeModel;
    private Double prix;
    private String imageVehicule;

    // Getters et setters
    public Long getIdvehicule() {
        return idvehicule;
    }

    public void setIdvehicule(Long idvehicule) {
        this.idvehicule = idvehicule;
    }

    public Integer getAnneeModel() {
        return anneeModel;
    }

    public void setAnneeModel(Integer anneeModel) {
        this.anneeModel = anneeModel;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getImageVehicule() {
        return imageVehicule;
    }

    public void setImageVehicule(String imageVehicule) {
        this.imageVehicule = imageVehicule;
    }
}
