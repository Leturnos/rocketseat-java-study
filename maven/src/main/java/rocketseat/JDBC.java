package rocketseat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class JDBC {
    public static void main(String[] args) {
        //PreparedStatement; // Fazer inserções
        //ResultSet; // Fazer consultas

        try {
            String url = "jdbc:postgresql://localhost:5432/rocketseat-java";
            Properties props = new Properties();
            props.setProperty("user", "admin");
            props.setProperty("password", "admin");
//          props.setProperty("ssl", "true");
            Connection conn = DriverManager.getConnection(url, props);
            System.out.println("Conexão realizada com sucesso");

            String sql = "INSERT INTO public.cadastro(nome, idade) VALUES(?,?);";
            String nome = "Leandro";
            int idade = 21;

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, nome);
            preparedStatement.setInt(2, idade);

            preparedStatement.execute();
            System.out.println("Cadastro inserido com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}