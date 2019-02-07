package fxml_lektion_1;

import ancient_encryption.CipherInterface;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Noob
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button krypterButton;
    @FXML
    private TextField inputText;
    @FXML
    private TextField kryptMassage;
    @FXML
    private TextField deKryptMassage;
    @FXML
    private Button deKrypterButton;
    @FXML
    private RadioButton atbashRB;
    @FXML
    private RadioButton caesarRB;
    @FXML
    private Spinner<Integer> spinnerRotFactor;

    private ToggleGroup tg = new ToggleGroup();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        atbashRB.setToggleGroup(tg);
        caesarRB.setToggleGroup(tg);
        tg.selectToggle(atbashRB);

        spinnerRotFactor.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(
                0, CipherInterface.ALPHABETH.length - 1,
                CipherInterface.ALPHABETH.length / 2));
    }

    @FXML
    private void krypterButton(ActionEvent event) {
        if (tg.getSelectedToggle() == atbashRB) {
            kryptMassage.setText(new AtbashCipher().encrypt(inputText.getText()));
        } else {

            kryptMassage.setText(new CeasarCipher(spinnerRotFactor.getValue()).encrypt(inputText.getText()));
        }
    }

    @FXML
    private void deKrypterButton(ActionEvent event) {
        if (tg.getSelectedToggle() == atbashRB) {
            deKryptMassage.setText(new AtbashCipher().decrypt(inputText.getText()));
        } else {

            deKryptMassage.setText(new CeasarCipher(spinnerRotFactor.getValue()).decrypt(inputText.getText()));
        }
    }

    @FXML
    private void spinnerRotFactor(MouseEvent event) {
    }

}
