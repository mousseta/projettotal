package com.parkauto.locationvehicules.dto;

public class ClientDTO {
    private Long idClient;
    private String nom;
    private String prenom;
    private String email;

    // Constructeurs
    public ClientDTO() {
    }

    public ClientDTO(Long idClient, String nom, String prenom, String email) {
        this.idClient = idClient;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    // Getters et Setters
    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
