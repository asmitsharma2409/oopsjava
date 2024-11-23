#include<iostream>
using namespace std;
class A
{  
  public:
  	A()   //Constructor Overloading
  	{
  		cout<<"Default constructor"<<endl;
	}
	
	~A()
	{
		cout<<"Destructor"<<endl;
	}
	public:
		void show()
		{
		  cout<<"Problem of RTM";
		}
};
int main()
{
	A *aobj = new A;  // Dynaminc Memory allocation
	aobj->show();
	delete aobj;
	
}

