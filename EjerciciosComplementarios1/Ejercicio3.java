import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int num = 0;
        int i = 1;
        int j = 1;
        System.out.println("Ingrese numero entero");
        num = scan.nextInt();
        scan.close();
        for (i = 1; i <= num; i++){
            for(j =1; j<= i; j++){
                System.out.print(j + " ");

            }
            System.out.println("");
        }

    }
    
}
