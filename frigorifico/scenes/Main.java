package frigorifico.scenes;

import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import mvc.Model;

/**
 *
 * @author ALUNO
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        /*Parent root = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();*/
        
        Scene scene2;

        FXMLLoader loader2 = new FXMLLoader();
        FileInputStream fileInputStream2 = new FileInputStream(new File("src/frigorifico/scenes/fornecedores/Fornecedores.fxml"));
        Parent root2 = loader2.load(fileInputStream2);
        scene2 = new Scene(root2);
        stage.setScene(scene2);
        stage.show();
    }
    public static Object conexao() throws SQLException, ClassNotFoundException{
        Model.driver_load();
        Object conexao = Model.conectar_bd();
        return conexao;
    }
    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Model.driver_load();
        Object conexao = Model.conectar_bd();
        //mvc.Model.select_bd(conexao, tabelas.Palete.getTabela(), tabelas.Palete.getColunas());
        launch(args);
        
    }
    
}
