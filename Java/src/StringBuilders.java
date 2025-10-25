public class StringBuilders {
    public static void main(String[] args) {
        String nome = "Leandro";
        nome = nome.concat(" da");
        nome = nome.concat(" Silva");
        nome = nome.concat(" Pereira");


        StringBuilder sb = new StringBuilder();
        sb.append("Leandro");
        sb.append(" da");
        sb.append(" Silva");
        sb.append(" Pereira");

        System.out.println(nome);
        System.out.println(sb);
    }
}
