import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SuperComputer extends Thread {
    @Override
    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(30301);
             Socket socket = serverSocket.accept();
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) {
            int number = in.read(); //TODO почему не читается переданное число
            int result = Calculator.fib(number);
            out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
