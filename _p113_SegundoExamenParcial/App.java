package _p113_SegundoExamenParcial;
public class App {
    public static void main(String[] args) {
    System.out.print("\033[H\033[2J");System.out.flush();
    Equipo miequipo = new Equipo("Limones", "Torneo la Bombonera");
    Jugador jugador1 = (new JugadorEntrenador("Francisco Zapeda", "Entrenador Principal", 'H', 1000, 8,1)); miequipo.agregarJugador(jugador1);
    Jugador jugador2 =(new JugadorEntrenador("Alexis Estrada", "Entrenador de Apoyo", 'H', 900, 10,2)); miequipo.agregarJugador(jugador2);
    Jugador jugador3 =(new JugadorActivo("Alexander Lopez","Principal No 11",'H',100,2,2)); miequipo.agregarJugador(jugador3);
    Jugador jugador4 =(new JugadorActivo("Uriel Puga","Principal No 16",'H',100,3,1)); miequipo.agregarJugador(jugador4);
    Jugador jugador5 =(new JugadorActivo("Alejandra Escalona","Principal No 21",'M',100,3,3)); miequipo.agregarJugador(jugador5);
    Jugador jugador6 =(new JugadorActivo("Armando Santana","Banca No 10",'H',120,4,1)); miequipo.agregarJugador(jugador6);
    Jugador jugador7 =(new JugadorActivo("Daniel Mijares","Banca No 15",'H',150,4,4)); miequipo.agregarJugador(jugador7);
    Jugador jugador8 =(new JugadorActivo("Antonio Hernandez","Banca No 20",'M',350,5,3)); miequipo.agregarJugador(jugador8);
    Jugador jugador9 =(new JugadorActivo("Andrea Solis","Principal No 12",'M',550,5,5)); miequipo.agregarJugador(jugador9);
    Jugador jugador10 =(new JugadorActivo("Marissa Hernandez","Principal No 12",'M',600,4,2));miequipo.agregarJugador(jugador10);
    Jugador jugador11 =(new JugadorActivo("Diana Soto","Principal No 12",'M',700,5,3)); miequipo.agregarJugador(jugador11);
    miequipo.reporte();
    }
}