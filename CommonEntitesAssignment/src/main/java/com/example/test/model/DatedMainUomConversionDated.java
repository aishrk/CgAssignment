package com.example.test.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "DMUCD")


public class DatedMainUomConversionDated implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mainId;

	private String description;

	public DatedMainUomConversionDated() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DatedMainUomConversionDated(int mainId, String description) {
		super();
		this.mainId = mainId;
		this.description = description;
	}

	public int getMainId() {
		return mainId;
	}

	public void setMainId(int mainId) {
		this.mainId = mainId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "DatedMainUomConversionDated [mainId=" + mainId + ", description=" + description + "]";
	}
	

}