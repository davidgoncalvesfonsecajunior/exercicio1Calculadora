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
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonCalcular(ActionEvent event) {
        String valor = campo.getText();
        
        double a = Double.parseDouble(valor) * 2;
        double b = Double.parseDouble(valor) * 3;
        double c = Double.parseDouble(valor) * Double.parseDouble(valor);
        double d = Double.parseDouble(valor) * c;
        
        dobro.setText("Dobro: "+Double.toString(a));
        triplo.setText("triplo: "+Double.toString(b));
        quadrado.setText("Quadrado: "+Double.toString(c));
        cubo.setText("Cubo: "+Double.toString(d));
        
    }

    @FXML
    private void CampNumero(ActionEvent event) {
    }
    
}
