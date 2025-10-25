import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        String nome = null;
        Integer idade = null;
        Double peso = null;

        String input = "Leandro;20;64.5";
        Scanner scan = new Scanner(input);
        scan.useDelimiter(";");

        int index = 0;
        while (scan.hasNext()){
            if (index == 0) {
                nome = scan.next();
            }
            else if (index == 1) {
                idade = Integer.valueOf(scan.next());
            }
            else{
                peso = Double.valueOf(scan.next());
            }
            index++;
        }

        System.out.println("Nome: " +nome + ", idade: " +idade + ", peso: " +peso);
        System.out.printf("Nome: %s, idade: %d, peso: %.2f", nome,idade,peso);
    }
}
