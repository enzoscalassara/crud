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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mvc.Model;
import tabelas.Carregamento_entrada;

/**
 * FXML Controller class
 *
 * @author enzo_
 */
public class EditarCarregamento_entradaController implements Initializable {

    private Carregamento_entrada selected;
    
    public EditarCarregamento_entradaController() {
    }

    public EditarCarregamento_entradaController(Carregamento_entrada selected) {
        this.selected = selected;
    }
    
    @FXML
    private Button btnConfirmar;

    @FXML
    private Button btnCancelar;

    @FXML
    private TextField textTransportadora;

    @FXML
    private TextField textMotorista;

    @FXML
    private TextField textDataChegada;
    
    @FXML
    private TextField textFornecedor;

    @FXML
    void cancelarEdit(ActionEvent event) {
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void confirmarEdit(ActionEvent event) throws SQLException, ClassNotFoundException {
        Object conexao = Main.conexao();
        Model.update_bd(conexao, tabelas.Fornecedor.getTabela(), 
                tabelas.Carregamento_entrada.getColumns_equal_values(Integer.valueOf(textFornecedor.getText()), textTransportadora.getText(),
                        textMotorista.getText(), textDataChegada.getText()), 
                tabelas.Carregamento_entrada.getID_nome(), Integer.toString(selected.getId_carregamento_entrada()));
        
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
        textDataChegada.setText(selected.getData_chegada());
        textFornecedor.setText(Integer.toString(selected.getId_fornecedor()));
    }    
    
}
