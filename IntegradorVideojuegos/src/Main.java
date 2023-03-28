import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Videojuegos> videojuego = new ArrayList<Videojuegos>();

        Videojuegos juego1 = new Videojuegos(1, "Dragon Ball","Play 2", 2, "Lucha");
        Videojuegos juego2 = new Videojuegos(2, "Mario","Nintendo 64", 4, "Autos");
        Videojuegos juego3 = new Videojuegos(3, "S4 League","PC", 5, "Shooter");
        Videojuegos juego4 = new Videojuegos(4, "CS","PC", 10, "Shooter");
        Videojuegos juego5 = new Videojuegos(5, "Digimon","PC", 1, "Aventura");

        videojuego.add(juego1);
        videojuego.add(juego2);
        videojuego.add(juego3);
        videojuego.add(juego4);
        videojuego.add(juego5);

        for (Videojuegos j: videojuego) {
            System.out.println("Titulo: "+ j.getTitulo().toString());
            System.out.println("Consola: "+ j.getConsola().toString());
            System.out.println("Jugadores: "+ j.getCantidadJugadores());
            System.out.println("------------------------");
        }

        //Cambiar nombre y cantidad de jugadores a 2 juegos
        juego1.setTitulo("Dragon ball Z");
        juego1.setCantidadJugadores(4);

        juego5.setTitulo("Digimon 2003");
        juego5.setCantidadJugadores(3);

        System.out.println("--------Luego del cambio---------");
        for (Videojuegos j2 : videojuego){
            System.out.println(j2.toString());
        }

        System.out.println("----Solo Nintendo 64-------");
        for (Videojuegos j3 : videojuego){
            if (j3.getConsola().equals("Nintendo 64")){
                System.out.println(j3.toString());
            }
        }
    }
}