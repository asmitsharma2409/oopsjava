import java.util.*;;

class Student{
    String Average(int m1,int m2,int m3){
        int avg = (m1+m2+m2+m3)/3;
        System.out.println(avg);
        if(avg>50){
            return "Pass";
        } else{
            return "Fail";
        }
    }
    String inputName(String name){
        return name;
    }
}

public class Details {
    public static void main(String[] args) {
        Student r = new Student();
        System.out.println(r.inputName("Raheel") + " is " + r.Average(1ls0,40,40));
    }   
}
