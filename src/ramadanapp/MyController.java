package ramadanapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MyController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    @FXML 
    TextField tf1;
    @FXML
    Button btn1;
    public void submit(ActionEvent e) throws IOException{
        if (tf1.getText().equals("12345")){
            Parent root = FXMLLoader.load(getClass().getResource("Appfxml.fxml"));
        
        Scene scene = new Scene(root, 400, 450);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        Stage  primaryStage = new Stage();
        primaryStage.setTitle("Ramadan App");
        primaryStage.setScene(scene);
        primaryStage.show();
        }
    }
    
    public void cashBtn() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Cashfxml.fxml"));
        
        Scene scene = new Scene(root, 400, 530);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        Stage  primaryStage = new Stage();
        primaryStage.setTitle("Ramadan App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void bankBtn() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Bankfxml.fxml"));
        
        Scene scene = new Scene(root, 400, 530);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        Stage  primaryStage = new Stage();
        primaryStage.setTitle("Ramadan App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void addCashMoney() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Cashopfxml.fxml"));
        
        Scene scene = new Scene(root, 630, 570);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        Stage  primaryStage = new Stage();
        primaryStage.setTitle("Ramadan App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void deleteCashMoney() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Cashopfxml.fxml"));
        
        Scene scene = new Scene(root, 630, 570);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        Stage  primaryStage = new Stage();
        primaryStage.setTitle("Ramadan App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void showCashMoney() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ShowCash.fxml"));
        
        Scene scene = new Scene(root, 630, 570);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        Stage  primaryStage = new Stage();
        primaryStage.setTitle("Ramadan App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    /**
     * @throws java.io.IOException**********************************************************************************/
    
    public void addBankMoney() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Bankopfxml.fxml"));
        
        Scene scene = new Scene(root, 630, 570);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        Stage  primaryStage = new Stage();
        primaryStage.setTitle("Ramadan App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void deleteBankMoney() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Bankopfxml.fxml"));
        
        Scene scene = new Scene(root, 630, 570);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        Stage  primaryStage = new Stage();
        primaryStage.setTitle("Ramadan App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void showBankMoney() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ShowBank.fxml"));
        
        Scene scene = new Scene(root, 630, 570);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        Stage  primaryStage = new Stage();
        primaryStage.setTitle("Ramadan App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void addPerson() throws IOException{
         Parent root = FXMLLoader.load(getClass().getResource("AddPerson.fxml"));
        
        Scene scene = new Scene(root, 630, 570);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        Stage  primaryStage = new Stage();
        primaryStage.setTitle("Ramadan App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void deletePerson() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("AddPerson.fxml"));
        
        Scene scene = new Scene(root, 630, 570);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        Stage  primaryStage = new Stage();
        primaryStage.setTitle("Ramadan App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void showPersonMoney() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ShowPersonMoney.fxml"));
        
        Scene scene = new Scene(root, 630, 570);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        Stage  primaryStage = new Stage();
        primaryStage.setTitle("Ramadan App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void chooseYearValue() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("chooseYearValue.fxml"));
        
        Scene scene = new Scene(root, 630, 570);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        Stage  primaryStage = new Stage();
        primaryStage.setTitle("Ramadan App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
            
    
    
    
    
    
    
    
}
