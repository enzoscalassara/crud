/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package frigorifico.scenes.fornecedores;

import frigorifico.scenes.Main;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mvc.Model;
import tabelas.Fornecedor;

/**
 * FXML Controller class
 *
 * @author enzo_
 */
public class InserirFornecedorController implements Initializable {
    
    
    @FXML
    private Button btnAdd;

    @FXML
    private Button btnCancelar;

    @FXML
    private TextField textCNPJ;

    @FXML
    private TextField textContato;

    @FXML
    private TextField textEmail;

    @FXML
    private TextField textNome;

    @FXML
    private TextField textTel;

    @FXML
    void addNovoFornecedor(ActionEvent event) throws IOException, SQLException, ClassNotFoundException {
        // TODO Quando algum campo estiver vazio abrir um popup perguntando se tem certeza que quer inserir com algum campo vazio.
        String valores = "'" + textNome.getText() + "', '" + textCNPJ.getText() + "', '" +  textTel.getText() + "', '" +  textContato.getText()
                + "', '" +  textEmail.getText() + "'";
        Object conexao = Main.conexao();
        
        Model.insert_bd(conexao, Fornecedor.getTabela(), Fornecedor.getColunas(), valores);
        
        /*} catch (SQLException ex) {
            System.out.println("Erro");
            Parent root = FXMLLoader.load(getClass().getResource("PopUpInsert.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
        
            final Stage dialog = new Stage();
                    dialog.initModality(Modality.APPLICATION_MODAL);
                    dialog.initOwner(stage);
                    dialog.setScene(scene);
                    dialog.show();
        }*/// POPUP informando erro. Pra implementar teria q estar passando campos vazios como null pro BD.
        // Na realidade eu poderia só verificar se o textField ta vazio e se estiver lançar o pop-up quando a pessoa tentar
        //confirmar a inserção.
        
        
        Stage stage = (Stage) btnAdd.getScene().getWindow();
        stage.close();
        
        
        
        
    }
    
    
    @FXML
    void cancelarAdd(ActionEvent event) throws IOException {
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
