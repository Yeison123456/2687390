import java.util.Scanner;

public class ChallengeNine {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int global, op, bet, bet2, count, decision;

        count=0;
        op=1;
        global=0;
            System.out.println("¿Cual es el valor global que puedes apostar?");
            global=lectura.nextInt();
        while(op==1){
            System.out.println("1.Cara o 2.Sello");
            decision=lectura.nextInt();
            System.out.println("¿Cuanto dinero quieres apostar de los " + global + " que tienes?");
            bet=lectura.nextInt();

            int number = (int)(Math. random()*2+1); 
            count=count+1;

            if(bet<=global){
                    if(number==1 && decision==1 || number==2 && decision==2){
                        global=global-bet;
                        global=global+(bet*2);
                        bet2=bet*2;
                        System.out.println("Ganaste, tu recompensa es el doble de lo que apostaste ("+bet2+")" );
                    }
                    else {
                        System.out.println("Perdiste, por lo cual perdiste lo apostado ("+bet+")");
                        global=global-bet;
                        }
                    }
            else {
                System.out.println("Tienes "+ global+" y estas apostando mas de lo que tienes");
            }
            
            System.out.println("¿Quieres seguir apostando? 1.Si 2.No");
            op=lectura.nextInt();
        }

        System.out.println("Las veces que jugaste fueron "+ count+" y el dinero acumulado que tienes es de "+global);
        lectura.close();
        }
    }

