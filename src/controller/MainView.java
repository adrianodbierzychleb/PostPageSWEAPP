package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainView extends Application {

    public static void main(String[] args)
    {
        Application.launch(MainView.class, (java.lang.String[]) null);
    }

    public void start(Stage primaryStage) throws Exception
    {
        try{
            AnchorPane page = (AnchorPane) FXMLLoader.load(MainView.class.getResource("MainController.fxml"));
            Scene scene = new Scene(page);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Table view");
            primaryStage.show();

            }
        catch (Exception e)
        {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
