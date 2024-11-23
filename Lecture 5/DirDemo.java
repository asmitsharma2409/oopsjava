import java.io.File;
import java.io.IOException;

public class DirDemo {
    public static void main(String[] args) {
        try {
            File f1 = new File("C:\\College Related\\Programming\\Java oops\\Lecture 1");
            f1.mkdirs();  // Create directories
            System.out.println(f1.exists());  // Check if the directory exists

            File f2 = new File(f1, "GSV.java");  // Create a new file inside the directory
            f2.createNewFile();  
            File f3 = new File("C:\\College Related\\Programming\\Java oops\\Lecture 1");
            System.out.println("File: " + f3.isFile());
            System.out.println("Dir: " + f3.isDirectory());

            String[] all = f3.list();

            // Counters for specific file types
            int fcount = 0;
            int dcount = 0;
            int jpegCount = 0;
            int pngCount = 0;
            int txtCount = 0;
            int otherCount = 0;
            int javaCount = 0;

            for (String name : all) {
                File f4 = new File("C:\\College Related\\Programming\\Java oops\\Lecture 1\\" + name);
                System.out.println(f4.getName());

                if (f4.isFile()) {
                    fcount++;

                    // Check the file extension
                    if (name.toLowerCase().endsWith(".jpeg") || name.toLowerCase().endsWith(".jpg")) {
                        jpegCount++;
                    } else if (name.toLowerCase().endsWith(".png")) {
                        pngCount++;
                    } else if (name.toLowerCase().endsWith(".txt")) {
                        txtCount++;
                    }
                    else if (name.toLowerCase().endsWith(".java")) {
                        javaCount++;}
                    else {
                        otherCount++;
                    }
                }
                if (f4.isDirectory()) {
                    dcount++;
                }
            }

            System.out.println("Total Files: " + fcount);
            System.out.println("Total Directories: " + dcount);

            // Print the counts for each file type
            System.out.println("JPEG Files: " + jpegCount);
            System.out.println("PNG Files: " + pngCount);
            System.out.println("Text Files: " + txtCount);
            System.out.println("Java Files: " + javaCount);
            System.out.println("Other Files: " + otherCount);

        } catch (IOException ref) {
            ref.printStackTrace();
        }
    }
}
