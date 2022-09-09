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
import javafx.scene.control.Label;
import javafx.stage.Stage;
import mvc.Model;
import tabelas.Comprador;

/**
 * FXML Controller class
 *
 * @author enzo_
 */
public class DeletarCompradorController implements Initializable {

    private Comprador selected;

    public DeletarCompradorController() {
    }

    public DeletarCompradorController(Comprador selected) {
        this.selected = selected;
    }
    
    
    
    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnConfirmar;

    @FXML
    private Label textCNPJ;

    @FXML
    private Label textContato;

    @FXML
    private Label textEmail;

    @FXML
    private Label textNome;

    @FXML
    private Label textTel;

    @FXML
    void cancelarDelete(ActionEvent event) {
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void deletarComprador(ActionEvent event) throws SQLException, ClassNotFoundException {
        Object conexao = Main.conexao();
        
        Model.delete_bd(conexao, selected.getTabela(), selected.getID_nome(), Integer.toString(selected.getId_comprador()));
        
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
