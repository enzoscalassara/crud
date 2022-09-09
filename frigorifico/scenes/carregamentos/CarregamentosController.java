package frigorifico.scenes.carregamentos;

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

public class CarregamentosController {
    private Stage stage;
    private Scene scene;
    
    @FXML
    void OpenMainMenu(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        FileInputStream fileInputStream = new FileInputStream(new File("src/frigorifico/scenes/MainScreen.fxml"));
        Parent root = loader.load(fileInputStream);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void OpenScreenCarregamentoEntrada(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        FileInputStream fileInputStream = new FileInputStream(new File("src/frigorifico/scenes/carregamentos/entrada/CarregamentosEntrada.fxml"));
        Parent root = loader.load(fileInputStream);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void OpenScreenCarregamentoSaida(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        FileInputStream fileInputStream = new FileInputStream(new File("src/frigorifico/scenes/carregamentos/saida/CarregamentosSaida.fxml"));
        Parent root = loader.load(fileInputStream);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
