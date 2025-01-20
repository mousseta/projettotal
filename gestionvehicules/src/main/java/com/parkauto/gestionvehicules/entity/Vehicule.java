package com.parkauto.gestionvehicules.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "VEHICULE")
public class Vehicule {
    @Id
    @Column(name = "IDVEHICULE")
    private Long idvehicule;

    @Column(name = "ANNEEMODEL")
    private Integer anneeModel;

    @Column(name = "PRIX")
    private Double prix;

    @Column(name = "IMAGE_VEHICULE")
    private String imageVehicule;

	
	public Vehicule() {
		super();
	}
	

	public Vehicule(Long idvehicule, int anneeModel, double prix) {
		super();
		this.idvehicule = idvehicule;
		this.anneeModel = anneeModel;
		this.prix = prix;
	}


	public Vehicule(Long idvehicule, int anneeModel, double prix, String imageVehicule) {
		super();
		this.idvehicule = idvehicule;
		this.anneeModel = anneeModel;
		this.prix = prix;
		this.imageVehicule = imageVehicule;
	}


	public Long getMatricule() {
		return idvehicule;
	}

	public void setMatricule(Long idvehicule) {
		this.idvehicule = idvehicule;
	}

	public int getAnneeModel() {
		return anneeModel;
	}

	public void setAnneeModel(int anneeModel) {
		this.anneeModel = anneeModel;
	}

	public String getImageVehicule() {
		return imageVehicule;
	}


	public void setImageVehicule(String imageVehicule) {
		this.imageVehicule = imageVehicule;
	}


	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}


	@Override
	public String toString() {
		return "Vehicule [matricule=" + idvehicule + ", anneeModel=" + anneeModel + ", prix=" + prix + "]";
	}
	
	public String demarrer() {
		return "Broouummmm!!";
	}
	
	public String accelerer() {
		return "Vrouummmmm!!!";
	}

}
