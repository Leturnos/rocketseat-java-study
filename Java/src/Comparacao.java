public class Comparacao {
    public static void main(String[] args) {
        // stack vs heap

        Integer j1 = 127;
        Integer j2 = Integer.parseInt("127");

        System.out.println(j1 == j2);

        Integer i1 = 128; // a pilha, stack, armazena até 128
        Integer i2 = Integer.parseInt("128");

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2)); // Quando for comparar objetos, usa .equals

        String nome1 = "leandro";
        String nome2 = new String("Leandro");

        System.out.println(nome1.equalsIgnoreCase(nome2)); // ignora o maiusculo
    }
}
