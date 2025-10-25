import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();
        System.out.println(horaAtual);

        LocalTime horaMinutoSegundoEspecifico = LocalTime.of(13,21,42); // 13:21:42
        System.out.println(horaMinutoSegundoEspecifico);

        LocalTime horaMinutoEspecifico = LocalTime.of(13,21); // 13:21
        System.out.println(horaMinutoEspecifico);

        LocalTime horaDeUmaString = LocalTime.parse("13:21:42");
        System.out.println(horaDeUmaString);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
        LocalTime horaDeUmaStringDespadronizada = LocalTime.parse("132142", formatter);
        System.out.println(horaDeUmaStringDespadronizada);

        LocalTime horaAtual1 = LocalTime.now();
        LocalTime horaAtualMais30Minutos = horaAtual1.plusMinutes(30);
        LocalTime horaAtualMenos2Horas = horaAtual1.minusHours(2);
        System.out.println(horaAtual1);
        System.out.println(horaAtualMais30Minutos);
        System.out.println(horaAtualMenos2Horas);

        LocalTime horaAtual2 = LocalTime.now();
        LocalTime horaAtualMenos2Horas1 = horaAtual2.minusHours(2);
        boolean passado = horaAtual2.isBefore(horaAtualMenos2Horas1);
        System.out.println(passado);
        LocalTime hora = LocalTime.of(13,21,42);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("ss-mm-HH");
        String horaFormatada = hora.format(formatter1);
        System.out.println(horaFormatada); //42-21-13

        LocalTime hora1 = LocalTime.of(13,21,42);
        System.out.println(hora1.getHour());     //13
        System.out.println(hora1.getMinute());   //21
        System.out.println(hora1.getSecond());   //42
        System.out.println(hora1.getNano());     //0

    }
}
