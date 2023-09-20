//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: De 1 a numIng y de numIng a 1, según el usuario lo decida.

import java.util.Scanner;
public class _p54_ArribaAbajo {
    public static void main(String[] args) {
        //Declaramos variables.
        int op;
        
        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do {
            //Limpiamos la pantalla de consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Obtenemos datos.
            System.out.println("Numeros de 1 a n .... [ 1 ]");
            System.out.println("Numeros de n a 1 .... [ 2 ]");
            System.out.println("Salir ............... [ 3 ]");
            System.out.print("Ingresa tu opcion: "); op = DatoIng.nextInt();

            //Establecemos las opciones.
            switch(op) {
                case 1:
                    System.out.print("¿Hata que numero se va a imprimir? "); int numIng = DatoIng.nextInt();
                    System.out.print("¿Con que paso? "); int paso = DatoIng.nextInt();
        
                    //En caso de que el numeros ingresado sea negativo, establecemos un proceso especializado.
                    if(numIng<0){
                        for(int i=0; i>=numIng; i-=paso) {
                            System.out.printf("%d ",i);
                        }                
                    }
                    else{
                        for(int i=0; i<=numIng; i+=paso) {
                            System.out.printf("%d ",i);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Digite el numero donde va a comenzar la impresión: "); int numFin = DatoIng.nextInt();
                    System.out.print("¿Con que paso va a imprimir los numeros? "); paso = DatoIng.nextInt();
        
                    //En caso de que el numero ingresado sea negativo se crea un proceso especializado para esa ocacion.
                    if(numFin<0){
                        for(int i=numFin; i<=0; i+=paso) {
                            System.out.printf("%d ",i);                
                        }
                    }
                    else{
                        for(int i=numFin; i>=0; i-=paso) {
                            System.out.printf("%d ",i);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nTe vas por que quieres nadie te corre");
                    break;

                default:
                System.out.println("\nOpcion Invalida");
                break;
            }
            System.out.println("\nPresiona <Enter> para continuar"); DatoIng.nextLine();DatoIng.nextLine();
        } while( op != 3);
        System.out.println("\nProceso Terminado ....");
        DatoIng.close();
    }
}