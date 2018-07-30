package view2;

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
    private Label lUserName, lPass, lConfPass, lEmail, lNome, lEndereco, lTelefone, lDataNasc;
    private TextField tfUserName, tfEmail, tfNome, tfEndereco, tfTelefone, tfDataNasc;
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
        lUserName = new Label("Login:");
        lPass = new Label("Password:");
        lConfPass = new Label("Conf. Pass.:");
        lEmail =new Label("Email:");
        lNome = new Label("Nome:");
        lEndereco = new Label("Endereço:");
        lTelefone = new Label("Telefone:");
        lDataNasc = new Label("Nascimento:");
        tfNome=new TextField("nome");
        tfUserName=new TextField("login");
        tfEmail=new TextField("user@prov.com");
        tfEndereco=new TextField("endereço");
        tfDataNasc=new TextField("dd/mm/yy");
        tfTelefone=new TextField("(xx) xxxxx-xxxx");
        pfConfPass=new PasswordField();
        pfPass=new PasswordField();
        btnConfirmar = new Button("Confirmar");
        btnConfirmar.setMaxWidth(Double.MAX_VALUE);
        btnCancelar = new Button("Cancelar");
        btnCancelar.setMaxWidth(Double.MAX_VALUE);
        grid.addColumn(0, lUserName, lEmail, lNome, lPass, lConfPass, lDataNasc, lEndereco, lTelefone);
        grid.addColumn(1, tfUserName, tfEmail, tfNome, pfPass, pfConfPass, tfDataNasc, tfEndereco, tfTelefone);
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

    public TextField getTfNome() {
        return tfNome;
    }

    public void setTfNome(TextField tfNome) {
        this.tfNome = tfNome;
    }

    public TextField getTfEndereco() {
        return tfEndereco;
    }

    public void setTfEndereco(TextField tfEndereco) {
        this.tfEndereco = tfEndereco;
    }

    public TextField getTfTelefone() {
        return tfTelefone;
    }

    public void setTfTelefone(TextField tfTelefone) {
        this.tfTelefone = tfTelefone;
    }

    public TextField getTfDataNasc() {
        return tfDataNasc;
    }

    public void setTfDataNasc(TextField tfDataNasc) {
        this.tfDataNasc = tfDataNasc;
    }
    
    
}
