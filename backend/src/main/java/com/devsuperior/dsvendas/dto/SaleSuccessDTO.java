package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String sellerNames;
	private Long visited;
	private Long deals;
	
	public SaleSuccessDTO() {
		
	}

	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		setSellerNames(seller.getName());
		this.visited = visited;
		this.deals = deals;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

	public String getSellerNames() {
		return sellerNames;
	}

	public void setSellerNames(String sellerNames) {
		this.sellerNames = sellerNames;
	}

	
	
	

}
