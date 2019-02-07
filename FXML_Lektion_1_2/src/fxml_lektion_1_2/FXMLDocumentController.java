package fxml_lektion_1_2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import opg4_polymorphism.Ellipse;
import opg4_polymorphism.ShapeFacade;

/**
 *
 * @author Noob
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button GetInfo;
    @FXML
    private TextArea InfoField;
    @FXML
    private TextField FirstPar;
    @FXML
    private TextField SecondPar;
    @FXML
    private RadioButton EllipseRB;
    @FXML
    private RadioButton RectangleRB;
    @FXML
    private RadioButton CircleRB;
    @FXML
    private RadioButton SquereRB;

    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    ToggleGroup tg = new ToggleGroup();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        EllipseRB.setToggleGroup(tg);
        RectangleRB.setToggleGroup(tg);
        CircleRB.setToggleGroup(tg);
        SquereRB.setToggleGroup(tg);

        EllipseRB.setUserData(ShapeFacade.SHAPES.ELLIPSE);
        RectangleRB.setUserData(ShapeFacade.SHAPES.RECTANGLE);
        CircleRB.setUserData(ShapeFacade.SHAPES.CIRCLE);
        SquereRB.setUserData(ShapeFacade.SHAPES.SQUERE);

        tg.selectToggle(EllipseRB);

    }

    @FXML
    private void GetInfoButton(ActionEvent event) {
    }

    @FXML
    private void TwoPar(ActionEvent event) {
        if (tg.getSelectedToggle().getUserData() == ShapeFacade.SHAPES.ELLIPSE || tg.getSelectedToggle().getUserData() == ShapeFacade.SHAPES.RECTANGLE) {
            SecondPar.setVisible(true);
        }
        if (tg.getSelectedToggle().getUserData() == ShapeFacade.SHAPES.CIRCLE || tg.getSelectedToggle().getUserData() == ShapeFacade.SHAPES.SQUERE) {
            SecondPar.setVisible(false
            );
        }
    }

}
