import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPrincipal extends JPanel {
    private static final long serialVersionUID = 1L;

    /**
     * Create the panel.
     */
    public PanelPrincipal() {
        setBackground(new Color(204, 255, 255));
        setLayout(null);

        JLabel lblTitulo = new JLabel("PRÁCTICA 5");
        lblTitulo.setBounds(0, 0, 1000, 69);
        lblTitulo.setFont(new Font("Dialog", Font.BOLD, 28));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setForeground(Color.BLACK);
        add(lblTitulo);

        //setBackground(Color.decode("#2B4F60"));
        setSize(1000, 670);

        JButton btnEj1 = new JButton("Depósito Banco");
        btnEj1.setBounds(47, 111, 200, 120);
        btnEj1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                PanelEj1 panel1 = new PanelEj1();
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PanelPrincipal.this);
                frame.getContentPane().remove(PanelPrincipal.this);
                frame.getContentPane().add(panel1);
                panel1.setVisible(true);
                frame.revalidate();
                frame.repaint();
            }
        });
        add(btnEj1);

        JButton btnEj2 = new JButton("Población Bolivia");
        btnEj2.setBounds(407, 111, 200, 120);
        btnEj2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PanelEj2 panel2 = new PanelEj2();
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PanelPrincipal.this);
                frame.getContentPane().remove(PanelPrincipal.this);
                frame.getContentPane().add(panel2);
                panel2.setVisible(true);
                frame.revalidate();
                frame.repaint();
            }
        });
        add(btnEj2);

        JButton btnEj3 = new JButton("Maximizar Z");
        btnEj3.setBounds(745, 111, 200, 120);
        btnEj3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PanelEj3 panel3 = new PanelEj3();
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PanelPrincipal.this);
                frame.getContentPane().remove(PanelPrincipal.this);
                frame.getContentPane().add(panel3);
                panel3.setVisible(true);
                frame.revalidate();
                frame.repaint();
            }
        });
        add(btnEj3);

        JButton btnEj4 = new JButton("Juego de Dados");
        btnEj4.setBounds(47, 292, 200, 120);
        btnEj4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PanelEj4 panel4 = new PanelEj4();
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PanelPrincipal.this);
                frame.getContentPane().remove(PanelPrincipal.this);
                frame.getContentPane().add(panel4);
                panel4.setVisible(true);
                frame.revalidate();
                frame.repaint();
            }
        });
        add(btnEj4);

        JButton btnEj5 = new JButton("Juego de Monedas");
        btnEj5.setBounds(407, 292, 200, 120);
        btnEj5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PanelEj5 panel5 = new PanelEj5();
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PanelPrincipal.this);
                frame.getContentPane().remove(PanelPrincipal.this);
                frame.getContentPane().add(panel5);
                panel5.setVisible(true);
                frame.revalidate();
                frame.repaint();
            }
        });
        add(btnEj5);

        JButton btnEj6 = new JButton("Lllegada de clientes");
        btnEj6.setBounds(745, 292, 200, 120);
        btnEj6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PanelEj6 panel6 = new PanelEj6();
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PanelPrincipal.this);
                frame.getContentPane().remove(PanelPrincipal.this);
                frame.getContentPane().add(panel6);
                panel6.setVisible(true);
                frame.revalidate();
                frame.repaint();
            }
        });
        add(btnEj6);

        JButton btnEj7 = new JButton("Gallina");
        btnEj7.setBounds(215, 491, 200, 120);
        btnEj7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PanelEj7 panel7 = new PanelEj7();
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PanelPrincipal.this);
                frame.getContentPane().remove(PanelPrincipal.this);
                frame.getContentPane().add(panel7);
                panel7.setVisible(true);
                frame.revalidate();
                frame.repaint();
            }
        });
        add(btnEj7);

        JButton btnEj8 = new JButton("Azúcar");
        btnEj8.setBounds(571, 491, 200, 120);
        /*
        btnEj8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PanelEj8 panel8 = new PanelEj8();
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PanelPrincipal.this);
                frame.getContentPane().remove(PanelPrincipal.this);
                frame.getContentPane().add(panel8);
                panel8.setVisible(true);
                frame.revalidate();
                frame.repaint();
            }
        });
        */

        add(btnEj8);

    }
}

