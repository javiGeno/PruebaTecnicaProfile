package com.ejercicio.tecnico.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonFormat;

public class PricesOutDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2109194149184225067L;

	private Integer brandId;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape = JsonFormat.Shape.STRING )
	private LocalDateTime startDate;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape = JsonFormat.Shape.STRING )
	private LocalDateTime endDate;
	
	
	private Integer priceList;
	
	private Integer productId;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(brandId, endDate, priceList, productId, startDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PricesOutDTO other = (PricesOutDTO) obj;
		return Objects.equals(brandId, other.brandId) && Objects.equals(endDate, other.endDate)
				&& Objects.equals(priceList, other.priceList) && Objects.equals(productId, other.productId)
				&& Objects.equals(startDate, other.startDate);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PricesOutDTO [brandId=");
		builder.append(brandId);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", endDate=");
		builder.append(endDate);
		builder.append(", priceList=");
		builder.append(priceList);
		builder.append(", productId=");
		builder.append(productId);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
