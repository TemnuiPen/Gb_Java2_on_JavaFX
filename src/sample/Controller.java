package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class Controller {
    StringBuilder textAreaValue = new StringBuilder();

    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    @FXML
    private void sendText() {
        textField.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if(event.getCode() == KeyCode.ENTER) {
                    btnSend();
                }
            }
        });
    }

    public void btnSend() {
        textAreaValue.append(textField.getText());
        textArea.setText(textAreaValue.toString());
        textField.setText("");
    }
}
