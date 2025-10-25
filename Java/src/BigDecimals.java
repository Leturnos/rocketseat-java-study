import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimals {
    public static void main(String[] args) {
        BigDecimal zero = BigDecimal.ZERO;
        BigDecimal resultado = zero.add(new BigDecimal("100"));
        System.out.println(resultado);

        resultado = resultado.subtract(new BigDecimal("25"));
        System.out.println(resultado);

        resultado = resultado.divide(new BigDecimal(3));
        System.out.println(resultado);

        resultado = resultado.multiply(new BigDecimal(4));
        System.out.println(resultado);

        BigDecimal divisor = BigDecimal.valueOf(3);
        resultado = BigDecimal.TEN.divide(divisor,2, RoundingMode.HALF_EVEN);
        System.out.println(resultado);

        BigDecimal precolitro = BigDecimal.valueOf(5.799);
        BigDecimal litrosUtilizados = BigDecimal.valueOf(21.752);
        BigDecimal valorTotal = litrosUtilizados.multiply(precolitro);
        System.out.println("Valor total: " + valorTotal);

        BigDecimal valorArredondado = valorTotal.setScale(2, RoundingMode.HALF_EVEN);
        //UP → sempre para longe do zero.
        //
        //DOWN → sempre para perto do zero.
        //
        //HALF_EVEN → empates vão para o número par (mais justo em séries grandes de dados).
        System.out.println("Valor arredondado: " + valorArredondado);
    }
}
