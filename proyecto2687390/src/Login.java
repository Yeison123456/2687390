import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner lectura= new Scanner (System.in);

        String user, password;
        System.out.println("Ingrese el usuario");
        user=lectura.nextLine();
        System.out.println("Ingrese la contraseña");
        password=lectura.nextLine();

        if( user.equals("yeison") && password.equals("yeisonxd:v")){
            System.out.println("Bienvenido al sistema");
        }
        else if(  user.equals("yeison" )){
            System.out.println("Parece que olvidaste tus credenciales de acceso");
        }

        else if( password.equals("yeisonxd:v")){
            System.out.println("Algo pasa con tus claves de acceso");
        }
        else {
            System.out.println("Acceso denegado");
        }

        lectura.close();
    }
}
