#include<iostream>
using namespace std;
class A
{  
int i=10;
  static int count;
  public:
  	static void show()  //A
  	{
  	  cout<<"A show"<<count<<endl;	
  	  //cout<<i;
	}
	void show1()
	{
		cout<<"A show"<<count<<endl;	
  	    cout<<i;
	}
};
int A::count=10;
int main()
{
   A::show();	
}
