import java.util.*;

public class Ejercicio4 {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int fact = 1;
        int num = 1;
        System.out.println(" Ingrese numero");
        num = scan.nextInt();
        scan.close();
        while (num !=0){
            fact = fact*num;
            num--;
        }
        System.out.println("El factorial de 5 es: " + fact);

    }

}
