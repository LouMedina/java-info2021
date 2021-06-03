import java.util.*;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String frase,letra = " ";
        int  lugar= 0;
        System.out.println(" Ingrese una frase");
        frase = scan.nextLine();
        frase= frase.toLowerCase();
        System.out.println("Ingrese letra deseada");
        letra = scan.nextLine();
        scan.close();
        for (int i=0; i<frase.length(); i++){
            if (frase.charAt(i) == letra.charAt(0)) {
                lugar++;
            }
        }
            if (lugar !=0){
                System.out.println("El caracater "+ letra.charAt(0)+" se repite "+ lugar);
            } else{
                System.out.println("El caracter no se encuentra en la frase");
            }
    }
    
}
