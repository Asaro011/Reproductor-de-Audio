package com.appDeReproduccionDeAudio.tiposDeAudio;

import com.appDeReproduccionDeAudio.calificaciones.Califica;

public class Cancion extends Audio implements Califica {

    //Atributos

    private String artista;

    private String album;

    //Get&Set

    public String getArtista() {
        return artista;
    }

    public void setArtista(String interprete) {
        this.artista = interprete;
    }


    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;

        }


    @Override
    public int getClasificacion() {
        if (calificacionMedia() >= 8){
            return 5;
        } else if (calificacionMedia() >= 7) {
            return 3;
        } else return 2;
    }
}


