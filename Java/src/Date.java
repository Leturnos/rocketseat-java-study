import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Date {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        System.out.println(dataAtual);

        System.out.println(LocalDateTime.of(2023,6,25,16,25));

        LocalDate dataNascimento = LocalDate.of(2004, 10, 5);
        System.out.println(dataNascimento);

        String data = "2025-08-14";
        System.out.println(LocalDate.parse(data));

        String dataBr = "05/11/2012";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(LocalDate.parse(dataBr, formatter));

        LocalDate data1 = LocalDate.of(2023, 3, 4);
        LocalDate data2 = LocalDate.of(2022, 2, 3);

        System.out.println(data2.isAfter(data1)); // false
        System.out.println(data2.isBefore(data1)); // true
        System.out.println(data2.isEqual(data1)); // false

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        System.out.println(data1); // 2023-03-04
        System.out.println(formatter1.format(data1)); // 04 de março de 2023

        LocalDate data3 = LocalDate.of(2023, 1, 13);
        String dataFormatada = data3.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println(dataFormatada);
        dataFormatada = data3.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(dataFormatada);
        dataFormatada = data3.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(dataFormatada);
        dataFormatada = data3.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(dataFormatada);

        LocalDate data4 = LocalDate.of(2021, 8, 23);
        Locale[] locales = {Locale.CANADA, Locale.US, new Locale("fi", "FI"), Locale.UK};
        for (Locale locale : locales) {
            String dataFormatada2 = data4.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale));
            System.out.println(dataFormatada2);
        }

        LocalDate data5 = LocalDate.of(2020,8,20);
        System.out.println(data5.getDayOfMonth());   // retorna o dia do mês -> 23
        System.out.println(data5.getYear());         // retorna o ano -> 2023
        System.out.println(data5.getMonth());        // retorna o elemento de enum java.time.Month -> AUGUST
        System.out.println(data5.getMonthValue());   // retorna o número do mês entre 1-12 -> 8

    }
}
