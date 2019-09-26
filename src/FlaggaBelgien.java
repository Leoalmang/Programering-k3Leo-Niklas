import javafx.application.Application;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.stage.Stage;
public class FlaggaBelgien extends Application {

    @Override
    public void start(Stage primaryStage) {
        Rectangle black = new Rectangle();
        black.setHeight(450);
        black.setWidth(300);
        black.setFill(Color.BLACK);

        Rectangle yellow = new Rectangle();
        yellow.setHeight(450);
        yellow.setWidth(300);
        yellow.setFill(Color.YELLOW);

        Rectangle red = new Rectangle();
        red.setHeight(450);
        red.setWidth(300);
        red.setFill(Color.RED);

        BorderPane fra = new BorderPane();
        Scene scene = new Scene(fra, 900, 450);
        fra.setLeft(black);
        fra.setCenter(yellow);
        fra.setRight(red);
        primaryStage.setTitle("Belgiens flagga\n");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
