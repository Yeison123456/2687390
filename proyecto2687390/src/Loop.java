import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int precio, cantidad, contador, subTotal, total, billete, cambio;
        Scanner lectura= new Scanner(System.in);

            contador=0;
            total=0;//acumulador//
            for( int x=1; x<=5; x++){
                System.out.println("Digite el precio del producto");
                precio=lectura.nextInt();

                System.out.println("Digite la cantidad del producto");
                cantidad=lectura.nextInt();

                contador=contador+1;
                subTotal=precio*cantidad;
                total=total+subTotal;
                System.out.println("El subtotal es de " + subTotal);
            }
            System.out.println("El valor a pagar es de " + total);
            System.out.println("¿Con cuanto vas a pagar?");
            billete=lectura.nextInt();
            cambio=billete-total;
            System.out.println("Su cambio es de " + cambio);

            lectura.nextLine();
            String respuesta;
            System.out.println("¿Cuenta con telefonia movil exito?");
            respuesta=lectura.nextLine();

            if(respuesta.equals("si")){
                System.out.println("Los minutos que obtuvo con su compra son " + contador);
            }
            else {
                System.out.println("No pierdas mas minutos, adquiere ya tu telefonia movil exito");
            }

            lectura.close();
    }
}
