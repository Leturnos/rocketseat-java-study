package rocketseat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class FabricaConexao {
    private static Connection connection;
    public static void conectar(){
        try{
            if(connection==null) {
                String url = "jdbc:postgresql://localhost:5432/rocketseat-java";
                Properties props = new Properties();
                props.setProperty("user", "admin");
                props.setProperty("password", "admin");
                connection = DriverManager.getConnection(url, props);
                System.out.println("Conexão realizada com sucesso");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
