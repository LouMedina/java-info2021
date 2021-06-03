import java.util.*;

public class Ejercicio2 {

    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int suma = 0;
        int resta = 0;
        int multi = 0;
        int div = 0;
        int resto = 0;
        System.out.print("Ingrese primer numero entero: ");
        a = scan.nextInt();
        System.out.print("Ingrese segundo numero entero: ");
        b = scan.nextInt();
        suma = a + b;
        resta = a - b;
        multi = a * b;
        div = a / b;
        resto = a % b;
        System.out.println(  a +  " + " +  b + " = " + suma);
        System.out.println( a +  " - " + b + " = " + resta);
        System.out.println(a +  " * " + b + " = " + multi);
        System.out.println(a +  " / " + b + " = " + div);
        System.out.println(a +  " % " + b + " = " + resto );

        scan.close();
    }
    
}
