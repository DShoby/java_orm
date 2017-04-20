package com.epsi.gplan.view;

import com.epsi.gplan.model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IHM_Agenda implements ActionListener {

    private JFrame frame;
    private JButton users;
    private JButton courses;
    private JButton plans;
    private JButton myPlan;
    private JPanel mainPanel;
    private GridLayout maingrid;
    private GridLayout secondgrid;
    private JPanel secondPanel;
    private JLabel entryMessage;

/*    private JLabel label_id;
    private JLabel label_pwd;
    private TextField id;
    private TextField pwd;
    private GridLayout secondgrid;
    private JPanel secondPanel;*/


    public IHM_Agenda(User user) {

        // *****  Params de la fenêtre  **** //
        frame = new JFrame();
        System.out.println("Starting Agenda...");
        frame.setTitle("Agenda");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


        // **** Implémentations **** //
        entryMessage = new JLabel(" Bienvenue "+user.getNom()+" "+user.getPrenom()+" !");
        users = new JButton("Utilisateurs");
        users.addActionListener(this);
        courses = new JButton("Cours");
        courses.addActionListener(this);
        plans = new JButton("Plannings");
        plans.addActionListener(this);
        myPlan = new JButton("Mon planning");
        myPlan.addActionListener(this);
        maingrid = new GridLayout(3,0);
        mainPanel = new JPanel(maingrid);
        secondgrid = new GridLayout(1,3);
        secondPanel = new JPanel(secondgrid);
        if(user.getAdmin()){
            secondPanel.add(users);
            secondPanel.add(courses);
            secondPanel.add(plans);
        }else{
            secondPanel.add(new JLabel(""));
            secondPanel.add(myPlan);
            secondPanel.add(new JLabel(""));
        }
        mainPanel.add(entryMessage);
        mainPanel.add(secondPanel);



        // **** Contenu de la fenêtre **** //
        /*
        connect = new JButton("Connexion");
        connect.addActionListener(this);
        label_id = new JLabel(" Identifiant: ");
        label_pwd = new JLabel(" Mot de passe: ");
        id = new TextField();
        pwd = new TextField();

        secondPanel = new JPanel(secondgrid);


        secondPanel.add(label_id);
        secondPanel.add(id);
        secondPanel.add(label_pwd);
        secondPanel.add(pwd);
        mainPanel.add(new JLabel("")); // emplacement vide
        mainPanel.add(secondPanel);
        mainPanel.add(new JLabel(""));
        mainPanel.add(connect);
        frame.setContentPane(mainPanel);

*/



        // Affichage de la fenêtre
        frame.setContentPane(mainPanel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
