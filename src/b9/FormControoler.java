package b9;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class FormControoler {

    public TextField txtName;
    public TextField txtEmail;
    public TextField txtTel;

    public void backToList(ActionEvent actionEvent) throws  Exception{
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.mainStoge.setScene(new Scene(root,600,400));
    }

    public void submit(ActionEvent actionEvent) {
        try {
            String name = txtName.getText();
            String email = txtEmail.getText();
            String tel = txtTel.getText();
            for (product s: HomCotroller.Listproduct){
                if(s.getName().equals(name))
                    throw new Exception("Tên SV đã tồn tại");
                if(s.getEmail().equals(email))
                    throw new Exception("Email đã tồn tại");
            }
            product sv = new product(name,email,tel);
            HomCotroller.Listproduct.add(sv);
            backToList(null);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }
}
