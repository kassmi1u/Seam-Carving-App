package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Seam Carving Project");
        final Scene scene = new Scene(root, 1200, 900);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

        public static void main (String[]args){
            launch(args);
        }
    }
