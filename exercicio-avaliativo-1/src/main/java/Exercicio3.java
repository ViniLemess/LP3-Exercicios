import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {

    private List<String> nomes = new ArrayList<>();

    private void addNome(String novoNome) {
        for (String nome: this.nomes) {
            if (nome.equals(novoNome)) {
                throw new IllegalArgumentException("Este nome ja existe na lista!");
            }
        }
        this.nomes.add(novoNome);
    }
    private void removerNomePeloIndice(int index) {
        this.nomes.remove(index);
    }
    private boolean possuiNomes() {
        return !this.nomes.isEmpty();
    }
    private List<String> filtrarPorNome(String nomeFiltro) {
        return this.nomes.stream().filter(nome -> nome.contains(nomeFiltro)).toList();
    }
    private boolean existeNaLista(String nome) {
        return this.nomes.contains(nome);
    }
    private void limparLista() {
        this.nomes.clear();
    }
    private int getTamanhoLista() {
        return this.nomes.size();
    }
    public static void main(String[] args) {

        Exercicio3 listaDeNomes = new Exercicio3();
        listaDeNomes.addNome("Josevaldo Moreira");
        listaDeNomes.addNome("Josevaldo Almeida");
        listaDeNomes.addNome("Gabriel");
        listaDeNomes.addNome("Josevaldo Romero");

        try {
            listaDeNomes.addNome("Josevaldo Romero");
        } catch (Exception  e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Existem nomes na lista? " + listaDeNomes.possuiNomes());
        System.out.println(listaDeNomes.filtrarPorNome("Josevaldo").toString());
        System.out.println("A lista possui " + listaDeNomes.getTamanhoLista() + " nomes");
        System.out.println("Gabriel existe na lista? " + listaDeNomes.existeNaLista("Gabriel"));
        listaDeNomes.removerNomePeloIndice(2);
        System.out.println("Gabriel existe na lista? " + listaDeNomes.existeNaLista("Gabriel"));
        listaDeNomes.limparLista();
        System.out.println("Existem nomes na lista? " + listaDeNomes.possuiNomes());

    }
}
