/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopatrones;

import builder.Paquete;
import builder.PaqueteBuilder;
import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class EjercicioPatrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        String servicio;
        String tipoPaquete;
        double distancia;
        double tiempo;
        double tiempoMinutos=0;
        
        
        System.out.println("Tipo de envio: ");
        servicio=tec.nextLine();
        System.out.println("Distancia: ");
        distancia=tec.nextDouble();
        tec.nextLine();
        System.out.println("Tipo de paquete: ");
        tipoPaquete=tec.nextLine();
        
        System.out.println(tipoPaquete);
        
        Paquete paquete= new PaqueteBuilder().setServicio(servicio)
                                             .setTipoPaquete(tipoPaquete)
                                             .setDistancia(distancia)
                                             .build();
        
        
        
        
        
        
        System.out.println("El costo del servicio es $"+paquete.getCosto()+", se entregara en "+paquete.getTransporte()+" en un tiempo aproximado es de "+paquete.getTiempoMinutos()+" minutos");
    }
    
}
