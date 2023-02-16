/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author Jesus
 */
public class PaqueteBuilder {
    private String servicio;
    private String tipoPaquete;

    
    private double distancia;
    
    
    public PaqueteBuilder setServicio(String servicio) {
        this.servicio=servicio;
        return this;
    }


    public PaqueteBuilder setTipoPaquete(String tipoPaquete) {
        this.tipoPaquete=tipoPaquete;
        return this;
    }

    
    public PaqueteBuilder setDistancia(double distancia){
        this.distancia=distancia;
        return this;
    }
    
    public Paquete build(){
        return Paquete.getBuilder(servicio,tipoPaquete,distancia);
    }
}
