import java.util.Scanner;

public class Carisellazo {
public static void main(String[] args) {

        int number = (int)(Math. random()*2+1); 

        String choice;

        Scanner lectura = new Scanner (System.in);
        System.out.println("¿Cara o sello?");
        choice = lectura.nextLine();

        if( choice.equals("cara") && number==1 ){
            System.out.println("Usted escogio cara y gano :D");
        }
        else if( choice.equals("sello") && number==2 ){
            System.out.println("Usted escogio sello y gano :D");
        }
        else if( choice.equals("cara") && number==2){
            System.out.println("Usted escogio cara y perdiste :,(");
        }
        else if( choice.equals("sello") && number==1){
            System.out.println("Ested escogio sello y perdio :,(");
        }

        lectura.close();
    }
}