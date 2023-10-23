package _p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String Nombre, Liga;
    private ArrayList<Jugador> Jugadores;

    public Equipo(){
        Jugadores = new ArrayList<>();
    }

    public Equipo(String nombre, String liga){
        this(); Nombre = nombre; Liga = liga;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }
    public void agregarJugador(Jugador jugador){
        Jugadores.add(jugador);
    }

    public double getTotalBono(){
        double Total = 0;
        for(Jugador jugador : Jugadores){Total += jugador.getBono();}
        return Total;
    }
    public double getTotal(){
        double Total = 0;
        for(Jugador jugador : Jugadores){Total += (jugador.getBono() + jugador.getSalario());}
        return Total;
    }
    public int getTotalH(){
        int total = 0;
        for(Jugador jugador : Jugadores){
            if(jugador.getSexo() == 'H'){total++;}
        }
        return total;
    }
    public int getTotalM(){
        int total = 0;
        for(Jugador jugador : Jugadores){
            if(jugador.getSexo() == 'M'){total++;}
        }
        return total;
    }
    public void reporte(){
        for(Jugador jugador : Jugadores){
            System.out.println(jugador.toString());
        }
    }

    @Override
    public String toString(){
        return String.format(">> Equipo [Nombre= %s, Liga= %s, Jugadores= %d, Bono= %.2f, Total= %.2f, Hombres= %d, Mujeres= %d]", Nombre, Liga, Jugadores.size(), this.getTotalBono(), this.getTotal(), this.getTotalH(), this.getTotalM());
    }


}
