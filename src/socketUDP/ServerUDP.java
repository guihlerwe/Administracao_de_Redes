/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newsocket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author guilherme
 */
public class ServerUDP {

    public static void main(String args[]) {
        try {
            DatagramSocket servidor = new DatagramSocket(1026);
            //cia o buffer 
            byte[] mensagem = new byte[256];
            //criase o datagrama
            DatagramPacket pacote = new DatagramPacket(mensagem,mensagem.length);
            //recebe-se o datagrama
            servidor.receive(pacote);
            //imprime valor
            System.out.println(new String(pacote.getData()).trim()); //trim corta os espaços vazios
            //finaliza conexao
            servidor.close();

        } catch (Exception e) {
            System.out.println("Ocorreu erro: "+e.getMessage());

        }

    }
}

