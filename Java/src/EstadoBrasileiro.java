public enum EstadoBrasileiro {
    PI ("Piaui"),
    MA ("Maranhão"),
    SP ("São Paulo"),
    RJ ("Rio de Janeiro");

    private String nome;

    private EstadoBrasileiro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static void main(String[] args) {
        System.out.println(EstadoBrasileiro.PI.getNome());
    }
}
