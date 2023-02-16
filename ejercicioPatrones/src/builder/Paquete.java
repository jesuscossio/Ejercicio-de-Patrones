/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package builder;

/**
 *
 * @author Jesus
 */
public class Paquete {

    private String servicio;
    private String tipoPaquete;
    private String transporte;
    private double costo;
    private double distancia;
    private double tiempo;
    private double tiempoMinutos;
    private static Paquete builderS;

    private Paquete(String servicio, String tipoPaquete, double distancia) {
        this.servicio = servicio;
        this.tipoPaquete = tipoPaquete;
        this.distancia = distancia;
    }

    public static Paquete getBuilder(String servicio, String tipoPaquete, double distancia) {
        if (builderS == null) {
            builderS = new Paquete(servicio, tipoPaquete, distancia);
        }
        return builderS;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getTipoPaquete() {
        return tipoPaquete;
    }

    public void setTipoPaquete(String tipoPaquete) {
        this.tipoPaquete = tipoPaquete;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public double getTiempoMinutos() {
        return tiempoMinutos;
    }

    public void setTiempoMinutos(double tiempoMinutos) {
        this.tiempoMinutos = tiempoMinutos;
    }
    
    

    public double getCosto() {
        double sobrante;
        if (servicio.equalsIgnoreCase("estandar")) {
            costo = costo + 30;
        } 
        if (servicio.equalsIgnoreCase("express")) {
            costo = costo + 50;
        }
            
        

        switch (tipoPaquete) {
            case ("sobre") -> {
                if (distancia < 1 && servicio.equalsIgnoreCase("express")) {
                    setTransporte("dron");
                    costo = costo + 20;
                }
                if (distancia < 1 && servicio.equalsIgnoreCase("estandar")) {
                    setTransporte("bicicleta");
                    costo = costo + 5;
                }
                if (distancia > 1 && servicio.equalsIgnoreCase("estandar")) {
                    setTransporte("bicicleta");
                    costo = costo + 5;
                    if (distancia > 10) {
                        sobrante = distancia - 10;
                        double precioMas = sobrante * 5;
                        costo = costo + precioMas;
                    }
                }
                if (distancia > 1 && servicio.equalsIgnoreCase("express")) {
                    setTransporte("motocicleta");
                    costo = costo + 15;
                    if (distancia > 10) {
                        sobrante = distancia - 10;
                        double precioMas = sobrante * 5;
                        costo = costo + precioMas;
                    }
                }
                costo=costo+5;
            }
            case ("caja pequenia") -> {
                if (distancia < 1 && servicio.equalsIgnoreCase("express")) {
                    setTransporte("dron");
                    costo = costo + 20;
                }
                if (distancia < 1 && servicio.equalsIgnoreCase("estandar")) {
                    setTransporte("bicicleta");
                    costo = costo + 5;
                }
                if (distancia > 1 && servicio.equalsIgnoreCase("estandar")) {
                    setTransporte("bicicleta");
                    costo = costo + 5;
                    if (distancia > 10) {
                        sobrante = distancia - 10;
                        double precioMas = sobrante * 5;
                        costo = costo + precioMas;
                    }
                }
                if (distancia > 1 && servicio.equalsIgnoreCase("express")) {
                    setTransporte("motocicleta");
                    costo = costo + 15;
                    if (distancia > 10) {
                        sobrante = distancia - 10;
                        double precioMas = sobrante * 5;
                        costo = costo + precioMas;
                    }
                }
                costo=costo+10;
            }
            case ("caja mediana") -> {
                if (distancia <= 5 && servicio.equalsIgnoreCase("estandar")) {
                    setTransporte("bicicleta");
                    costo = costo + 5;
                }
                if (distancia >= 5 || servicio.equalsIgnoreCase("express")) {
                    setTransporte("motocicleta");
                    costo = costo + 15;
                    if (distancia > 10) {
                        sobrante = distancia - 10;
                        double precioMas = sobrante * 5;
                        costo = costo + precioMas;
                    }
                }
                costo=costo+20;
            }
            case ("caja grande") -> {
                setTransporte("automovil");
                costo = costo + 30;
                if (distancia > 10) {
                    sobrante = distancia - 10;
                    double precioMas = sobrante * 5;
                    costo = costo + precioMas;
                }
                costo=costo+50;
            }
            default -> {
                
            }
        }
        if (getTransporte().equalsIgnoreCase("dron")) {
            tiempo=distancia/60;
            tiempoMinutos=tiempo*60;
        }
        if (getTransporte().equalsIgnoreCase("bicicleta")) {
            tiempo=distancia/20;
            tiempoMinutos=tiempo*60;
        }
        if (getTransporte().equalsIgnoreCase("motocicleta")) {
            tiempo=distancia/45;
            tiempoMinutos=tiempo*60;
        }
        if (getTransporte().equalsIgnoreCase("automovil")) {
            tiempo=distancia/40;
            tiempoMinutos=tiempo*60;
        }
        
        
        return costo;
    }

    
}
