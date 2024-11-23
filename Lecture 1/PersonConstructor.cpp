#include<iostream>
using namespace std;
class Person  //Class
{	int age;// Attribute
	float weight;
	float height;
	public:
	float runSpeed()  //Function
	{
		return((age*height)/weight);
	}
	Person(int age,float weight, float height)  //Constructor
	{
	  this->age =age;  //kumar.age = age  //kiran.age = age
	  this->weight =weight;
	  this->height =height;
	}

};
int main()  //Main method 
{
	Person kumar(25,58.4,5.4); //Obect creation
	float k_speed  = kumar.runSpeed(); //Function access
	cout<<"Kumar Speed ="<<k_speed<<endl;
	Person kiran(22,78.4,5.9);
	float ki_speed  = kiran.runSpeed();
	cout<<"Kiran Speed ="<<ki_speed;
	
	
}
