import java.io.FileNotFoundException;
import java.io.IOException;

/*class A {
    void show() throws IOException{
        System.out.println("A IOEX");
    }
}

class B extends A{
    void show() throws FileNotFoundException{
        System.out.println("B I");
    }
}

public class OverridingException {
    
}*/

class A {
    void show() throws FileNotFoundException{
        System.out.println("A IOEX");
    }
}

class B extends A{
    void show() throws IOException{
        System.out.println("B I");
    }
}

public class OverridingException {
    
}
