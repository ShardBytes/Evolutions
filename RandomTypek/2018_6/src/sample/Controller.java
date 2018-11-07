package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.Random;

public class Controller {

    private Random random = new Random();

    @FXML private Button button;

    @FXML private void buttonClicked(){
        button.setLayoutX(random.nextInt((int)Math.round(Main.stage.getWidth()) - (int)Math.round(button.getWidth())));
        button.setLayoutY(random.nextInt((int)Math.round(Main.stage.getHeight()) - (int)Math.round(button.getHeight())));
        System.out.println("button.getWidth() = " + button.getWidth());
        System.out.println("button.getHeight() = " + button.getHeight());
        System.out.println("Main.stage.getWidth() = " + Main.stage.getWidth());
        System.out.println("Main.stage.getHeight() = " + Main.stage.getHeight());
        System.out.println("button.getLayoutX() = " + button.getLayoutX());
        System.out.println("button.getLayoutY() = " + button.getLayoutY());
    }

}
