package de.ToDaKa.CashRegisterSystem.control;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by karls_000 on 20.06.2016.
 */
public class ControllerFunctions {

   public  boolean switchScene(ActionEvent event, String filename) throws Exception
    {
        boolean ret=false;
        String cFilename="de/ToDaKa/CashRegisterSystem/view/"+filename;
        Parent nextScene = (Parent) FXMLLoader.load(getClass().getClassLoader().getResource(cFilename));
        Scene scene = new Scene(nextScene);

        Node node = (Node)event.getSource();
        Stage sStage =  (Stage) node.getScene().getWindow();

        sStage.setScene(scene);
        sStage.show();

        ret=true;

        return ret;
    }
}
