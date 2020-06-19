import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args)throws IOException {
        //all this does is make a new socket and connects to IP(in this case its the same machine as the server hence "localhost") and port 9696
        Socket s = new Socket("localhost", 9696);

        PrintWriter out = new PrintWriter(s.getOutputStream());
        out.println("hello, i joined");
        out.flush();
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        while(true){
            Scanner scanner = new Scanner( System.in);
            String inputString = scanner.nextLine();
            out.println(inputString);
            out.flush();
        }
    }

}
