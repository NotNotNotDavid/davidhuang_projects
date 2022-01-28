package com.example.friendbook2;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {
    public TextField getFirstName;
    public TextField getLastName;
    public TextField getAge;
    public Button createFriend;
    public ListView<Friend> friendList = new ListView<>();
    public Label IbIFirstName;
    public Label IbILastName;
    public Label IbIAge;
    public Button deleteFriend;

    public void addFriend(ActionEvent actionEvent){
        String firstName = getFirstName.getText();
        String lastName = getLastName.getText();
        int age = Integer.parseInt(getAge.getText());
        Friend friend = new Friend(firstName,lastName,age);
        friendList.getItems().add(friend);
        getFirstName.clear();
        getLastName.clear();
        getAge.clear();

    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friend friend;
        friend = friendList.getSelectionModel().getSelectedItem();
        IbIAge.setText(Integer.toString(friend.getAge()));
        IbIFirstName.setText(friend.firstName);
        IbILastName.setText(friend.lastName);
    }

    public void deleteFriend(ActionEvent mouseEvent) {
        Friend friend;
        friend = friendList.getSelectionModel().getSelectedItem();
        friendList.getItems().remove(friend);
        IbIAge.setText("");
        IbIFirstName.setText("");
        IbILastName.setText("");
    }
}