import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class For {
    public static void main(String[] args) {
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println(carneirinhos + " carneirinhos...");
            if (carneirinhos == new Random().nextInt(20)){
                int y = ThreadLocalRandom.current().nextInt(1, 20 ); // sorteia um número entre 1 e 20
                System.out.println("Dormiu e só contou..." + y + " ovelhas eu acho?");
                break;
            }
        }

    }
}
