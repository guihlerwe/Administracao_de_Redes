import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class ServerTCP {

    public static void main(String[] args) {

        try {
            ServerSocket servidor = new ServerSocket(1025);
            System.out.println("o servidor iniciou na porta: "+servidor.getLocalPort());
            
            while(true){
                Socket cliente = servidor.accept();
                
                System.out.println("Cliente: " +cliente.getPort()+ " "+ cliente.getLocalAddress());
                
                ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
                saida.flush();
                saida.writeObject(new Date());
                
                saida.close();
                cliente.close();
            }
            
            
        } catch (Exception e) {
            System.out.println("Ocorreu um ero: " + e.getMessage());
        }
    }
}
