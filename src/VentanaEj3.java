import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.Serial;

public class VentanaEj3 extends JFrame {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Create the frame.
     */
    public VentanaEj3() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setSize(1000, 700);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
        setTitle("Generación de Números Aleatorios");

        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);
        // Hacer que la ventana no sea resizable
        setResizable(false);

        setContentPane(contentPane);

        // Utilizar un BorderLayout y agregar el PanelPrincipal al centro
        getContentPane().setLayout(new BorderLayout());
        PanelEj3 panelPrincipal = new PanelEj3();
        getContentPane().add(panelPrincipal, BorderLayout.CENTER);
    }
}

