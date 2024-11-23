public class AgeNegativeException extends Exception {       //Compile time when extends with Exception and Run time when extends with RuntimeException 
    public AgeNegativeException(String msg){
        super(msg);
    }
}
