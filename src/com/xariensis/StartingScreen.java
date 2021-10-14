package com.xariensis;

import javax.swing.*;


import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class StartingScreen {

    JFrame      window;
    JPanel      titleNamePanel,
                mainTextPanel, playerHealthPanel, playerDamagePanel,
                swordImagePanel, heartImagePanel,
                nextScreenButtonPanel, startButtonPanel, choiceButtonPanel;
    JLabel      titleNameLabel,
                pictureSwordLabel, pictureHeartLabel;
    JButton     startButton, choiceButton1, choiceButton2, choiceButton3, choiceButton4, nextScreenButton;
    JTextArea   mainTextArea, damageTextArea, heartTextArea;
    ImageIcon   imageSword, imageHeart;

    Random random = new Random();

    GridLayout gridlayout1 = new GridLayout(1,1);



    TitleScreenHandler tsHandler = new TitleScreenHandler();
    RunGameScreenHandler gsHandler = new RunGameScreenHandler();

    Font titleFont = new Font("Papyrus", Font.PLAIN, 60);
    Font normalFont = new Font("Papyrus", Font.PLAIN, 25);

    int playerDamage = 2;
    int playerHealth = 10;
    int playerLevel = 1;
    int experience = 0;
    String textChoiceButton1, textChoiceButton2, textChoiceButton3, textChoiceButton4;




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

        titleNameLabel = new JLabel("TEST TITLE");
        titleNameLabel.setForeground(Color.WHITE);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);
        //--------------------------creates button---------------------------
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 300, 200, 50 );
        startButtonPanel.setLayout(gridlayout1);

        window.add(startButtonPanel);

        startButton = new JButton("PLAY");
        startButton.setBackground(Color.RED);
        startButton.setForeground(Color.BLACK);
        startButton.setFont(normalFont);
        startButton.addActionListener(tsHandler);


        startButtonPanel.add(startButton);

        window.setVisible(true);

    }
    //--------------------------creates game screen---------------------------
    public void createGameScreen() {
        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        if(nextScreenButtonPanel != null){
            nextScreenButtonPanel.setVisible(false);
        }

        //--------------------------creates maintext---------------------------
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(300, 50, 400, 200);
        mainTextPanel.setBackground(Color.BLACK);
        window.add(mainTextPanel);

        mainTextArea = new JTextArea("put in here some text about what you need to do. this text here is only a placeholder, so I can see how much space is used.");
        mainTextArea.setBounds(300, 50, 400, 200);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        //--------------------------creates toptext with icon---------------------------
        createPlayerStatsPanel();
        //--------------------------creates the 4 choice Buttons---------------------------
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(200,400,400,100);
        choiceButtonPanel.setBackground(Color.BLUE);
        window.add(choiceButtonPanel);
        GridLayout gridLayout = new GridLayout(2,2);
        choiceButtonPanel.setLayout(gridLayout);

        textChoiceButton1 = "WAIT";
        textChoiceButton2 = "RUN";
        textChoiceButton3 = "FIGHT";
        textChoiceButton4 = "OBSERVE";


        choiceButton1 = new JButton(textChoiceButton1);
        choiceButton1.setForeground(Color.WHITE);
        choiceButton1.setBackground(Color.BLACK);
        choiceButton1.setFont(normalFont);
        choiceButton1.addActionListener(gsHandler);

        choiceButton2 = new JButton(textChoiceButton2);
        choiceButton2.setForeground(Color.WHITE);
        choiceButton2.setBackground(Color.BLACK);
        choiceButton2.setFont(normalFont);
        choiceButton2.addActionListener(gsHandler);

        choiceButton3 = new JButton(textChoiceButton3);
        choiceButton3.setForeground(Color.WHITE);
        choiceButton3.setBackground(Color.BLACK);
        choiceButton3.setFont(normalFont);
        choiceButton3.addActionListener(gsHandler);

        choiceButton4 = new JButton(textChoiceButton4);
        choiceButton4.setForeground(Color.WHITE);
        choiceButton4.setBackground(Color.BLACK);
        choiceButton4.setFont(normalFont);
        choiceButton4.addActionListener(gsHandler);

        choiceButtonPanel.add(choiceButton1);
        choiceButtonPanel.add(choiceButton2);
        choiceButtonPanel.add(choiceButton3);
        choiceButtonPanel.add(choiceButton4);

        choiceButtonPanel.setVisible(true);



        window.setVisible(true);



    }

    public void createPlayerStatsPanel() {
        playerHealthPanel = new JPanel();
        playerHealthPanel.setBounds(100, 150, 50, 50);
        playerHealthPanel.setBackground(Color.BLACK);
        window.add(playerHealthPanel);

        playerDamagePanel = new JPanel();
        playerDamagePanel.setBounds(100, 50, 50, 50);
        playerDamagePanel.setBackground(Color.BLACK);
        window.add(playerDamagePanel);

        damageTextArea = new JTextArea(String.valueOf(playerDamage));
        damageTextArea.setBounds(0, 0, 100, 150);
        damageTextArea.setBackground(Color.BLACK);
        damageTextArea.setForeground(Color.WHITE);
        damageTextArea.setFont(normalFont);
        damageTextArea.setEditable(false);
        playerDamagePanel.add(damageTextArea);

        heartTextArea = new JTextArea(String.valueOf(playerHealth));
        heartTextArea.setBounds(0, 0, 100, 150);
        heartTextArea.setBackground(Color.BLACK);
        heartTextArea.setForeground(Color.WHITE);
        heartTextArea.setFont(normalFont);
        heartTextArea.setEditable(false);
        playerHealthPanel.add(heartTextArea);

        swordImagePanel = new JPanel();
        swordImagePanel.setBounds(50, 50, 50, 50);
        swordImagePanel.setBackground(Color.BLACK);
        window.add(swordImagePanel);

        heartImagePanel = new JPanel();
        heartImagePanel.setBounds(50, 150, 50, 50);
        heartImagePanel.setBackground(Color.BLACK);
        window.add(heartImagePanel);

        pictureSwordLabel = new JLabel();
        pictureSwordLabel.setBounds(0, 0, 0, 0);
        pictureHeartLabel = new JLabel();
        pictureHeartLabel.setBounds(0, 0, 0, 0);
        swordImagePanel.add(pictureSwordLabel);
        heartImagePanel.add(pictureHeartLabel);

        imageSword = new ImageIcon("src/res/sword32p.png");
        imageHeart = new ImageIcon("src/res/heart32p.png");
        pictureSwordLabel.setIcon(imageSword);
        pictureHeartLabel.setIcon(imageHeart);
    }

    public void actionGameScreen(){
        choiceButtonPanel.setVisible(false);
        playerHealthPanel.setVisible(false);
        playerDamagePanel.setVisible(false);

        createPlayerStatsPanel();
        nextScreenButtonPanel = new JPanel();
        nextScreenButtonPanel.setBounds(300, 400, 200, 100);
        nextScreenButtonPanel.setLayout(gridlayout1);
        window.add(nextScreenButtonPanel);
        nextScreenButton = new JButton("I see.");
        nextScreenButton.setBackground(Color.BLACK);
        nextScreenButton.setForeground(Color.WHITE);
        nextScreenButton.setFont(normalFont);
        nextScreenButton.addActionListener(gsHandler);
        nextScreenButtonPanel.add(nextScreenButton);








    }
    public void checkHealth(){
        if(playerHealth < 1){
            //TODO
        }
    }
    //--------------------------adds mouse functionality---------------------------
    public class TitleScreenHandler implements ActionListener {
        public void actionPerformed(ActionEvent event){
            createGameScreen();
        }
    }

    public class RunGameScreenHandler implements ActionListener {
        public void actionPerformed(ActionEvent event){

            int runFactor = random.nextInt(10)+1;

            System.out.println(runFactor+" RUNFACTOR"); //NACHVOLLZIEHBARKEIT

            if(runFactor < 5){
                mainTextArea.setText("Your ran away.");
            }else{
                int runDamage = random.nextInt(4)+1;
                mainTextArea.setText("You were unable to run away and got hit with "+runDamage+" Damage.");
                playerHealth = playerHealth-runDamage;
                System.out.println(runDamage+" RUNDAMAGE");
            }
            actionGameScreen();


        }
    }

    public class FightGameScreenHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            //TODO
        }
    }





}
