package _p113_SegundoExamenParcial;
public class App {
    public static void main(String[] args) {
    System.out.print("\033[H\033[2J");System.out.flush();
    Equipo miequipo = new Equipo("Limones", "Torneo la Bombonera");
    Jugador jugador1 = new JugadorEntrenador("Francisco Zapeda", "Jugador Entrenador", 'H', 1000, 8, 1);
    System.out.println(miequipo.toString());
    System.out.println(jugador1.toString());
    }
}