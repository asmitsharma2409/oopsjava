#include<iostream>
using namespace std;
class Person
{
	public:
	int age;
	float weight;
	float height;
	public:
	float runSpeed()
	{
		return((age*height)/weight);
	}

};
int main()
{
	Person kumar;
	kumar.age=25;
	kumar.weight=58.4;
	kumar.height=5.4;
	float k_speed  = kumar.runSpeed();
	cout<<"Kumar Speed ="<<k_speed;
	Person kiran;
	kiran.age=22;
	kiran.weight=78.4;
	kiran.height=5.9;
	float ki_speed  = kiran.runSpeed();
	cout<<"Kiran Speed ="<<ki_speed;
	
	
}
