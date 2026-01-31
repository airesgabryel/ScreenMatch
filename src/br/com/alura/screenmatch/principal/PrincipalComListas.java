package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        Filme filmeDoPaulo = new Filme("Dogville", 2000);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoPaulo; // <-- variável de referência

        ArrayList<Titulo> lista = new ArrayList<>();
        //podemos utilizar List no lugar de ArrayList, basta importar o método
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação" + filme.getClassificacao());
            }
        }


        //ordenando ArrayList.
        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Gabryel");
        buscaPorArtista.add("Wattson");
        buscaPorArtista.add("Jacqueline");


        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);

        //escolhendo critério de comparação da ordenação.
        System.out.println("Lista de títulos ordenada por letras:");
        Collections.sort(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNome() + ", " + lista.get(i).getAnoDeLancamento());
        }
        System.out.println();
        System.out.println("Nova lista ordenada por ano: ");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i).getNome() + " " + lista.get(i).getAnoDeLancamento() + ", ");
        }




    }
}
