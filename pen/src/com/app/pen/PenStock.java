package com.app.pen;

import java.time.LocalDate;



public class PenStock {
	 private static int idCounter = 1;
	private int id;
    private Brand brand;
    private String color;
    private String inkColor;
    private String material;
    private int stock;
    private LocalDate stockUpdateDate;
    private LocalDate stockListingDate;
    private double price;
    private double discount;
    
    
	public PenStock(Brand brand, String color, String inkColor, String material, int stock,
			LocalDate stockUpdateDate, LocalDate stockListingDate, double price, double discount) {
		super();
		
		this.brand = brand;
		this.color = color;
		this.inkColor = inkColor;
		this.material = material;
		this.stock = stock;
		this.stockUpdateDate = stockUpdateDate;
		this.stockListingDate = stockListingDate;
		this.price = price;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "PenStock [id=" + id + ", brand=" + brand + ", color=" + color + ", inkColor=" + inkColor + ", material="
				+ material + ", stock=" + stock + ", stockUpdateDate=" + stockUpdateDate + ", stockListingDate="
				+ stockListingDate + ", price=" + price + ", discount=" + discount + "]";
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
public String getInkColor() {
		return inkColor;
	}


	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}


	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

public int getStock() {
		return stock;
	}


	public PenStock(int id) {
	super();
	this.id = id;
}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}
	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}

	public LocalDate getStockListingDate() {
		return stockListingDate;
	}


	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}

	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}
@Override
public boolean equals(Object o) {
	System.out.println("in pen's equals");
	if(o instanceof PenStock ) {
		return this.id==((PenStock)o).id;
	}
	return false;
}

	
}
