import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _p143_Temperaturas extends JFrame {
    private JLabel inputLabel, outputLabel;
    private JTextField inputField, outputField;
    private JRadioButton celsiusButton, fahrenheitButton;
    private ButtonGroup radioButtonGroup;
    private JButton convertButton;

    public _p143_Temperaturas() {
        setTitle("Temperature Converter");
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(4, 2));

        inputLabel = new JLabel("Input Temperature:");
        pane.add(inputLabel);

        inputField = new JTextField();
        pane.add(inputField);

        celsiusButton = new JRadioButton("Celsius to Fahrenheit");
        fahrenheitButton = new JRadioButton("Fahrenheit to Celsius");
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(celsiusButton);
        radioButtonGroup.add(fahrenheitButton);

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(1, 2));
        radioPanel.add(celsiusButton);
        radioPanel.add(fahrenheitButton);

        pane.add(radioPanel);

        outputLabel = new JLabel("Output Temperature:");
        pane.add(outputLabel);

        outputField = new JTextField();
        pane.add(outputField);

        convertButton = new JButton("Convert");
        convertButton.addActionListener(new ConvertButtonHandler());
        pane.add(convertButton);

        setSize(400, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class ConvertButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double inputTemperature = Double.parseDouble(inputField.getText());
            double outputTemperature;

            if (celsiusButton.isSelected()) {
                outputTemperature = inputTemperature * 1.8 + 32;
            } else {
                outputTemperature = (inputTemperature - 32) / 1.8;
            }

            outputField.setText(String.format("%.2f", outputTemperature));
        }
    }

    public static void main(String[] args) {
        new _p143_Temperaturas();
    }
}
