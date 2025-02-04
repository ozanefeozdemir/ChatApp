import java.io.*;
import java.net.*;

public class Server {
    private static final int PORT = 12345;

    public static void main(String[] args) {
        System.out.println("Server is running...");
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            try (
                    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in))
            ) {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    System.out.println("Client: " + inputLine);

                    if ("exit".equalsIgnoreCase(inputLine)) {
                        System.out.println("Client disconnected.");
                        break;
                    }

                    System.out.print("Server: ");
                    String reply = keyboard.readLine();
                    out.println(reply);
                }
            }
        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
}
