/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author jaca
 */
public class FormCadastro extends MyForm{
    private GridPane grid;
    private Label lUserName, lPass, lConfPass, lEmail;
    private TextField tfUserName, tfEmail;
    private PasswordField pfPass, pfConfPass;
    private Button btnConfirmar, btnCancelar;
    private HBox hbBtnBox;
    private VBox vbCenterContainer;

    public FormCadastro(double width, double height) {
        vbCenterContainer = new VBox();
        vbCenterContainer.setSpacing(10);
        vbCenterContainer.setMaxWidth(320);
        vbCenterContainer.setMaxHeight(350);
        vbCenterContainer.setId("center-panel");
        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setMaxWidth(350);
        grid.setMaxHeight(350);
        lUserName = new Label("User Name:");
        lPass = new Label("Password:");
        lConfPass = new Label("Conf. Pass.:");
        lEmail =new Label("Email:");
        tfUserName=new TextField("username");
        tfEmail=new TextField("user@prov.com");
        pfConfPass=new PasswordField();
        pfPass=new PasswordField();
        btnConfirmar = new Button("Confirmar");
        btnConfirmar.setMaxWidth(Double.MAX_VALUE);
        btnCancelar = new Button("Cancelar");
        btnCancelar.setMaxWidth(Double.MAX_VALUE);
        grid.addColumn(0, lUserName, lEmail, lPass, lConfPass );
        grid.addColumn(1, tfUserName, tfEmail, pfPass, pfConfPass);
        hbBtnBox = new HBox(btnConfirmar, btnCancelar);
        hbBtnBox.setSpacing(10);
        hbBtnBox.setPadding(new Insets(25, 25, 25, 25));
        hbBtnBox.setPrefWidth(350);
        vbCenterContainer.getChildren().addAll(grid, hbBtnBox);
        pane.setCenter(vbCenterContainer);
        scene = new Scene(pane, width, height);
    }
    
    public void setBtnConfirmarAction(EventHandler<ActionEvent> eh){
        btnConfirmar.setOnAction(eh);
    }
    
    public void setBtnCancelarAction(EventHandler<ActionEvent> eh){
        btnCancelar.setOnAction(eh);
    }
        
    
}
