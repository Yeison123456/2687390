import java.util.Scanner;
public class ChallengeSix {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        String tirar;
        System.out.println("¿Quieres tirar los dados?");
        tirar=lectura.nextLine();
        int given1 = (int)(Math. random()*6+1); 
        int given2 = (int)(Math. random()*6+1); 

        //ganas con par de 1//
        if( given1==1 && given2==1 ){
            System.out.println("Salio par, ganaste con 2 :D");
        } // o con par de 6//
        else if(given1==6 && given2==6 ){
            System.out.println("Salio par, ganaste con 12 :D");
        }//ganas si obtienes un total de 3//
        else if( given1==2 && given2==1 || given1==1 && given2==2){
            System.out.println("Salio 2 y 1, ganaste con 3 :D");
        }//ganas si obtienes un total de 11//
        else if( given1==5 && given2==6 || given1==6 && given2==5){
            System.out.println("Salio 5 y 6, ganaste con 11 :D");
        } //ganas si obtienes un total de 7//
        else if(given1==6 && given2==1 || given1==1 && given2==6 ){
            System.out.println("Salio 6 y 1, ganaste con 7 :D");
        }
        else if(given1==2 && given2==5 || given1==5 && given2==2){
            System.out.println("Salio 2 y 5, ganaste con 7 :D");
        }
        else if(given1==3 && given2==4 || given1==4 && given2==3 ){
            System.out.println("Salio 3 en el primer dado y 4 en el segundo dado, ganaste con 7 :D");
        }
        else{
            System.out.println("Perdiste");
        }
        lectura.close();
    }
}
