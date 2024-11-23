#include<iostream>
using namespace std;
class A
{  
  public:
  	A()   //Constructor Overloading
  	{
  		cout<<"Default constructor"<<endl;
	}
	A(int a)
	{
		cout<<"Parameterized Con"<<a;
	}
	A(float ab)
	{
		cout<<"Parameterized Con"<<ab<<endl;
	}
	A(A &aobj)
	{
		cout<<"Copy constructror"<<endl;
	}
	~A()
	{
		cout<<"Destructor"<<endl;
	}
};
int main()
{
	A aobj;
	A aobj1(52);
	A aobj2(52.4f);
	A aobj3(aobj1);
}

