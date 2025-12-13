import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class ScrollPaneDemo extends Application
 {
       public void start(Stage stage) 
{
       VBox content = new VBox(10);

 // Add a lot of labels to make it scrollable
for (int i = 1; i <= 30; i++) 
{
  content.getChildren().add(new Label("This is   line number " + i));
}
        // Create ScrollPane
        ScrollPane scrollPane = new ScrollPane(content);
        scrollPane.setPrefSize(250, 200); // visible area
        scrollPane.setFitToWidth(true);   // content fits the width of scroll pane
        Scene scene = new Scene(scrollPane);
        stage.setScene(scene);
        stage.setTitle("JavaFX ScrollPane Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

