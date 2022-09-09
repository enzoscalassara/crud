package frigorifico.scenes.fornecedores;

import frigorifico.scenes.Main;
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
import tabelas.Fornecedor;

public class FornecedoresController implements Initializable {
    private Stage stage;
    private Scene scene;

    
    @FXML
    private ResourceBundle resources;
    
    @FXML
    void Deletar(ActionEvent event) throws FileNotFoundException, IOException {
        Fornecedor selected = tableview.getSelectionModel().getSelectedItem();
        
        
        DeletarFornecedorController controller = new DeletarFornecedorController(selected);
        FXMLLoader loader = new FXMLLoader();
        loader.setController(controller);
        FileInputStream fileInputStream = new FileInputStream(new File("src/frigorifico/scenes/fornecedores/DeletarFornecedor.fxml"));
        Parent root = loader.load(fileInputStream);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        
       
        
        final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(stage);
                dialog.setScene(scene);
                dialog.showAndWait(); 
                
                
                Stage stage2;
                Scene scene2;

                FXMLLoader loader2 = new FXMLLoader();
                FileInputStream fileInputStream2 = new FileInputStream(new File("src/frigorifico/scenes/fornecedores/Fornecedores.fxml"));
                Parent root2 = loader2.load(fileInputStream2);
                stage2 = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene2 = new Scene(root2);
                stage2.setScene(scene2);
                stage2.show();
    }

    @FXML
    void Editar(ActionEvent event) throws IOException {

        Fornecedor selected = tableview.getSelectionModel().getSelectedItem();

        
        EditarFornecedorController controller = new EditarFornecedorController(selected);
        FXMLLoader loader = new FXMLLoader();
        loader.setController(controller);
        FileInputStream fileInputStream = new FileInputStream(new File("src/frigorifico/scenes/fornecedores/EditarFornecedor.fxml"));
        Parent root = loader.load(fileInputStream);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        
       
        
        final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(stage);
                dialog.setScene(scene);
                dialog.showAndWait(); 
                
                
                Stage stage2;
                Scene scene2;

                FXMLLoader loader2 = new FXMLLoader();
                FileInputStream fileInputStream2 = new FileInputStream(new File("src/frigorifico/scenes/fornecedores/Fornecedores.fxml"));
                Parent root2 = loader2.load(fileInputStream2);
                stage2 = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene2 = new Scene(root2);
                stage2.setScene(scene2);
                stage2.show();
    }

    @FXML
    void Inserir(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        FileInputStream fileInputStream = new FileInputStream(new File("src/frigorifico/scenes/fornecedores/InserirFornecedor.fxml"));
        Parent root = loader.load(fileInputStream);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        
        final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(stage);
                dialog.setScene(scene);
                dialog.showAndWait(); 
                
                
                Stage stage2;
                Scene scene2;

                FXMLLoader loader2 = new FXMLLoader();
                FileInputStream fileInputStream2 = new FileInputStream(new File("src/frigorifico/scenes/fornecedores/Fornecedores.fxml"));
                Parent root2 = loader2.load(fileInputStream2);
                stage2 = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene2 = new Scene(root2);
                stage2.setScene(scene2);
                stage2.show();
        

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
    private TableView<Fornecedor> tableview;
    @FXML
    private TableColumn<Fornecedor, String> colNome;
    @FXML
    private TableColumn<Fornecedor, String> colCNPJ;
    @FXML
    private TableColumn<Fornecedor, String> colTel;
    @FXML
    private TableColumn<Fornecedor, String> colContato;
    @FXML
    private TableColumn<Fornecedor, String> colEmail;
    
    ObservableList<Fornecedor> oblist = FXCollections.observableArrayList();
    
    private void openTableView(){
        try {
            Object conexao = Main.conexao();
        
        
        ResultSet result = Model.select_bd(conexao, Fornecedor.getTabela(), Fornecedor.getColunasID());
        
        while (result.next()){
            oblist.add(new Fornecedor(result.getInt("id_fornecedor"), result.getString("nome"), 
                    result.getString("cnpj"), result.getString("tel"), 
                    result.getString("nome_contato"), result.getString("email_contato")));
        }
        
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(FornecedoresController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colCNPJ.setCellValueFactory(new PropertyValueFactory<>("cnpj"));
        colTel.setCellValueFactory(new PropertyValueFactory<>("tel"));
        colContato.setCellValueFactory(new PropertyValueFactory<>("nome_contato"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email_contato"));

        
        tableview.setItems(oblist);
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        openTableView();
        
    }

}

