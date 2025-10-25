package FilaPrioridade;

// Tornando a classe Cliente comparável
class Cliente implements Comparable<Cliente> {
    private String nome;
    // 0 = preferencial / 1 = normal
    private Integer prioridade;

    public Cliente(String nome, Integer prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Cliente o) {
        // valida se minha prioridade é superior ao outro elemento
        // todas as classes Wrappers já comparáveis
        return prioridade.compareTo(o.prioridade);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }
}