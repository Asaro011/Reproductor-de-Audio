import com.appDeReproduccionDeAudio.calificaciones.Calculos;
import com.appDeReproduccionDeAudio.tiposDeAudio.Cancion;

public class PaginaPrincipal {
    public static void main(String[] args){

        Calculos calculos = new Calculos();

        Cancion cancion = new Cancion();

        System.out.println("\n");

        cancion.setArtista("Creepy Nuts");
        cancion.setNombre("Otonoke");
        cancion.setGenero("Rap/HipHop");
        cancion.setDuracionEnMinutos(3);
        cancion.setAlbum("Otonoke");
        cancion.setTotalDeReproducciones(200000);
        cancion.detalles();

        cancion.nota(8.9);
        cancion.nota(8.8);
        cancion.nota(9.4);

        calculos.caculoDeMedia(cancion);


    }
}