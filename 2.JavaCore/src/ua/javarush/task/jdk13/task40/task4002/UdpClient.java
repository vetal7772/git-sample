package ua.javarush.task.jdk13.task40.task4002;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {

    private final DatagramSocket socket;
    private final InetAddress serverAddress;
    private final int serverPort;

    public UdpClient(int port) throws IOException {
        socket = new DatagramSocket(port);
        serverAddress = InetAddress.getByName("localhost");
        serverPort = 4445;
    }

    public String sendReceive(String message) throws IOException {
        String receivedString;
        byte[] data = message.getBytes();
        DatagramPacket pack = new DatagramPacket(data, data.length, serverAddress, serverPort);

        socket.send(pack);


        DatagramPacket pack2 = new DatagramPacket(new byte[1024], 1024);
        socket.receive(pack2);
        receivedString = new String(pack2.getData(), 0, pack2.getLength());
        return receivedString;


    }

    public void close() {
        socket.close();
    }
}
