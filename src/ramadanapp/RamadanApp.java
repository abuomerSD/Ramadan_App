package ramadanapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Eltayeb
 */
public class RamadanApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
    
    Parent root = FXMLLoader.load(getClass().getResource("Loginfxml.fxml"));
    
      
        
        Scene scene = new Scene(root, 400, 530);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        Stage  primaryStage = new Stage();
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
