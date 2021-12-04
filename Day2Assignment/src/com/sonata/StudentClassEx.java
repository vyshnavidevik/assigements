package com.sonata;

public class StudentClassEx {
    int stuId;
	String stuName;
	String stuClass;
	
	StudentClassEx(){}
	StudentClassEx(int a,String n,String c)
	{
		this.stuId=a;
		this.stuName=n;
		this.stuClass=c;
	}
	
 public void display()
	{
		System.out.println(stuId);
		System.out.println(stuName);
		System.out.println(stuClass);
		
	}

public static void main(String args[])
{
	StudentClassEx s1 = new StudentClassEx();
	s1.stuId = 21228;
	s1.stuName="vyshu";
	s1.stuClass="training";
	s1.display();
 StudentClassEx s2 = new StudentClassEx(21268,"katta","etg training");
  s2.display();
}

}

