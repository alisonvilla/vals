package vals;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        PaneOrganizer organizer= new PaneOrganizer();

        stage.setScene(new Scene(organizer.getRoot()));
        stage.show();
    }
}
