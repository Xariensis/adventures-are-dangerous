package com.xariensis;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartingScreen {

    JFrame      window;
    JPanel      titleNamePanel, startButtonPanel, choiceButtonPanel,
                mainTextPanel, topTextPanel,
                swordImagePanel, heartImagePanel;
    JLabel      titleNameLabel,
                pictureSwordLabel, pictureHeartLabel;
    JButton     startButton, choiceButton;
    JTextArea   mainTextArea, damageTextArea, heartTextArea;
    ImageIcon   imageSword, imageHeart;



    TitleScreenHandler tsHandler = new TitleScreenHandler();
    GameScreenHandler gsHandler = new GameScreenHandler();

    Font titleFont = new Font("Papyrus", Font.PLAIN, 60);
    Font normalFont = new Font("Papyrus", Font.PLAIN, 25);

    int playerDamage = 2;
    int playerHealth = 10;
    int playerLevel = 1;
    int experience = 0;




    public StartingScreen(){
        //--------------------------creates frame---------------------------
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800,600);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        window.setLocationRelativeTo(null);

        //--------------------------creates title---------------------------
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(25, 100, 750, 100);
        titleNamePanel.setBackground(Color.BLACK);
        window.add(titleNamePanel);

        titleNameLabel = new JLabel("Adventures are Dangerous");
        titleNameLabel.setForeground(Color.WHITE);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);
        //--------------------------creates button---------------------------
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 300, 200, 100 );
        startButtonPanel.setBackground(Color.BLACK);
        window.add(startButtonPanel);

        startButton = new JButton("PLAY");
        startButton.setBackground(Color.BLACK);
        startButton.setForeground(Color.WHITE);
        startButton.setFont(normalFont);
        startButton.addActionListener(tsHandler);

        startButtonPanel.add(startButton);

        window.setVisible(true);

    }
    //--------------------------creates game screen---------------------------
    public void createGameScreen() {
        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        //--------------------------creates maintext---------------------------
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(300, 50, 400, 200);
        mainTextPanel.setBackground(Color.BLACK);
        window.add(mainTextPanel);

        mainTextArea = new JTextArea("Hello there! Do you need help? You look miserable. What happened with you?");
        mainTextArea.setBounds(300, 50, 400, 200);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        //--------------------------creates toptext with icon---------------------------
        topTextPanel = new JPanel();
        topTextPanel.setBounds(100,20,100,300);
        topTextPanel.setBackground(Color.BLACK);
        window.add(topTextPanel);

        damageTextArea = new JTextArea(String.valueOf(playerDamage));
        damageTextArea.setBounds(0, 0, 100, 50);
        damageTextArea.setBackground(Color.BLACK);
        damageTextArea.setForeground(Color.WHITE);
        damageTextArea.setFont(titleFont);
        damageTextArea.setEditable(false);
        topTextPanel.add(damageTextArea);

        heartTextArea = new JTextArea(String.valueOf(playerHealth));
        heartTextArea.setBounds(0, 0, 100, 150);
        heartTextArea.setBackground(Color.BLACK);
        heartTextArea.setForeground(Color.WHITE);
        heartTextArea.setFont(titleFont);
        heartTextArea.setEditable(false);
        topTextPanel.add(heartTextArea);

        swordImagePanel = new JPanel();
        swordImagePanel.setBounds(50,50,50,50);
        swordImagePanel.setBackground(Color.BLACK);
        window.add(swordImagePanel);

        heartImagePanel = new JPanel();
        heartImagePanel.setBounds(50,150,50,50);
        heartImagePanel.setBackground(Color.BLACK);
        window.add(heartImagePanel);

        pictureSwordLabel = new JLabel();
        pictureSwordLabel.setBounds(0,0,0,0);
        pictureHeartLabel = new JLabel();
        pictureHeartLabel.setBounds(0,0,0,0);
        swordImagePanel.add(pictureSwordLabel);
        heartImagePanel.add(pictureHeartLabel);

        imageSword = new ImageIcon("src/res/sword32p.png");
        imageHeart = new ImageIcon("src/res/heart32p.png");
        pictureSwordLabel.setIcon(imageSword);
        pictureHeartLabel.setIcon(imageHeart);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(200,400,400,100);
        choiceButtonPanel.setBackground(Color.BLUE);
        window.add(choiceButtonPanel);

        choiceButton = new JButton("");
        choiceButton.setForeground(Color.WHITE);
        choiceButton.setBackground(Color.BLACK);
        choiceButton.setFont(normalFont);




        window.setVisible(true);



    }
    //--------------------------adds mouse functionality---------------------------
    public class TitleScreenHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            createGameScreen();
        }

    }

    public class GameScreenHandler implements ActionListener {
        public void actionPerformed(ActionEvent event){

        }
    }



}
