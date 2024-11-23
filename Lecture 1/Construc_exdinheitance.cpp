#include<iostream>
using namespace std;
class A
{  
  public:
  	void show()  //A
  	{
  	  cout<<"A show"<<endl;	
	}
	A()
	   {
	   	cout<<"\n constructor A class";
	   }
	   ~A()
	   {
	   	cout<<"\n Destructor A";
	   }
	
};
class B : public A
{
	public:
	   B():A()
	   {
	   	cout<<"\n constructor B class";
	   }
	  void display()  //2 : 1 Super + 1 Sub
	  {
	  	cout<<"\n Display"<<endl;
	  }
	  ~B()
	   {
	   	cout<<"\n Destructor B";
	   }
};
int main()
{
	 //A aobj;
	 //aobj.show();
	 //aobj.display();
	 B bobj;
	 bobj.show();
	 bobj.display();
}

