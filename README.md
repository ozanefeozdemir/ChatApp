# Java Socket Chat Application

This is a simple client-server chat application implemented in Java using sockets. The client connects to the server, allowing bidirectional communication between them.

## Features

- The server listens for a connection from the client.
- The client connects to the server using a socket.
- Both client and server can send and receive messages.
- The conversation continues until either party sends `exit`, which closes the connection.

## Requirements

- Java Development Kit (JDK) 8 or later

## How to Run

### Step 1: Compile the Java files
```sh
javac Server.java Client.java
Step 2: Start the Server
Run the server first so it can listen for incoming connections.

sh
Kopyala
Düzenle
java Server
Step 3: Start the Client
In a separate terminal or command prompt, start the client.

sh
Kopyala
Düzenle
java Client
Step 4: Chat
Type messages in the client and press Enter to send them to the server.
The server can reply by typing messages and pressing Enter.
To exit, type exit and press Enter.
Code Overview
Server.java
Starts a ServerSocket on port 12345.
Waits for a client to connect.
Reads messages from the client and sends responses.
Client.java
Connects to the server on localhost:12345.
Sends user input to the server and prints the response.
Example Interaction
Client:

vbnet
Kopyala
Düzenle
Client: Hello, Server!
Server: Hi, Client!
Client: How are you?
Server: I'm good, thanks!
Client: exit
Disconnected from the server.
Server:

arduino
Kopyala
Düzenle
Server is running...
Client connected.
Client: Hello, Server!
Server: Hi, Client!
Client: How are you?
Server: I'm good, thanks!
Client: exit
Client disconnected.
Notes
Ensure that the server is running before starting the client.
The client and server communicate via plain text.
The connection closes when either side sends exit.
Enjoy chatting with this simple Java socket application! 🚀

yaml
Kopyala
Düzenle

---

