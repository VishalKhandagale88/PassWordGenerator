import javax.swing.*;
public class PassWordGenerator {
    private JTextField lengthField;

    public PassWordGenerator() {
        JFrame jFrame = new JFrame("Password Generator");
        JPanel jpanel = new JPanel();
        lengthField = new JTextField(10);
        JTextField passwordGenerated = new JTextField(10);
        JButton jButton = new JButton();

    }
}
