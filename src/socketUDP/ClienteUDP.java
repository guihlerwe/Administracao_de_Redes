/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socketUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author aluno
 */
public class ClienteUDP {

    public static void main(String args[]) {
        try {
            DatagramSocket cliente = new DatagramSocket();
            System.out.println("Serviço UDP ativo");
            String mensagem = "ola Mundo";
            
            
            DatagramPacket segmento = new DatagramPacket(mensagem.getBytes(),mensagem.getBytes().length, InetAddress.getByName("191.52.13.8"),1026);
            
            System.out.println("A menssagem foi enviada pela porrta local: "+cliente.getLocalPort());
            
            cliente.send(segmento);
            cliente.close();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
