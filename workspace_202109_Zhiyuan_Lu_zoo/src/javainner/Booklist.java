package javainner;

public class Booklist {
   

   private String name;
   private  String author;
   private double price;
   public Booklist(String name, String author,double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}
   public String toString() {
	   return("name: "+name+", author: "+author+" ,price: "+price);
	   
   }
   
}
