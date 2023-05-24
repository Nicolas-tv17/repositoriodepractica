import java.util.Scanner;

public class Condicion8{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero maximo de 9 digitos: ");
        int numero = entrada.nextInt();

        int digito1 = numero / 100000000;

        if(numero > 0 && numero < 999999999){
            if( numero == digito1){
                System.out.println("uno");
        } else {
            System.out.println("ingresa una opcion valida.");
        }
        }
   }
}