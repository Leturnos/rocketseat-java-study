import java.util.Random;

public class DoWhile {
    private static int numeroTentativas=0;

    public static void main(String[] args) {
        System.out.println("Discando...");
        do{
            System.out.println("Telefone tocando...");
        } while (tocando());

        if (numeroTentativas <= 5) {
            System.out.println("Alô?");
        }
        else{
            System.out.println("Ligação perdida...");
        }
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(10)==1;
        numeroTentativas++;
        if (numeroTentativas >= 5){
            return false;
        }
        else {
            System.out.println("Atendeu? " + atendeu);
            return !atendeu;
        }
    }
}
