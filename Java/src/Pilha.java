import java.util.*;

public class Pilha {
    public static void main(String[] args) {
        //LinkedList é tanto um: List, Queue e Deque
        Deque candidatos = new LinkedList();

        candidatos.add("Gleyson");
        candidatos.add("Julia");
        candidatos.add("Izabelly");
        candidatos.add("Carlos");
        candidatos.addFirst("Dona Benedita");

        imprimirCandidatos(candidatos);

        // recupera MAS não remove da Fila
        Object proximo = candidatos.peekFirst();

        System.out.println("O proximo candidato é: " + proximo);

        Object desistente = candidatos.removeLast();

        System.out.println("O ultimo candidato " + desistente + " desistiu da entrevista" );

        // recupera E remove da Fila
        proximo = candidatos.poll(); // herdou de Queue
        System.out.println("O candidato " + proximo + " entrou na sala de entrevistas");

        imprimirCandidatos(candidatos);

    }
    static void imprimirCandidatos(Collection candidatos){
        System.out.println("***Listando os candidatos***");
        for(Object candidato: candidatos){
            System.out.println(candidato);
        }
    }
}