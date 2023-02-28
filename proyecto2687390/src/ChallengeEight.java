import java.util.Scanner;

public class ChallengeEight {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int op;
        double buy, price, amount, totals, ticket, change, changeR, changeB, disfoundR, disfoundB, changeY, red, blue, yellow;
        String desicion;
        
        op=1;
        totals=0;
        do {

            System.out.println("Ingrese el precio del producto");
            price= lectura.nextDouble();
            System.out.println("Ingrese el la cantidad del producto");
            amount= lectura.nextDouble();

            buy=price*amount;
            totals=totals+buy;

            System.out.println("¿Desea registrar otra compra? 1.Si 2.No");
            op=lectura.nextInt();
            
            
        }while(op==1);

    if( totals>=50000 ){
        System.out.println("Su compra a sido beneficiad@ con el descuento de nuestro aniversario, con un gasto de " + totals);
        lectura.nextLine();
        System.out.println("Tienes que sacar una bolita, hay 4 bolitas en total cada bolita tiene un descuento diferente, ¿Estas listo para sacar la bolita, si o no?");
        desicion=lectura.nextLine();
        
        int bolita = (int)(Math. random()*4+1); 
            if( desicion.equals("si") && bolita==1 ){
                disfoundR=(totals*10)/100;
                red=(totals*90)/100;
                System.out.println("Sacaste la bolita roja la cual tiene un descuento del 10%(" + disfoundR +"), el total que tienes que pagar es de " + red);
                System.out.println("¿Con cuanto dinero piensa pagar?");
                ticket=lectura.nextInt();
                    while(ticket<=red){
                        System.out.println("No te alcanza para pagar la compra, digita un precio mas alto o igual que "+ red);
                        System.out.println("¿Con cuanto dinero piensa pagar?");
                        ticket=lectura.nextInt();
                    }
                changeR=ticket-red;
                System.out.println("Tu cambio es de "+changeR);
            }
            else if( desicion.equals("si") && bolita==2 ){
                disfoundB=(totals*30)/100;
                blue=(totals*70)/100;
                System.out.println("Sacaste la bolita azul la cual tiene un descuento del 30%("+disfoundB+ "), el total que tienes que pagar es de " + blue);
                System.out.println("¿Con cuanto dinero piensa pagar?");
                ticket=lectura.nextInt();
                    while(ticket<=blue){
                        System.out.println("No te alcanza para pagar la compra, digita un precio mas alto o igual que "+ blue);
                        System.out.println("¿Con cuanto dinero piensa pagar?");
                        ticket=lectura.nextInt();
                    }
                changeB=ticket-blue;
                System.out.println("Tu cambio es de "+changeB);
            }
            else if( desicion.equals("si") && bolita==3 ){
                yellow=(totals*50)/100;
                System.out.println("Sacaste la bolita amarilla la cual tiene un descuento del 50%("+yellow+"), el total que tienes que pagar es de " + yellow);
                System.out.println("¿Con cuanto dinero piensa pagar?");
                ticket=lectura.nextInt();
                    while(ticket<=yellow){
                        System.out.println("No te alcanza para pagar la compra, digita un precio mas alto o igual que "+ yellow);
                        System.out.println("¿Con cuanto dinero piensa pagar?");
                        ticket=lectura.nextInt();
                    }
                changeY=ticket-yellow;
                System.out.println("Tu cambio es de "+changeY);
            }
             else if(desicion.equals("si") && bolita==4){
                System.out.println("Sacaste la bolita blanca la cual tiene un descuento del 100%, te llevas tu compra gratis :D ");
            }
            else {
                System.out.println("Quien rechaza un descuento? :/, El total que tienes que pagar es de "+ totals);
                System.out.println("¿Con cuanto dinero piensa pagar?");
                ticket=lectura.nextInt();
                while(ticket<=totals){
                    System.out.println("No te alcanza para pagar la compra, digita un precio mas alto o igual que "+ totals);
                    System.out.println("¿Con cuanto dinero piensa pagar?");
                    ticket=lectura.nextInt();
                }
                change=ticket-totals;
                System.out.println("Tu cambio es de "+change);
            }
    }   
        else{

            System.out.println("No superaste el gasto necesario para participar por el descuento, el total que tienes que pagar es de "+totals);
            System.out.println("¿Con cuanto dinero piensa pagar?");
            ticket=lectura.nextInt();
            change=ticket-totals;
            System.out.println("Tu cambio es de "+change);
        }
        
        

        System.out.println("Gracias por su compra");
        lectura.close();
    }
}
