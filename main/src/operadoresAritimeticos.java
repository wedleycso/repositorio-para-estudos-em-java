import java.util.Scanner;

public class operadoresAritimeticos {
    /**
     * @param args
     */
    public static void main(String[] args) {

        /*
         Adição +
         Subtração -
         Multiplicação *
         Divisão /
         Resto %
         */
        int numero1;
        int numero2;
        int resul;

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Digite o primeiro Número: ");
        numero1 = entradaDoUsuario.nextInt();

        System.out.println("Digite o segundo Número: ");
        numero2 = entradaDoUsuario.nextInt();

        resul = numero1 + numero2;
        entradaDoUsuario.close();
        System.out.println("Resultado: " + resul);
    }
}