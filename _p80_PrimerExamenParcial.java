//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un sistema de control escolar.

import java.util.Scanner;
public class _p80_PrimerExamenParcial{
    //Declaramos las funciones a utilizar.
    public static int Registro(){
        //Limpiamos la pantalla de la consola.
        System.out.print("\033[H\033[2J");System.out.flush();

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);
        
        //Obtencion de datos.
        System.out.println("Ingrese su nombre: "); DatoIng.nextLine();
        System.out.println("Ingrese su edad: "); int edad = DatoIng.nextInt();
        if(edad<18){
            System.out.println("Los siento, pero solo aceptamos a mayores de edad.");
            
        }
        return edad;
    }
    public static void main(String[] args) {
        //Declaramos las variables a utilizar.
        int op, op1, Trabajador, Docente, Alumno, sexoCM, sexoCH;
        float cuota, total, totalA, totalD, totalT;
        char res, sexo;
        //Damos valor a las variables.
        Trabajador = Docente = Alumno = sexoCH = sexoCM = 0;
        total = totalD = totalA = totalT=0;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);
        do{
            System.out.println("Este prorama es un sistema de control escolar.\n");
            System.out.println("Ingresar...[1]\nConsultar ingresos...[2]\nConsulta sobre el personal...[3]\nSalir...[4]"); op  = DatoIng.nextInt();
            switch(op){
                case 1:
                do{
                    //Limpiamos la ventana de la consola.
                     System.out.print("\033[H\033[2J");System.out.flush();

                    //Obtencion de datos.
                    System.out.println("Ingrese el tipo de usuario: \nAlumno...[1]\nDocente...[2]\nTrabajador...[3]"); op1 = DatoIng.nextInt();
                    switch (op1) {
                        case 1:
                            if(Registro()>=18){
                                do{
                                    System.out.println("Intrese su sexo (F/M): "); sexo = Character.toUpperCase(DatoIng.next().charAt(0));
                                    if(sexo == 'F'){
                                        sexoCM++;
                                    }
                                    else if(sexo == 'M'){
                                        sexoCH++;
                                    }
                                    else{
                                        System.out.println("La opcion que usted ha ingresado es invalida.");
                                    }
                                    cuota = 50;
                                    Alumno++;
                                    totalA += cuota;
                                    total += cuota;
                                }while(sexo == 'F' || sexo == 'M');
                            }
                            break;
                        case 2:
                            if(Registro()>=18){
                                do{
                                    System.out.println("Intrese su sexo (F/M): "); sexo = Character.toUpperCase(DatoIng.next().charAt(0));
                                    if(sexo == 'F'){
                                        sexoCM++;
                                    }
                                    else if(sexo == 'M'){
                                        sexoCH++;
                                    }
                                    else{
                                        System.out.println("La opcion que usted ha ingresado es invalida.");
                                    }
                                    cuota = 80;
                                    Docente++;
                                    totalD += cuota;
                                    total += cuota;
                                }while(sexo == 'F' || sexo == 'M');
                            }
                            break;

                        case 3:
                            if(Registro()>=18){
                                do{
                                    System.out.println("Intrese su sexo (F/M): "); sexo = Character.toUpperCase(DatoIng.next().charAt(0));
                                    if(sexo == 'F'){
                                        sexoCM++;
                                    }
                                    else if(sexo == 'M'){
                                        sexoCH++;
                                    }
                                    else{
                                        System.out.println("La opcion que usted ha ingresado es invalida.");
                                    }
                                    cuota = 60;
                                    Trabajador++;
                                    totalT += cuota;
                                    total += cuota;
                                }while(sexo == 'F' || sexo == 'M');
                            }
                            break;
                    }                    
                    System.out.println("¿Desea registrar a alguien mas? (S/N)"); res = Character.toUpperCase(DatoIng.next().charAt(0));
                }while(res != 'N' && (op1 <=3 && op1 >0));     
                break;

                case 2:
                    do{                    
                        //Limpiamos la pantalla de la consola.
                        System.out.print("\033[H\033[2J");System.out.flush();

                        System.out.println("Ingresos totales...[1]\nIngresos de los docentes...[2]\nIngresos de los alumnos...[3]\nIngresos de los trabajadores...[4]\nRegresar...[5]"); 
                        op1 = DatoIng.nextInt();
                        switch (op1) {
                            case 1:
                                System.out.printf("Los ingresos totales son: %.2f", total);
                                break;
                            case 2:
                                System.out.printf("Los ingresos de los docentes son: %.2f", totalD);
                                break;
                            case 3:
                                System.out.printf("Los ingresos de los alumnos son: %.2f", totalA);
                                break;
                            case 4:
                                System.out.printf("Los ingresos de los trabajadores son: %.2", totalT);
                                break;
                            default:
                                System.out.println("La opcion que usted ha ingresado es invalida.");
                                break;
                        }
                    }while(op1 !=4);
                    break;

                case 3:
                    //Limpiamos la pantalla de la consola.
                    System.out.print("\033[H\033[2J");System.out.flush();
                    System.out.printf("La cantidad de personal es: \nAlumnos...%d\nDocentes...%d\nTrabajadores...%d\nHombres: %d\n", Alumno, Docente, Trabajador, sexoCH, sexoCM);
                    System.out.println("\nPresione <ENTER> para continuar."); DatoIng.nextLine();
                break;
                case 4:
                    System.out.println("\n\nGracias por usar nuestro programa."); 
                    DatoIng.close();
                    break;
                default:
                    System.out.println("La opcion que usted ha ingresado no es valida.\nPresione <ENTER> para continuar."); DatoIng.nextLine();
            }
        }while(op != 4);
    }
}