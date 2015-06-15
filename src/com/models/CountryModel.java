package com.models;

public class CountryModel {

	private String id;
	private String country;
	private String isoCode2;
	private String isoCode3;
	private String addressFormat;
	private String postCodeRequired;
	private String status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIsoCode2() {
		return isoCode2;
	}

	public void setIsoCode2(String isoCode2) {
		this.isoCode2 = isoCode2;
	}

	public String getIsoCode3() {
		return isoCode3;
	}

	public void setIsoCode3(String isoCode1) {
		this.isoCode3 = isoCode1;
	}

	public String getAddressFormat() {
		return addressFormat;
	}

	public void setAddressFormat(String addressFormat) {
		this.addressFormat = addressFormat;
	}

	public String getPostCodeRequired() {
		return postCodeRequired;
	}

	public void setPostCodeRequired(String postCodeRequired) {
		this.postCodeRequired = postCodeRequired;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
