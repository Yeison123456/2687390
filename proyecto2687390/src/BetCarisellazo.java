import java.util.Scanner;

public class BetCarisellazo {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int global, op, bet, count, decision;

        count=0;
        op=1;
        global=0;
        while(op==1){
            System.out.println("1.Cara o 2.Sello");
            decision=lectura.nextInt();
            System.out.println("¿Cuanto dinero quieres apostar?");
            bet=lectura.nextInt();

            int numero = (int)(Math. random()*2+1); 
            count=count+1;

            if(numero==1 && decision==1 || numero==2 && decision==2){
                System.out.println("Ganaste, tu recompensa es el doble de lo que apostaste");
                global=global+(bet*2);
            }
            else{
                System.out.println("Perdiste, por lo cual perdiste lo apostado");
                global=global-bet;
            }

            System.out.println("¿Quieres seguir apostando? 1.Si 2.No");
            op=lectura.nextInt();
        }

        System.out.println("Las veces que jugaste fueron "+ count+" y el dinero que ganaste o perdiste es de "+global);
    }
}
