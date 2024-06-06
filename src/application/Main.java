package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Paint;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Main interface");
			primaryStage.setMaximized(true);
			Image image = new Image("C:\\Users\\ghaid\\eclipse-workspace2\\DataBaseP\\backgroundf.jpg");
			final ImageView imgView = new ImageView(image);
			imgView.setFitWidth(1540);
			imgView.setFitHeight(870);
			imgView.setPreserveRatio(true);
			Font font2 = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 32);


			Button studentB = new Button("STUDENT");
			studentB.setPrefSize(205, 70);
			studentB.setStyle("-fx-background-color: #e47437; ");
			studentB.setFont(font2);

			Button teacherB = new Button("TEACHER");
			teacherB.setPrefSize(205, 70);
			teacherB.setStyle("-fx-background-color: #bae6e6; ");
			teacherB.setFont(font2);


			Button ExamB = new Button("EXAM");
			ExamB.setPrefSize(205, 70);
			ExamB.setStyle("-fx-background-color: #ffd54b; ");
			ExamB.setFont(font2);

			Button CourseB = new Button("COURSE");
			CourseB.setPrefSize(205, 70);
			CourseB.setStyle("-fx-background-color: #16adb4; ");
			CourseB.setFont(font2);

			HBox hBox = new HBox();
			hBox.getChildren().addAll(studentB, teacherB,ExamB,CourseB);
			hBox.setSpacing(100);
			hBox.setLayoutY(80);
			hBox.setLayoutX(200);

			CourseB.setOnAction(p -> {
				primaryStage.close();
				Stage stage99= new Stage();
				Group group99 = new Group();
				Scene scene99 = new Scene(group99, 1536, 870);
				stage99.setScene(scene99);
				LinearGradient linearGradient = new LinearGradient(0, 0, 1, 1, true, CycleMethod.NO_CYCLE,new Stop(0, Color.valueOf("#fc9fdd")),new Stop(1, Color.valueOf("#9fdffc")));
				scene99.setFill(linearGradient);
				Font font3 = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 55);
				Font font1 = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 32);

				Button AddCoB = new Button("ADD  Course");
				AddCoB.setPrefSize(370, 70);
				AddCoB.setStyle("-fx-background-color: #8a0469; ");
				AddCoB.setFont(font1);
				AddCoB.setLayoutX(300);
				AddCoB.setLayoutY(250);
				AddCoB.setTextFill(Paint.valueOf("white"));

				Button DelCoB = new Button("DELETE  Course");
				DelCoB.setPrefSize(370, 70);
				DelCoB.setStyle("-fx-background-color: #8a0469; ");
				DelCoB.setFont(font1);
				DelCoB.setLayoutX(900);
				DelCoB.setLayoutY(250);
				DelCoB.setTextFill(Paint.valueOf("white"));


				Button UPCoB = new Button("UPDATE  Course");
				UPCoB.setPrefSize(370, 70);
				UPCoB.setStyle("-fx-background-color: #8a0469; ");
				UPCoB.setFont(font1);
				UPCoB.setLayoutX(300);
				UPCoB.setLayoutY(450);
				UPCoB.setTextFill(Paint.valueOf("white"));

				Button SerCoB = new Button("SEARCH For Course");
				SerCoB.setPrefSize(370, 70);
				SerCoB.setStyle("-fx-background-color: #8a0469; ");
				SerCoB.setFont(font1);
				SerCoB.setLayoutX(900);
				SerCoB.setLayoutY(450);
				SerCoB.setTextFill(Paint.valueOf("white"));

				Button BackfromCoBToM = new Button("Back");
				BackfromCoBToM.setPrefSize(150, 50);
				BackfromCoBToM.setStyle("-fx-background-color: #8a0469; ");
				BackfromCoBToM.setFont(font1);
				BackfromCoBToM.setLayoutX(100);
				BackfromCoBToM.setLayoutY(700);
				BackfromCoBToM.setTextFill(Paint.valueOf("white"));


				Label l1 = new Label("Course Tabel Querys");
				l1.setLayoutX(500);
				l1.setLayoutY(40);
				l1.setFont(font3);
				l1.setTextFill(Paint.valueOf("#8a0469"));

				Main m = new Main();
				BackfromCoBToM.setOnAction(j->{

					m.start(primaryStage);
					stage99.close();

				});


				AddCoB.setOnAction(t -> {
					stage99.close();
					Stage stage00= new Stage();
					Group group00 = new Group();
					Scene scene00 = new Scene(group00, 1536, 870);
					stage00.setScene(scene00);
					LinearGradient linearGradient0 = new LinearGradient(0, 0, 1, 1, true, CycleMethod.NO_CYCLE,new Stop(0, Color.valueOf("#fc9fdd")),new Stop(1, Color.valueOf("#9fdffc")));
					scene00.setFill(linearGradient0);


					Label lab = new Label("Add A Course");
					lab.setFont(font3);
					lab.setLayoutX(600);
					lab.setLayoutY(40);
					lab.setTextFill(Paint.valueOf("#8a0469"));

					Label label1 = new Label(" Course ID ");
					label1.setLayoutX(300);
					label1.setLayoutY(200); 
					label1.setFont(font2);


					Label label2 = new Label(" Course Name ");
					label2.setLayoutX(300);
					label2.setLayoutY(300);
					label2.setFont(font2);

					Label label3 = new Label(" Teacher ID ");
					label3.setLayoutX(300);
					label3.setLayoutY(400);
					label3.setFont(font2);

					TextField textField1 = new TextField();
					textField1.setLayoutX(700);
					textField1.setLayoutY(200);
					textField1.setPrefSize(400, 40);

					TextField textField2 = new TextField();
					textField2.setLayoutX(700);
					textField2.setLayoutY(300);
					textField2.setPrefSize(400, 40);
					textField2.setDisable(true);

					TextField textField3 = new TextField();
					textField3.setLayoutX(700);
					textField3.setLayoutY(400);
					textField3.setPrefSize(400, 40);
					textField3.setDisable(true);

					Button BackfromEaddQToEli = new Button("Back");
					BackfromEaddQToEli.setPrefSize(150, 50);
					BackfromEaddQToEli.setStyle("-fx-background-color: #8a0469; ");
					BackfromEaddQToEli.setFont(font1);
					BackfromEaddQToEli.setLayoutX(100);
					BackfromEaddQToEli.setLayoutY(700);
					BackfromEaddQToEli.setTextFill(Paint.valueOf("white"));

					Button clickAdd = new Button("ADD");
					clickAdd.setPrefSize(150, 50);
					clickAdd.setStyle("-fx-background-color: #8a0469; ");
					clickAdd.setFont(font1);
					clickAdd.setLayoutX(1300);
					clickAdd.setLayoutY(700);
					clickAdd.setTextFill(Paint.valueOf("white"));

					Button clearE = new Button("Clear");
					clearE.setPrefSize(150, 50);
					clearE.setStyle("-fx-background-color: #8a0469; ");
					clearE.setFont(font1);
					clearE.setLayoutX(1300);
					clearE.setLayoutY(100);
					clearE.setTextFill(Paint.valueOf("white"));


					textField1.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField2.setDisable(false);
						}
					});

					textField2.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField3.setDisable(false);
						}
					});

					BackfromEaddQToEli.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							// set the action for the "BackfromStuQToS" button
							CourseB.fire();
							stage00.close();
						}
					});


					clearE.setOnAction(s -> {
						textField1.setText("");
						textField2.setText("");
						textField3.setText("");
						textField2.setDisable(true);
						textField3.setDisable(true);


					});



					group00.getChildren().addAll(lab,label1,label2,label3,textField1,textField2,textField3,BackfromEaddQToEli,clearE,clickAdd);
					stage00.setMaximized(true);
					stage00.show();
				});

				UPCoB.setOnAction(o->{
					stage99.close();
					Stage stage08= new Stage();
					Group group08 = new Group();
					Scene scene08 = new Scene(group08, 1536, 870);
					stage08.setScene(scene08);
					LinearGradient linearGradient0 = new LinearGradient(0, 0, 1, 1, true, CycleMethod.NO_CYCLE,new Stop(0, Color.valueOf("#fc9fdd")),new Stop(1, Color.valueOf("#9fdffc")));
					scene08.setFill(linearGradient0);


					Label lab = new Label("Update A Course");
					lab.setFont(font3);
					lab.setLayoutX(600);
					lab.setLayoutY(40);
					lab.setTextFill(Paint.valueOf("#8a0469"));

					Label label1 = new Label(" Course ID ");
					label1.setLayoutX(300);
					label1.setLayoutY(200); 
					label1.setFont(font2);


					Label label2 = new Label(" Course Name ");
					label2.setLayoutX(300);
					label2.setLayoutY(300);
					label2.setFont(font2);

					Label label3 = new Label(" Teacher ID ");
					label3.setLayoutX(300);
					label3.setLayoutY(400);
					label3.setFont(font2);

					TextField textField1 = new TextField();
					textField1.setLayoutX(700);
					textField1.setLayoutY(200);
					textField1.setPrefSize(400, 40);

					TextField textField2 = new TextField();
					textField2.setLayoutX(700);
					textField2.setLayoutY(300);
					textField2.setPrefSize(400, 40);
					textField2.setDisable(true);

					TextField textField3 = new TextField();
					textField3.setLayoutX(700);
					textField3.setLayoutY(400);
					textField3.setPrefSize(400, 40);
					textField3.setDisable(true);

					Button BackfromEUPToEli = new Button("Back");
					BackfromEUPToEli.setPrefSize(150, 50);
					BackfromEUPToEli.setStyle("-fx-background-color: #8a0469; ");
					BackfromEUPToEli.setFont(font1);
					BackfromEUPToEli.setLayoutX(100);
					BackfromEUPToEli.setLayoutY(700);
					BackfromEUPToEli.setTextFill(Paint.valueOf("white"));

					Button clickUP = new Button("UPDATE");
					clickUP.setPrefSize(180, 50);
					clickUP.setStyle("-fx-background-color: #8a0469; ");
					clickUP.setFont(font1);
					clickUP.setLayoutX(1300);
					clickUP.setLayoutY(700);
					clickUP.setTextFill(Paint.valueOf("white"));

					Button clearE = new Button("Clear");
					clearE.setPrefSize(150, 50);
					clearE.setStyle("-fx-background-color: #8a0469; ");
					clearE.setFont(font1);
					clearE.setLayoutX(1300);
					clearE.setLayoutY(100);
					clearE.setTextFill(Paint.valueOf("white"));


					textField1.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField2.setDisable(false);
						}
					});

					textField2.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField3.setDisable(false);
						}
					});

					BackfromEUPToEli.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							// set the action for the "BackfromStuQToS" button
							CourseB.fire();
							stage08.close();
						}
					});


					clearE.setOnAction(s -> {
						textField1.setText("");
						textField2.setText("");
						textField3.setText("");
						textField2.setDisable(true);
						textField3.setDisable(true);


					});



					group08.getChildren().addAll(lab,label1,label2,label3,textField1,textField2,textField3,BackfromEUPToEli,clearE,clickUP);
					stage08.setMaximized(true);
					stage08.show();
				});

				DelCoB.setOnAction(f->{
					stage99.close();
					Stage stage12= new Stage();
					Group group12 = new Group();
					GridPane gp = new GridPane();
					Scene scene12 = new Scene(group12, 1536, 870);
					stage12.setScene(scene12);
					scene12.setFill(linearGradient);
					gp.setAlignment(Pos.CENTER);
					gp.setHgap(10);
					gp.setVgap(10);
					gp.setPadding(new Insets(25, 25, 25, 25));

					Label lab = new Label("Delete A Course");
					lab.setFont(font3);
					lab.setLayoutX(600);
					lab.setLayoutY(40);
					lab.setTextFill(Paint.valueOf("#8a0469"));

					Label label1 = new Label(" Course ID ");
					label1.setLayoutX(300);
					label1.setLayoutY(200); 
					label1.setFont(font2);

					TextField textField1 = new TextField();
					textField1.setLayoutX(700);
					textField1.setLayoutY(200);
					textField1.setPrefSize(400, 40);

					Button BackfromDelQToS = new Button("Back");
					BackfromDelQToS.setPrefSize(150, 50);
					BackfromDelQToS.setStyle("-fx-background-color: #8a0469; ");
					BackfromDelQToS.setFont(font1);
					BackfromDelQToS.setLayoutX(100);
					BackfromDelQToS.setLayoutY(700);
					BackfromDelQToS.setTextFill(Paint.valueOf("white"));

					Button clickDel = new Button("DELETE");
					clickDel.setPrefSize(180, 50);
					clickDel.setStyle("-fx-background-color: #8a0469; ");
					clickDel.setFont(font1);
					clickDel.setLayoutX(1300);
					clickDel.setLayoutY(700);
					clickDel.setTextFill(Paint.valueOf("white"));

					Button clearE = new Button("Clear");
					clearE.setPrefSize(150, 50);
					clearE.setStyle("-fx-background-color: #8a0469; ");
					clearE.setFont(font1);
					clearE.setLayoutX(1300);
					clearE.setLayoutY(100);
					clearE.setTextFill(Paint.valueOf("white"));

					BackfromDelQToS.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							stage12.close();
							CourseB.fire();
						}
					});

					clearE.setOnAction(s -> {
						textField1.setText("");

					});


					group12.getChildren().addAll(label1,textField1,BackfromDelQToS,clearE,clickDel,lab);
					stage12.setScene(scene12);
					stage12.setMaximized(true);
					stage12.show();	
				});


				SerCoB.setOnAction(f->{
					stage99.close();
					Stage stage02= new Stage();
					Group group02 = new Group();
					GridPane gp = new GridPane();
					Scene scene02 = new Scene(group02, 1536, 870);
					stage02.setScene(scene02);
					scene02.setFill(linearGradient);
					gp.setAlignment(Pos.CENTER);
					gp.setHgap(10);
					gp.setVgap(10);
					gp.setPadding(new Insets(25, 25, 25, 25));

					Label lab = new Label("Search A Course");
					lab.setFont(font3);
					lab.setLayoutX(600);
					lab.setLayoutY(40);
					lab.setTextFill(Paint.valueOf("#8a0469"));

					Label label1 = new Label(" Course ID ");
					label1.setLayoutX(300);
					label1.setLayoutY(200); 
					label1.setFont(font2);

					TextField textField1 = new TextField();
					textField1.setLayoutX(700);
					textField1.setLayoutY(200);
					textField1.setPrefSize(400, 40);

					Button BackfromSerQToCo = new Button("Back");
					BackfromSerQToCo.setPrefSize(150, 50);
					BackfromSerQToCo.setStyle("-fx-background-color: #8a0469; ");
					BackfromSerQToCo.setFont(font1);
					BackfromSerQToCo.setLayoutX(100);
					BackfromSerQToCo.setLayoutY(700);
					BackfromSerQToCo.setTextFill(Paint.valueOf("white"));

					Button clickSer = new Button("SEARCH");
					clickSer.setPrefSize(180, 50);
					clickSer.setStyle("-fx-background-color: #8a0469; ");
					clickSer.setFont(font1);
					clickSer.setLayoutX(1300);
					clickSer.setLayoutY(700);
					clickSer.setTextFill(Paint.valueOf("white"));

					Button clearc = new Button("Clear");
					clearc.setPrefSize(150, 50);
					clearc.setStyle("-fx-background-color: #8a0469; ");
					clearc.setFont(font1);
					clearc.setLayoutX(1300);
					clearc.setLayoutY(100);
					clearc.setTextFill(Paint.valueOf("white"));

					BackfromSerQToCo.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							stage02.close();
							CourseB.fire();
						}
					});

					clearc.setOnAction(s -> {
						textField1.setText("");

					});


					group02.getChildren().addAll(label1,textField1,BackfromSerQToCo,clearc,clickSer,lab);
					stage02.setScene(scene02);
					stage02.setMaximized(true);
					stage02.show();	
				});

				group99.getChildren().addAll(BackfromCoBToM,l1,SerCoB,UPCoB,DelCoB,AddCoB);
				stage99.setMaximized(true);
				stage99.show();


			});

			studentB.setOnAction(e->{
				primaryStage.close();
				Stage stage= new Stage();

				Group group = new Group();
				Scene scene = new Scene(group, 1536, 870);
				stage.setScene(scene);

				LinearGradient linearGradient = new LinearGradient(0, 0, 1, 1, true, CycleMethod.NO_CYCLE,new Stop(0, Color.valueOf("#ffaf75")),new Stop(1, Color.valueOf("#ffdd75")));
				scene.setFill(linearGradient);

				Font font3 = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 55);
				Font font1 = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 32);

				Button AddStuB = new Button("ADD  Student");
				AddStuB.setPrefSize(370, 70);
				AddStuB.setStyle("-fx-background-color: #e88d4d; ");
				AddStuB.setFont(font1);
				AddStuB.setLayoutX(300);
				AddStuB.setLayoutY(250);
				AddStuB.setTextFill(Paint.valueOf("white"));

				Button DelStuB = new Button("DELETE  Student");
				DelStuB.setPrefSize(370, 70);
				DelStuB.setStyle("-fx-background-color: #e88d4d; ");
				DelStuB.setFont(font1);
				DelStuB.setLayoutX(900);
				DelStuB.setLayoutY(250);
				DelStuB.setTextFill(Paint.valueOf("white"));


				Button UPStuB = new Button("UPDATE  Student");
				UPStuB.setPrefSize(370, 70);
				UPStuB.setStyle("-fx-background-color: #e88d4d; ");
				UPStuB.setFont(font1);
				UPStuB.setLayoutX(300);
				UPStuB.setLayoutY(450);
				UPStuB.setTextFill(Paint.valueOf("white"));

				Button SerStuB = new Button("SEARCH  Student");
				SerStuB.setPrefSize(370, 70);
				SerStuB.setStyle("-fx-background-color: #e88d4d; ");
				SerStuB.setFont(font1);
				SerStuB.setLayoutX(900);
				SerStuB.setLayoutY(450);
				SerStuB.setTextFill(Paint.valueOf("white"));

				Button BackfromStuBToM = new Button("Back");
				BackfromStuBToM.setPrefSize(150, 50);
				BackfromStuBToM.setStyle("-fx-background-color: #e88d4d; ");
				BackfromStuBToM.setFont(font1);
				BackfromStuBToM.setLayoutX(100);
				BackfromStuBToM.setLayoutY(700);
				BackfromStuBToM.setTextFill(Paint.valueOf("white"));


				Label l1 = new Label("Student Tabel Querys");
				l1.setLayoutX(500);
				l1.setLayoutY(40);
				l1.setFont(font3);
				l1.setTextFill(Paint.valueOf("#ed8237"));

				// set on action for buttons inside the student table 

				Main m = new Main();
				BackfromStuBToM.setOnAction(a -> {
					try {

						m.start(primaryStage);
						stage.close();
					} catch (Exception e1) {

						e1.printStackTrace();
					}
				});


				//add student set on action from list query 

				AddStuB.setOnAction(b->{
					stage.close();
					Stage stage1 = new Stage();
					Group group1 = new Group();
					GridPane gp = new GridPane();
					Scene scene1 = new Scene(group1, 1536, 870);
					stage1.setScene(scene1);
					scene1.setFill(linearGradient);
					gp.setAlignment(Pos.CENTER);
					gp.setHgap(10);
					gp.setVgap(10);
					gp.setPadding(new Insets(25, 25, 25, 25));

					Label lab = new Label("Add A Student");
					lab.setFont(font3);
					lab.setLayoutX(600);
					lab.setLayoutY(40);

					Label label1 = new Label(" Student ID ");
					label1.setLayoutX(300);
					label1.setLayoutY(200); 
					label1.setFont(font2);


					Label label2 = new Label(" Student Name ");
					label2.setLayoutX(300);
					label2.setLayoutY(300);
					label2.setFont(font2);

					Label label3 = new Label(" Student E-mail ");
					label3.setLayoutX(300);
					label3.setLayoutY(400);
					label3.setFont(font2);

					Label label4 = new Label(" Student PhoneN ");
					label4.setLayoutX(300);
					label4.setLayoutY(500);
					label4.setFont(font2);

					Label label5 = new Label(" Course ID ");
					label5.setLayoutX(300);
					label5.setLayoutY(600);
					label5.setFont(font2);

					TextField textField1 = new TextField();
					textField1.setLayoutX(700);
					textField1.setLayoutY(200);
					textField1.setPrefSize(400, 40);

					TextField textField2 = new TextField();
					textField2.setLayoutX(700);
					textField2.setLayoutY(300);
					textField2.setPrefSize(400, 40);
					textField2.setDisable(true);

					TextField textField3 = new TextField();
					textField3.setLayoutX(700);
					textField3.setLayoutY(400);
					textField3.setPrefSize(400, 40);
					textField3.setDisable(true);

					TextField textField4 = new TextField();
					textField4.setLayoutX(700);
					textField4.setLayoutY(500);
					textField4.setPrefSize(400, 40);
					textField4.setDisable(true);

					TextField textField5 = new TextField();
					textField5.setLayoutX(700);
					textField5.setLayoutY(600);
					textField5.setPrefSize(400, 40);
					textField5.setDisable(true);

					Button BackfromStuQToS = new Button("Back");
					BackfromStuQToS.setPrefSize(150, 50);
					BackfromStuQToS.setStyle("-fx-background-color: #e88d4d; ");
					BackfromStuQToS.setFont(font1);
					BackfromStuQToS.setLayoutX(100);
					BackfromStuQToS.setLayoutY(700);
					BackfromStuQToS.setTextFill(Paint.valueOf("white"));

					Button clickAdd = new Button("ADD");
					clickAdd.setPrefSize(150, 50);
					clickAdd.setStyle("-fx-background-color: #e88d4d; ");
					clickAdd.setFont(font1);
					clickAdd.setLayoutX(1300);
					clickAdd.setLayoutY(700);
					clickAdd.setTextFill(Paint.valueOf("white"));

					Button clearSTU = new Button("Clear");
					clearSTU.setPrefSize(150, 50);
					clearSTU.setStyle("-fx-background-color: #d1bf92; ");
					clearSTU.setFont(font1);
					clearSTU.setLayoutX(1300);
					clearSTU.setLayoutY(100);
					clearSTU.setTextFill(Paint.valueOf("white"));


					textField1.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField2.setDisable(false);
						}
					});

					textField2.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField3.setDisable(false);
						}
					});

					textField3.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField4.setDisable(false);
						}
					});

					textField4.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField5.setDisable(false);
						}
					});




					BackfromStuQToS.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							// set the action for the "BackfromStuQToS" button
							studentB.fire();
							stage1.close();
						}
					});


					clearSTU.setOnAction(s -> {
						clear(textField1, textField2, textField3, textField4, textField5);

					});



					group1.getChildren().addAll(gp,label1,lab,label2,label3,label4,label5,textField1,textField2,textField3,textField4,textField5,BackfromStuQToS,clickAdd,clearSTU);
					stage1.setMaximized(true);
					stage1.show();
				});

				//delete in student query set on action 
				DelStuB.setOnAction(c->{
					stage.close();
					Stage stage2= new Stage();
					Group group2 = new Group();
					GridPane gp = new GridPane();
					Scene scene2 = new Scene(group2, 1536, 870);
					stage2.setScene(scene2);
					scene2.setFill(linearGradient);
					gp.setAlignment(Pos.CENTER);
					gp.setHgap(10);
					gp.setVgap(10);
					gp.setPadding(new Insets(25, 25, 25, 25));

					Label lab = new Label("Delete A Student");
					lab.setFont(font3);
					lab.setLayoutX(600);
					lab.setLayoutY(40);

					Label label1 = new Label(" Student ID ");
					label1.setLayoutX(300);
					label1.setLayoutY(200); 
					label1.setFont(font2);

					TextField textField1 = new TextField();
					textField1.setLayoutX(700);
					textField1.setLayoutY(200);
					textField1.setPrefSize(400, 40);

					Button BackfromDelQToS = new Button("Back");
					BackfromDelQToS.setPrefSize(150, 50);
					BackfromDelQToS.setStyle("-fx-background-color: #e88d4d; ");
					BackfromDelQToS.setFont(font1);
					BackfromDelQToS.setLayoutX(100);
					BackfromDelQToS.setLayoutY(700);
					BackfromDelQToS.setTextFill(Paint.valueOf("white"));

					Button clickDel = new Button("DELETE");
					clickDel.setPrefSize(180, 50);
					clickDel.setStyle("-fx-background-color: #e88d4d; ");
					clickDel.setFont(font1);
					clickDel.setLayoutX(1300);
					clickDel.setLayoutY(700);
					clickDel.setTextFill(Paint.valueOf("white"));

					Button clearSTU = new Button("Clear");
					clearSTU.setPrefSize(150, 50);
					clearSTU.setStyle("-fx-background-color: #d1bf92; ");
					clearSTU.setFont(font1);
					clearSTU.setLayoutX(1300);
					clearSTU.setLayoutY(100);
					clearSTU.setTextFill(Paint.valueOf("white"));

					BackfromDelQToS.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							studentB.fire();
							stage2.close();
						}
					});

					clearSTU.setOnAction(s -> {
						textField1.setText("");

					});


					group2.getChildren().addAll(label1,textField1,BackfromDelQToS,clearSTU,clickDel,lab);
					stage2.setScene(scene2);
					stage2.setMaximized(true);
					stage2.show();
				});



				// search student set on action form the list
				SerStuB.setOnAction(c->{
					stage.close();
					Stage stage2= new Stage();
					Group group2 = new Group();
					GridPane gp = new GridPane();
					Scene scene2 = new Scene(group2, 1536, 870);
					stage2.setScene(scene2);
					scene2.setFill(linearGradient);
					gp.setAlignment(Pos.CENTER);
					gp.setHgap(10);
					gp.setVgap(10);
					gp.setPadding(new Insets(25, 25, 25, 25));

					Label lab = new Label("Search for A Student");
					lab.setFont(font3);
					lab.setLayoutX(600);
					lab.setLayoutY(40);

					Label label1 = new Label(" Student ID ");
					label1.setLayoutX(300);
					label1.setLayoutY(200); 
					label1.setFont(font2);

					TextField textField1 = new TextField();
					textField1.setLayoutX(700);
					textField1.setLayoutY(200);
					textField1.setPrefSize(400, 40);

					Button BackfromSerQToS = new Button("Back");
					BackfromSerQToS.setPrefSize(150, 50);
					BackfromSerQToS.setStyle("-fx-background-color: #e88d4d; ");
					BackfromSerQToS.setFont(font1);
					BackfromSerQToS.setLayoutX(100);
					BackfromSerQToS.setLayoutY(700);
					BackfromSerQToS.setTextFill(Paint.valueOf("white"));

					Button clickDel = new Button("SEARCH");
					clickDel.setPrefSize(150, 50);
					clickDel.setStyle("-fx-background-color: #e88d4d; ");
					clickDel.setFont(font1);
					clickDel.setLayoutX(1300);
					clickDel.setLayoutY(700);
					clickDel.setTextFill(Paint.valueOf("white"));

					Button clearSTU = new Button("Clear");
					clearSTU.setPrefSize(150, 50);
					clearSTU.setStyle("-fx-background-color: #d1bf92; ");
					clearSTU.setFont(font1);
					clearSTU.setLayoutX(1300);
					clearSTU.setLayoutY(100);
					clearSTU.setTextFill(Paint.valueOf("white"));



					BackfromSerQToS.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							studentB.fire();
							stage2.close();
						}
					});

					clearSTU.setOnAction(s -> {
						textField1.setText("");

					});


					group2.getChildren().addAll(label1,textField1,BackfromSerQToS,clearSTU,clickDel,lab);
					stage2.setScene(scene2);
					stage2.setMaximized(true);
					stage2.show();
				});


				//update set on action
				UPStuB.setOnAction(b->{
					stage.close();
					Stage stage1 = new Stage();
					Group group1 = new Group();
					GridPane gp = new GridPane();
					Scene scene1 = new Scene(group1, 1536, 870);
					stage1.setScene(scene1);
					scene1.setFill(linearGradient);
					gp.setAlignment(Pos.CENTER);
					gp.setHgap(10);
					gp.setVgap(10);
					gp.setPadding(new Insets(25, 25, 25, 25));

					Label lab = new Label("Update A Student");
					lab.setFont(font3);
					lab.setLayoutX(600);
					lab.setLayoutY(40);

					Label label1 = new Label(" Student ID ");
					label1.setLayoutX(300);
					label1.setLayoutY(200); 
					label1.setFont(font2);


					Label label2 = new Label(" Student Name ");
					label2.setLayoutX(300);
					label2.setLayoutY(300);
					label2.setFont(font2);

					Label label3 = new Label(" Student E-mail ");
					label3.setLayoutX(300);
					label3.setLayoutY(400);
					label3.setFont(font2);

					Label label4 = new Label(" Student PhoneN ");
					label4.setLayoutX(300);
					label4.setLayoutY(500);
					label4.setFont(font2);

					Label label5 = new Label(" Course ID ");
					label5.setLayoutX(300);
					label5.setLayoutY(600);
					label5.setFont(font2);

					TextField textField1 = new TextField();
					textField1.setLayoutX(700);
					textField1.setLayoutY(200);
					textField1.setPrefSize(400, 40);

					TextField textField2 = new TextField();
					textField2.setLayoutX(700);
					textField2.setLayoutY(300);
					textField2.setPrefSize(400, 40);
					textField2.setDisable(true);

					TextField textField3 = new TextField();
					textField3.setLayoutX(700);
					textField3.setLayoutY(400);
					textField3.setPrefSize(400, 40);
					textField3.setDisable(true);

					TextField textField4 = new TextField();
					textField4.setLayoutX(700);
					textField4.setLayoutY(500);
					textField4.setPrefSize(400, 40);
					textField4.setDisable(true);

					TextField textField5 = new TextField();
					textField5.setLayoutX(700);
					textField5.setLayoutY(600);
					textField5.setPrefSize(400, 40);
					textField5.setDisable(true);

					Button BackfromStuQToS = new Button("Back");
					BackfromStuQToS.setPrefSize(150, 50);
					BackfromStuQToS.setStyle("-fx-background-color: #e88d4d; ");
					BackfromStuQToS.setFont(font1);
					BackfromStuQToS.setLayoutX(100);
					BackfromStuQToS.setLayoutY(700);
					BackfromStuQToS.setTextFill(Paint.valueOf("white"));

					Button clickAdd = new Button("Update");
					clickAdd.setPrefSize(150, 50);
					clickAdd.setStyle("-fx-background-color: #e88d4d; ");
					clickAdd.setFont(font1);
					clickAdd.setLayoutX(1300);
					clickAdd.setLayoutY(700);
					clickAdd.setTextFill(Paint.valueOf("white"));

					Button clearSTU = new Button("Clear");
					clearSTU.setPrefSize(150, 50);
					clearSTU.setStyle("-fx-background-color: #d1bf92; ");
					clearSTU.setFont(font1);
					clearSTU.setLayoutX(1300);
					clearSTU.setLayoutY(100);
					clearSTU.setTextFill(Paint.valueOf("white"));


					textField1.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField2.setDisable(false);
						}
					});

					textField2.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField3.setDisable(false);
						}
					});

					textField3.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField4.setDisable(false);
						}
					});

					textField4.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField5.setDisable(false);
						}
					});




					BackfromStuQToS.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							// set the action for the "BackfromStuQToS" button
							studentB.fire();
							stage1.close();
						}
					});


					clearSTU.setOnAction(s -> {
						clear(textField1, textField2, textField3, textField4, textField5);

					});



					group1.getChildren().addAll(gp,label1,lab,label2,label3,label4,label5,textField1,textField2,textField3,textField4,textField5,BackfromStuQToS,clickAdd,clearSTU);
					stage1.setMaximized(true);
					stage1.show();
				});


				group.getChildren().addAll(AddStuB,l1,DelStuB,UPStuB,SerStuB,BackfromStuBToM);
				stage.setMaximized(true);
				stage.show();
			});



			teacherB.setOnAction(e->{
				primaryStage.close();
				Stage stage= new Stage();
				Group group = new Group();
				Scene scene = new Scene(group, 1536, 870);
				stage.setScene(scene);
				LinearGradient linearGradient = new LinearGradient(0, 0, 1, 1, true, CycleMethod.NO_CYCLE,new Stop(0, Color.valueOf("#a0e0fa")),new Stop(1, Color.valueOf("#90d6a0")));
				scene.setFill(linearGradient);

				Font font3 = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 55);
				Font font1 = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 32);

				Button AddTB = new Button("ADD  Teacher");
				AddTB.setPrefSize(370, 70);
				AddTB.setStyle("-fx-background-color: #2596be; ");
				AddTB.setFont(font1);
				AddTB.setLayoutX(300);
				AddTB.setLayoutY(250);
				AddTB.setTextFill(Paint.valueOf("white"));

				Button DelTB = new Button("DELETE  Teacher");
				DelTB.setPrefSize(370, 70);
				DelTB.setStyle("-fx-background-color: #2596be; ");
				DelTB.setFont(font1);
				DelTB.setLayoutX(900);
				DelTB.setLayoutY(250);
				DelTB.setTextFill(Paint.valueOf("white"));


				Button UPTB = new Button("UPDATE  Teacher");
				UPTB.setPrefSize(370, 70);
				UPTB.setStyle("-fx-background-color: #2596be; ");
				UPTB.setFont(font1);
				UPTB.setLayoutX(300);
				UPTB.setLayoutY(450);
				UPTB.setTextFill(Paint.valueOf("white"));

				Button SerTB = new Button("SEARCH  Teacher");
				SerTB.setPrefSize(370, 70);
				SerTB.setStyle("-fx-background-color: #2596be; ");
				SerTB.setFont(font1);
				SerTB.setLayoutX(900);
				SerTB.setLayoutY(450);
				SerTB.setTextFill(Paint.valueOf("white"));

				Button BackfromTBToM = new Button("Back");
				BackfromTBToM.setPrefSize(150, 50);
				BackfromTBToM.setStyle("-fx-background-color: #2596be; ");
				BackfromTBToM.setFont(font1);
				BackfromTBToM.setLayoutX(100);
				BackfromTBToM.setLayoutY(700);
				BackfromTBToM.setTextFill(Paint.valueOf("white"));


				Label l1 = new Label("Teacher Tabel Querys");
				l1.setLayoutX(500);
				l1.setLayoutY(40);
				l1.setFont(font3);
				l1.setTextFill(Paint.valueOf("#0f80a8"));

				// set on action for buttons inside the student table 

				Main m = new Main();
				BackfromTBToM.setOnAction(a -> {
					try {

						m.start(primaryStage);
						stage.close();
					} catch (Exception e1) {

						e1.printStackTrace();
					}
				});

				AddTB.setOnAction(b->{
					stage.close();
					Stage stage1 = new Stage();
					Group group1 = new Group();
					GridPane gp = new GridPane();
					Scene scene1 = new Scene(group1, 1536, 870);
					stage1.setScene(scene1);
					scene1.setFill(linearGradient);
					gp.setAlignment(Pos.CENTER);
					gp.setHgap(10);
					gp.setVgap(10);
					gp.setPadding(new Insets(25, 25, 25, 25));

					Label lab = new Label("Add A New Teacher");
					lab.setFont(font3);
					lab.setLayoutX(500);
					lab.setLayoutY(40);
					lab.setTextFill(Paint.valueOf("#0f80a8"));

					Label label1 = new Label(" Teacher's ID ");
					label1.setLayoutX(300);
					label1.setLayoutY(150); 
					label1.setFont(font2);


					Label label2 = new Label(" Teacher's Name ");
					label2.setLayoutX(300);
					label2.setLayoutY(220);
					label2.setFont(font2);

					Label label3 = new Label(" Teacher's Age ");
					label3.setLayoutX(300);
					label3.setLayoutY(290);
					label3.setFont(font2);

					Label label4 = new Label(" Teacher's PhoneN ");
					label4.setLayoutX(300);
					label4.setLayoutY(360);
					label4.setFont(font2);

					Label label5 = new Label(" Teacher's E-mail ");
					label5.setLayoutX(300);
					label5.setLayoutY(430);
					label5.setFont(font2);

					Label label6 = new Label(" Teacher's Major");
					label6.setLayoutX(300);
					label6.setLayoutY(500);
					label6.setFont(font2);

					Label label7 = new Label(" Teacher's Experince");
					label7.setLayoutX(300);
					label7.setLayoutY(570);
					label7.setFont(font2);

					Label label8 = new Label(" Teacher's Salary");
					label8.setLayoutX(300);
					label8.setLayoutY(640);
					label8.setFont(font2);

					TextField textField1 = new TextField();
					textField1.setLayoutX(700);
					textField1.setLayoutY(150);
					textField1.setPrefSize(400, 40);

					TextField textField2 = new TextField();
					textField2.setLayoutX(700);
					textField2.setLayoutY(220);
					textField2.setPrefSize(400, 40);
					textField2.setDisable(true);

					TextField textField3 = new TextField();
					textField3.setLayoutX(700);
					textField3.setLayoutY(290);
					textField3.setPrefSize(400, 40);
					textField3.setDisable(true);

					TextField textField4 = new TextField();
					textField4.setLayoutX(700);
					textField4.setLayoutY(360);
					textField4.setPrefSize(400, 40);
					textField4.setDisable(true);

					TextField textField5 = new TextField();
					textField5.setLayoutX(700);
					textField5.setLayoutY(430);
					textField5.setPrefSize(400, 40);
					textField5.setDisable(true);

					TextField textField6 = new TextField();
					textField6.setLayoutX(700);
					textField6.setLayoutY(500);
					textField6.setPrefSize(400, 40);
					textField6.setDisable(true);

					TextField textField7 = new TextField();
					textField7.setLayoutX(700);
					textField7.setLayoutY(570);
					textField7.setPrefSize(400, 40);
					textField7.setDisable(true);

					TextField textField8 = new TextField();
					textField8.setLayoutX(700);
					textField8.setLayoutY(640);
					textField8.setPrefSize(400, 40);
					textField8.setDisable(true);



					Button BackfromTLtoT = new Button("Back");
					BackfromTLtoT.setPrefSize(150, 50);
					BackfromTLtoT.setStyle("-fx-background-color: #2596be; ");
					BackfromTLtoT.setFont(font1);
					BackfromTLtoT.setLayoutX(100);
					BackfromTLtoT.setLayoutY(700);
					BackfromTLtoT.setTextFill(Paint.valueOf("white"));

					Button clickAdd = new Button("ADD");
					clickAdd.setPrefSize(150, 50);
					clickAdd.setStyle("-fx-background-color: #2596be; ");
					clickAdd.setFont(font1);
					clickAdd.setLayoutX(1300);
					clickAdd.setLayoutY(700);
					clickAdd.setTextFill(Paint.valueOf("white"));

					Button clearSTU = new Button("Clear");
					clearSTU.setPrefSize(150, 50);
					clearSTU.setStyle("-fx-background-color: #2596be; ");
					clearSTU.setFont(font1);
					clearSTU.setLayoutX(1300);
					clearSTU.setLayoutY(100);
					clearSTU.setTextFill(Paint.valueOf("white"));


					textField1.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField2.setDisable(false);
						}
					});

					textField2.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField3.setDisable(false);
						}
					});

					textField3.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField4.setDisable(false);
						}
					});

					textField4.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField5.setDisable(false);
						}
					});
					textField5.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField6.setDisable(false);
						}
					});
					textField6.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField7.setDisable(false);
						}
					});
					textField7.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField8.setDisable(false);
						}
					});




					BackfromTLtoT.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							// set the action for the "BackfromStuQToS" button
							stage1.close();
							teacherB.fire();
						}
					});


					clearSTU.setOnAction(s -> {
						textField1.setText("");
						textField2.setText("");
						textField3.setText("");
						textField4.setText("");
						textField5.setText("");
						textField6.setText("");
						textField7.setText("");
						textField8.setText("");
						textField2.setDisable(true);
						textField3.setDisable(true);
						textField4.setDisable(true);
						textField5.setDisable(true);
						textField6.setDisable(true);
						textField7.setDisable(true);
						textField8.setDisable(true);

					});






					group1.getChildren().addAll(gp,label1,lab,label2,label3,label4,label5,label6,label7,label8,textField1,textField2,textField3,textField4,textField5,textField6,textField7,textField8,BackfromTLtoT,clickAdd,clearSTU);
					stage1.setMaximized(true);
					stage1.show();
				});


				//delete in student query set on action 
				DelTB.setOnAction(c->{
					stage.close();
					Stage stage2= new Stage();
					Group group2 = new Group();
					GridPane gp = new GridPane();
					Scene scene2 = new Scene(group2, 1536, 870);
					stage2.setScene(scene2);
					LinearGradient linearGradientT = new LinearGradient(0, 0, 1, 1, true, CycleMethod.NO_CYCLE,new Stop(0, Color.valueOf("#a0e0fa")),new Stop(1, Color.valueOf("#90d6a0")));
					scene2.setFill(linearGradientT);
					gp.setAlignment(Pos.CENTER);
					gp.setHgap(10);
					gp.setVgap(10);
					gp.setPadding(new Insets(25, 25, 25, 25));

					Label lab = new Label("Delete A Teacher");
					lab.setFont(font3);
					lab.setLayoutX(500);
					lab.setLayoutY(40);
					lab.setTextFill(Paint.valueOf("#0f80a8"));

					Label label1 = new Label(" Teacher's ID ");
					label1.setLayoutX(300);
					label1.setLayoutY(200); 
					label1.setFont(font2);


					TextField textField1 = new TextField();
					textField1.setLayoutX(700);
					textField1.setLayoutY(200);
					textField1.setPrefSize(400, 40);

					Button BackfromDelQToS = new Button("Back");
					BackfromDelQToS.setPrefSize(150, 50);
					BackfromDelQToS.setStyle("-fx-background-color: #2596be; ");
					BackfromDelQToS.setFont(font1);
					BackfromDelQToS.setLayoutX(100);
					BackfromDelQToS.setLayoutY(700);
					BackfromDelQToS.setTextFill(Paint.valueOf("white"));

					Button clickDel = new Button("DELETE");
					clickDel.setPrefSize(180, 50);
					clickDel.setStyle("-fx-background-color: #2596be; ");
					clickDel.setFont(font1);
					clickDel.setLayoutX(1300);
					clickDel.setLayoutY(700);
					clickDel.setTextFill(Paint.valueOf("white"));

					Button clearT = new Button("Clear");
					clearT.setPrefSize(150, 50);
					clearT.setStyle("-fx-background-color: #2596be; ");
					clearT.setFont(font1);
					clearT.setLayoutX(1300);
					clearT.setLayoutY(100);
					clearT.setTextFill(Paint.valueOf("white"));

					BackfromDelQToS.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							stage2.close();
							teacherB.fire();
						}
					});

					clearT.setOnAction(s -> {
						textField1.setText("");

					});


					group2.getChildren().addAll(label1,textField1,BackfromDelQToS,clearT,clickDel,lab);
					stage2.setScene(scene2);
					stage2.setMaximized(true);
					stage2.show();
				});


				UPTB.setOnAction(b->{
					stage.close();
					Stage stage1 = new Stage();
					Group group1 = new Group();
					GridPane gp = new GridPane();
					Scene scene1 = new Scene(group1, 1536, 870);
					stage1.setScene(scene1);
					scene1.setFill(linearGradient);
					gp.setAlignment(Pos.CENTER);
					gp.setHgap(10);
					gp.setVgap(10);
					gp.setPadding(new Insets(25, 25, 25, 25));

					Label lab = new Label("Update Teacher's Info");
					lab.setFont(font3);
					lab.setLayoutX(500);
					lab.setLayoutY(40);
					lab.setTextFill(Paint.valueOf("#0f80a8"));

					Label label1 = new Label(" Teacher's ID ");
					label1.setLayoutX(300);
					label1.setLayoutY(150); 
					label1.setFont(font2);


					Label label2 = new Label(" Teacher's Name ");
					label2.setLayoutX(300);
					label2.setLayoutY(220);
					label2.setFont(font2);

					Label label3 = new Label(" Teacher's Age ");
					label3.setLayoutX(300);
					label3.setLayoutY(290);
					label3.setFont(font2);

					Label label4 = new Label(" Teacher's PhoneN ");
					label4.setLayoutX(300);
					label4.setLayoutY(360);
					label4.setFont(font2);

					Label label5 = new Label(" Teacher's E-mail ");
					label5.setLayoutX(300);
					label5.setLayoutY(430);
					label5.setFont(font2);

					Label label6 = new Label(" Teacher's Major");
					label6.setLayoutX(300);
					label6.setLayoutY(500);
					label6.setFont(font2);

					Label label7 = new Label(" Teacher's Experince");
					label7.setLayoutX(300);
					label7.setLayoutY(570);
					label7.setFont(font2);

					Label label8 = new Label(" Teacher's Salary");
					label8.setLayoutX(300);
					label8.setLayoutY(640);
					label8.setFont(font2);

					TextField textField1 = new TextField();
					textField1.setLayoutX(700);
					textField1.setLayoutY(150);
					textField1.setPrefSize(400, 40);

					TextField textField2 = new TextField();
					textField2.setLayoutX(700);
					textField2.setLayoutY(220);
					textField2.setPrefSize(400, 40);
					textField2.setDisable(true);

					TextField textField3 = new TextField();
					textField3.setLayoutX(700);
					textField3.setLayoutY(290);
					textField3.setPrefSize(400, 40);
					textField3.setDisable(true);

					TextField textField4 = new TextField();
					textField4.setLayoutX(700);
					textField4.setLayoutY(360);
					textField4.setPrefSize(400, 40);
					textField4.setDisable(true);

					TextField textField5 = new TextField();
					textField5.setLayoutX(700);
					textField5.setLayoutY(430);
					textField5.setPrefSize(400, 40);
					textField5.setDisable(true);

					TextField textField6 = new TextField();
					textField6.setLayoutX(700);
					textField6.setLayoutY(500);
					textField6.setPrefSize(400, 40);
					textField6.setDisable(true);

					TextField textField7 = new TextField();
					textField7.setLayoutX(700);
					textField7.setLayoutY(570);
					textField7.setPrefSize(400, 40);
					textField7.setDisable(true);

					TextField textField8 = new TextField();
					textField8.setLayoutX(700);
					textField8.setLayoutY(640);
					textField8.setPrefSize(400, 40);
					textField8.setDisable(true);



					Button BackfromTLtoT = new Button("Back");
					BackfromTLtoT.setPrefSize(150, 50);
					BackfromTLtoT.setStyle("-fx-background-color: #2596be; ");
					BackfromTLtoT.setFont(font1);
					BackfromTLtoT.setLayoutX(100);
					BackfromTLtoT.setLayoutY(700);
					BackfromTLtoT.setTextFill(Paint.valueOf("white"));

					Button clickUPD = new Button("UPDATE");
					clickUPD.setPrefSize(180, 50);
					clickUPD.setStyle("-fx-background-color: #2596be; ");
					clickUPD.setFont(font1);
					clickUPD.setLayoutX(1300);
					clickUPD.setLayoutY(700);
					clickUPD.setTextFill(Paint.valueOf("white"));

					Button clearSTU = new Button("Clear");
					clearSTU.setPrefSize(150, 50);
					clearSTU.setStyle("-fx-background-color: #2596be; ");
					clearSTU.setFont(font1);
					clearSTU.setLayoutX(1300);
					clearSTU.setLayoutY(100);
					clearSTU.setTextFill(Paint.valueOf("white"));


					textField1.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField2.setDisable(false);
						}
					});

					textField2.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField3.setDisable(false);
						}
					});

					textField3.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField4.setDisable(false);
						}
					});

					textField4.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField5.setDisable(false);
						}
					});
					textField5.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField6.setDisable(false);
						}
					});
					textField6.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField7.setDisable(false);
						}
					});
					textField7.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							textField8.setDisable(false);
						}
					});




					BackfromTLtoT.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							// set the action for the "BackfromStuQToS" button
							stage1.close();
							teacherB.fire();
						}
					});


					clearSTU.setOnAction(s -> {
						textField1.setText("");
						textField2.setText("");
						textField3.setText("");
						textField4.setText("");
						textField5.setText("");
						textField6.setText("");
						textField7.setText("");
						textField8.setText("");
						textField2.setDisable(true);
						textField3.setDisable(true);
						textField4.setDisable(true);
						textField5.setDisable(true);
						textField6.setDisable(true);
						textField7.setDisable(true);
						textField8.setDisable(true);

					});






					group1.getChildren().addAll(gp,label1,lab,label2,label3,label4,label5,label6,label7,label8,textField1,textField2,textField3,textField4,textField5,textField6,textField7,textField8,BackfromTLtoT,clickUPD,clearSTU);
					stage1.setMaximized(true);
					stage1.show();
				});


				SerTB.setOnAction(c->{
					stage.close();
					Stage stage2= new Stage();
					Group group2 = new Group();
					GridPane gp = new GridPane();
					Scene scene2 = new Scene(group2, 1536, 870);
					stage2.setScene(scene2);
					LinearGradient linearGradientT = new LinearGradient(0, 0, 1, 1, true, CycleMethod.NO_CYCLE,new Stop(0, Color.valueOf("#a0e0fa")),new Stop(1, Color.valueOf("#90d6a0")));
					scene2.setFill(linearGradientT);
					gp.setAlignment(Pos.CENTER);
					gp.setHgap(10);
					gp.setVgap(10);
					gp.setPadding(new Insets(25, 25, 25, 25));

					Label lab = new Label("Search For A Teacher");
					lab.setFont(font3);
					lab.setLayoutX(500);
					lab.setLayoutY(40);
					lab.setTextFill(Paint.valueOf("#0f80a8"));

					Label label1 = new Label(" Teacher's ID ");
					label1.setLayoutX(300);
					label1.setLayoutY(200); 
					label1.setFont(font2);


					TextField textField1 = new TextField();
					textField1.setLayoutX(700);
					textField1.setLayoutY(200);
					textField1.setPrefSize(400, 40);

					Button BackfromDelQToS = new Button("Back");
					BackfromDelQToS.setPrefSize(150, 50);
					BackfromDelQToS.setStyle("-fx-background-color: #2596be; ");
					BackfromDelQToS.setFont(font1);
					BackfromDelQToS.setLayoutX(100);
					BackfromDelQToS.setLayoutY(700);
					BackfromDelQToS.setTextFill(Paint.valueOf("white"));

					Button clickserT = new Button("SEARCH");
					clickserT.setPrefSize(180, 50);
					clickserT.setStyle("-fx-background-color: #2596be; ");
					clickserT.setFont(font1);
					clickserT.setLayoutX(1300);
					clickserT.setLayoutY(700);
					clickserT.setTextFill(Paint.valueOf("white"));

					Button clearT = new Button("Clear");
					clearT.setPrefSize(150, 50);
					clearT.setStyle("-fx-background-color: #2596be; ");
					clearT.setFont(font1);
					clearT.setLayoutX(1300);
					clearT.setLayoutY(100);
					clearT.setTextFill(Paint.valueOf("white"));

					BackfromDelQToS.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							stage2.close();
							teacherB.fire();

						}
					});

					clearT.setOnAction(s -> {
						textField1.setText("");

					});



					group2.getChildren().addAll(label1,textField1,BackfromDelQToS,clearT,clickserT,lab);
					stage2.setScene(scene2);
					stage2.setMaximized(true);
					stage2.show();
				});




				group.getChildren().addAll(AddTB,BackfromTBToM,SerTB,UPTB,DelTB,l1);
				stage.setMaximized(true);
				stage.show();

			});

			ExamB.setOnAction(v->{
				primaryStage.close();
				Stage stage4 = new Stage();
				Group group4 = new Group();
				GridPane gp = new GridPane();
				Scene scene4 = new Scene(group4, 1536, 870);
				LinearGradient linearGradientT = new LinearGradient(0, 0, 1, 1, true, CycleMethod.NO_CYCLE,new Stop(0, Color.valueOf("#fce76f")),new Stop(1, Color.valueOf("#f3dff7")));
				stage4.setScene(scene4);
				scene4.setFill(linearGradientT);
				gp.setAlignment(Pos.CENTER);
				gp.setHgap(10);
				gp.setVgap(10);
				gp.setPadding(new Insets(25, 25, 25, 25));

				Font font3 = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 55);
				Font font1 = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 32);

				Button AddEB = new Button("ADD  Exam");
				AddEB.setPrefSize(370, 70);
				AddEB.setStyle("-fx-background-color: #8a6791; ");
				AddEB.setFont(font1);
				AddEB.setLayoutX(300);
				AddEB.setLayoutY(250);
				AddEB.setTextFill(Paint.valueOf("#fce76f"));

				Button DelEB = new Button("DELETE  Exam");
				DelEB.setPrefSize(370, 70);
				DelEB.setStyle("-fx-background-color: #8a6791; ");
				DelEB.setFont(font1);
				DelEB.setLayoutX(900);
				DelEB.setLayoutY(250);
				DelEB.setTextFill(Paint.valueOf("#fce76f"));


				Button UPEB = new Button("UPDATE  Exam");
				UPEB.setPrefSize(370, 70);
				UPEB.setStyle("-fx-background-color: #8a6791; ");
				UPEB.setFont(font1);
				UPEB.setLayoutX(300);
				UPEB.setLayoutY(450);
				UPEB.setTextFill(Paint.valueOf("#fce76f"));

				Button SerEB = new Button("SEARCH  Exam");
				SerEB.setPrefSize(370, 70);
				SerEB.setStyle("-fx-background-color:#8a6791; ");
				SerEB.setFont(font1);
				SerEB.setLayoutX(900);
				SerEB.setLayoutY(450);
				SerEB.setTextFill(Paint.valueOf("#fce76f"));

				Button BackfromEBToM = new Button("Back");
				BackfromEBToM.setPrefSize(150, 50);
				BackfromEBToM.setStyle("-fx-background-color: #8a6791; ");
				BackfromEBToM.setFont(font1);
				BackfromEBToM.setLayoutX(100);
				BackfromEBToM.setLayoutY(700);
				BackfromEBToM.setTextFill(Paint.valueOf("#fce76f"));


				Label l1 = new Label(" Exam Tabel Querys");
				l1.setLayoutX(510);///////////////
				l1.setLayoutY(40);
				l1.setFont(font3);
				l1.setTextFill(Paint.valueOf("#8a6791"));

				// set on action for buttons inside the student table 

				Main m = new Main();
				BackfromEBToM.setOnAction(a -> {
					try {
						m.start(primaryStage);
						stage4.close();
					} catch (Exception e1) {

						e1.printStackTrace();
					}
				});

				AddEB.setOnAction(w ->{
					//here
					stage4.close();
					Stage stage6 = new Stage();
					Group group6 = new Group();
					Scene scene6 = new Scene(group6, 1536, 870);
					stage6.setScene(scene6);
					LinearGradient linearGradienth = new LinearGradient(0, 0, 1, 1, true, CycleMethod.NO_CYCLE,new Stop(0, Color.valueOf("#fce76f")),new Stop(1, Color.valueOf("#f3dff7")));
					scene6.setFill(linearGradienth);
					gp.setAlignment(Pos.CENTER);
					gp.setHgap(10);
					gp.setVgap(10);
					gp.setPadding(new Insets(25, 25, 25, 25));

					Label labe = new Label("Add A New Exam");
					labe.setLayoutX(550);
					labe.setLayoutY(40);
					labe.setFont(font3);
					labe.setTextFill(Paint.valueOf("#8a6791"));

					Label label1 = new Label(" Exam ID ");
					label1.setLayoutX(300);
					label1.setLayoutY(200); 
					label1.setFont(font2);


					Label label2 = new Label(" Exam Name ");
					label2.setLayoutX(300);
					label2.setLayoutY(300);
					label2.setFont(font2);

					Label label3 = new Label(" Course ID ");
					label3.setLayoutX(300);
					label3.setLayoutY(400);
					label3.setFont(font2);

					Label label4 = new Label(" Exam Time ");
					label4.setLayoutX(300);
					label4.setLayoutY(500);
					label4.setFont(font2);

					Label label5 = new Label(" Exam Date ");
					label5.setLayoutX(300);
					label5.setLayoutY(600);
					label5.setFont(font2);

					TextField tf1 = new TextField();
					tf1.setLayoutX(600);
					tf1.setLayoutY(200);
					tf1.setPrefSize(400, 40);

					TextField tf2 = new TextField();
					tf2.setLayoutX(600);
					tf2.setLayoutY(300);
					tf2.setPrefSize(400, 40);
					tf2.setDisable(true);

					TextField tf3 = new TextField();
					tf3.setLayoutX(600);
					tf3.setLayoutY(400);
					tf3.setPrefSize(400, 40);
					tf3.setDisable(true);

					TextField tf4 = new TextField();
					tf4.setLayoutX(600);
					tf4.setLayoutY(500);
					tf4.setPrefSize(400, 40);
					tf4.setDisable(true);

					TextField tf5 = new TextField();
					tf5.setLayoutX(600);
					tf5.setLayoutY(600);
					tf5.setPrefSize(400, 40);
					tf5.setDisable(true);

					tf1.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							tf2.setDisable(false);
						}
					});

					tf2.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							tf3.setDisable(false);
						}
					});

					tf3.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							tf4.setDisable(false);
						}
					});

					tf4.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							tf5.setDisable(false);
						}
					});


					Button BackfromEToEli = new Button("Back");
					BackfromEToEli.setPrefSize(150, 50);
					BackfromEToEli.setStyle("-fx-background-color: #8a6791; ");
					BackfromEToEli.setFont(font1);
					BackfromEToEli.setLayoutX(100);
					BackfromEToEli.setLayoutY(700);
					BackfromEToEli.setTextFill(Paint.valueOf("white"));

					Button clickAddE = new Button("ADD");
					clickAddE.setPrefSize(180, 50);
					clickAddE.setStyle("-fx-background-color: #8a6791; ");
					clickAddE.setFont(font1);
					clickAddE.setLayoutX(1300);
					clickAddE.setLayoutY(700);
					clickAddE.setTextFill(Paint.valueOf("white"));

					Button clearE = new Button("Clear");
					clearE.setPrefSize(150, 50);
					clearE.setStyle("-fx-background-color: #8a6791; ");
					clearE.setFont(font1);
					clearE.setLayoutX(1300);
					clearE.setLayoutY(100);
					clearE.setTextFill(Paint.valueOf("white"));

					clearE.setOnAction(s -> {
						tf1.setText("");
						tf2.setText("");
						tf3.setText("");
						tf4.setText("");
						tf5.setText("");

						tf2.setDisable(true);
						tf3.setDisable(true);
						tf4.setDisable(true);
						tf5.setDisable(true);


					});


					BackfromEToEli.setOnAction(u -> {
						ExamB.fire();
						stage6.close();
					});

					group6.getChildren().addAll(labe,label1,label2,label3,label4,label5,tf1,tf2,tf3,tf4,tf5,BackfromEToEli,clickAddE,clearE);
					stage6.setMaximized(true);
					stage6.show();


				});


				SerEB.setOnAction(n ->{
					stage4.close();
					Stage stage11 = new Stage();
					Group group11 = new Group();
					Scene scene11 = new Scene(group11, 1536, 870);
					stage11.setScene(scene11);
					LinearGradient linearGradienth = new LinearGradient(0, 0, 1, 1, true, CycleMethod.NO_CYCLE,new Stop(0, Color.valueOf("#fce76f")),new Stop(1, Color.valueOf("#f3dff7")));
					scene11.setFill(linearGradienth);
					gp.setAlignment(Pos.CENTER);
					gp.setHgap(10);
					gp.setVgap(10);
					gp.setPadding(new Insets(25, 25, 25, 25));

					Label lab = new Label("Search For A Exam");
					lab.setFont(font3);
					lab.setLayoutX(500);
					lab.setLayoutY(40);
					lab.setTextFill(Paint.valueOf("#8a6791"));

					Label label1 = new Label(" Exam ID ");
					label1.setLayoutX(300);
					label1.setLayoutY(200); 
					label1.setFont(font2);


					TextField textField1 = new TextField();
					textField1.setLayoutX(700);
					textField1.setLayoutY(200);
					textField1.setPrefSize(400, 40);

					Button BackfromSerEToEl = new Button("Back");
					BackfromSerEToEl.setPrefSize(150, 50);
					BackfromSerEToEl.setStyle("-fx-background-color: #8a6791; ");
					BackfromSerEToEl.setFont(font1);
					BackfromSerEToEl.setLayoutX(100);
					BackfromSerEToEl.setLayoutY(700);
					BackfromSerEToEl.setTextFill(Paint.valueOf("white"));

					Button clickserT = new Button("SEARCH");
					clickserT.setPrefSize(180, 50);
					clickserT.setStyle("-fx-background-color: #8a6791; ");
					clickserT.setFont(font1);
					clickserT.setLayoutX(1300);
					clickserT.setLayoutY(700);
					clickserT.setTextFill(Paint.valueOf("white"));

					Button clearE = new Button("Clear");
					clearE.setPrefSize(150, 50);
					clearE.setStyle("-fx-background-color: #8a6791; ");
					clearE.setFont(font1);
					clearE.setLayoutX(1300);
					clearE.setLayoutY(100);
					clearE.setTextFill(Paint.valueOf("white"));

					clearE.setOnAction(s -> {
						textField1.setText("");



					});


					BackfromSerEToEl.setOnAction(u -> {
						ExamB.fire();
						stage11.close();
					});

					group11.getChildren().addAll(lab,label1,textField1,BackfromSerEToEl,clickserT,clearE);
					stage11.setMaximized(true);
					stage11.show();
				});


				DelEB.setOnAction(n ->{
					stage4.close();
					Stage stage12 = new Stage();
					Group group12 = new Group();
					Scene scene12 = new Scene(group12, 1536, 870);
					stage12.setScene(scene12);
					LinearGradient linearGradienth = new LinearGradient(0, 0, 1, 1, true, CycleMethod.NO_CYCLE,new Stop(0, Color.valueOf("#fce76f")),new Stop(1, Color.valueOf("#f3dff7")));
					scene12.setFill(linearGradienth);
					gp.setAlignment(Pos.CENTER);
					gp.setHgap(10);
					gp.setVgap(10);
					gp.setPadding(new Insets(25, 25, 25, 25));

					Label lab = new Label("Delete An Exam");
					lab.setFont(font3);
					lab.setLayoutX(500);
					lab.setLayoutY(40);
					lab.setTextFill(Paint.valueOf("#8a6791"));

					Label label1 = new Label(" Exam ID ");
					label1.setLayoutX(300);
					label1.setLayoutY(200); 
					label1.setFont(font2);


					TextField textField1 = new TextField();
					textField1.setLayoutX(700);
					textField1.setLayoutY(200);
					textField1.setPrefSize(400, 40);

					Button BackfromSerEToEl = new Button("Back");
					BackfromSerEToEl.setPrefSize(150, 50);
					BackfromSerEToEl.setStyle("-fx-background-color: #8a6791; ");
					BackfromSerEToEl.setFont(font1);
					BackfromSerEToEl.setLayoutX(100);
					BackfromSerEToEl.setLayoutY(700);
					BackfromSerEToEl.setTextFill(Paint.valueOf("white"));

					Button clickDelE = new Button("Delete");
					clickDelE.setPrefSize(180, 50);
					clickDelE.setStyle("-fx-background-color: #8a6791; ");
					clickDelE.setFont(font1);
					clickDelE.setLayoutX(1300);
					clickDelE.setLayoutY(700);
					clickDelE.setTextFill(Paint.valueOf("white"));

					Button clearE = new Button("Clear");
					clearE.setPrefSize(150, 50);
					clearE.setStyle("-fx-background-color: #8a6791; ");
					clearE.setFont(font1);
					clearE.setLayoutX(1300);
					clearE.setLayoutY(100);
					clearE.setTextFill(Paint.valueOf("white"));

					clearE.setOnAction(s -> {
						textField1.setText("");



					});


					BackfromSerEToEl.setOnAction(u -> {
						ExamB.fire();
						stage12.close();
					});

					group12.getChildren().addAll(lab,label1,textField1,BackfromSerEToEl,clickDelE,clearE);
					stage12.setMaximized(true);
					stage12.show();
				});


				UPEB.setOnAction(k-> {
					stage4.close();
					Stage stage33 = new Stage();
					Group group33 = new Group();
					Scene scene33 = new Scene(group33, 1536, 870);
					stage33.setScene(scene33);
					LinearGradient linearGradienth = new LinearGradient(0, 0, 1, 1, true, CycleMethod.NO_CYCLE,new Stop(0, Color.valueOf("#fce76f")),new Stop(1, Color.valueOf("#f3dff7")));
					scene33.setFill(linearGradienth);
					gp.setAlignment(Pos.CENTER);
					gp.setHgap(10);
					gp.setVgap(10);
					gp.setPadding(new Insets(25, 25, 25, 25));

					Label labe = new Label("Update Exam");
					labe.setLayoutX(550);
					labe.setLayoutY(40);
					labe.setFont(font3);
					labe.setTextFill(Paint.valueOf("#8a6791"));

					Label label1 = new Label(" Exam ID ");
					label1.setLayoutX(300);
					label1.setLayoutY(200); 
					label1.setFont(font2);


					Label label2 = new Label(" Exam Name ");
					label2.setLayoutX(300);
					label2.setLayoutY(300);
					label2.setFont(font2);

					Label label3 = new Label(" Course ID ");
					label3.setLayoutX(300);
					label3.setLayoutY(400);
					label3.setFont(font2);

					Label label4 = new Label(" Exam Time ");
					label4.setLayoutX(300);
					label4.setLayoutY(500);
					label4.setFont(font2);

					Label label5 = new Label(" Exam Date ");
					label5.setLayoutX(300);
					label5.setLayoutY(600);
					label5.setFont(font2);

					TextField tf1 = new TextField();
					tf1.setLayoutX(600);
					tf1.setLayoutY(200);
					tf1.setPrefSize(400, 40);

					TextField tf2 = new TextField();
					tf2.setLayoutX(600);
					tf2.setLayoutY(300);
					tf2.setPrefSize(400, 40);
					tf2.setDisable(true);

					TextField tf3 = new TextField();
					tf3.setLayoutX(600);
					tf3.setLayoutY(400);
					tf3.setPrefSize(400, 40);
					tf3.setDisable(true);

					TextField tf4 = new TextField();
					tf4.setLayoutX(600);
					tf4.setLayoutY(500);
					tf4.setPrefSize(400, 40);
					tf4.setDisable(true);

					TextField tf5 = new TextField();
					tf5.setLayoutX(600);
					tf5.setLayoutY(600);
					tf5.setPrefSize(400, 40);
					tf5.setDisable(true);

					tf1.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							tf2.setDisable(false);
						}
					});

					tf2.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							tf3.setDisable(false);
						}
					});

					tf3.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							tf4.setDisable(false);
						}
					});

					tf4.textProperty().addListener((observable, oldValue, newValue) -> {
						if (!newValue.isEmpty()) {
							tf5.setDisable(false);
						}
					});


					Button BackfromEToEli = new Button("Back");
					BackfromEToEli.setPrefSize(150, 50);
					BackfromEToEli.setStyle("-fx-background-color: #8a6791; ");
					BackfromEToEli.setFont(font1);
					BackfromEToEli.setLayoutX(100);
					BackfromEToEli.setLayoutY(700);
					BackfromEToEli.setTextFill(Paint.valueOf("white"));

					Button clickUPE = new Button("UPDATE");
					clickUPE.setPrefSize(180, 50);
					clickUPE.setStyle("-fx-background-color: #8a6791; ");
					clickUPE.setFont(font1);
					clickUPE.setLayoutX(1300);
					clickUPE.setLayoutY(700);
					clickUPE.setTextFill(Paint.valueOf("white"));

					Button clearE = new Button("Clear");
					clearE.setPrefSize(150, 50);
					clearE.setStyle("-fx-background-color: #8a6791; ");
					clearE.setFont(font1);
					clearE.setLayoutX(1300);
					clearE.setLayoutY(100);
					clearE.setTextFill(Paint.valueOf("white"));

					clearE.setOnAction(s -> {
						tf1.setText("");
						tf2.setText("");
						tf3.setText("");
						tf4.setText("");
						tf5.setText("");

						tf2.setDisable(true);
						tf3.setDisable(true);
						tf4.setDisable(true);
						tf5.setDisable(true);


					});


					BackfromEToEli.setOnAction(u -> {
						ExamB.fire();
						stage33.close();
					});

					group33.getChildren().addAll(labe,label1,label2,label3,label4,label5,tf1,tf2,tf3,tf4,tf5,BackfromEToEli,clickUPE,clearE);
					stage33.setMaximized(true);
					stage33.show();

				});

				group4.getChildren().addAll(AddEB,SerEB,UPEB,DelEB,l1,BackfromEBToM);
				stage4.setMaximized(true);
				stage4.show();

			});


			Group group = new Group();
			group.getChildren().addAll(imgView, hBox);
			Scene scene = new Scene(group, 1536, 870);

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clear(TextField textField1, TextField textField2, TextField textField3, TextField textField4, TextField textField5) {
		textField1.setText("");
		textField2.setText("");
		textField3.setText("");
		textField4.setText("");
		textField5.setText("");
		textField2.setDisable(true);
		textField3.setDisable(true);
		textField4.setDisable(true);
		textField5.setDisable(true);



	}

	public static void main(String[] args) {
		launch(args);
	}
}
