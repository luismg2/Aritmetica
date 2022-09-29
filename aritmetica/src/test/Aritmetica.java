/*Realizar operaciones matematicas: suma, resta, division, multiplicacion*/
package test;

import comunes.operaciones;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Aritmetica {
    static Scanner ent = new Scanner(System.in);
    static operaciones op=new operaciones();
    
    public static void main(String[] args) {
        System.out.println("\tOPERACIONES ARITMETICAS");
        System.out.println("\t=======================\n");
        introducirNums();
    }
    
    public static void menu(int n1, int n2){
        char sw;
        int opcion=-1;
        while(opcion!=0){
            System.out.println("MENÚ: SELECCIONE UNA OPCIÓN\n");
            System.out.println("\t(1) SUMA");
            System.out.println("\t(2) RESTA");
            System.out.println("\t(3) MULTIPLICAR");
            System.out.println("\t(4) DIVISION");
            System.out.println("\t(0) SALIR\n");
            System.out.print("Seleccione la opción a elegir: ");
            opcion=ent.nextInt();
            switch(opcion){
                case 1:
                    ent.nextLine();
                    op.sumaClase(n1, n2);
                    break;
                case 2:
                    ent.nextLine();
                    op.restaClase(n1, n2);
                    break;
                case 3:
                    ent.nextLine();
                    op.multiplicacionClase(n1, n2);
                    break;
                case 4:
                    ent.nextLine();
                    op.divisionClase(n1, n2);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nIntroduzca un número entre 0 y 4");
                    break;
            }
            for(int i=0;i<2;i++){
                System.out.println("");
            }
        }
    }
    
    public static void introducirNums(){
        System.out.print("Introduzca el primer número con el que desea operar: ");
        int n1=ent.nextInt();
        System.out.print("Introduzca el segundo número con el que desea operar: ");
        int n2=ent.nextInt();
        menu(n1,n2);

    }
    public static void suma(){
        
    }
    
    public static void resta(){
        
    }
    
    public static void multiplicacion(){
        
    }
    
    public static void division(){
        
    }    
}
