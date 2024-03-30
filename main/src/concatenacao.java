import java.util.Scanner;

public class concatenacao {
    public static void main(String[] args) {
        String nome;
        String sobrenome;
        byte idade;

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        nome = entradaDoUsuario.nextLine();
        
        System.out.println("Qual é o seu Sobrenome?");
        sobrenome = entradaDoUsuario.nextLine();

        System.out.println("Qual a sua idade?");
        idade = entradaDoUsuario.nextByte();

        
        entradaDoUsuario.close();

        System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade);

        
    }
}