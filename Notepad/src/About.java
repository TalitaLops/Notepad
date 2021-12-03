package Notepad.src;

import javax.swing.*;

public class About extends JFrame{
    About(){
        setBounds(100, 100, 500, 400);
        setTitle("About Notepad Application");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ImageIcon icon = new ImageIcon(getClass().getResource("icons-notes.png"));
        setIconImage(icon.getImage());

        setLayout(null);

        JLabel iconLabel = new JLabel(new ImageIcon(getClass().getResource("icons-notes.png")));
        iconLabel.setBounds(100,80,80,80);
        add(iconLabel);
        
        JLabel textLabel = new JLabel("Bem vindo ao Bloco de Notas.");
        textLabel.setBounds(100,20,200,300);
        add(textLabel);
        

    }

    
     public static void main(String[] args) {
        new About().setVisible(true);   
    }

}
