import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.concurrent.ExecutionException;

public class writerMain {

    public static void readerMethod(){
        char[] array = new char[34];
        try{
            Reader input = new FileReader("C:\\Users\\azeer\\OneDrive\\Documents\\java oops\\writer.txt");
            System.out.println("there is any words: " + input.ready());
            input.read(array);
            System.out.println(array);
            input.close();
        }
        catch (Exception e){
            System.out.println("Exception is: "+ e.getMessage());
        }
    }
    public static void main(String[] args){
        String data = "This is java fileWriter practice: ";
        try {
            Writer output = new FileWriter("C:\\Users\\azeer\\OneDrive\\Documents\\java oops\\writer.txt");
            output.write(data);
            output.close();
        }
        catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            readerMethod();
            System.out.println();
        }
    }
}
