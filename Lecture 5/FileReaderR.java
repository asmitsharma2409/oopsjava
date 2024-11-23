import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderR {
    public static void main(String args[]){
        File f1 = null;
        FileReader fr = null;

        try{
            f1 = new File("Sample.txt");
            fr = new FileReader(f1);
            int ch;
            while((ch=fr.read())!=-1){
                System.out.print((char)(ch));
            }
        }
        catch(IOException ref){
            ref.printStackTrace();
        }
        finally{
            try{
                if(fr!=null){
                    fr.close();
                }
            }
            catch(IOException ref){
                ref.printStackTrace();
            }
        }
    }
}
