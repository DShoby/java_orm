package com.epsi.gplan.view;

import com.epsi.gplan.service.UserService;
import com.epsi.gplan.database.Connect;
import com.epsi.gplan.model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class IHM_Connexion implements ActionListener{

    private JFrame frame;
    private JButton connect;
    private JLabel label_id;
    private JLabel label_pwd;
    private TextField id;
    private TextField pwd;
    private GridLayout maingrid;
    private GridLayout secondgrid;
    private JPanel mainPanel;
    private JPanel secondPanel;

    public IHM_Connexion() {

        // *****  Params de la fenêtre de connexion **** //
        frame = new JFrame();
        System.out.println("Starting app...");
        frame.setTitle("Connexion");
        frame.setSize(600, 350);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


        // *** Implémentations ***** //
        connect = new JButton("Connexion");
        connect.addActionListener(this);
        label_id = new JLabel(" Identifiant: ");
        label_pwd = new JLabel(" Mot de passe: ");
        id = new TextField();
        pwd = new TextField();
        maingrid = new GridLayout(4,0);
        secondgrid = new GridLayout(2,2);
        mainPanel = new JPanel(maingrid);
        secondPanel = new JPanel(secondgrid);

        // **** Contenu de la fenêtre **** //
        secondPanel.add(label_id);
        secondPanel.add(id);
        secondPanel.add(label_pwd);
        secondPanel.add(pwd);
        mainPanel.add(new JLabel("")); // emplacement vide
        mainPanel.add(secondPanel);
        mainPanel.add(new JLabel(""));
        mainPanel.add(connect);
        frame.setContentPane(mainPanel);


        // *** Visibilité de la fenêtre *** //
        frame.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == connect){
            // si un ou plusieurs champs sont vides
            if(id.getText().compareTo("")  == 0 || pwd.getText().compareTo("")  == 0){
                System.out.println("erreur remplissage");
                JOptionPane.showMessageDialog(null,"Erreur, vous devez remplir tous les champs!");
            }
            // si les champs sont saisis
            else {
                System.out.println("Identifiants saisis");

                /**
                 *
                 * Ajouter le code de vérification des identifiants auprès de la BDD
                 *
                 *
                 **/

                // fermeture de la fenêtre de connexion et ouverture de l'agenda
                frame.dispose();
                // ** users lambda ** //
                User userProf = new User("prof","prof","nomProf","prenomProf","prof@mail.fr",false);
                User userAdmin = new User("admin","admin","nomAdmin","prenomAdmin","admin@mail.fr",true);
                IHM_Agenda agenda = new IHM_Agenda(userAdmin);

            }
        }
    }
}
