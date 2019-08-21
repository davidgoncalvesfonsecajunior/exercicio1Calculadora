/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1.calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author david
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button calcular;
    @FXML
    private TextField campo;
    @FXML
    private Label dobro;
    @FXML
    private Label triplo;
    @FXML
    private Label quadrado;
    @FXML
    private Label cubo;
    @FXML
    private Label numero;
    @FXML
    private AnchorPane EXERCICIO1;
    @FXML
    private Button limpar;
    
    /*private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }*/
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonCalcular(ActionEvent event) {
        double x = Double.parseDouble(campo.getText());
        double a = x * 2;
        double b = x * 3;
        double c = Math.pow(x, 2);
        double d = Math.pow(x, 3);
        
        dobro.setText("Dobro: "+Double.toString(a));
        triplo.setText("Triplo: "+Double.toString(b));
        quadrado.setText("Quadrado: "+Double.toString(c));
        cubo.setText("Cubo: "+Double.toString(d));
        
    }

   

    @FXML
    private void limparTexto(ActionEvent event) {
        dobro.setText("Dobro: ");
        triplo.setText("Triplo: ");
        quadrado.setText("Quadrado: ");
        cubo.setText("Cubo: ");
    }
    
}
