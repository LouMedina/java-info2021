import java.util.*;

public class Ejercicio7 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Ingrese palabra");
        char minus= 0;
        String palabra = scan.nextLine();
        int a= palabra.length();
        scan.close();
        for (int i = 0; i< a; i++){
            minus=  (char) palabra.charAt(i);
            if (minus >= 'a' && minus<='z'){
            minus = (char)(minus- 'a' + 'A');
            System.out.print(minus);
            }
        }
    }
}
