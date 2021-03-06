package com.pattern;

public class Book {
   private String name;
   private int id;
   
public Book(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}

public Book() {
	
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

@Override
public String toString() {
	return "Book [name=" + name + ", id=" + id + "]";
}
}
