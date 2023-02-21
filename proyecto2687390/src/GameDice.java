import java.util.Scanner;
public class GameDice {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        String tirar;
        System.out.println("¿Quieres tirar los dados?");
        tirar=lectura.nextLine();
        int dado1 = (int)(Math. random()*6+1); 
        int dado2 = (int)(Math. random()*6+1); 

        //ganas con par de 1//
        if( dado1==1 && dado2==1 ){
            System.out.println("Salio par, ganaste con 2 :D");
        } // o con par de 6//
        else if(dado1==6 && dado2==6 ){
            System.out.println("Salio par, ganaste con 12 :D");
        }//ganas si obtienes un total de 3//
        else if( dado1==2 && dado2==1 || dado1==1 && dado2==2){
            System.out.println("Salio 2 y 1, ganaste con 3 :D");
        }//ganas si obtienes un total de 11//
        else if( dado1==5 && dado2==6 || dado1==6 && dado2==5){
            System.out.println("Salio 5 y 6, ganaste con 11 :D");
        } //ganas si obtienes un total de 7//
        else if(dado1==6 && dado2==1 || dado1==1 && dado2==6 ){
            System.out.println("Salio 6 y 1, ganaste con 7 :D");
        }
        else if(dado1==2 && dado2==5 || dado1==5 && dado2==2){
            System.out.println("Salio 2 y 5, ganaste con 7 :D");
        }
        else if(dado1==3 && dado2==4 || dado1==4 && dado2==3 ){
            System.out.println("Salio 3 en el primer dado y 4 en el segundo dado, ganaste con 7 :D");
        }
        else{
            System.out.println("Perdiste");
        }
        lectura.close();
    }
}
