/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.util.Callback;

/**
 *
 * @author jaca
 */
public class FormDash extends MyForm{
    private GridPane grid;
    private Label lSearch, lFriends, lPosts, lPost, lFiles;
    private TextField tfSearch;
    private Button btnSearch, btnPost;
    private ListView<String> lista;
    

    public FormDash(double width, double height) {
        lista = new ListView(data);
//        lista.setCellFactory(new Callback<ListView<String>, ListCell<String>>(){;
//            public ListCell<String> call(ListView<String> list){
//                return new String();
//            }
//        });
        
        pane.setCenter(lista);
//        grid.setId("app-center");
        scene = new Scene(pane, width, height);
    }
    
    
}
