/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package frigorifico.scenes.compradores;

import frigorifico.scenes.Main;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mvc.Model;
import tabelas.Comprador;

/**
 * FXML Controller class
 *
 * @author enzo_
 */
public class InserirCompradorController implements Initializable {

    
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
    void addNovoComprador(ActionEvent event) throws IOException, SQLException, ClassNotFoundException {
        
        String valores = "'" + textNome.getText() + "', '" + textContato.getText() + "', '" +  textEmail.getText() + "', '" +  textTel.getText()
                + "', '" +  textCNPJ.getText() + "'";
        Object conexao = Main.conexao();
        
        Model.insert_bd(conexao, Comprador.getTabela(), Comprador.getColunas(), valores);
        
        Stage stage = (Stage) btnAdd.getScene().getWindow();
        stage.close();
        
        
    }

    @FXML
    void cancelarAdd(ActionEvent event) throws IOException {
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
