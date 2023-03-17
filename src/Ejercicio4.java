import java.util.Scanner;
//EJERCICIO 12
public class Ejercicio4 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int mes,dia,an,suma;
    int numSuerte=0;
    System.out.print("Ingresa tu dia de nacimiento: ");
    dia=sc.nextInt();
    System.out.print("Ingresa tu numero de mes de nacimiento: ");
    mes=sc.nextInt();
    System.out.print("Ingresa tu au00f1o de nacimiento: ");
    an=sc.nextInt();
    
    suma=dia+mes+an;
    System.out.println("La suma de tu fecha de nacimiento es: "+suma);
    while(suma> 0) {
           numSuerte+=suma%10;
            suma=suma/10;
        }
        System.out.println("La suma es: " + numSuerte);
    
    
    }
    
}
