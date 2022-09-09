/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package frigorifico.scenes.carregamentos.entrada;

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
import tabelas.Carregamento_entrada;

/**
 * FXML Controller class
 *
 * @author enzo_
 */
public class DeletarCarregamento_entradaController implements Initializable {

    private Carregamento_entrada selected;

    public DeletarCarregamento_entradaController() {
    }

    public DeletarCarregamento_entradaController(Carregamento_entrada selected) {
        this.selected = selected;
    }
    
    
    
    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnConfirmar;

    @FXML
    private Label textTransportadora;

    @FXML
    private Label textMotorista;

    @FXML
    private Label textData_chegada;


    @FXML
    void cancelarDelete(ActionEvent event) {
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void confirmarDelete(ActionEvent event) throws SQLException, ClassNotFoundException {
        Object conexao = Main.conexao();
        
        Model.delete_bd(conexao, selected.getTabela(), selected.getID_nome(), Integer.toString(selected.getId_carregamento_entrada()));
        
        Stage stage = (Stage) btnConfirmar.getScene().getWindow();
        stage.close();
    }

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        textTransportadora.setText(selected.getTransportadora());
        textMotorista.setText(selected.getMotorista());
        textData_chegada.setText(selected.getData_chegada());
    }    
    
}
