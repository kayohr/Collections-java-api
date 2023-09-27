import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void addConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removeConvidadoPorCOnvite(int codigoConvite){ //o nome pode ser igual, menos convite
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args){
        ConjuntoConvidados cj = new ConjuntoConvidados();//instanciacao
        // System.out.println(cj.contarConvidados());

            cj.addConvidado("convidado 1", 123);
            cj.addConvidado("convidado 2", 124);
            cj.addConvidado("convidado 3", 125);
            cj.addConvidado("convidado 4", 125);

            System.out.println(cj.contarConvidados());

            cj.removeConvidadoPorCOnvite(125);
            System.out.println(cj.contarConvidados());

            cj.exibirConvidados();

    }

}