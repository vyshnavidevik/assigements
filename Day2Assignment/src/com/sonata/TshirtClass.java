package com.sonata;

public class TshirtClass {
	String color;
	String material;
	String design;
	TshirtClass(String color,String material,String design)
	{
		this.color=color;
		this.material=material;
		this.design = design;
	
	}

	public String Size(String size)
	{
		return size;
	}
	public void display()
	{
		System.out.println("T-shirt color: "+color);
		System.out.println("T-shirt material: "+material);
		System.out.println("T-shirt design: "+design);
	}

	
	public static void main(String args[])
	{
		TshirtClass t1 = new TshirtClass("red","Cotton","Printed Pattern");
		t1.display();
		System.out.println("Available Sizes :"+t1.Size("smal")+","+ t1.Size("Lrg")+","+t1.Size("Xtra-Lrg"));
		TshirtClass t2 = new TshirtClass("blue","wool","dots");
		t2.display();
		System.out.println("Available Sizes :"+t2.Size("smal")+","+ t2.Size("Lrg")+","+t2.Size("Xtra-Lrg"));
		TshirtClass t3 = new TshirtClass("black","Polyster","umbrella");
		t3.display();
		System.out.println("Available Sizes :"+t3.Size("smal")+","+ t3.Size("Lrg")+","+t3.Size("Xtra-Lrg"));
    
		
		
	}

}
