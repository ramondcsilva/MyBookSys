/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


/**
 *
 * @author jaca
 */
public class FormLogin extends MyForm {
    private Button btnLogin;
    private Button btnCadastro;
    private VBox vbControls;
    private TextField tfUser;
    private PasswordField pfPass;
    
    public FormLogin(double width, double height){
        tfUser = new TextField("user email");
        pfPass = new PasswordField();
        btnLogin = new Button("login");
        btnLogin.setMaxWidth(Double.MAX_VALUE);
        btnCadastro = new Button("Cadastro");
        btnCadastro.setMaxWidth(Double.MAX_VALUE);
        vbControls = new VBox();
        vbControls.setSpacing(13);
        vbControls.setPadding(new Insets(25, 10, 10, 10));
        vbControls.getChildren().addAll(tfUser, pfPass, btnLogin, btnCadastro);
        vbControls.setMaxWidth(200);
        vbControls.setMaxHeight(200);
        vbControls.setId("center-panel");
        pane.setCenter(vbControls);
        scene = new Scene(pane, width, height);
    }

    public Button getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(Button btnLogin) {
        this.btnLogin = btnLogin;
    }

    public Button getBtnCadastro() {
        return btnCadastro;
    }

    public void setBtnCadastro(Button btnCadastro) {
        this.btnCadastro = btnCadastro;
    }

    public VBox getVbControls() {
        return vbControls;
    }

    public void setVbControls(VBox vbControls) {
        this.vbControls = vbControls;
    }

    public TextField getTfUser() {
        return tfUser;
    }

    public void setTfUser(TextField tfUser) {
        this.tfUser = tfUser;
    }

    public PasswordField getPfPass() {
        return pfPass;
    }

    public void setPfPass(PasswordField pfPass) {
        this.pfPass = pfPass;
    }

    public void setBtnLoginAction(EventHandler<ActionEvent> eh){
        btnLogin.setOnAction(eh);
    }
    
    public void setBtnCadastroAction(EventHandler<ActionEvent> eh){
        btnCadastro.setOnAction(eh);
    }
    
}
