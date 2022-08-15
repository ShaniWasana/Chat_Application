package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class UserLoginFormController {

    public AnchorPane logInContext;
    public JFXTextField txtUserName;

    static String userName;

    public void btnLogInOnAction(ActionEvent actionEvent) throws IOException {
       userName=txtUserName.getText();
        if (userName.equals("")) {
            new Alert(Alert.AlertType.WARNING, "Your Logging is Failed!..").showAndWait();

        }else {
            Stage stage = (Stage) txtUserName.getScene().getWindow();
            stage.close();
            Stage stage1 = new Stage();
            stage1.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ChatRoomForm.fxml"))));
            stage1.setResizable(false);
            //primaryStage.getIcons().add(new Image("location"));
            stage1.setTitle(userName);
            stage1.centerOnScreen();
            stage1.show();
        }

    }
}
