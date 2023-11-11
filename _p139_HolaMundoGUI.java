import javax.swing.*;

public class _p139_HolaMundoGUI {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Hola Mundo");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel etiqueta = new JLabel("Hola Mundo");
        ventana.add(etiqueta);
        ventana.setVisible(true);
    }
}
