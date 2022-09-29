/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunes;

/**
 *
 * @author Alumno Mañana
 */
public class operaciones {
    public int n1;
    public int n2;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public operaciones() {
    }

    public operaciones(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("operaciones{n1=").append(n1);
        sb.append(", n2=").append(n2);
        sb.append('}');
        return sb.toString();
    }

    public void sumaClase(int n1,int n2){
        System.out.println("La suma de los 2 números es: "+(n1+n2));
    }
    public void restaClase(int n1,int n2){
        System.out.println("La resta de los 2 números es: "+(n1-n2));
    }
    public void multiplicacionClase(int n1,int n2){
        System.out.println("La multiplicacion de los 2 números es: "+(n1*n2));
    }
    public void divisionClase(int n1,int n2){
        double sol=(n1/n2);
        System.out.println("La resta de los 2 números es: "+sol);
    }
    
    
}
