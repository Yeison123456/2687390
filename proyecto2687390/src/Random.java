import java.util.Scanner;

public class Random {
public static void main(String[] args) {

        int numero = (int)(Math. random()*2+1); 

        String eleccion;

        Scanner lectura = new Scanner (System.in);
        System.out.println("Cara o cruz");
        eleccion = lectura.nextLine();

        if( eleccion.equals("cara") && numero==1 ){
            System.out.println("Usted escogio cara y gano :D");
        }
        else if( eleccion.equals("cruz") && numero==2 ){
            System.out.println("Usted escogio cruz y gano :,(");
        }
        else if( eleccion.equals("cara") && numero==2){
            System.out.println("Usted escogio cara y perdiste");
        }
        else if( eleccion.equals("cruz") && numero==1){
            System.out.println("Ested escogio cruz y perdio");
        }

        lectura.close();
    }
}