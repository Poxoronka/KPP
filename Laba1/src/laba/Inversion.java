
package laba;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Inversion extends Display {
	public void invers (Button calculateButton, TextField dividendTextField, TextField dividerTextField) {
		  String dividend = dividendTextField.getText();
		  char[] text = dividend.toCharArray();
		  String result = "";
		       for (int j = text.length - 1; j >= 0; j--)
		       {
		             result += text[j]; 
		       }
		  dividerTextField.setText(result);
	}
}
