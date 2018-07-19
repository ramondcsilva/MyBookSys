/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

/**
 *
 * @author ramon
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) {
        stage.setTitle("Teste: Hallo World");
        final double width = 450;
        final double height = 600;
        SceneForm dash = new FormCadastro(width, height);
        SceneForm cad = new FormCadastro(width, height);
        SceneForm login = new FormLogin(width, height);
        ((FormLogin)login).setBtnLoginAction((ActionEvent eh)-> {
            stage.setScene(dash.getScene());
            stage.show();
        });
        ((FormLogin)login).setBtnCadastroAction((ActionEvent eh)->{
            stage.setScene(cad.getScene());
            stage.show();
        });
        ((FormCadastro)cad).setBtnConfirmarAction((ActionEvent eh)->{
            stage.setScene(login.getScene());
            stage.show();
        });
        ((FormCadastro)cad).setBtnCancelarAction((ActionEvent eh)->{
            stage.setScene(login.getScene());
            stage.show();
        });
        login.getScene().getStylesheets().add(Main.class.getResource("main/main.css").toExternalForm());
        dash.getScene().getStylesheets().add(Main.class.getResource("main/main.css").toExternalForm());
        cad.getScene().getStylesheets().add(Main.class.getResource("main/main.css").toExternalForm());
        stage.setScene(login.getScene());
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
