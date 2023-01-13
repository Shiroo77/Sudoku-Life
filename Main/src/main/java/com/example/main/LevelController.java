package com.example.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class LevelController implements Initializable {
    public static String level;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        level = null;
    }

    public void btn_easy(ActionEvent actionEvent) throws IOException {
        level = "Easy";
        Parent parent =
                FXMLLoader.load(getClass().getResource("suduku.fxml"));
        Scene scene = new Scene(parent);
        Stage stage =
                (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void btn_medium(ActionEvent actionEvent) throws IOException {
        level = "Medium";
        Parent parent =
                FXMLLoader.load(getClass().getResource("suduku.fxml"));
        Scene scene = new Scene(parent);
        Stage stage =
                (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void btn_hard(ActionEvent actionEvent) throws IOException {
        level = "Hard";
        Parent parent =
                FXMLLoader.load(getClass().getResource("suduku.fxml"));
        Scene scene = new Scene(parent);
        Stage stage =
                (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void btn_expert(ActionEvent actionEvent) throws IOException {
        level = "Expert";
        Parent parent =
                FXMLLoader.load(getClass().getResource("suduku.fxml"));
        Scene scene = new Scene(parent);
        Stage stage =
                (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void btn_evil(ActionEvent actionEvent) throws IOException {
        level = "Evil";
        Parent parent =
                FXMLLoader.load(getClass().getResource("suduku.fxml"));
        Scene scene = new Scene(parent);
        Stage stage =
                (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
