import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void addLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livroListAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livroListAutor.add(l);
                }
            }
        }
        return livroListAutor;
    }

    public List<Livro> pesquisarIntervaloAno(int anoInicial, int anoFinal){
        List<Livro> livrosIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicado() >= anoInicial && l.getAnoPublicado() <= anoFinal){
                    livrosIntervaloAnos.add(l);
                }
            }
        }
        return livrosIntervaloAnos;
    }

    public List<Livro> pesquisarAnoAtual(int anoAtual) {
    List<Livro> livrosAnoAtual = new ArrayList<>();
    if (!livroList.isEmpty()) {
        for (Livro l : livroList) {
            if (l.getAnoPublicado() == anoAtual) {
                livrosAnoAtual.add(l);
            }
        }
    }
    return livrosAnoAtual;
}

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
        
    }

    public static void main(String[] args){
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.addLivro("livro 1", "autor1", 2020);
        catalogoLivros.addLivro("livro 2", "autor2", 2022);
        catalogoLivros.addLivro("livro 2", "autor2", 2019);

        System.out.println(catalogoLivros.pesquisarAutor("autor2"));
        System.out.println(catalogoLivros.pesquisarIntervaloAno(2019, 2022));
        System.out.println(catalogoLivros.pesquisarAnoAtual(2019));
        System.out.println(catalogoLivros.pesquisarAutor("autor1"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("livro 1"));


        // for(Livro l : catalogoLivros.livroList){
        //     System.out.println(l);
        // }
    }
}