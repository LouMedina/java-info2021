import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int base = 1;
        int expo = 1;
        int potencia = 1;
        System.out.println("Ingrese la base");
        base = scan.nextInt();
        System.out.println("Ingrese el exponente");
        expo = scan.nextInt();
        scan.close();
        if (base != 0 && expo !=0){
            for( int j= 1; j<=expo; j++){
                potencia *= base;
                
            }
            System.out.println(base + " elevado a "+ expo +" = "+ potencia); 
        }
        
        
    }

}
