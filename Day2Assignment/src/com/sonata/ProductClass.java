package com.sonata;

public class ProductClass {
	int proID;
	String proName;
	double proPrice;
	
	ProductClass(){}
	
	ProductClass(int id,String name,int price){
		this.proID = id;
		this.proName=name;
		this.proPrice=price;
		
		}
	 public double totalPrice(double gst)
	 {
		 proPrice=proPrice+gst;
		 return proPrice;
	 }
	
	public void display()
	{
		System.out.println(proID);
		System.out.println(proName);
		System.out.println(proPrice);
	}
public static void main(String args[])
{
	ProductClass p1 = new ProductClass();
	p1.proID = 01;
	p1.proName = "lotion";
	p1.proPrice = 660;
	p1.display();
	System.out.println(p1.totalPrice(32.40));
	
	ProductClass p2= new ProductClass(02,"soaps",290);
	p2.display();
	System.out.println(p2.totalPrice(88.005));
	
}
}

