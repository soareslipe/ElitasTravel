package com.grouptheamigos.elitas.enitities.dto;

import java.io.Serializable;

import com.grouptheamigos.elitas.enitities.Plane;

public class PlaneDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String description;
	private String imgUrl;
	private Double price;

	public PlaneDTO() {
	}

	public PlaneDTO(Long id, String name, String description, String imgUrl, Double price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.imgUrl = imgUrl;
		this.price = price;
	}
	
	public PlaneDTO(Plane entity) {
		id = entity.getId();
		name = entity.getName();
		description = entity.getDescription();
		imgUrl = entity.getImgUrl();
		price = entity.getPrice();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
