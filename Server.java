import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args)throws IOException {
        //making a server socket that listens on port 9696
        String currentDirectory = System.getProperty("user.dir");
        System.out.print("CurrentDirectory = " + currentDirectory);
        ServerSocket ss = new ServerSocket(9696);
        //uses a different socket for exchange
        Socket s = ss.accept();

        System.out.println("Hi! A new connection has been initialized");
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        while(true){
            char[] cbuf = new char[100];
            bf.read(cbuf);
            System.out.println("Client:"+new String(cbuf));

        }

    }

}
