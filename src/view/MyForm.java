/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author jaca
 */
public abstract class MyForm implements SceneForm {
    
    protected Scene scene;
    protected BorderPane pane;
    protected Label lAppName;

    public MyForm() {
        pane = new BorderPane();
        lAppName = new Label("myBook");
        lAppName.setId("app-name");
        pane.setTop(lAppName);
    }

    public BorderPane getPane() {
        return pane;
    }


    public Label getlAppName() {
        return lAppName;
    }

    @Override
    public Scene getScene() {
        return scene;
    }

    @Override
    public void setScene(Scene scene) {
        this.scene = scene;
    }
    
}
