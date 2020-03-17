package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	AlienDictionary ad=new AlienDictionary();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private Button btnTranslate;
    
    @FXML
    private Button btnReset;
    @FXML
    private TextField txtTranslate;
    @FXML
    private TextArea txtArea;

    @FXML
    void doTranslate(ActionEvent event) {
    	String text=txtTranslate.getText().toLowerCase();
    	
    	if (text.contains(" ")) {
    		String array[]=text.split(" ");
    		ad.addWord(new Word(array[0],array[1]));
    	}
    	else {
    		txtArea.setText(ad.translateWord(text));
    	}
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	txtArea.setText(""); 
    }
    
    
    @FXML
    void initialize() {

    }
}