import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;

public class Error {
    public static void main(String[] args) {
        try {
            Double valor = Double.valueOf("a1.75");
            System.out.println(valor);
        }
        catch (NumberFormatException e){
            System.err.println("Número inválido");
        }

        try {
            DecimalFormat df = new DecimalFormat();
            DecimalFormatSymbols symbols = new DecimalFormatSymbols();
            symbols.setDecimalSeparator(',');
            symbols.setGroupingSeparator('.');
            df.setDecimalFormatSymbols(symbols);
            Number valor2 = NumberFormat.getInstance().parse("1,75");
            System.out.println(valor2);
            // o parse, diferente do valueOf, obriga tratar o erro,
            // se for em .parse, voce vai ver que ele tem o "throws"
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
