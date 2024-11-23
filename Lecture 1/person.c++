#include<iostream>
#include<string>
using namespace std;

class Person{

    int age;
    string name;
    int weight;
    float height;
public:
    Person(string name){
        this->name = name;
        cout << name << endl;
    }

    float BMI(int age, float height, int weight){
            return ((weight*weight)/height); 
        }

    ~Person(){
        cout << "Destructor" << endl;
    }

};

class Student: public Person{
    public:
    Student(string name) : Person(name) {}
    public:
        void print_marks(){
            cout << "Marks" << endl;
        }
};


int main(){

    Person p1("Abhinav");
    cout << p1.BMI(19, 45.2, 78) << endl;

    Person p2("Abhi");

    Student s1("Student1");
    s1.print_marks();

    return 0;
}

