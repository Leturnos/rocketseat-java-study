import java.util.*;

public class Generics {
    public static void main(String[] args) {
        List<String> pessoas = new ArrayList();
        pessoas.add("marcos");
        pessoas.add("joao");
        pessoas.add("patricia");
        pessoas.add("fernando");
        pessoas.add("mirela");

        Collections.addAll(pessoas,"julia","alessandra");	// Adiciona uma sequência de novos elementos em uma coleção
        imprimirLista(pessoas);
        Collections.sort(pessoas); // Classifica uma coleção pela ordem natural ou por um classificador
        imprimirLista(pessoas);
        Collections.reverse(pessoas); // Inverte a ordem da lista com base na inserção ou classificação
        imprimirLista(pessoas);
        Collections.shuffle(pessoas); //Embaralha os elementos podendo receber ordens alteradas em cada execução
        imprimirLista(pessoas);
    }

    public static void imprimirLista(List<String> pessoas) {
        for(Object pessoa:pessoas){
            System.out.println(pessoa);
        }
        System.out.println();
    }
}