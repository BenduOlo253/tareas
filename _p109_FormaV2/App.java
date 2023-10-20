package _p109_FormaV2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo("Rojo", true, 10.23);
        Circulo circulo2 = new Circulo("Verde", false, 99.12);
        Rectangulo rectangulo1 = new Rectangulo("Amarillo", false, 10.0, 20.0);
        Rectangulo rectangulo2 = new Rectangulo("Azul", true, 15, 44);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo1);
        formas.add(circulo2);
        formas.add(rectangulo1);
        formas.add(rectangulo2);

        System.out.println(circulo1);
        System.out.println(circulo2);
        System.out.println(rectangulo1);
        System.out.println(rectangulo2);

        System.out.println("\n\nCalculando áreas y perimetros de las figuras ...\n");

        for(Forma forma : formas){
            if(forma instanceof Circulo){
                System.out.println("La forma es un circulo");
                System.out.println("El área es: " + forma.getArea());
                System.out.println("El perimetro es: " + forma.getPerimetro() + "\n");
            }
            else if(forma instanceof Rectangulo){
                System.out.println("La forma es un rectangulo");
                System.out.println("El área es: " + forma.getArea());
                System.out.println("El perimetro es: " + forma.getPerimetro() + "\n");
            }
        }
    }
}