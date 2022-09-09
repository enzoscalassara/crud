/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frigorifico.scenes.compradores;

import frigorifico.scenes.Main;
import frigorifico.scenes.fornecedores.FornecedoresController;
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
import tabelas.Comprador;

/**
 * FXML Controller class
 *
 * @author ALUNO
 */
public class CompradoresController implements Initializable {
    private Stage stage;
    private Scene scene;
    
    @FXML
    private ResourceBundle resources;
    
    @FXML
    void Deletar(ActionEvent event) throws FileNotFoundException, IOException {
        Comprador selected = tableview.getSelectionModel().getSelectedItem();
        
        
        DeletarCompradorController controller = new DeletarCompradorController(selected);
        FXMLLoader loader = new FXMLLoader();
        loader.setController(controller);
        FileInputStream fileInputStream = new FileInputStream(new File("src/frigorifico/scenes/compradores/DeletarComprador.fxml"));
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
        Comprador selected = tableview.getSelectionModel().getSelectedItem();

        
        EditarCompradorController controller = new EditarCompradorController(selected);
        FXMLLoader loader = new FXMLLoader();
        loader.setController(controller);
        FileInputStream fileInputStream = new FileInputStream(new File("src/frigorifico/scenes/compradores/EditarComprador.fxml"));
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
        FileInputStream fileInputStream = new FileInputStream(new File("src/frigorifico/scenes/compradores/InserirComprador.fxml"));
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
    private TableView<Comprador> tableview;
    @FXML
    private TableColumn<Comprador, String> colNome;
    @FXML
    private TableColumn<Comprador, String> colCNPJ;
    @FXML
    private TableColumn<Comprador, String> colTel;
    @FXML
    private TableColumn<Comprador, String> colContato;
    @FXML
    private TableColumn<Comprador, String> colEmail;
    
    ObservableList<Comprador> oblist = FXCollections.observableArrayList();
    
    private void openTableView(){
        try {
            Object conexao = Main.conexao();
        
        
        ResultSet result = Model.select_bd(conexao, Comprador.getTabela(), Comprador.getColunasID());
        
        while (result.next()){
            oblist.add(new Comprador(result.getInt("id_comprador"), result.getString("nome"), 
                    result.getString("nome_contato"), result.getString("email_contato"), 
                    result.getString("tel"), result.getString("cnpj")));

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
