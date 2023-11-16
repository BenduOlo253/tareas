//Alumno: Jose Manuel Roberto Badillo.
//Descripcion: Crear un programa con interfaz grafica que calcule el salario de un trabajador tomando en cuenta la paga inicial, las horas trabjadas y la taza de impuestos.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class _p142_PagaTrabagadorGUI extends JFrame implements ActionListener {
    //Declaramos las variables a utilizar de manera global.
    private JLabel labelHorasTrabajadas, labelPagaPorHora, labelPagoNeto;
    private JTextField fieldHorasTrabajadas, fieldPagaPorHora, fieldPagoNeto;
    private JButton buttonCalcular;

    //Creamos la ventana con todos sus complmementos.
    public _p142_PagaTrabagadorGUI() {
        setTitle("Calculadora de Pago Neto");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 2));
        labelHorasTrabajadas = new JLabel("Horas trabajadas:");
        fieldHorasTrabajadas = new JTextField();
        labelPagaPorHora = new JLabel("Paga por hora:");
        fieldPagaPorHora = new JTextField();
        labelPagoNeto = new JLabel("Pago neto:");
        fieldPagoNeto = new JTextField();
        fieldPagoNeto.setEditable(false);
        buttonCalcular = new JButton("Calcular");
        buttonCalcular.addActionListener(this);

        panel.add(labelHorasTrabajadas);
        panel.add(fieldHorasTrabajadas);
        panel.add(labelPagaPorHora);
        panel.add(fieldPagaPorHora);
        panel.add(labelPagoNeto);
        panel.add(fieldPagoNeto);
        panel.add(buttonCalcular);

        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        double horasTrabajadas = Double.parseDouble(fieldHorasTrabajadas.getText());
        double pagaPorHora = Double.parseDouble(fieldPagaPorHora.getText());
        double pagoNeto = horasTrabajadas * pagaPorHora * 0.8; // 20% de impuestos
        fieldPagoNeto.setText(String.format("%.2f", pagoNeto));
    }

    public static void main(String[] args) {
        _p142_PagaTrabagadorGUI ventana = new _p142_PagaTrabagadorGUI();
        ventana.setVisible(true);
    }
}
