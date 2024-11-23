class Person
{
  int age;
  float weight;
  double height;
  double runFast()
  {
    return((age*weight)/height);
  } 
}
class PersonManager
{
	public static void main(String []args)
	{
	  Person kumar = new Person();
	         kumar.age=45;
	         kumar.weight=56.4f;
	         kumar.height=5.6;
	  double k_speed  = kumar.runFast();
	  System.out.println("Kumar speed "+k_speed);
	  Person kiran = new Person();
	         kiran.age=45;
	         kiran.weight=52.4f;
	         kiran.height=5.6;
	  double kr_speed  = kiran.runFast();
	  System.out.println("Kiran speed "+kr_speed);
	}
}       