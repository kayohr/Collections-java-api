import java.util.Objects;


public class Convidado {

    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }
    
    //os dois debaixo deixou a resposta mais organizado, mas sem eles funciona também
    public boolean equals(Object o) {
        if(this == o) return true;
        if (!(o instanceof Convidado)) return false;
        Convidado convidado = (Convidado) o; 
        return getCodigoConvite() == convidado.getCodigoConvite(); //getCodigoConvite seria a chave primaria, aqui nessa func ia ver no banco de dados se tem repetido.
    }

    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    public String toString() {
        return "Convidado{" +
            "nome='" + nome + '\'' +
            ", codigoConvite=" + codigoConvite +
            '}';
  }
}