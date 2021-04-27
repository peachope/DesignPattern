package com.pattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
	 private String shopName;
	 List<Book> books = new ArrayList<>();
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	 public void loadData() {
		 for( int i=0; i<=5; i++) {
			 Book b = new Book();
			 b.setName("Book " + "0"+i);
			 b.setId(i);
			 getBooks().add(b);
		 }
	 }
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	 
	 
	
	 
	 
	 
}
