//Alumno: Jose Manuel Roberto Badillo.
//Descripción: Crear un programa que calcule el area de un triangulo, pidiendo las medidas del mismo al usuario.
import java.util.Scanner;
public class _p03_AreaTriangulo {
    public static void main(String[] args) {
        int base, altura;
        double area;
        Scanner datoIng = new Scanner(System.in);
        System.out.println("Este programa calcula el area de un triangulo. Presione ENTER para continuar.");
        datoIng.nextLine();
        System.out.print("Digita la base del triangulo.");
        base = datoIng.nextInt();
        System.out.print("Digita la altura: ");
        altura = datoIng.nextInt();
        area = base*altura/2;
        System.out.println(String.format("El triangulo de base %d y altura %d tiene un area de %.2f", base, altura, area));
    }
}
