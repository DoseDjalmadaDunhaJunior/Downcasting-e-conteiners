public class Individuo extends Homem{
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    private String nome;
    private int idade;
    private String classe;
}
