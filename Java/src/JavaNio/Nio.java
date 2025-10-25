package JavaNio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Nio {
    public static void main(String[] args) {
        try {
            String conteudo = "Hoje aprendemos sobre Java IO - OutputStream e escrita";

            File aulaFile = new File("aula-java-nio.txt");

            FileOutputStream output = new FileOutputStream(aulaFile);
            char [] caracteres = conteudo.toCharArray();

//            Percebemos que para uma operação simples foram necessárias algumas linhas de
//            códigos para ser possível cada caractere do conteúdo por vez. Para melhorar o nosso
//            programa iremos desfrutar da combinação das classes FileOutputStream com a
//            ByteArrayOutputStream.

            int x = 0;

            while (x < conteudo.length()) {
                // escreve caractere por caractere
                output.write(caracteres[x++]);
            }
            // fecha o arquivo
            output.close();
        } catch (IOException e) {
            // um erro acontecerá se o diretório não existir previamente
            e.printStackTrace();
        }
    }
}
