package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Table;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;

import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class MainController implements Initializable
{

    @FXML
    TableView<Table> tableID;
    @FXML
    TableColumn<Table, Integer> iID;
    @FXML
    TableColumn<Table, String> iName;
    @FXML
    TableColumn<Table, String> iDate;
    @FXML
    TableColumn<Table, Integer> iRating;

    @FXML
    TextField nameInput;

    @FXML
    Button submit;

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate localDate = LocalDate.now();

    private int rating = 0;

    private int iNumber = 1;

    final ObservableList<Table> data = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        iID.setCellValueFactory(new PropertyValueFactory<Table, Integer>("rID"));
        iName.setCellValueFactory(new PropertyValueFactory<Table, String>("rName"));
        iDate.setCellValueFactory(new PropertyValueFactory<Table, String>("rDate"));
        iRating.setCellValueFactory(new PropertyValueFactory<Table, Integer>("rRating"));

        tableID.setItems(data);
    }

    public void AddItem(ActionEvent event)
    {
        Table entry = new Table(iNumber, nameInput.getText(), dtf.format(localDate), rating);
        iNumber++;

        data.add(entry);

        clearForm();

    }

    private void clearForm()
    {
        nameInput.clear();
    }
}
