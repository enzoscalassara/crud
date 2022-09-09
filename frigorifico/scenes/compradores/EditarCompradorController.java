/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package frigorifico.scenes.compradores;

import frigorifico.scenes.Main;
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
public class EditarCompradorController implements Initializable {

    private Comprador selected;
    
    public EditarCompradorController (){}
    
    public EditarCompradorController (Comprador selected){
        this.selected = selected;
    }
    

    @FXML
    private Button btnConfirmar;

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
    void cancelarEdit(ActionEvent event) {
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void editarFornecedor(ActionEvent event) throws SQLException, ClassNotFoundException {
        Object conexao = Main.conexao();
        Model.update_bd(conexao, tabelas.Comprador.getTabela(), 
                tabelas.Comprador.getColumns_equal_values(textNome.getText(), textCNPJ.getText(),
                        textTel.getText(), textContato.getText(), textEmail.getText()), 
                tabelas.Comprador.getID_nome(), Integer.toString(selected.getId_comprador()));
        
        Stage stage = (Stage) btnConfirmar.getScene().getWindow();
        stage.close();
    }

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        textNome.setText(selected.getNome());
        textCNPJ.setText(selected.getCnpj());
        textTel.setText(selected.getTel());
        textContato.setText(selected.getNome_contato());
        textEmail.setText(selected.getEmail_contato());

    }    
    
    
}
