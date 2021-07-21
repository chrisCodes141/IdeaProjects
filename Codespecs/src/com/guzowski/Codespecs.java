package com.guzowski;
import com.guzowski.linkedlist.MyLinkedList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

//CTRL + LEFT CLICK ANYTHING, and bottom left ull c strcuture READ
public class Codespecs extends JPanel { //we extend it so we can add this panel to frame

    private final JList<Project> JL;

    //
    // + - - - - - - - - - - +
    // |                     |
    // |       JFrame        |
    // |                     |
    // + - - - - -+- - - - - +
    //            ^
    //            |
    //            |
    //            |
    //            v
    // + - - - - - - - - - - +
    // |                     |
    // |      Codespecs      |
    // |                     |
    // | + - - - - - - - - + |
    // | |                 | |
    // | |     Project     | |
    // | |                 | |
    // | | + - - - - - - + | |
    // | | |             | | |
    // | | | yourproject | | |
    // | | |             | | |
    // | | + - - -+- - - + | |
    // | + - - - -+- - - - + |
    // + - - - - -+- - - - - +

    public Codespecs() {
        setLayout(new BorderLayout());
        JL = new JList<>();
        JL.setBorder(BorderFactory.createTitledBorder("Projects"));
        DefaultListModel<Project> listModel = new DefaultListModel<>();

        listModel.addElement(new Project("whut"));
        listModel.addElement(new Project("up"));

        JL.setModel(listModel);

        JL.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()) {
                    Project p = JL.getSelectedValue();
                    System.out.println(p);
                }
            }
        });
        add(JL, BorderLayout.WEST);// bcuz we r in constructor, its automatically doing it for it
    }

    public class Project {
        private String name;

        private Project(String name) {
            this.name = name;
        }

        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame("Codespecs"); //titling
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setDefualt... IS the X button, what's inside f is what will happen

        JMenuBar THEbar = new JMenuBar();//creates

        JMenu fileMenu = new JMenu("File");
        THEbar.add(fileMenu);
        JMenuItem theFirstItem = new JMenuItem("Give it a string");
        fileMenu.add(theFirstItem);

        jf.setJMenuBar(THEbar);//puts

        Codespecs cs = new Codespecs();
        jf.add(cs);
        jf.setSize(640, 480);
        jf.setLocationRelativeTo(null); //centers the sht
        jf.setVisible(true); // always do at end or else things after wont be rendered visible
    }
}
