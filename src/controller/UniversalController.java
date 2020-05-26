package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import model.Laptop;
import model.Supermarket;
import thread.ThreadClock1;

public class UniversalController implements Initializable{
	
	@FXML
    private Label labelClock;

    @FXML
    private BorderPane mainPanel;
    
    @FXML
    private TextField textLaptop;
    
    private Supermarket supermarket;
    
    private ThreadClock1 thread1;
    
    public UniversalController( Supermarket supermarket ) {
		this.supermarket = supermarket;
	}

    @FXML
    void addACandidate(ActionEvent event) {

    }

    @FXML
    void addAClient(ActionEvent event) {

    }

    @FXML
    void addALaptop(ActionEvent event) {

    }

    @FXML
    void addAManager(ActionEvent event) {

    }

    @FXML
    void addAProvider(ActionEvent event) {

    }

    @FXML
    void generateAReport(ActionEvent event) {

    }

    @FXML
    void loadCandidates(ActionEvent event) {

    }

    @FXML
    public void searchALaptop(ActionEvent event) throws IOException{
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/SearchLaptop.fxml"));
    	loader.setController(this);
    	Parent searchLaptop = loader.load();
    	mainPanel.setCenter(searchLaptop);
    }

    @FXML
    public void searchATv(ActionEvent event) {

    }

    @FXML
    void showTheDoomClock(ActionEvent event) {

    }

    @FXML
    public void showTheProgressBar(ActionEvent event) {

    }
    
    //------------------------------------------------------------------------
    @FXML
    public void searchLaptop(ActionEvent event) {
    	String name = textLaptop.getText();
    	Laptop l = supermarket.binarySearchLaptopByName(name);
    	if( l == null )
    	{
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Not found");
    		alert.setHeaderText("The product was not found");
    		alert.setContentText("Try to type better.");
    		alert.show();
    	}
    	else
    	{
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("Object found");
    		alert.setHeaderText("The product was found");
    		alert.setContentText("" + l.getName());
    		alert.show();
    	}
    }
    
    public void updateTime( String time ) {
    	labelClock.setText(time);
    }
    
    public void startClock() {
    	thread1 = new ThreadClock1(this);
    	thread1.start();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		startClock();
	}
	
}
