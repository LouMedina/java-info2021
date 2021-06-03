import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int multi = 0;
        System.out.println("Ingrese un numero");
        num1 = scan.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = scan.nextInt();
        scan.close();
        if ((num1 != 0) && (num2 != 0)){
            for ( int i =0; i< num2; i++){
                multi += num1;
            }
        }
        System.out.println("El resultado es " + multi);

    }
    
}
