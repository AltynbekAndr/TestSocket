import java.awt.HeadlessException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Server implements Runnable{
    ServerSocket socket=null;
    Socket socket2=null;
    ObjectOutputStream out = null;

    @Override
    public void run() {
        try {
            socket = new ServerSocket(5555);    
            socket2 = socket.accept();
            DataOutputStream dt = new DataOutputStream(new ObjectOutputStream(socket2.getOutputStream()));
            while(true){           

                dt.write(21312333);
               
            }




        } catch (UnknownHostException e) {
        } catch (IOException e) {
        } catch (HeadlessException e) {


        } 
    }

}
