import java.io.*;
import java.net.Socket;

public class Client extends Thread {
    @Override
    public void run() {
        try (Socket socket = new Socket("127.0.0.1", 30301);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true)) {

            int userInput = InputReader.getUserInput();
            out.println(userInput);

            String result = in.readLine();
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
