   
 import java.awt.*;
import java.awt.event.*;

class AWTexample extends Frame implements ActionListener {

    Label label;
    TextField textField;
    Button button;

    AWTexample() {
        // Set frame title, size, and layout
        setTitle("AWT Example");
        setSize(400, 200);
        setLayout(new FlowLayout());

        // Create components
        label = new Label("Enter your name: ");
        textField = new TextField(20);
        button = new Button("Submit");

        // Add components to frame
        add(label);
        add(textField);
        add(button);

        // Add event listener
        button.addActionListener(this);

        // Closing the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    // Event handling method
    public void actionPerformed(ActionEvent e) {
        String name = textField.getText();
        label.setText("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        new AWTexample();
    }
}
   

