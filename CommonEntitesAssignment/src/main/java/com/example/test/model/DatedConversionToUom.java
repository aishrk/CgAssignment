package com.example.test.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Entity
@Table(name="DCTU")

public class DatedConversionToUom implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uomTypeId;
	
	private String abbrevation;

	public DatedConversionToUom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DatedConversionToUom(int uomTypeId, String abbrevation) {
		super();
		this.uomTypeId = uomTypeId;
		this.abbrevation = abbrevation;
	}

	public int getUomTypeId() {
		return uomTypeId;
	}

	public void setUomTypeId(int uomTypeId) {
		this.uomTypeId = uomTypeId;
	}

	public String getAbbrevation() {
		return abbrevation;
	}

	public void setAbbrevation(String abbrevation) {
		this.abbrevation = abbrevation;
	}

	@Override
	public String toString() {
		return "DatedConversionToUom [uomTypeId=" + uomTypeId + ", abbrevation=" + abbrevation + "]";
	}

	
}
