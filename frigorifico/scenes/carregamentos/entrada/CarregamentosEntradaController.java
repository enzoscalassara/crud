package frigorifico.scenes.carregamentos.entrada;

import frigorifico.scenes.Main;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import mvc.Model;
import tabelas.Carregamento_entrada;

public class CarregamentosEntradaController implements Initializable{
    private Stage stage;
    private Scene scene;
    
    @FXML
    void Deletar(ActionEvent event)  throws FileNotFoundException, IOException {
        Carregamento_entrada selected = tableview.getSelectionModel().getSelectedItem();
        
        
        DeletarCarregamento_entradaController controller = new DeletarCarregamento_entradaController(selected);
        FXMLLoader loader = new FXMLLoader();
        loader.setController(controller);
        FileInputStream fileInputStream = new FileInputStream(new File("src/frigorifico/scenes/carregamentos/entrada/DeletarCarregamento_entrada.fxml"));
        Parent root = loader.load(fileInputStream);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        
       
        
        final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(stage);
                dialog.setScene(scene);
                dialog.show();
    }

    @FXML
    void Editar(ActionEvent event) throws FileNotFoundException, IOException {
        Carregamento_entrada selected = tableview.getSelectionModel().getSelectedItem();

        
        EditarCarregamento_entradaController controller = new EditarCarregamento_entradaController(selected);
        FXMLLoader loader = new FXMLLoader();
        loader.setController(controller);
        FileInputStream fileInputStream = new FileInputStream(new File("src/frigorifico/scenes/carregamentos/entrada/EditarCarregamento_entrada.fxml"));
        Parent root = loader.load(fileInputStream);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        
       
        
        final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(stage);
                dialog.setScene(scene);
                dialog.show();
    }

    @FXML
    void Inserir(ActionEvent event) throws FileNotFoundException, IOException {
        FXMLLoader loader = new FXMLLoader();
        FileInputStream fileInputStream = new FileInputStream(new File("src/frigorifico/scenes/carregamentos/entrada/InserirCarregamento_entrada.fxml"));
        Parent root = loader.load(fileInputStream);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        
        final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(stage);
                dialog.setScene(scene);
                dialog.show();
    }

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
    private TableView<Carregamento_entrada> tableview;
    @FXML
    private TableColumn<Carregamento_entrada, String> colData_chegada;
    @FXML
    private TableColumn<Carregamento_entrada, String> colTransportadora;
    @FXML
    private TableColumn<Carregamento_entrada, String> colMotorista;
    
    ObservableList<Carregamento_entrada> oblist = FXCollections.observableArrayList();
    
    private void openTableView(){
        try {
            Object conexao = Main.conexao();
        
        
        ResultSet result = Model.select_bd(conexao, Carregamento_entrada.getTabela(), Carregamento_entrada.getColunasID());
        
        while (result.next()){
            oblist.add(new Carregamento_entrada(result.getInt("id_carregamento_entrada"), result.getInt("id_fornecedor"), result.getString("data_chegada"), 
                    result.getString("transportadora"), result.getString("motorista")));

        }
        
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CarregamentosEntradaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        colData_chegada.setCellValueFactory(new PropertyValueFactory<>("data_chegada"));
        colTransportadora.setCellValueFactory(new PropertyValueFactory<>("transportadora"));
        colMotorista.setCellValueFactory(new PropertyValueFactory<>("motorista"));
        
        tableview.setItems(oblist);
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        openTableView();
        
    }

}
