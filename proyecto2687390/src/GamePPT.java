import java.util.Scanner;
public class GamePPT {
    public static void main(String[] args) {
        int numero = (int)(Math. random()*3+1); 

        String eleccion;

        Scanner lectura = new Scanner (System.in);
        System.out.println("¿piedra, papel o tijeras?");
        eleccion = lectura.nextLine();

        if( eleccion.equals("pierda") && numero==1 ){
            System.out.println("Usted escogio piedra y la maquina escogio piedra, empataste");
        }
        else if( eleccion.equals("piedra") && numero==2 ){
            System.out.println("Usted escogio piedra y la maquina escogio papel, perdiste :,(");
        }
        else if( eleccion.equals("piedra") && numero==3){
            System.out.println("Usted escogio piedra y la maquina escogio tijera, ganaste :D");
        }
        else if( eleccion.equals("papel") && numero==1 ){
            System.out.println("Usted escogio papel y la maquina escogio piedra, ganaste :D");
        } 
        else if( eleccion.equals("papel") && numero==2 ){
            System.out.println("Usted escogio papel y la maquina escogio papel, empataste");
        }
        else if( eleccion.equals("papel") && numero==3){
            System.out.println("Usted escogio papel y la maquina escogio tijera, perdiste :,(");
        }
        else if( eleccion.equals("tijeras") && numero==1 ){
            System.out.println("Usted escogio tijeras y la maquina escogio piedra, perdiste :,(");
        }
        else if( eleccion.equals("tijeras") && numero==2 ){
            System.out.println("Usted escogio tijeras y la maquina escogio papel, ganaste :D");
        }
        else if( eleccion.equals("tijeras") && numero==3){
            System.out.println("Usted escogio tijeras y la maquina escogio tijera, empataste");
        }
        lectura.close();
    }
}
