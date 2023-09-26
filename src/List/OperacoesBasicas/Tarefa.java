public class Tarefa {
    // atributo
    private String descricao;

    // constructor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    } // Feche o construtor aqui

    // Método getter para a descrição
    public String getDescricao() {
        return descricao;
    }

    public String toString() {
        return descricao;
    }
}