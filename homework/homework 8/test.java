import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class test extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Circle circle = new Circle(100, 75, 20);
        circle.setFill(Color.LIGHTCORAL);
        pane.getChildren().add(circle);

        Button btnUp = new Button("Up");
        btnUp.setOnAction(e -> circle.setCenterY(circle.getCenterY() - 10));

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(btnUp);

        Scene scene = new Scene(borderPane, 300, 200);
        primaryStage.setTitle("Move Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}