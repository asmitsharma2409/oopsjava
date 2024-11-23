package com.gsv.pack1;

public class A
{
	private int i;
		    int j=11;
    protected int k=12;
    public int l=13;
    
	
	void test()
	{
		System.out.println(" i "+i);
	}
	public int setI()
	{
		return i;
	}
	public void getI(int i)
	{
		this.i = i;
	}
}
class B extends A
{
	void info()
	{
		//System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
	
}
/*
class A
{
  public static void main(String[] args) 
  {
	A a = new A();
	
	a.setI();
	a.getI(10);
	a.test();
	B b  =new B();
	b.info();
	MangerB mb  = new MangerB();
	System.out.println(mb.j);
	System.out.println(mb.k);
	//System.out.println(a.i);
  }
}
*/