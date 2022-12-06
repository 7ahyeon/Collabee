package com.spring.collabee.biz.cart;

public class CartVO{
	
	private int productNum, storageNum, categoryNum;
	private String thumSysFilename, productName;
	private int count, price, saleprice, stock, memberNum;
	
	public CartVO() {
	}

	public int getProductNum() {
		return productNum;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}

	public int getStorageNum() {
		return storageNum;
	}

	public void setStorageNum(int storageNum) {
		this.storageNum = storageNum;
	}

	public int getCategoryNum() {
		return categoryNum;
	}

	public void setCategoryNum(int categoryNum) {
		this.categoryNum = categoryNum;
	}

	public String getThumSysFilename() {
		return thumSysFilename;
	}

	public void setThumSysFilename(String thumSysFilename) {
		this.thumSysFilename = thumSysFilename;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSaleprice() {
		return saleprice;
	}

	public void setSaleprice(int saleprice) {
		this.saleprice = saleprice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}

	@Override
	public String toString() {
		return "CartVO [productNum=" + productNum + ", storageNum=" + storageNum + ", categoryNum=" + categoryNum
				+ ", thumSysFilename=" + thumSysFilename + ", productName=" + productName + ", count=" + count
				+ ", price=" + price + ", saleprice=" + saleprice + ", stock=" + stock + ", memberNum=" + memberNum
				+ "]";
	}

	
	
}
