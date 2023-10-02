package com.GestionLocationV.Glocation.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "voiture")
public class CarEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "MARQUE")
	private String marque;

	@Column(name = "MODEL")
	private Integer model;

	@Column(name = "TARIF_HIVER")
	private Double tarifHiver;

	@Column(name = "TARIF_ETE")
	private Double tarifETE;

	@Column(name = "DATE_APPLICATION_HIVER")
	private Date dateApplicationHiver;

	@Column(name = "DATE_APPLICATION_ETE")
	private Date dateApplicationEte;

	@Column(name = "MATRICUL")
	private String matricul;

	@Column(name = "DATE_CREATION")
	private Date dateCreation;

	@Column(name = "DATE_MAJ")
	private Date dateMaj;

	@Column(name = "USER_MAJ")
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
