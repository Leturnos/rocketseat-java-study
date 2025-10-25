public class StringBuilders {
    public static void main(String[] args) {
        String nome = "Leandro";
        nome = nome.concat(" da");
        nome = nome.concat(" Silva");
        nome = nome.concat(" Pereira");


        String sb = "Leandro" +
                " da" +
                " Silva" +
                " Pereira";

        System.out.println(nome);
        System.out.println(sb);
    }
}
