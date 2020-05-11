package entities;

public class Product {
	
	private String nameProduct;
	private Double valueProduct;
	private Integer qtProduct;
	
	public Product(String nameProduct, Double valueProduct, Integer qtProduct) {
		this.nameProduct = nameProduct;
		this.valueProduct = valueProduct;
		this.qtProduct = qtProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public Double getValueProduct() {
		return valueProduct;
	}

	public void setValueProduct(Double valueProduct) {
		this.valueProduct = valueProduct;
	}

	public Integer getQtProduct() {
		return qtProduct;
	}

	public void setQtProduct(Integer qtProduct) {
		this.qtProduct = qtProduct;
	}
	
	public double totalProduct() {
		return valueProduct * qtProduct; 
	}
	
}
