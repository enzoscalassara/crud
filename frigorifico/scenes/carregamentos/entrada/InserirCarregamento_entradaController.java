/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package frigorifico.scenes.carregamentos.entrada;

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
import tabelas.Carregamento_entrada;

/**
 * FXML Controller class
 *
 * @author enzo_
 */
public class InserirCarregamento_entradaController implements Initializable {

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnCancelar;

    @FXML
    private TextField textTransportadora;

    @FXML
    private TextField textMotorista;

    @FXML
    private TextField textData_chegada;
    
    @FXML
    private TextField textFornecedor;

    @FXML
    void addNovo(ActionEvent event) throws IOException, SQLException, ClassNotFoundException {
        // TODO Colocar uma lista para selecionar os fornecedores cadastrados e puxar o id do selecionado e passar como parametro
        String valores = textFornecedor + ", '" + textTransportadora.getText() + "', '" +
                textMotorista.getText() + "', '" +  textData_chegada.getText() + "'";
        Object conexao = Main.conexao();
        
        Model.insert_bd(conexao, Carregamento_entrada.getTabela(), Carregamento_entrada.getColunas(), valores);
        
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
