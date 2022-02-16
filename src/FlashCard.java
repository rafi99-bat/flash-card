import javafx.scene.image.Image;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FlashCard extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
      FXMLLoader loader =new FXMLLoader(getClass().getResource("card.fxml"));
        Parent root = loader.load();
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("FlashCard");
        primaryStage.getIcons().add(new Image(FlashCard.class.getResourceAsStream("icon.png")));
        primaryStage.setScene(scene);
        //primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
