package com.example.test.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "UCD")

public class UomConversionDated implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uomID;

	@Column(name = "uomIdTo")
	private String uomIdTo;

	@Column(name = "fromDate")
	private Date fromDate;

	@Column(name = "conversationFactories")
	private String conversationFactories;

	@Column(name = "customeMethodId")
	private String customeMethodId;

	@Column(name = "decimalScale")
	private Long decimalScale;

	@Column(name = "roundingMode")
	private String roundingMode;

	@OneToMany(targetEntity = DatedMainUomConversionDated.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "uomid_fk", referencedColumnName = "uomID")
	private List<DatedMainUomConversionDated> dmucd;

	@OneToMany(targetEntity = DatedConversionToUom.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "uomto_fk", referencedColumnName = "uomIdTo")
	private List<DatedConversionToUom> dctu;

	public UomConversionDated() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUomID() {
		return uomID;
	}

	public void setUomID(int uomID) {
		this.uomID = uomID;
	}

	public String getUomIdTo() {
		return uomIdTo;
	}

	public void setUomIdTo(String uomIdTo) {
		this.uomIdTo = uomIdTo;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public String getConversationFactories() {
		return conversationFactories;
	}

	public void setConversationFactories(String conversationFactories) {
		this.conversationFactories = conversationFactories;
	}

	public String getCustomeMethodId() {
		return customeMethodId;
	}

	public void setCustomeMethodId(String customeMethodId) {
		this.customeMethodId = customeMethodId;
	}

	public Long getDecimalScale() {
		return decimalScale;
	}

	public void setDecimalScale(Long decimalScale) {
		this.decimalScale = decimalScale;
	}

	public String getRoundingMode() {
		return roundingMode;
	}

	public void setRoundingMode(String roundingMode) {
		this.roundingMode = roundingMode;
	}

	public List<DatedMainUomConversionDated> getDmucd() {
		return dmucd;
	}

	public void setDmucd(List<DatedMainUomConversionDated> dmucd) {
		this.dmucd = dmucd;
	}

	public List<DatedConversionToUom> getDctu() {
		return dctu;
	}

	public void setDctu(List<DatedConversionToUom> dctu) {
		this.dctu = dctu;
	}

	public UomConversionDated(int uomID, String uomIdTo, Date fromDate, String conversationFactories,
			String customeMethodId, Long decimalScale, String roundingMode, List<DatedMainUomConversionDated> dmucd,
			List<DatedConversionToUom> dctu) {
		super();
		this.uomID = uomID;
		this.uomIdTo = uomIdTo;
		this.fromDate = fromDate;
		this.conversationFactories = conversationFactories;
		this.customeMethodId = customeMethodId;
		this.decimalScale = decimalScale;
		this.roundingMode = roundingMode;
		this.dmucd = dmucd;
		this.dctu = dctu;
	}

	@Override
	public String toString() {
		return "UomConversionDated [uomID=" + uomID + ", uomIdTo=" + uomIdTo + ", fromDate=" + fromDate
				+ ", conversationFactories=" + conversationFactories + ", customeMethodId=" + customeMethodId
				+ ", decimalScale=" + decimalScale + ", roundingMode=" + roundingMode + ", dmucd=" + dmucd + ", dctu="
				+ dctu + "]";
	}

	


}
