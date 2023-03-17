import java.util.Scanner; // -> Importar el scanner (Permite la entrada de datos desde teclado)
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float gradosC;
        System.out.print("Introduce los grados en centigrados: "); //Datos de entrada
        gradosC = sc.nextFloat();
        /*FORMULA
        F= 32+(9*C/5)
        En este caso C es igual a gradosC (variable declarada arriba)
        Declarar la variable gradosF esta es igual a la formula de F
        
        --También este es el proceso del programa, la conversion de grados c a F--
        */
        float gradosF= 32+(9*(gradosC/5));
        
        //Imprimir la conversion
        
       System.out.print(gradosC+" grados centigrados equivale a "+gradosF+" grados Fahreheit. ");
        
        
        
    }
    
}
