import java.util.Scanner;
public class ChallengeFour {
    public static void main(String[] args) {
        int number = (int)(Math. random()*3+1); 

        String choice;

        Scanner lectura = new Scanner (System.in);
        System.out.println("¿piedra, papel o tijeras?");
        choice = lectura.nextLine();

        if( choice.equals("pierda") && number==1 ){
            System.out.println("Usted escogio piedra y la maquina escogio piedra, empataste");
        }
        else if( choice.equals("piedra") && number==2 ){
            System.out.println("Usted escogio piedra y la maquina escogio papel, perdiste :,(");
        }
        else if( choice.equals("piedra") && number==3){
            System.out.println("Usted escogio piedra y la maquina escogio tijera, ganaste :D");
        }
        else if( choice.equals("papel") && number==1 ){
            System.out.println("Usted escogio papel y la maquina escogio piedra, ganaste :D");
        } 
        else if( choice.equals("papel") && number==2 ){
            System.out.println("Usted escogio papel y la maquina escogio papel, empataste");
        }
        else if( choice.equals("papel") && number==3){
            System.out.println("Usted escogio papel y la maquina escogio tijera, perdiste :,(");
        }
        else if( choice.equals("tijeras") && number==1 ){
            System.out.println("Usted escogio tijeras y la maquina escogio piedra, perdiste :,(");
        }
        else if( choice.equals("tijeras") && number==2 ){
            System.out.println("Usted escogio tijeras y la maquina escogio papel, ganaste :D");
        }
        else if( choice.equals("tijeras") && number==3){
            System.out.println("Usted escogio tijeras y la maquina escogio tijera, empataste");
        }
        lectura.close();
    }
}
