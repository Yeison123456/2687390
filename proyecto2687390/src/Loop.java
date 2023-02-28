import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int price, amount, counter, subTotal, total, bill, change;
        Scanner lectura= new Scanner(System.in);

            counter=0;
            total=0;//acumulador//
            for( int x=1; x<=5; x++){
                System.out.println("Digite el precio del producto");
                price=lectura.nextInt();

                System.out.println("Digite la cantidad del producto");
                amount=lectura.nextInt();

                counter=counter+1;
                subTotal=price*amount;
                total=total+subTotal;
                System.out.println("El subtotal es de " + subTotal);
            }
            System.out.println("El valor a pagar es de " + total);
            System.out.println("¿Con cuanto vas a pagar?");
            bill=lectura.nextInt();
            change=bill-total;
            System.out.println("Su cambio es de " + change);

            lectura.nextLine();
            String respuesta;
            System.out.println("¿Cuenta con telefonia movil exito?");
            respuesta=lectura.nextLine();

            if(respuesta.equals("si")){
                System.out.println("Los minutos que obtuvo con su compra son " + counter);
            }
            else {
                System.out.println("No pierdas mas minutos, adquiere ya tu telefonia movil exito");
            }

            lectura.close();
    }
}
