package com.appDeReproduccionDeAudio.tiposDeAudio;

public class Audio {

    //variables

    private String nombre;

    private int duracionEnMinutos;

    private int totalDeReproducciones;

    private String genero;

    private double calificacion;

    private int calificacionTotal;

    //Getters & Setters

    public int getCalificacionTotal() {
        return calificacionTotal;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos

    public void detalles(){

        System.out.println("Estas escuchando: " + nombre);
        System.out.println("Tiempo de reproducción: " + duracionEnMinutos + " minutos");
        System.out.println("Genero: " + genero);


    }

    public void nota (double nota){

    calificacion += nota;
    calificacionTotal++;

    }

    public double  calificacionMedia (){

       return calificacion / calificacionTotal;
    }
}
