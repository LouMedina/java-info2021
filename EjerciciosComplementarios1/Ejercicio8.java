import java.util.*;

public class Ejercicio8 {
    
    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);
        String nom, edad, dir, ciudad = " ";
        System.out.println("Ingrese nombre y apellido");
        nom = scan.nextLine();
        System.out.println("Ingrese edad");
        edad = scan.nextLine();
        System.out.println("Ingrese direccion");
        dir = scan.nextLine();
        System.out.println("Ingrese ciudad");
        ciudad = scan.nextLine();
        scan.close();
        System.out.println(ciudad+ " - "+dir+" - " + edad+ " - "+ nom);


    }
}
