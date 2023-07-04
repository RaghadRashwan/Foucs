/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedproject;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.effect.DropShadow;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javax.persistence.EntityManager;
import org.hibernate.*;
import org.hibernate.Query;
import org.hibernate.Transaction;


/**
 *
 * @author shaha
 */
public class AdvancedProject extends Application {

    Scene CreateNewAcount;
    Scene loginInScene;
    Scene GroupType;
    Scene createGroupScene;
    Scene GoalsScene;
    Scene GoalView;
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        
        Image backgroundImage = new Image("https://i.pinimg.com/originals/ac/45/95/ac459523a75b3d03da293cfe942093b3.jpg");
        BackgroundImage background_GoalsScene = new BackgroundImage(backgroundImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT);
        Background bGround = new Background(background_GoalsScene);
         
        ImageView background_CreateNewAcount = new ImageView(backgroundImage);//Setting the image view 

        ImageView background_loginInScene = new ImageView(backgroundImage);//Setting the image view 
        
        ImageView background_GroupType = new ImageView(backgroundImage);//Setting the image view 
        
        ImageView background_createGroupScene = new ImageView(backgroundImage);//Setting the image view 
        
        
        Image goalimage = new Image("advancedproject/goalphoto.png");
        ImagePattern Img = new ImagePattern(goalimage);

        
        Image image_BOOK = new Image("https://i.pinimg.com/564x/29/f6/3e/29f63ee2269cd20e499c21e498f31d67.jpg");
        ImageView book = new ImageView(image_BOOK);//Setting the image view 
        book.setFitHeight(180);//setting the fit height and width of the image view 
        book.setFitWidth(550);
        
        
        Image Logo1 = new Image("https://i.pinimg.com/originals/56/13/12/561312815857fa6793d97095d09f99fa.png");
        ImageView Logo = new ImageView(Logo1);//Setting the image view 
        Logo.setFitHeight(340);//setting the fit height and width of the image view 
        Logo.setFitWidth(340);


        
        /////code shahad alhassani - login page
        //Page title text
        
        String soundpath="C:\\Users\\User\\Desktop\\program\\AdvancedProject\\src\\advancedproject\\adiuo.mp4";
        Media sound = new Media(new File(soundpath).toURI().toString());
        MediaPlayer sound1 = new MediaPlayer(sound);
        
        Text textLgnin = new Text(); //Creating a Text object
        textLgnin.setText("تسجيل الدخول"); //Setting the text to be added. 
        textLgnin.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));//setting the font
        

        Label user_nameLogIN = new Label("اسم المستخدم:");
        user_nameLogIN.setTextFill(Color.BLACK);
        TextField Enteruser_nameLogIN = new TextField();
        Enteruser_nameLogIN.setMaxWidth(200);


        Label password_Lgnin = new Label("كلمة المرور:");
        password_Lgnin.setTextFill(Color.BLACK);
        PasswordField EnterPassword_Lgnin = new PasswordField();
        EnterPassword_Lgnin.setMaxWidth(200);
        
        
        Text OpenAnAccount = new Text("لانشاء حساب جديد ");
        OpenAnAccount.setFill(Color.BLACK);
        
        Text GoToRegistrationPage = new Text("اضغط هنا");
        GoToRegistrationPage.setFill(Color.BLUE);
        GoToRegistrationPage.setUnderline(true);
        
        HBox PaneTexts= new HBox(5);
        PaneTexts.setAlignment(Pos.CENTER);
        PaneTexts.getChildren().addAll(GoToRegistrationPage,OpenAnAccount);
        
        Button ButtomSignin = new Button("تسجيل دخول");
           Label msg = new Label();
           msg.setTextFill(Color.RED);
        VBox paneInput_loginInScene = new VBox(20);
        paneInput_loginInScene.setAlignment(Pos.CENTER);
        paneInput_loginInScene.getChildren().addAll(textLgnin,msg,user_nameLogIN, Enteruser_nameLogIN,password_Lgnin,EnterPassword_Lgnin,ButtomSignin,PaneTexts);

        Rectangle rectangle_loginInScene = new Rectangle(300,340);
        rectangle_loginInScene.setFill(Color.rgb(85, 117, 112,0.7));
        rectangle_loginInScene.setArcHeight(90);
        rectangle_loginInScene.setArcWidth(90);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(rectangle_loginInScene,paneInput_loginInScene);
        stackPane.setPadding(new Insets(0, 20, 0, 0));

        HBox pageFormat_loginInScene = new HBox(20);
        pageFormat_loginInScene.setPadding(new Insets(30,0, 30, 0));
        pageFormat_loginInScene.getChildren().addAll(stackPane,Logo);
        pageFormat_loginInScene.setAlignment(Pos.CENTER);
        
        StackPane paneForAll_loginInScene = new StackPane();
        paneForAll_loginInScene.getChildren().addAll(background_loginInScene,pageFormat_loginInScene);
        paneForAll_loginInScene.setPadding(new Insets(30,0, 30, 50));
        paneForAll_loginInScene.setAlignment(Pos.CENTER);
         
        loginInScene = new Scene(paneForAll_loginInScene, 800, 600);
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////
        //wessal code

        String path= "C:\\Users\\User\\Desktop\\program\\AdvancedProject\\src\\advancedproject\\vidio.mp4";   
        Media media = new Media(new File(path).toURI().toString()); 
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView (mediaPlayer);
        mediaView.setFitHeight(300);
        mediaView.setFitWidth(300);
        mediaView.setStyle("-fx-border-color: black");
        
        
                
        Media sound11 = new Media(new File(soundpath).toURI().toString());
        MediaPlayer sound111 = new MediaPlayer(sound11);

        Media sound1111 = new Media(new File(soundpath).toURI().toString());
        MediaPlayer sound11111 = new MediaPlayer(sound1111);  
        
        Text newaccT = new Text(); //Creating a Text object
        newaccT.setText("إنشاء حساب جديد"); //Setting the text to be added. 
        newaccT.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 25));//setting the font

        Rectangle rectangle_CreateNewAcount = new Rectangle(370, 390);
        rectangle_CreateNewAcount.setFill(Color.rgb(85, 117, 112, 0.7));
        rectangle_CreateNewAcount.setArcHeight(130);
        rectangle_CreateNewAcount.setArcWidth(130);

        Rectangle rectangle_CreateNewAcount1 = new Rectangle(370, 390);
        rectangle_CreateNewAcount1.setFill(Color.rgb(85, 117, 112, 0.7));
        rectangle_CreateNewAcount1.setArcHeight(130);
        rectangle_CreateNewAcount1.setArcWidth(130);
        
        Label userName = new Label("اسم المستخدم ");
        Label userEmail = new Label("البريد الالكتروني ");
        Label usrePass = new Label("كلمةالمرور  ");
        Label msg1 = new Label();
        msg1.setTextFill(Color.RED);
        TextField TFuserName = new TextField();
        TextField TFuserEmail = new TextField();
        PasswordField TFusrePass = new PasswordField();

        Button create = new Button("إنشاء ");
        Button ExportToFile = new Button("Export To File");
        
        //ceneter

        GridPane form = new GridPane();
        form.add(TFuserName, 0, 0);
        form.add(userName, 1, 0);

        form.add(TFuserEmail, 0, 1);
        form.add(userEmail, 1, 1);

        form.add(TFusrePass, 0, 2);
        form.add(usrePass, 1, 2);
   

        form.setAlignment(Pos.CENTER);
        form.setHgap(10);
        form.setVgap(25);

        form.setPadding(new Insets(10, 0, 20, 0));

        Text login = new Text("لديك حساب مسبقا؟ ");
        login.setFill(Color.BLACK);

        Text GoToRegistrationPage1 = new Text("اضغط هنا");
        GoToRegistrationPage1.setFill(Color.BLUE);
        GoToRegistrationPage1.setUnderline(true);

        HBox gotologin = new HBox();
        gotologin.getChildren().addAll(GoToRegistrationPage1, login);
        gotologin.setAlignment(Pos.CENTER);

        VBox buttons = new VBox(15);
        buttons.getChildren().addAll(create, gotologin,ExportToFile);
        buttons.setAlignment(Pos.CENTER);


      
        VBox textn = new VBox();
        textn.getChildren().addAll(newaccT,msg1,form,buttons);
        textn.setAlignment(Pos.CENTER);
 


        StackPane ENTER_CreateNewAcount = new StackPane();
        ENTER_CreateNewAcount.getChildren().addAll(background_CreateNewAcount, rectangle_CreateNewAcount, textn);
        ENTER_CreateNewAcount.setPadding(new Insets(30, 0, 30, 0));
        ENTER_CreateNewAcount.setAlignment(Pos.CENTER);
        
        StackPane paneForAll_CreateNewAcount1 = new StackPane();
        paneForAll_CreateNewAcount1.getChildren().addAll(rectangle_CreateNewAcount1,mediaView );
        paneForAll_CreateNewAcount1.setAlignment(Pos.CENTER);
        
        HBox ALL = new HBox();
        ALL.getChildren().addAll(ENTER_CreateNewAcount,paneForAll_CreateNewAcount1);
        ALL.setAlignment(Pos.CENTER);
        
        StackPane paneForAll_CreateNewAcount111 = new StackPane();
        paneForAll_CreateNewAcount111.getChildren().addAll(background_CreateNewAcount,ALL );
        paneForAll_CreateNewAcount111.setAlignment(Pos.CENTER);
        
        CreateNewAcount = new Scene(paneForAll_CreateNewAcount111, 800, 600);
        
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //rahaf scene
        //the headline______________________________________________________________
      Text joinG = new Text(); //Creating a Text object
        joinG.setText("من فضلك إختر المجموعة التي تود الإنضمام إليها: "); //Setting the text to be added. 
        joinG.setFont(Font.font("Arabic Typesetting", FontWeight.BOLD, FontPosture.REGULAR, 44));//setting the font
        //shape in middle_________________________________
        Rectangle rectangle2 = new Rectangle(550, 500);
        rectangle2.setFill(Color.rgb(85, 117, 112, 0.7));
        rectangle2.setArcHeight(130);
        rectangle2.setArcWidth(130);

        //labeles 
        Label newGr = new Label(" لإنشاء مجموعة جديدة:");
        newGr.setTextFill(Color.WHITE);
        Label availableGr = new Label("للإنضمام الى مجموعة موجودة أدخل الID الخاص بها:");
        availableGr.setTextFill(Color.WHITE);
        Label wantedGr = new Label("قائمة بمجموعاتك الحالية:");
        wantedGr.setTextFill(Color.WHITE);

        Label msg2 = new Label();  //alert message 
        msg2.setTextFill(Color.DARKRED);
        msg2.setFont(new Font(10.0));
        msg2.setAlignment(Pos.CENTER);

        //bottuns
        Button newGPage = new Button("انقر هنا");
        Button AvailGPage = new Button("التالي");
        Button toViewGoal = new Button("إستعراض الأهداف");

        //textfield for enter group id
        TextField EnterGrID = new TextField();
        EnterGrID.setMaxWidth(200);
        EnterGrID.setPromptText("ID number");
        //new group-------------
        HBox NewLine = new HBox(10);
        NewLine.setAlignment(Pos.CENTER);
        NewLine.getChildren().addAll(newGPage, newGr);
        //already existing------------------------
        HBox nextAv = new HBox(10);
        nextAv.setAlignment(Pos.CENTER);
        nextAv.getChildren().addAll(AvailGPage, EnterGrID);
        //the goals
        HBox goalsLine = new HBox(10);
        goalsLine.setAlignment(Pos.CENTER);
        goalsLine.getChildren().addAll(toViewGoal);

        //arranging them all___________
        //top
        VBox textn2 = new VBox(20);
        textn2.getChildren().addAll(joinG);
        textn2.setAlignment(Pos.TOP_CENTER);
        textn2.setPadding(new Insets(120, 50, 30, 50));

        //center
        VBox forming = new VBox(15);
        textn2.getChildren().addAll(NewLine, availableGr, nextAv,goalsLine );
        textn2.setAlignment(Pos.CENTER);
        textn2.setPadding(new Insets(120, 120, 50, 120));
        textn2.setPrefSize(450, 540);
        //borderPane
        BorderPane pane2 = new BorderPane();

        pane2.setTop(textn2); //to show the joinG text in top
        pane2.setCenter(forming); //to show the forms in center

        StackPane paneForAll_GroupType = new StackPane();
        paneForAll_GroupType.getChildren().addAll(background_GroupType, rectangle2, pane2);
        paneForAll_GroupType.setPadding(new Insets(30, 0, 30, 50));
        paneForAll_GroupType.setAlignment(Pos.CENTER);

        GroupType = new Scene(paneForAll_GroupType, 800, 600);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //raghad scene
        //Page title text
        Text textCreat = new Text(); //Creating a Text object
        textCreat.setText("لإنشاء مجموعة جديدة "); //Setting the text to be added. 
        textCreat.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));//setting the font

        Text textEnter = new Text(); //Creating a Text object
        textEnter.setText("قم بتعبئة المعلومات التالية من فضلك  :"); //Setting the text to be added. 
        textEnter.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));//setting the font

        Text textID = new Text(); //Creating a Text object
        textID.setText("سيتم انشاء ID الخاص بك في حال الضغط على زر الانشاء"); //Setting the text to be added. 
        textID.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 11));
        textID.setUnderline(true);
        
        
     
        Label groupName = new Label("اسم المجموعة:");
        groupName.setTextFill(Color.BLACK);
        TextField EnterGroupN = new TextField();
        EnterGroupN.setMaxWidth(200);
        
       Label groupCh = new Label("عدد الفصول:");
        groupCh.setTextFill(Color.BLACK);
        TextField EnterGroupch = new TextField();
        EnterGroupch.setMaxWidth(50); 
                 
        
        HBox Pane = new HBox(5); 
        Pane.setAlignment(Pos.CENTER);
        Pane.setStyle("fx-border-color: balck");
        
        Button creatG = new Button("انشاء"); //creat a botton nade
        HBox button = new HBox(20);
        button.setAlignment(Pos.CENTER);
        button.getChildren().addAll(creatG);
        
        Button back = new Button("رجوع"); //creat a botton nade
        HBox buttonBack = new HBox(20);
        buttonBack.setAlignment(Pos.CENTER);
        buttonBack.getChildren().addAll(back);
        
        Pane.getChildren().addAll(button, buttonBack);

        VBox paneInput2 = new VBox(2);// Vbox for the book imge
        paneInput2.setStyle("-fx-effect: innershadow(gaussian, rgba(248,254,254,255), 50, 0, 0, 0);");
        paneInput2.setAlignment(Pos.BOTTOM_RIGHT);
        paneInput2.getChildren().addAll(book);

        VBox paneInput1 = new VBox(20);
        paneInput1.setAlignment(Pos.CENTER);
        paneInput1.getChildren().addAll(textCreat, textEnter,  groupName, EnterGroupN,groupCh,EnterGroupch,textID, Pane);

        Rectangle rectangle1 = new Rectangle(300, 340);
        rectangle1.setFill(Color.rgb(85, 117, 112, 0.7));
        rectangle1.setArcHeight(90);
        rectangle1.setArcWidth(90);

        StackPane stackPane1 = new StackPane();
        stackPane1.getChildren().addAll(rectangle1, paneInput1);
        stackPane1.setPadding(new Insets(0, 20, 0, 0));

        VBox pageFormat1 = new VBox(20);
        pageFormat1.setPadding(new Insets(30, 0, 30, 0));
        pageFormat1.getChildren().addAll(stackPane1, paneInput2);
        pageFormat1.setAlignment(Pos.CENTER);

        StackPane paneForAll_createGroupScene = new StackPane();
        paneForAll_createGroupScene.getChildren().addAll(background_createGroupScene, pageFormat1);
        paneForAll_createGroupScene.setPadding(new Insets(30, 0, 30, 50));
        paneForAll_createGroupScene.setAlignment(Pos.CENTER);

        createGroupScene = new Scene(paneForAll_createGroupScene, 800, 600);
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //shahad aldaajani scene
        //goals scene
Circle circle = new Circle();
        circle.setRadius(20);
        circle.setFill(Img);

        //Label for the group name and text field 
        Label groupNameLabel = new Label("اسم المجموعة:");
        groupNameLabel.setTextFill(Color.BLACK);
        Label GroupName = new Label();
       
        GroupName.textProperty().bind(EnterGroupN.textProperty());
        
        GroupName.setAlignment(Pos.CENTER_RIGHT);
        Button modifyGroupName = new Button("تعديل");
        HBox butnAndName = new HBox(2);

        //hbox pane for label & textfield
        HBox HboxForGroupName = new HBox(20);
        HboxForGroupName.setAlignment(Pos.CENTER);
        HboxForGroupName.getChildren().addAll(GroupName, groupNameLabel);
        HboxForGroupName.setPadding(new Insets(0, 70, 0, 0));

        //Label for the group members quantity and text field 
        Label groupChaptersLabel = new Label("عدد الفصول:");
        groupChaptersLabel.setTextFill(Color.BLACK);
        Label groupChapter = new Label();
       
        groupChapter.textProperty().bind(EnterGroupch.textProperty());;
        
        //hbox pane for label & textfield
        HBox HboxForgroupChapter = new HBox(20);
        HboxForgroupChapter.setAlignment(Pos.CENTER);
        HboxForgroupChapter.setPadding(new Insets(0, 70, 0, 0));
        HboxForgroupChapter.getChildren().addAll(groupChapter, groupChaptersLabel);
        
        VBox groupinfo = new VBox(20);
        groupinfo.getChildren().addAll(HboxForGroupName,HboxForgroupChapter);
        groupinfo.setAlignment(Pos.CENTER);
        
        //labels for information
        Label infoLabel1 = new Label("إضافة اهداف المجموعة", circle);
        infoLabel1.setContentDisplay(ContentDisplay.RIGHT);
        infoLabel1.setPadding(new Insets(0, 30, 0, 0));
        infoLabel1.setFont(Font.font("", FontWeight.BOLD, FontPosture.REGULAR, 15));
        Label infoLabel2 = new Label("لإضافة هدف ادخله بالأسفل: ");
        infoLabel2.setFont(Font.font("", FontWeight.BOLD, FontPosture.REGULAR, 13));
        infoLabel2.setTextFill(Color.rgb(245, 229, 220));
        infoLabel2.setAlignment(Pos.CENTER);
        infoLabel2.setPadding(new Insets(0, 60, 0, 0));
        Label msgLabel = new Label();
        msgLabel.setFont(Font.font("", FontWeight.LIGHT, FontPosture.REGULAR, 10));
        msgLabel.setTextFill(Color.rgb(141, 69, 48));
        msgLabel.setAlignment(Pos.CENTER);
        msgLabel.setPadding(new Insets(0, 0, 0, 0));

        VBox paneForText = new VBox(5);
        paneForText.getChildren().addAll(infoLabel1, infoLabel2, msgLabel);
        paneForText.setPadding(new Insets(0, 250, 0, 0));
        paneForText.setAlignment(Pos.TOP_RIGHT);

        Label FirstgoalLabel = new Label("-الهدف الأول ");
        Label SecondgoalLabel = new Label("- الهدف الثاني");
        Label ThirdgoalLabel = new Label("-الهدف الثالث ");
        Label forthgoalLabel = new Label("- الهدف الرابع");
        Label fifthgoalLabel = new Label("-الهدف الخامس");

        Button AddGoal1 = new Button("إضافة");
        Button AddGoal2 = new Button("إضافة");
        Button AddGoal3 = new Button("إضافة");
        Button AddGoal4 = new Button("إضافة");
        Button AddGoal5 = new Button("إضافة");

        TextField txFirstgoal = new TextField();
        TextField txSecondgoal = new TextField();
        TextField txThirdgoal = new TextField();
        TextField txforthgoal = new TextField();
        TextField txfifthgoal = new TextField();

        Button updateGoal1 = new Button("تحديث");
        Button updateGoal2 = new Button("تحديث");
        Button updateGoal3 = new Button("تحديث");
        Button updateGoal4 = new Button("تحديث");
        Button updateGoal5 = new Button("تحديث");

        GridPane paneForGoals = new GridPane();
        paneForGoals.add(updateGoal1, 0, 0);
        paneForGoals.add(AddGoal1, 1, 0);
        paneForGoals.add(txFirstgoal, 2, 0);
        paneForGoals.add(FirstgoalLabel, 3, 0);

        paneForGoals.add(updateGoal2, 0, 1);
        paneForGoals.add(AddGoal2, 1, 1);
        paneForGoals.add(txSecondgoal, 2, 1);
        paneForGoals.add(SecondgoalLabel, 3, 1);

        paneForGoals.add(updateGoal3, 0, 2);
        paneForGoals.add(AddGoal3, 1, 2);
        paneForGoals.add(txThirdgoal, 2, 2);
        paneForGoals.add(ThirdgoalLabel, 3, 2);

        paneForGoals.add(updateGoal4, 0, 3);
        paneForGoals.add(AddGoal4, 1, 3);
        paneForGoals.add(txforthgoal, 2, 3);
        paneForGoals.add(forthgoalLabel, 3, 3);

        paneForGoals.add(updateGoal5, 0, 4);
        paneForGoals.add(AddGoal5, 1, 4);
        paneForGoals.add(txfifthgoal, 2, 4);
        paneForGoals.add(fifthgoalLabel, 3, 4);

        paneForGoals.setAlignment(Pos.CENTER);
        paneForGoals.setVgap(10);
        paneForGoals.setHgap(20);

        Goals goal1 = new Goals();
        Goals goal2 = new Goals();
        Goals goal3 = new Goals();
        Goals goal4 = new Goals();
        Goals goal5 = new Goals();

        //actions on add button to add goals
        AddGoal1.setOnAction(event -> {

            Session session = HibernateUtil.getSessionFactory().openSession();
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();

            Goals goal = null;
            goal = (Goals) session.get(Goals.class, 1);

            if (goal == null && !(txFirstgoal.getText().isEmpty())) {

                goal1.setGoalId(1);
                goal1.setGoal_description(txFirstgoal.getText());

                session.save(goal1);
                session.getTransaction().commit();
                session.close();
                msgLabel.setText("                                       تم إضافة الهدف");
                System.out.println("Goal " + goal1.getGoalId() + " inserted: " + goal1.getGoal_description());
            } else if (goal != null) {
                msgLabel.setText("        الهدف مدخل مسبقا, إذا اردت تحديثه إضغط على زر التحديث");
            } else {
                msgLabel.setText("                               من فضلك ادخل الهدف اولا");
            }

        });

        AddGoal2.setOnAction(event -> {

            if (txSecondgoal.getText() == "") {
                msgLabel.setText("من فضلك ادخل الهدف اولا");
            }

            Session session = HibernateUtil.getSessionFactory().openSession();
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();

            Goals goal = null;
            goal = (Goals) session.get(Goals.class, 2);

            if (goal == null && !(txSecondgoal.getText().isEmpty())) {

                goal2.setGoalId(2);
                goal2.setGoal_description(txSecondgoal.getText());

                session.save(goal2);
                session.getTransaction().commit();
                session.close();
                msgLabel.setText("                                       تم إضافة الهدف");
                System.out.println("Goal " + goal2.getGoalId() + " inserted: " + goal2.getGoal_description());
            } else if (goal != null) {
                msgLabel.setText("        الهدف مدخل مسبقا, إذا اردت تحديثه إضغط على زر التحديث");
            } else {
                msgLabel.setText("                               من فضلك ادخل الهدف اولا");
            }
        });

        AddGoal3.setOnAction(event -> {

            Session session = HibernateUtil.getSessionFactory().openSession();
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();

            Goals goal = null;
            goal = (Goals) session.get(Goals.class, 3);

            if (goal == null && !(txThirdgoal.getText().isEmpty())) {

                goal3.setGoalId(3);
                goal3.setGoal_description(txThirdgoal.getText());

                session.save(goal3);
                session.getTransaction().commit();
                session.close();
                msgLabel.setText("                                       تم إضافة الهدف");
                System.out.println("Goal " + goal3.getGoalId() + " inserted: " + goal3.getGoal_description());
            } else if (goal != null) {
                msgLabel.setText("        الهدف مدخل مسبقا, إذا اردت تحديثه إضغط على زر التحديث");
            } else {
                msgLabel.setText("                               من فضلك ادخل الهدف اولا");
            }
        });

        AddGoal4.setOnAction(event -> {

            Session session = HibernateUtil.getSessionFactory().openSession();
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();

            Goals goal = null;
            goal = (Goals) session.get(Goals.class, 4);

            if (goal == null && !(txforthgoal.getText().isEmpty())) {

                goal4.setGoalId(4);
                goal4.setGoal_description(txforthgoal.getText());

                session.save(goal4);
                session.getTransaction().commit();
                session.close();
                msgLabel.setText("                                       تم إضافة الهدف");
                System.out.println("Goal " + goal4.getGoalId() + " inserted: " + goal4.getGoal_description());
            } else if (goal != null) {
                msgLabel.setText("        الهدف مدخل مسبقا, إذا اردت تحديثه إضغط على زر التحديث");
            } else {
                msgLabel.setText("                               من فضلك ادخل الهدف اولا");
            }
        });

        AddGoal5.setOnAction(event -> {

            Session session = HibernateUtil.getSessionFactory().openSession();
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();

            Goals goal = null;
            goal = (Goals) session.get(Goals.class, 5);

            if (goal == null && !(txfifthgoal.getText().isEmpty())) {
                goal5.setGoalId(5);
                goal5.setGoal_description(txfifthgoal.getText());

                session.save(goal5);
                session.getTransaction().commit();
                session.close();
                msgLabel.setText("                                       تم إضافة الهدف");
                System.out.println("Goal " + goal5.getGoalId() + " inserted: " + goal5.getGoal_description());
            } else if (goal != null) {
                msgLabel.setText("        الهدف مدخل مسبقا, إذا اردت تحديثه إضغط على زر التحديث");
            } else {
                msgLabel.setText("                               من فضلك ادخل الهدف اولا");
            }
        });

        //actions on update buttons to update data
        updateGoal1.setOnAction(event -> {
            try {

                Session session = HibernateUtil.getSessionFactory().openSession();
                session = HibernateUtil.getSessionFactory().openSession();
                Transaction tx = session.beginTransaction();

                Goals goal = null;
                goal = (Goals) session.get(Goals.class, 1);
                if (!(txFirstgoal.getText().isEmpty()) && goal != null) {
                    goal.setGoal_description(txFirstgoal.getText());
                    session.update(goal);
                    session.getTransaction().commit();
                    session.close();
                    msgLabel.setText("                                       تم تحديث الهدف");
                    System.out.println("item updated: " + goal.getGoal_description());
                } else if (txFirstgoal.getText().isEmpty()) {
                    msgLabel.setText("                               من فضلك ادخل الهدف اولا");
                } else {

                    msgLabel.setText("لا يوجد هدف مدخل مسبقا, من فضلك ادخل الهدف واضغط على زر الإضافة");
                }

            } catch (Exception e) {
                System.out.println("Update Error");
            }
        });

        updateGoal2.setOnAction(event -> {
            try {

                Session session = HibernateUtil.getSessionFactory().openSession();
                session = HibernateUtil.getSessionFactory().openSession();
                Transaction tx = session.beginTransaction();

                Goals goal = null;
                goal = (Goals) session.get(Goals.class, 2);

                if (!(txSecondgoal.getText().isEmpty()) && goal != null) {
                    goal.setGoal_description(txSecondgoal.getText());
                    session.update(goal);
                    session.getTransaction().commit();
                    session.close();
                    msgLabel.setText("                                       تم تحديث الهدف");
                    System.out.println("item updated: " + goal.getGoal_description());
                } else if (txSecondgoal.getText().isEmpty()) {
                    msgLabel.setText("                               من فضلك ادخل الهدف اولا");
                } else {

                    msgLabel.setText("لا يوجد هدف مدخل مسبقا, من فضلك ادخل الهدف واضغط على زر الإضافة");
                }
            } catch (Exception e) {
                System.out.println("Update Error");
            }
        });

        updateGoal3.setOnAction(event -> {
            try {

                Session session = HibernateUtil.getSessionFactory().openSession();
                session = HibernateUtil.getSessionFactory().openSession();
                Transaction tx = session.beginTransaction();

                Goals goal = null;
                goal = (Goals) session.get(Goals.class, 3);

                if (!(txThirdgoal.getText().isEmpty()) && goal != null) {
                    goal.setGoal_description(txThirdgoal.getText());
                    session.update(goal);
                    session.getTransaction().commit();
                    session.close();
                    msgLabel.setText("                                       تم تحديث الهدف");
                    System.out.println("item updated: " + goal.getGoal_description());
                } else if (txThirdgoal.getText().isEmpty()) {
                    msgLabel.setText("                               من فضلك ادخل الهدف اولا");
                } else {
                    msgLabel.setText("لا يوجد هدف مدخل مسبقا, من فضلك ادخل الهدف واضغط على زر الإضافة");
                }
            } catch (Exception e) {
                System.out.println("Update Error");
            }
        });

        updateGoal4.setOnAction(event -> {
            try {

                Session session = HibernateUtil.getSessionFactory().openSession();
                session = HibernateUtil.getSessionFactory().openSession();
                Transaction tx = session.beginTransaction();

                Goals goal = null;
                goal = (Goals) session.get(Goals.class, 4);

                if (!(txforthgoal.getText().isEmpty()) && goal != null) {
                    goal.setGoal_description(txforthgoal.getText());
                    session.update(goal);
                    session.getTransaction().commit();
                    session.close();
                    msgLabel.setText("                                       تم تحديث الهدف");
                    System.out.println("item updated: " + goal.getGoal_description());
                } else if (txforthgoal.getText().isEmpty()) {
                    msgLabel.setText("                               من فضلك ادخل الهدف اولا");
                } else {
                    msgLabel.setText("لا يوجد هدف مدخل مسبقا, من فضلك ادخل الهدف واضغط على زر الإضافة");
                }
            } catch (Exception e) {
                System.out.println("Update Error");
            }
        });

        updateGoal5.setOnAction(event -> {
            try {

                Session session = HibernateUtil.getSessionFactory().openSession();
                session = HibernateUtil.getSessionFactory().openSession();
                Transaction tx = session.beginTransaction();

                Goals goal = null;
                goal = (Goals) session.get(Goals.class, 5);

                if (!(txfifthgoal.getText().isEmpty()) && goal != null) {
                    goal.setGoal_description(txfifthgoal.getText());
                    session.update(goal);
                    session.getTransaction().commit();
                    session.close();
                    msgLabel.setText("                                       تم تحديث الهدف");
                    System.out.println("item updated: " + goal.getGoal_description());
                } else if (txfifthgoal.getText().isEmpty()) {
                    msgLabel.setText("                               من فضلك ادخل الهدف اولا");
                } else {
                    msgLabel.setText("لا يوجد هدف مدخل مسبقا, من فضلك ادخل الهدف واضغط على زر الإضافة");
                }
            } catch (Exception e) {
                System.out.println("Update Error");
            }
        });

        //vbox for goal list
        VBox goalList = new VBox(20);
        goalList.getChildren().addAll(paneForText, paneForGoals);
        goalList.setAlignment(Pos.CENTER);
        //rectangle to set it as background
        Rectangle rectangle3 = new Rectangle();
        rectangle3.setWidth(500);
        rectangle3.setHeight(350);
        rectangle3.setFill(Color.rgb(85, 117, 112, 0.7));
        rectangle3.setArcHeight(90);
        rectangle3.setArcWidth(90);
        //stackpane to set the goal lis vbox on top of the rectangle
        StackPane stackPane2 = new StackPane();
        stackPane2.getChildren().addAll(rectangle3, goalList);
        stackPane2.setPadding(new Insets(0, 20, 0, 0));

        //to switch between pages
        ImageView Ileft2 = new ImageView("advancedproject/arrow.png");
        ImageView Iright2 = new ImageView("advancedproject/arrow-right.png");
        Ileft2.setFitHeight(10);
        Ileft2.setFitWidth(10);
        Iright2.setFitHeight(10);
        Iright2.setFitWidth(10);
        Button forward_to_viewGoals = new Button("", Ileft2);
        Button backward_to_CreateGroup = new Button("", Iright2);
        HBox switchPages2 = new HBox(5);
        switchPages2.getChildren().addAll(forward_to_viewGoals, backward_to_CreateGroup);
        switchPages2.setAlignment(Pos.BOTTOM_CENTER);

        //vbox pane for all panes
        VBox paneForAll_goals = new VBox(20);
        //paneForAll.setStyle("-fx-background-color:#d6ddd8");
        paneForAll_goals.setPadding(new Insets(30, 0, 30, 20));
        paneForAll_goals.getChildren().addAll(stackPane2);
        paneForAll_goals.setAlignment(Pos.TOP_CENTER);

        BorderPane signGoalsPage = new BorderPane();
        signGoalsPage.setCenter(paneForAll_goals);
        signGoalsPage.setBottom(switchPages2);
        signGoalsPage.setBackground(bGround);

        GoalsScene = new Scene(signGoalsPage, 800, 600);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Circle goal_circle2 = new Circle();
        goal_circle2.setRadius(20);
        goal_circle2.setFill(Img);

        Circle goal_circle3 = new Circle();
        goal_circle3.setRadius(20);
        goal_circle3.setFill(Img);

        Circle goal_circle4 = new Circle();
        goal_circle4.setRadius(20);
        goal_circle4.setFill(Img);

        Circle goal_circle5 = new Circle();
        goal_circle5.setRadius(20);
        goal_circle5.setFill(Img);

        Circle goal_circle6 = new Circle();
        goal_circle6.setRadius(20);
        goal_circle6.setFill(Img);

        Circle goal_circle7 = new Circle();
        goal_circle7.setRadius(20);
        goal_circle7.setFill(Img);

        Label lblGoalList = new Label("قائمة اهداف المجموعة اليومية:", goal_circle2);
        lblGoalList.setContentDisplay(ContentDisplay.RIGHT);
        lblGoalList.setPadding(new Insets(0, 0, 0, 50));
        lblGoalList.setFont(Font.font("", FontWeight.BOLD, FontPosture.REGULAR, 15));

        Label FirstgoalViewLabel = new Label("الهدف الأول    :", goal_circle3);
        FirstgoalViewLabel.setContentDisplay(ContentDisplay.RIGHT);
        Label SecondgoalViewLabel = new Label("الهدف الثاني   :", goal_circle4);
        SecondgoalViewLabel.setContentDisplay(ContentDisplay.RIGHT);
        Label ThirdgoalViewLabel = new Label("الهدف الثالث   :", goal_circle5);
        ThirdgoalViewLabel.setContentDisplay(ContentDisplay.RIGHT);
        Label forthgoalViewLabel = new Label("الهدف الرابع    :", goal_circle6);
        forthgoalViewLabel.setContentDisplay(ContentDisplay.RIGHT);
        Label fifthgoalViewLabel = new Label("الهدف الخامس:", goal_circle7);
        fifthgoalViewLabel.setContentDisplay(ContentDisplay.RIGHT);

        Label Goal1View = new Label();
        Label Goal2View = new Label();
        Label Goal3View = new Label();
        Label Goal4View = new Label();
        Label Goal5View = new Label();
        
         //retrive
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        List<Goals> GoalList = null;
        String queryStr = "from Goals";
        Query query = session1.createQuery(queryStr);
        GoalList = query.list();
        session1.close();

        for (int i = 0; i < GoalList.size(); i++) {
            if (i == 0) {
                Goal1View.setText(GoalList.get(i).getGoal_description());
            }
            if (i == 1) {
                Goal2View.setText(GoalList.get(i).getGoal_description());
            }
            if (i == 2) {
                Goal3View.setText(GoalList.get(i).getGoal_description());
            }
            if (i == 3) {
                Goal4View.setText(GoalList.get(i).getGoal_description());
            }
            if (i == 4) {
                Goal5View.setText(GoalList.get(i).getGoal_description());
            }
        }
        

        //pane for viewing the goals in the view scene
        GridPane paneToViewGoals = new GridPane();
        paneToViewGoals.add(Goal1View, 0, 0);
        paneToViewGoals.add(FirstgoalViewLabel, 1, 0);

        paneToViewGoals.add(Goal2View, 0, 1);
        paneToViewGoals.add(SecondgoalViewLabel, 1, 1);

        paneToViewGoals.add(Goal3View, 0, 2);
        paneToViewGoals.add(ThirdgoalViewLabel, 1, 2);

        paneToViewGoals.add(Goal4View, 0, 3);
        paneToViewGoals.add(forthgoalViewLabel, 1, 3);

        paneToViewGoals.add(Goal5View, 0, 4);
        paneToViewGoals.add(fifthgoalViewLabel, 1, 4);

        paneToViewGoals.setAlignment(Pos.CENTER);

        paneToViewGoals.setVgap(10);
        paneToViewGoals.setHgap(5);

        //final
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //vbox for viewing goals
        VBox goalView = new VBox(20);
        goalView.getChildren().addAll(lblGoalList, paneToViewGoals);
        goalView.setAlignment(Pos.CENTER);
        //rectangle to set it as background
        Rectangle rectangle4 = new Rectangle();
        rectangle4.setWidth(350);
        rectangle4.setHeight(350);
        rectangle4.setFill(Color.rgb(85, 117, 112, 0.7));
        rectangle4.setArcHeight(90);
        rectangle4.setArcWidth(90);
        //stackpane to set the goal lis vbox on top of the rectangle
        StackPane stackPane3 = new StackPane();
        stackPane3.getChildren().addAll(rectangle4, goalView);
        stackPane3.setPadding(new Insets(0, 20, 0, 0));

        //goal achieved check box
        Label lblAllgoalsAchieved = new Label("عند الإنتهاء من جميع اهداف القائمة ");
        Button goalsAchievedButton = new Button("إنقر هنا");
        VBox goalsPane = new VBox(10);
        goalsPane.getChildren().addAll(lblAllgoalsAchieved, goalsAchievedButton);
        goalsPane.setAlignment(Pos.CENTER);
        goalsPane.setPadding(new Insets(0, 0, 0, 0));

        Alert alert = new Alert(AlertType.INFORMATION);

        goalsAchievedButton.setOnAction(e -> {
            alert.setTitle("Goals Finished");
            alert.setContentText("لقد انتهيت من جميع الأهداف!");
            alert.setHeaderText(null);
            alert.show();
        });
        //to switch between pages
        ImageView Ileft3 = new ImageView("advancedproject/arrow.png");
        ImageView Iright3 = new ImageView("advancedproject/arrow-right.png");
        Ileft3.setFitHeight(10);
        Ileft3.setFitWidth(10);
        Iright3.setFitHeight(10);
        Iright3.setFitWidth(10);
        Button forward_to_FirstPage = new Button("", Ileft3);
        Button backward_to_signGoals = new Button("", Iright3);
        HBox switchPages3 = new HBox(5);
        switchPages3.getChildren().addAll(forward_to_FirstPage, backward_to_signGoals);
        switchPages3.setAlignment(Pos.BOTTOM_CENTER);

        //vbox pane for all panes
        VBox paneForAll_goalView = new VBox(20);
        //paneForAll.setStyle("-fx-background-color:#d6ddd8");
        paneForAll_goalView.setPadding(new Insets(30, 0, 30, 20));
        paneForAll_goalView.getChildren().addAll(groupinfo,stackPane3,goalsPane);
        paneForAll_goalView.setAlignment(Pos.TOP_CENTER);

        BorderPane goalViewPage = new BorderPane();
        goalViewPage.setCenter(paneForAll_goalView);
        goalViewPage.setBottom(switchPages3);
        goalViewPage.setBackground(bGround);

        GoalView = new Scene(goalViewPage, 800, 600);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //action
          ExportToFile.setOnAction(e ->{      
          sound1.play();
              DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
            try {
             
                PrintWriter writer = new PrintWriter("users info at date " + LocalDateTime.now().format(dateFormatter) + ".txt"); //creating and opening the txt file
                       Session s = HibernateUtil.getSessionFactory().openSession();
                Transaction t = s.beginTransaction();
                
                List <userPOJO> list = null;
                String query1 = "from userPOJO";
                Query q = s.createQuery(query1);
                list = q.list();
                for(userPOJO use : list){
                   writer.println(
                       "User Name : "+use.getUsename() + " | " 
                       +"User Email : "+ use.getUseremail() + " | " 
                       +"User Password : "+ use.getUserpass() ); }
                   writer.close();
                   t.commit();
                   s.close();
                   System.out.println("File Exported .");}

             catch (IOException b) {
                System.out.println("An error occurred.");
                b.printStackTrace();
            }});
        
        forward_to_viewGoals.setOnAction(e -> {
            primaryStage.setScene(GoalView);

        });

        backward_to_CreateGroup.setOnAction(e -> {
            primaryStage.setScene(createGroupScene);

        });

        backward_to_signGoals.setOnAction(e -> {
            primaryStage.setScene(GoalsScene);

        });
        
        newGPage.setOnAction(e -> {
            primaryStage.setScene(createGroupScene);});
        
        
        GoToRegistrationPage1.setOnMouseClicked(e -> {
            primaryStage.setScene(loginInScene);});
        
        
        
        create.setOnAction(e -> {
            sound111.play();
            String uName = TFuserName.getText();
            String uEmail = TFuserEmail.getText();
            String uPass = TFusrePass.getText();

            if (TFuserName.getText().isEmpty() == true  ) {
                msg1.setText("Please enter username !");
            }else if(TFuserEmail.getText().isEmpty() == true ){
               msg1.setText("Please enter email !");
            }else if(TFusrePass.getText().isEmpty() == true ){
               msg1.setText("Please enter password !");
            }else if (!TFuserEmail.getText().contains("@")){
                msg1.setText("The email must contain '@', please try again");}
            else if(TFusrePass.getText().length() < 8){
                msg1.setText("The passowrd must be 8 digits or more ,  please try again ");}
            else{
                Session s = HibernateUtil.getSessionFactory().openSession();
                Transaction t = s.beginTransaction();
                List <userPOJO> list = null;
                String query2 = "from userPOJO";
                Query q = s.createQuery(query2);
                list = q.list();
                for(userPOJO use : list){
                    if(use.getUsename().equals(TFuserName.getText())){
                        msg1.setText("username is used try a new one .");
                        return;}}
                
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            userPOJO i = new userPOJO (uName,uEmail,uPass);

            String itname = (String) session.save(i);

            session.getTransaction().commit();
            session.close();
            System.out.println("inserted  user: "+i.getUsename());
            primaryStage.setScene(loginInScene); }});

        
        GoToRegistrationPage.setOnMouseClicked(e -> {
            primaryStage.setScene(CreateNewAcount);
            mediaPlayer.play();});
        

        ButtomSignin.setOnAction(e -> {
            sound11111.play();
           if(Enteruser_nameLogIN.getText().isEmpty() == true  ) {
           msg.setText("Please enter username !");
           }else if(EnterPassword_Lgnin.getText().isEmpty() == true ){
          msg.setText("Please enter password !");
          }else{
            Session s = HibernateUtil.getSessionFactory().openSession();
            Transaction t = s.beginTransaction();
            List <userPOJO> list = null;
            String query3 = "from userPOJO";
            Query q = s.createQuery(query3);
            list = q.list();
            for(userPOJO u : list){
                if(u.getUsename().equals(Enteruser_nameLogIN.getText())){
                    if(u.getUserpass().equals(EnterPassword_Lgnin.getText())){  
                        primaryStage.setScene(GroupType);
                        return;}}
                else{
                    msg.setText("username or password incorrect");} }
            t.commit();
            s.close(); }});
       

        back.setOnAction(e -> {
            primaryStage.setScene(GroupType);});
        
        
    creatG.setOnAction(e -> {

            Session session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Group groupT=new Group();

            groupT.setname(EnterGroupN.getText());
            groupT.setChaptersNum(EnterGroupch.getText());
                
            session.save(groupT);
            session.getTransaction().commit();
            session.close();

            primaryStage.setScene(GoalsScene);
 
            });
    
    
        
    //----------------------
        AvailGPage.setOnAction(e -> {
            primaryStage.setScene(GoalsScene);
             }
        );
  //----------------------
    toViewGoal.setOnAction(e -> {             
                primaryStage.setScene(GoalView);

    }
    );
    
        primaryStage.setTitle("فوكس");
        primaryStage.setScene(loginInScene);
        primaryStage.show();}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }}