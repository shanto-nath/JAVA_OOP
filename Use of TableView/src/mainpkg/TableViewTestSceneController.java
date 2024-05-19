/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author User
 */
public class TableViewTestSceneController implements Initializable {

    @FXML    private TextField idTextField;
    @FXML    private TextField nameTextField;
    @FXML    private TextField cgpaTextField;
    @FXML    private RadioButton maleRadioButton;
    @FXML    private RadioButton femaleRadioButton;
    @FXML    private RadioButton othersRadioButton;
    @FXML    private PasswordField pwPasswordField;
    @FXML    private ComboBox<String> majorComboBox;
    @FXML    private TableView<Student> studInfoTableView;
    @FXML    private TableColumn<Student, String> idTableColumn;
    @FXML    private TableColumn<Student, String> nameTableColumn;
    @FXML    private TableColumn<Student, String> genderTableColumn;
    @FXML    private TableColumn<Student, String> majorTableColumn;
    @FXML    private TableColumn<Student, String> cgpaTableColumn;
    @FXML    private TableColumn<Student, String> uniNameTableColumn;

    //ToggleGroup tg1, tg2;
    ToggleGroup tg;
    ArrayList<Student> studList;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        User u1,u2;
        //u1 = new User();
        Student asif;
        
        asif = new Student();
        u2 = new Student();
        
        Faculty skd;
        Researcher r1;
        Taxable t1;
        u1 = new Faculty();
        r1 = new Faculty();
        t1 = new Faculty();
        skd = new Faculty();
        
        majorComboBox.getItems().add("CSE");
        majorComboBox.getItems().add("EEE");
        majorComboBox.getItems().addAll("PS","MIS","Finance");
        
        tg = new ToggleGroup();
        maleRadioButton.setToggleGroup(tg);
        femaleRadioButton.setToggleGroup(tg);
        othersRadioButton.setToggleGroup(tg);
        // TODO
        studList = new ArrayList<Student>();
        
        idTableColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("id"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("name"));
        cgpaTableColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("cgpa"));
        genderTableColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("gender"));
        majorTableColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("major"));
        uniNameTableColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("uniName"));
    }    

    @FXML
    private void addNewStudentButtonMouseOnClicked(ActionEvent event) {
        //Student stud = new Student(....);
        String gender="";
        if(maleRadioButton.isSelected())
            gender="Male";
        else if(femaleRadioButton.isSelected())
            gender="Female";
        else if(othersRadioButton.isSelected())
            gender="Others";        
        studList.add(
            new Student(
                Integer.parseInt(idTextField.getText()),
                nameTextField.getText(),
                gender,
                majorComboBox.getValue(),
                Float.parseFloat(cgpaTextField.getText()),
               pwPasswordField.getText()
            )
        );
        idTextField.clear(); nameTextField.clear();
        cgpaTextField.clear(); pwPasswordField.clear();
        
    }

    @FXML
    private void showStudentInfoButtonMouseOnClicked(ActionEvent event) {
        for(Student s: studList){
            studInfoTableView.getItems().add(s);
        }
    }
    
}
