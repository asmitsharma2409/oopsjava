import java.util.Scanner;
public class MCQ {
    public static void generateReport(String answers[],String user[]){
        System.out.println("Q" + "     " + "SUBMITTED ANSWER" + "     " + "CORRECT ANS" + "     " + "RESULT");
        for(int i = 0;i<answers.length;i++){
            if(user[i].equals(answers[i])){
                System.out.println((i+1) + "     " + user[i] + "     " + answers[i] + "    CORRECT");
            } else if(user.equals(answers) == false && user.equals(" ") == true){
                System.out.println((i+1) + "     " + user[i] + "     " + answers[i] + "    UNANSWERED");
            } else{
                System.out.println((i+1) + "     " + user[i] + "     " + answers[i] + "    WRONG");
            } 
        }
    }
    public static void conductQuiz(String answers[]){
        Scanner sc = new Scanner(System.in);
        String user[] = new String[answers.length];
        for(int i=0;i<answers.length;i++){
            System.out.print((i+1) + ". ");
            user[i] = sc.nextLine();
        }
        int correct = 0;
        int unanswered = 0;
        int wrong = 0;
        for(int i  = 0;i<answers.length;i++){
            if(user[i].equals(answers[i])){
                correct++;
            } else if(user.equals(answers) == false && user.equals("\n") == true){
                unanswered++;
            } else{
                wrong++;
            }
        }
        generateReport(answers, user);
        System.out.println("Number of Corret Answers: " + correct);
        System.out.println("Number of Wrong Answers: " + wrong);
        System.out.println("Number of Unanswered Answers: " + unanswered);
    }
    public static void main(String[] args) {
        String answers[] = {"C","A","B","D","B","C","C","A"};   
        conductQuiz(answers);
    }
}
