/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MatrixOperationSceneController implements Initializable {

    @FXML    private TextField noOfRowsTextField;
    @FXML    private TextField noOfColsTextField;
    @FXML    private Label outputLabel;

    Matrix m1,m2;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        m1 = new Matrix(); 
        m2= new Matrix();
        // TODO
    }    

    @FXML
    private void generateButtonOnMouseClicked(ActionEvent event) {
        m1 = new Matrix(
            Integer.parseInt(noOfRowsTextField.getText()),
            Integer.parseInt(noOfColsTextField.getText())
        );
    }
    @FXML
    private void showButtonOnMouseClicked(ActionEvent event) {      
        outputLabel.setText(
            "Matrix m1:"
            + m1.getStringEquivalentOfMatrix()
            + "\nMatrix m2:"
            + m2.getStringEquivalentOfMatrix()                
        );
        System.out.println("Matrix m1:");
        m1.showMatrix();
        System.out.println("\nMatrix m2:");
        m2.showMatrix();        
    } 
}
