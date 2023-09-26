import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList; //uma list com generics. O tarefaList é o nome do atributo

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void addTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removeTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);//remover os elemetos repetidos
    }

    public int obterTotalTarefas(){
        return tarefaList.size(); //quantidade de elementos dentro da lista, o tamanho
    }

    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.addTarefa("Tarefa 50");
        listaTarefa.addTarefa("Tarefa 60");
        listaTarefa.addTarefa("Tarefa 80");

        System.out.println(listaTarefa.obterTotalTarefas());
        
        System.out.println("Total de tarefas: " + listaTarefa.obterTotalTarefas());


        listaTarefa.removeTarefa("Tarefa 50");
        System.out.println(listaTarefa.obterTotalTarefas()); 

        listaTarefa.obterDescricaoTarefas();
    }
}