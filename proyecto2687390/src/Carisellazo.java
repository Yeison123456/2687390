import java.util.Scanner;

public class Carisellazo {
public static void main(String[] args) {

        int numero = (int)(Math. random()*2+1); 

        String eleccion;

        Scanner lectura = new Scanner (System.in);
        System.out.println("¿Cara o sello?");
        eleccion = lectura.nextLine();

        if( eleccion.equals("cara") && numero==1 ){
            System.out.println("Usted escogio cara y gano :D");
        }
        else if( eleccion.equals("sello") && numero==2 ){
            System.out.println("Usted escogio sello y gano :D");
        }
        else if( eleccion.equals("cara") && numero==2){
            System.out.println("Usted escogio cara y perdiste :,(");
        }
        else if( eleccion.equals("sello") && numero==1){
            System.out.println("Ested escogio sello y perdio :,(");
        }

        lectura.close();
    }
}