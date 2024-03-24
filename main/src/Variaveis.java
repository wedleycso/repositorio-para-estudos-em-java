public class Variaveis {
    public static void main (String[] args) {

        // Toda variável é composta por : 
        // Um tipo de dado + Identificação + Valor atribuído
        
      String nome = "Wédley C. Oliveira";

        

        /*
        String:
        texto
         
        Números inteiros:
        byte = -128 a 127 (1 byte de informação equivale a 8 bits)
        short = -32768 a 32767 (2 bytes de informação ou 16 bits)
        int = -2147483648 a 2147483647 (4 bytes de informação ou 32 bits)
        Long = -9223372036854775808 a 9223372036854775807 (8 bytes de informação ou 64 bits)

        Números decimais:
        Float = 7 digitos decimais (4 bytes de infomração ou 32 bits)
        Double = 15 digitos decimais (8 bytes de informação ou 64 bits)

        Valores Booleanos:
        Boolean (1 bit de informação)

          */

      byte idade = 29;
      short estoque = 32767;
      Long contaCorrente = 9223372036854775807L;
      float real = 1.45f;
      Double dolar = 5.537275473;
      Boolean botaoAtivado = true;

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(estoque);
        System.out.println(contaCorrente);
        System.out.println(real);
        System.out.println(dolar);
        System.out.println(botaoAtivado);
      
    }
}