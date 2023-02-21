import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        
        int buy;
        double red, blue, yellow;
        String desicion;
        
        System.out.println("Ingrese el valor de la compra");
        buy= lectura.nextInt();
        
        if( buy>=50000 ){
            System.out.println("Su compra a sido beneficiado con el descuento de nuestro aniversario");
        }
        lectura.nextLine();
        System.out.println("Tienes que sacar una bolita, hay 4 bolita en total cada bolita tiene un descuento diferente, ¿Estas listo para sacar la bolita?");
        desicion=lectura.nextLine();
        
        int bolita = (int)(Math. random()*4+1); 

        if( bolita==1){
            red=(buy*10)/100;
            System.out.println("Sacaste la bolita roja la cual tiene un descuento del 10%, el total que tienes que pagar es de " + red);
        }
        else if( bolita==2 ){
            blue=(buy*30)/100;
            System.out.println("Sacaste la bolita azul la cual tiene un descuento del 30%, el total que tienes que pagar es de " + blue);
        }
        else if( bolita==3 ){
            yellow=(buy*50)/100;
            System.out.println("Sacaste la bolita amarilla la cual tiene un descuento del 50%, el total que tienes que pagar es de " + yellow);
        }
        else if ( bolita==4){
            System.out.println("Sacaste la bolita blanca la cual tiene un descuento del 100%, te llevas tu compra gratis :D ");
        }
        lectura.close();
    }
}
