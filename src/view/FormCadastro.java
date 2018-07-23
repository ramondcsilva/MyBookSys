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
    
    // Getters e Setters ----------------------

    public GridPane getGrid() {
        return grid;
    }

    public void setGrid(GridPane grid) {
        this.grid = grid;
    }

    public Label getlUserName() {
        return lUserName;
    }

    public void setlUserName(Label lUserName) {
        this.lUserName = lUserName;
    }

    public Label getlPass() {
        return lPass;
    }

    public void setlPass(Label lPass) {
        this.lPass = lPass;
    }

    public Label getlConfPass() {
        return lConfPass;
    }

    public void setlConfPass(Label lConfPass) {
        this.lConfPass = lConfPass;
    }

    public Label getlEmail() {
        return lEmail;
    }

    public void setlEmail(Label lEmail) {
        this.lEmail = lEmail;
    }

    public TextField getTfUserName() {
        return tfUserName;
    }

    public void setTfUserName(TextField tfUserName) {
        this.tfUserName = tfUserName;
    }

    public TextField getTfEmail() {
        return tfEmail;
    }

    public void setTfEmail(TextField tfEmail) {
        this.tfEmail = tfEmail;
    }

    public PasswordField getPfPass() {
        return pfPass;
    }

    public void setPfPass(PasswordField pfPass) {
        this.pfPass = pfPass;
    }

    public PasswordField getPfConfPass() {
        return pfConfPass;
    }

    public void setPfConfPass(PasswordField pfConfPass) {
        this.pfConfPass = pfConfPass;
    }

    public Button getBtnConfirmar() {
        return btnConfirmar;
    }

    public void setBtnConfirmar(Button btnConfirmar) {
        this.btnConfirmar = btnConfirmar;
    }

    public Button getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(Button btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public HBox getHbBtnBox() {
        return hbBtnBox;
    }

    public void setHbBtnBox(HBox hbBtnBox) {
        this.hbBtnBox = hbBtnBox;
    }

    public VBox getVbCenterContainer() {
        return vbCenterContainer;
    }

    public void setVbCenterContainer(VBox vbCenterContainer) {
        this.vbCenterContainer = vbCenterContainer;
    }
    
          
    
}
