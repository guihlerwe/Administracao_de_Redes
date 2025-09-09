/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socketThread.TCP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;

/**
 *
 * @author aluno
 */
public class ServerTCPThread {
    private ServerSocket server = null;
    private HashSet<Socket> clients =new HashSet<Socket>();
    
    public ServerTCPThread(int port) throws IOException{
        this.server = new ServerSocket(port);
    }
    
    public void execute(){
        while (true) {
            try{
            Socket client = this.server.accept();
            }catch (IOException e){
                System.out.println("Ocorreu um erro: "+e.getMessage());
            }
        }
    }
}
