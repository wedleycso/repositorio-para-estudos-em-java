public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);
        pessoa.exibeDados();
    }

    static class Pessoa {
        private String nome;
        private int idade;

        public Pessoa(String n, int i) {
            setNome(n);
            setIdade(i);
        }

        public void setNome(String n) {
            nome = n;
        }

        public String getNome() {
            return nome;
        }

        public void setIdade(int id) {
            idade = id;
        }

        public int getIdade() {
            return idade;
        }

        public void fazAniversario() {
            idade++;
        }

        public void exibeDados() {
            System.out.println("Nome: " + getNome());
            System.out.println("Idade: " + getIdade());
        }
    }
}
