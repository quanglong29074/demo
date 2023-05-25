package b9;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class HomCotroller implements Initializable {


    public static ObservableList<product> Listproduct = FXCollections.observableArrayList();
    public ListView<product> listView;
    public static product editproduct;


public void goTOForm(ActionEvent actionEvent) throws  Exception{
    Parent root = FXMLLoader.load(getClass().getResource("form.fxml"));
   Main.mainStoge.setScene(new Scene(root,600,400));
}








    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listView.setItems(Listproduct);
    }


}
