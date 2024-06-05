package com.library;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

import com.library.view.FirstStage;

public class Main extends Application {

    @Override
    @SuppressWarnings("exports")
    public void start(Stage stage) throws IOException {
        FirstStage.start(stage);
    }

    public static void main(String[] args) {
        launch();
    }

}