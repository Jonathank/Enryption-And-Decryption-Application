package AppInterface;

import data.CaeserCipher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class AppController {
	@FXML
	private Button btnencrypt,btndecrypt,clear;
	@FXML
	private TextArea typeword,result;
	
	
	@FXML
	public void enrypt(ActionEvent event) throws Exception{
		 CaeserCipher enc = new  CaeserCipher(3);
		 String word = typeword.getText().toUpperCase().toString();
		 
		 result.setText(enc.encrypt(word));
	}

	@FXML
	public void derypt(ActionEvent event) throws Exception {
		 CaeserCipher enc = new  CaeserCipher(3);
		 String word = typeword.getText().toUpperCase().toString();
		 
		 result.setText(enc.decrypt(word));
	}
	
	@FXML
	public void clear(ActionEvent event) {
		typeword.setText("");
		result.setText("");
	}

}
