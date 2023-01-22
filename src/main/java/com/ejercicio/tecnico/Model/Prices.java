package com.ejercicio.tecnico.Model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRICES")
public class Prices implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2960523013940437188L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/**foreign key de la cadena del grupo (1 = ZARA)*/
	@Column(name="BRAND_ID")
	private Integer brandId;
	
	/**rango de fechas en el que aplica el precio tarifa indicado*/
	@Column(name="START_DATE")
	private LocalDateTime startDate;
	
	/**rango de fechas en el que aplica el precio tarifa indicado*/
	@Column(name="END_DATE")
	private LocalDateTime endDate;
	
	/**Identificador de la tarifa de precios aplicable*/
	@Column(name="PRICE_LIST")
	private Integer priceList;
	
	/**Identificador código de producto*/
	@Column(name="PRODUCT_ID")
	private Integer productId;
	
	/**Desambiguador de aplicación de precios. Si dos tarifas coinciden en un rago de fechas se aplica la de mayor prioridad (mayor valor numérico)*/
	@Column(name="PRIORITY")
	private Integer priority;
	
	/**precio final de venta*/
	@Column(name="PRICE")
	private Double price;
	
	/**iso de la moneda*/
	@Column(name="CURR")
	private String curr;
	
	

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public Integer getPriceList() {
		return priceList;
	}

	public void setPriceList(Integer priceList) {
		this.priceList = priceList;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Prices [brandId=");
		builder.append(brandId);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", endDate=");
		builder.append(endDate);
		builder.append(", priceList=");
		builder.append(priceList);
		builder.append(", productId=");
		builder.append(productId);
		builder.append(", priority=");
		builder.append(priority);
		builder.append(", price=");
		builder.append(price);
		builder.append(", curr=");
		builder.append(curr);
		builder.append("]");
		return builder.toString();
	}
	
	

}
