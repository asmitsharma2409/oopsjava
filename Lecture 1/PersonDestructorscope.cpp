#include<iostream>
using namespace std;
class Person
{

	int age;
	float weight;
	float height;
	public:
	float runSpeed(); //Declaration/Prototype

	Person(int age,float weight, float height);

	~Person();
	

};
float Person:: runSpeed()
{
		return((age*height)/weight);
}
Person :: Person(int age,float weight, float height)
{
	  this->age =age;  //kumar.age = age  //kiran.age = age
	  this->weight =weight;
	  this->height =height;
}
Person ::~Person()
{
	   cout<<"Destructor"<<endl;	
}

int main()
{
	Person kumar(25,58.4,5.4);
	float k_speed  = kumar.runSpeed();
	cout<<"Kumar Speed ="<<k_speed<<endl;
	Person kiran(22,78.4,5.9);
	float ki_speed  = kiran.runSpeed();
	cout<<"Kiran Speed ="<<ki_speed;
}
