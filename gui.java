// import javax.swing.*;
// import java.awt.*;
// public class gui{
//     public static void main(String[] args) {
//         JFrame f = new JFrame();
//         f.setSize(500,400);
//         f.setVisible(true);
//         JLabel l1 = new JLabel("Roll No:");
//         JLabel l2 = new JLabel("Name:");
//         JLabel l3 = new JLabel("Branch:");
//         JTextField t1 = new JTextField();
//         JTextField t2 = new JTextField();
//         JTextField t3 = new JTextField();
//         l1.setBounds(50, 30, 50, 20);
//         l2.setBounds(50, 60, 50, 20);
//         l3.setBounds(50, 90, 40, 20);
//         t1.setBounds(110,30,100,20);
//         t2.setBounds(110,60,100,20);
//         t3.setBounds(110,90,100,30);
//         f.add(t1);
//         f.add(t2);
//         f.add(t3);
//         f.add(l1);
//         f.add(l2);
//         f.add(l3);
//         f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
//     }
// }

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class gui extends JFrame {
    private JTextField rollNoField, nameField;
    private JComboBox<String> branchDropdown;

    public gui() {
        setTitle("Student Data Entry");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        JLabel rollNoLabel = new JLabel("Roll No:");
        rollNoField = new JTextField();

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        JLabel branchLabel = new JLabel("Branch:");
        String[] branches = {"CSE", "ICT", "ECE"};
        branchDropdown = new JComboBox<>(branches);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(e -> saveRecord());

        add(rollNoLabel);
        add(rollNoField);
        add(nameLabel);
        add(nameField);
        add(branchLabel);
        add(branchDropdown);
        add(saveButton);

        setVisible(true);
    }

    private void saveRecord() {
        String rollNo = rollNoField.getText();
        String name = nameField.getText();
        String branch = (String) branchDropdown.getSelectedItem();

        try {
            int rollNoInt = Integer.parseInt(rollNo);
            if (rollNoInt % 2 != 0) {
                String filename = branch + ".txt";
                String data = "Roll No: " + rollNo + "\nName: " + name + "\nBranch: " + branch + "\n";
                FileWriter fileWriter = new FileWriter(filename, true);
                PrintWriter printWriter = new PrintWriter(fileWriter);
                printWriter.println(data);
                printWriter.close();
                JOptionPane.showMessageDialog(null, "Record saved successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Please enter an odd Roll No");
            }
        } catch (NumberFormatException | IOException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new gui());
    }
}
