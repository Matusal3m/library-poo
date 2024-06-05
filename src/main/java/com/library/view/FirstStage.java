package com.library.view;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FirstStage {

  private FirstStage() {}

  public static void start(Stage stage) {
    Group root = new Group();

    Scene scene = new Scene(root, 640, 480);

    stage.setScene(scene);
    stage.show();
  }
}
