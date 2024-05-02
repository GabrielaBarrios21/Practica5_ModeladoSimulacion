import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelEj1 extends JPanel {

    private static final long serialVersionUID = 1L;

    /**
     * Create the panel.
     */
    public PanelEj1() {
        setLayout(null);
        JLabel lblTitulo = new JLabel("Depósito en un banco");
        lblTitulo.setBounds(0, 0, 1000, 31);
        lblTitulo.setFont(new Font("Dialog", Font.BOLD, 20));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setForeground(Color.BLACK);
        add(lblTitulo);

        //setBackground(Color.decode("#2B4F60"));
        setSize(1000, 670);

        JButton btnAtras = new JButton("<<Atrás");
        btnAtras.setBounds(10, 25, 89, 23);
        btnAtras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PanelPrincipal panerlprincipal = new PanelPrincipal();
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PanelEj1.this);
                frame.getContentPane().remove(PanelEj1.this);
                frame.getContentPane().add(panerlprincipal);
                panerlprincipal.setVisible(true);
                frame.revalidate();
                frame.repaint();
            }
        });
        add(btnAtras);

    }
}
