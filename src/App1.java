import java.io.*;
//     ^^^^^^^^^      notice me
public class App { // notice me          vvvvvvvvvvvvvvvv
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, " + System.getenv("USERNAME") + "!");
    
    System.out.print("> ");
    
    BufferedReader in = new BufferedReader(
        new InputStreamReader(System.in));
        
    String line = in.readLine();
    
    System.out.println("Goodbye, " + line + "!");
  }
}