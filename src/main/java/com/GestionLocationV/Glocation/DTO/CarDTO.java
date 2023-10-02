package com.GestionLocationV.Glocation.DTO;


import lombok.Data;

import java.util.Date;

@Data
public class CarDTO {


    private Integer id;


    private String marque;


    private Integer model;

    private Double tarifHiver;

    private Double tarifETE;

    private Date dateApplicationHiver;


    private Date dateApplicationEte;

    private String matricul;

    private Date dateCreation;

    private Date dateMaj;

    private Integer userMaj;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Integer getModel() {
		return model;
	}

	public void setModel(Integer model) {
		this.model = model;
	}

	public Double getTarifHiver() {
		return tarifHiver;
	}

	public void setTarifHiver(Double tarifHiver) {
		this.tarifHiver = tarifHiver;
	}

	public Double getTarifETE() {
		return tarifETE;
	}

	public void setTarifETE(Double tarifETE) {
		this.tarifETE = tarifETE;
	}

	public Date getDateApplicationHiver() {
		return dateApplicationHiver;
	}

	public void setDateApplicationHiver(Date dateApplicationHiver) {
		this.dateApplicationHiver = dateApplicationHiver;
	}

	public Date getDateApplicationEte() {
		return dateApplicationEte;
	}

	public void setDateApplicationEte(Date dateApplicationEte) {
		this.dateApplicationEte = dateApplicationEte;
	}

	public String getMatricul() {
		return matricul;
	}

	public void setMatricul(String matricul) {
		this.matricul = matricul;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateMaj() {
		return dateMaj;
	}

	public void setDateMaj(Date dateMaj) {
		this.dateMaj = dateMaj;
	}

	public Integer getUserMaj() {
		return userMaj;
	}

	public void setUserMaj(Integer userMaj) {
		this.userMaj = userMaj;
	}


}
