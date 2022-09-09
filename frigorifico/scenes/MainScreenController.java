package frigorifico.scenes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainScreenController {
    private Stage stage;
    private Scene scene;
    
    @FXML
    void OpenScreenCarregamentos(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader();
        FileInputStream fileInputStream = new FileInputStream(new File("src/frigorifico/scenes/carregamentos/Carregamentos.fxml"));
        Parent root = loader.load(fileInputStream);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void OpenScreenCompradores(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader();
        FileInputStream fileInputStream = new FileInputStream(new File("src/frigorifico/scenes/compradores/Compradores.fxml"));
        Parent root = loader.load(fileInputStream);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void OpenScreenEstoque(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader();
        FileInputStream fileInputStream = new FileInputStream(new File("src/frigorifico/scenes/estoque/Estoque.fxml"));
        Parent root = loader.load(fileInputStream);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void OpensScreenFornecedores(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader();
        FileInputStream fileInputStream = new FileInputStream(new File("src/frigorifico/scenes/fornecedores/Fornecedores.fxml"));
        Parent root = loader.load(fileInputStream);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
