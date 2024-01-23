import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomPasswordGenerator extends JFrame {

    private JSlider lengthSlider;
    private JTextField passwordField;

    public RandomPasswordGenerator() {
        setTitle("Random Password Generator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(4, 1));

        lengthSlider = new JSlider(8, 16);
        lengthSlider.setMajorTickSpacing(2);
        lengthSlider.setPaintTicks(true);
        lengthSlider.setPaintLabels(true);

        passwordField = new JTextField();
        passwordField.setEditable(false);

        JButton generateButton = new JButton("Generate Password");
        generateButton.setForeground(Color.WHITE); // Text color
        generateButton.setBackground(new Color(0, 102, 204)); // Blue background color
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        JButton copyButton = new JButton("Copy to Clipboard");
        copyButton.setForeground(Color.WHITE); // Text color
        copyButton.setBackground(new Color(0, 127, 255)); // Blue background color
        copyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        add(lengthSlider);
        add(generateButton);
        add(passwordField);
        add(copyButton);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RandomPasswordGenerator().setVisible(true);
            }
        });
    }
}
