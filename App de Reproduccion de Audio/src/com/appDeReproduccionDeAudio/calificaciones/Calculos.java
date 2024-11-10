package com.appDeReproduccionDeAudio.calificaciones;

public class Calculos {

    public void caculoDeMedia (Califica calificaion) {
        if (calificaion.getClasificacion() >= 4) {
            System.out.println("Lo mas escuchado");
        } else if (calificaion.getClasificacion() == 3 ) {
            System.out.println("Grandes exitos");
        }else {
            System.out.println("Podria interesarte");
        }
    }
}
