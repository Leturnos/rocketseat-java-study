package rocketseat;

public class Cadastro {
    private Integer id;
    private String nome;
    private int idade;

    public Cadastro(){

    }

    public Cadastro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
