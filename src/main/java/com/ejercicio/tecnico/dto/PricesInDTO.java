package com.ejercicio.tecnico.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;


public class PricesInDTO implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer brand;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape = JsonFormat.Shape.STRING )
	private LocalDateTime dateAplication;
	private Integer product;
	public Integer getBrand() {
		return brand;
	}
	public void setBrand(Integer brand) {
		this.brand = brand;
	}
	public LocalDateTime getDateAplication() {
		return dateAplication;
	}
	public void setDateAplication(LocalDateTime dateAplication) {
		this.dateAplication = dateAplication;
	}
	public Integer getProduct() {
		return product;
	}
	public void setProduct(Integer product) {
		this.product = product;
	}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(brand, dateAplication, product);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PricesInDTO other = (PricesInDTO) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(dateAplication, other.dateAplication)
				&& Objects.equals(product, other.product);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PricesInDTO [brand=");
		builder.append(brand);
		builder.append(", dateAplication=");
		builder.append(dateAplication);
		builder.append(", product=");
		builder.append(product);
		builder.append("]");
		return builder.toString();
	}

	
	
}
