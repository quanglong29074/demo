package javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class HomeController {
    @FXML
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtTelephone;



    public static ObservableList<Student> ListStudent = FXCollections.observableArrayList();
    public ListView<Student> listView;
    public static Student editStudent;



    public void submit(javafx.event.ActionEvent actionEvent) {
        try {
            String name = txtName.getText();
            String email = txtEmail.getText();
            String telephone = txtTelephone.getText();
            if (editStudent!=null){
                editStudent.setName(name);
                editStudent.setEmail(email);
                editStudent.setTelePhone(telephone);
                listView.setItems(ListStudent);
                listView.refresh();
                editStudent=null;
                txtName.clear();
                txtEmail.clear();
                txtTelephone.clear();
                return;
            }
            for (Student s : ListStudent){
                if (s.getName().equals(name)) throw new Exception("Tên sinh đã tồn tại");
                if (s.getEmail().equals(email)) throw new Exception("email này đã tồn tại");
            }
            Student sv = new Student(name,email, telephone);
            ListStudent.add(sv);
            listView.setItems(ListStudent);
            txtName.clear();
            txtEmail.clear();
            txtTelephone.clear();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }

    public void editStudent(MouseEvent mouseEvent) {
        editStudent = listView.getSelectionModel().getSelectedItem();
        if (editStudent!=null) {
            txtName.setText(editStudent.getName());
            txtEmail.setText(editStudent.getEmail());
            txtTelephone.setText(editStudent.getTelePhone());
        }
    }
}

// cách 2 dùng if và lưu ý bỏ String ra ngoài chứ không bỏ trong try
// if(emailList.contains(email)){
//    Alert aleart = new Alert(Alert.AlertType.ERROR);
//     aleart.setContentText("Email này đã tồn tại.");
//     aleart.show();
//     return;
// }
//  emailList.add(email);
// String sv ="\n"+ name + "\n" + email + "\n" + telephone;
//  txtOut.setText(txtOut.getText() + sv);
//Telephone
// if(telephoneList.contains(telephone)){
//    Alert aleart = new Alert(Alert.AlertType.ERROR);
//    aleart.setContentText("telephone này đã tồn tại.");
//    aleart.show();
//    return;
//  }
//  telephoneList.add(telephone);
//  String sm ="\n"+ name + "\n" + email + "\n" + telephone;
//  txtOut.setText(txtOut.getText() + sm);