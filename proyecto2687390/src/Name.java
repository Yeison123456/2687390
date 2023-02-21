import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        String name, lastName, nameComplete;
        System.out.println( "Ingrese su nombre");
        name=lectura.nextLine();
        System.out.println("Ingrese su apellido");
        lastName=lectura.nextLine();

        //longitud de la cadena//
        System.out.println("La longitud del nombre es:" + name.length() + "caracteres");
        System.out.println("La longitud del apellido es:" + lastName.length()+ "caracteres");

        //nombre en Mayuscula y apellido en minuscula//
        System.out.println("Nombre en mayuscula y apellido en minuscula");
        System.out.println(name.toUpperCase());
        System.out.println(lastName.toLowerCase());

        //nombre y apellido juntos//
        nameComplete=name+lastName;
        System.out.println("La union del nombre y apellido: " + nameComplete);

        //las dos primeras letras del nombre y juntarlos con el apellido//
        String subName = name.substring(0, 2);
        System.out.println(subName+lastName);

        lectura.close();
    }
}
