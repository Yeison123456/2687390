import java.util.Scanner;

public class Random {
public static void main(String[] args) {

        int numero = (int)(Math. random()*2+1); 

        String eleccion;

        Scanner lectura = new Scanner (System.in);
        System.out.println("Cara o cruz");
        eleccion = lectura.nextLine();

        if( numero<2 ){
            System.out.println("Usted escogio cara y gano :D");
        }
        else{
            System.out.println("Usted escogio cruz y perdio :,(");
        }

        lectura.close();
    }
}