/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socketThread.TCP;

import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.HashSet;

/**
 *
 * @author guilherme
 */
public class ClienteTCPThread extends Thread {

    private Socket client = null;
    /**
     * guarda referencia da estrutura que guarda os clientes,
     * para posteriamente tira-los
     */
    private HashSet<Socket> clients = null;
    private ObjectOutputStream output = null;
    private ObjectInputStream input = null;
    

    public ClienteTCPThread(Socket client, HashSet<Socket> clients) {
        this.client = client;
        this.clients = clients;
    }

    public void run() {
        

    }
}
