import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        //2023-06-25T16:25 -> data e hora sem segundo
        LocalDateTime dataHora = LocalDateTime.of(2023,6,25, 16,25);
        //2023-06-25T16:25:33 -> data e hora com segundo
        dataHora = LocalDateTime.of(2023,6,25, 16,25,33);

        LocalDateTime dataHora2 = LocalDateTime.of(2023,6,25, 16,25);
        LocalDateTime proximoMes = dataHora.plusMonths(1);
        LocalDateTime dataHoraComMenos15Minutos = dataHora.minusMinutes(15);
        LocalDateTime dataHoraDefinindoSegundoZero = dataHora.withSecond(33);

        LocalDateTime dataHora3 = LocalDateTime.of(2023,6,25, 16,25,17);
        // comparando dois objetos data/hora em sua totalidade
        boolean dataHoraIgual = dataHora2.equals(dataHora3); //false
        //comparando dígito específico de uma data e hora
        boolean dataHoraDigitoIgual = dataHora2.getDayOfMonth()==dataHora2.getDayOfMonth();

        LocalDateTime dataHora4 = LocalDateTime.of(2023,7,22,17,33);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        String dataHoraFormatada = dataHora4.format(formatter);
        System.out.println(dataHoraFormatada); // 22/07/23 17:33:00
    }
}
