public class Switch {
    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla) {
            case "P":{
                System.out.println("Tamanho pequeno");
                break;
            }
            case "M":{
                System.out.println("Tamanho médio");
                //break; precisa do break
            }
            case "G":{
                System.out.println("Tamanho grande");
                break;
            }
            default:{
                System.out.println("Indefinido");
            }
        }
    }
}