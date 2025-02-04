import java.io.*;
import java.net.*;

public class Client {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        System.out.println("Connecting to the server...");
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT)) {
            System.out.println("Connected to the server.");

            try (
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in))
            ) {
                String userInput;
                while (true) {
                    System.out.print("Client: ");
                    userInput = keyboard.readLine();
                    out.println(userInput);

                    if ("exit".equalsIgnoreCase(userInput)) {
                        System.out.println("Disconnected from the server.");
                        break;
                    }

                    String serverReply = in.readLine();
                    System.out.println("Server: " + serverReply);
                }
            }
        } catch (IOException e) {
            System.err.println("Client error: " + e.getMessage());
        }
    }
}
