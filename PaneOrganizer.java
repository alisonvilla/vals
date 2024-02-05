package vals;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;


public class PaneOrganizer {

    private BorderPane root;
    private BorderPane mainPane;
    private Button noBtn;
    private Button yesBtn;

    public PaneOrganizer(){
        this.root= new BorderPane();
        this.root.setPrefSize(500,500);

        this.mainPane = new BorderPane();
        this.root.setCenter(this.mainPane);
        this.mainPane.setStyle("-fx-background-color: #FFFACD");
        this.mainPane.setFocusTraversable(false);

        this.heartMaker();
        this.buttonMaker();

    }

    

    private void heartMaker(){
        ImageView  heartview= new ImageView(new Image("./vals/heart.png", 300,300,
                true, false));

        this.mainPane.getChildren().add(heartview);
        heartview.setX(100);
        heartview.setY(100);
    }

    private void buttonMaker(){
        this.yesBtn= new Button("yes");
        this.yesBtn.setFocusTraversable(true);

        this.noBtn= new Button("no");
        this.noBtn.setFocusTraversable(true);

        this.mainPane.setLeft(this.yesBtn);


    }


    public BorderPane getRoot() {
        return this.root;
    }
}
