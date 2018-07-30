/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view2;

import controller.SistemaController;
import exception.DuplicateKeyException;
import exception.DuplicateUsuarioException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 *
 * @author ramon
 */
public class Main extends Application {

    SistemaController controller = new SistemaController();
    Alert alert = new Alert(Alert.AlertType.WARNING);

    @Override
    public void start(Stage stage) {
        stage.setTitle("meinBuch");
        final double width = 450;
        final double height = 600;
        SceneForm dash = new FormCadastro(width, height);
        FormCadastro cad = new FormCadastro(width, height);
        FormLogin login = new FormLogin(width, height);
        
 //-------------------Configuração de Eventos dos botões dos formularios-----------------------------------------------
        
        login.setBtnLoginAction((ActionEvent eh) -> {
            stage.setScene(dash.getScene());
            stage.show();
        });
        login.setBtnCadastroAction((ActionEvent eh) -> {
            cad.getTfUserName().setText(login.getTfUser().getText());
            stage.setScene(cad.getScene());
            stage.show();
        });
        cad.setBtnConfirmarAction((ActionEvent eh) -> {
            try {
                controller.registrarUsuario(
                            cad.getTfUserName().getText(),
                            cad.getPfConfPass().getText(),
                            cad.getTfNome().getText(),
                            cad.getTfEmail().getText(),
                            cad.getTfDataNasc().getText(),
                            cad.getTfEndereco().getText(),
                            cad.getTfTelefone().getText()
                        );
                
            } catch (DuplicateUsuarioException ex) {
                alert.setContentText("Usuário Duplicado");
                alert.show();
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);

            } catch (DuplicateKeyException ex) {
                alert.setContentText("Chave Duplicada");
                alert.show();
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            stage.setScene(login.getScene());
            stage.show();
        });
        cad.setBtnCancelarAction((ActionEvent eh) -> {
            stage.setScene(login.getScene());
            stage.show();
        });
        
 //---------------------------Configuração dos estilos dos formulários -----------------------------------------------------------
        
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
