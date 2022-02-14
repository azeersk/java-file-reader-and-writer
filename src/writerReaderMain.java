import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class writerReaderMain {
    public static void readerMethod(){
        char[] arrayChar = new char[91];
        try {
            Reader input = new FileReader("C:\\Users\\azeer\\OneDrive\\Documents\\java oops\\writer reader.txt");
            System.out.println("is file is not empty: "+ input.ready());
            input.read(arrayChar);
            System.out.println(arrayChar);
            input.close();
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }

    }

    public static void main(String[] args){


        try {
            String newData = "this is the is file location: C:\\Users\\azeer\\OneDrive\\Documents\\java oops\\writer reader.txt";
            Writer output = new FileWriter("C:\\Users\\azeer\\OneDrive\\Documents\\java oops\\writer reader.txt");
            output.write(newData);
            output.close();
        }
        catch (Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
        finally {
            System.out.println();
            readerMethod();
        }
    }
}
