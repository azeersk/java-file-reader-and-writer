import java.io.FileReader;
import java.io.Reader;

public class readerMain {
    public static void main(String[] args){
//        char[] array = new char[900];
//        char [] arrayOne = new char[900];
        char[] arrayChar = new char[900];
        try {
            Reader inputChar = new FileReader("C:\\Users\\azeer\\OneDrive\\Documents\\my certificates\\final project.txt");
            inputChar.read(arrayChar);
            System.out.println(arrayChar);
            inputChar.close();

//            Reader input = new FileReader("C:\\Users\\azeer\\OneDrive\\Documents\\my certificates\\final project.txt");
//            System.out.println("is there data in stream: "+ input.ready());
//
//            input.read(array);
//            System.out.println("Data in the stream is: ");
//            System.out.println(array);
//            input.close();
//            Reader inputA = new FileReader("C:\\Users\\azeer\\OneDrive\\Documents\\my certificates\\final project.txt");
//            System.out.println("is there file: " + inputA.ready());
//
//            inputA.read(arrayOne);
//            System.out.println("the file is in side: ");
//            System.out.println(arrayOne);
//            inputA.close();



        }
        catch (Exception e){
            System.out.println("Exception: "+ e.getMessage());

        }
    }
}
