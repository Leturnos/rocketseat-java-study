package FilaPrioridade;

import java.util.*;

public class Fila {
    public static void main(String[] args) {
        PriorityQueue <Cliente> clientes = new PriorityQueue<>();
        clientes.add(new Cliente("Jose", 1));
        clientes.add(new Cliente("Marcos", 1));
        clientes.add(new Cliente("Maria Lucia", 0));
        clientes.add(new Cliente("Estefany", 1));
        clientes.add(new Cliente("Joaquim da Silva", 0));

        imprimirClientes(clientes);

        System.out.println("O próximo cliente da fila sera? " + clientes.peek());
        System.out.println("Acabamos de atender o Senhor(a) " + clientes.poll());
        System.out.println("O próximo cliente da fila sera? " + clientes.peek());
        System.out.println("Acabamos de atender o Senhor(a) " + clientes.poll());

        clientes.add(new Cliente("Antonia Moreira", 0));
        System.out.println("Antonia Moreira entrou na fila com prioridade");

        imprimirClientes(clientes);

        System.out.println("O próximo cliente da fila sera? " + clientes.peek());
    }
    // não se assuste com o nível de abstração, em breve você vai entender
    static void imprimirClientes(Collection clientes){
        System.out.println("***Listando os inscritos***");
        for(Object cliente: clientes){
            System.out.println(cliente);
        }
    }
}

