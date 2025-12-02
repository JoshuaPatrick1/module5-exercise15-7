import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ChangeCircleColor extends Application {
   @Override
   public void start(Stage primaryStage) {
      // Create a circle
      Circle circle = new Circle(150, 150, 75, Color.WHITE);

      // Event handlers
      circle.setOnMousePressed(e -> circle.setFill(Color.BLACK));
      circle.setOnMouseReleased(e -> circle.setFill(Color.WHITE));

      Pane pane = new Pane(circle);
      Scene scene = new Scene(pane, 300, 300);

      primaryStage.setTitle("Exercise 15.7 - Change Circle Color");
      primaryStage.setScene(scene);
      primaryStage.show();
   }

   public static void main(String[] args) {
      launch(args);
   }
}
