package com.gsv.basic;

class Demo1
{
	int i=10;
	static int j=100;
	static void display()  //Static
	{
		System.out.println("Static Demo1");
		System.out.println("Static j"+j); //Static
		
	}
	void info()  //Non static 
	{
		System.out.println("Static Demo1");
		System.out.println("Static j"+j);
		System.out.println("Non Static i"+i);
		
	}
}
public class StaticDemo 
{
	public static void main(String[] args) 
	{
	   Demo1.display();	 //Class name
	   //Demo1.info();
	   Demo1  d1  = new Demo1();
	   d1.display();//Compiler convert : Demo1.display()
	   d1.info();
	   
	   
	}
}
