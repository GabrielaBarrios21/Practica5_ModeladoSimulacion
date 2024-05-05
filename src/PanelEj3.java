import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelEj3 extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField numSim;
    private JTextField tfNMI;
    private JTextField tfX1;
    private JTextField tfX2;
    private JTextField tfX3;
    private JTextField tfX1X2;
    private JTextField tfMenorX1;
    private JTextField tfMayorX1;
    private JTextField tfMenorX2;
    private JTextField tfMayorX2;
    private JTextField tfMenorX3;
    private JTextField tfMayorX3;
    private JTextField tfPromedioZ;
    private JTextField tfPromedioX1;
    private JTextField tfPromedioX2;
    private JTextField tfPromedioX3;
    private JTable table; // Agregar la variable para la tabla

    /**
     * Create the panel.
     */
    public PanelEj3() {
        setLayout(null);
        JLabel lblTitulo = new JLabel("Maximizar Z");
        lblTitulo.setBounds(0, 0, 1000, 31);
        lblTitulo.setFont(new Font("Dialog", Font.BOLD, 20));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setForeground(Color.BLACK);
        add(lblTitulo);

        //setBackground(Color.decode("#2B4F60"));
        setSize(990, 670);

        JButton btnAtras = new JButton("<<Atrás");
        btnAtras.setBounds(10, 25, 89, 23);
        btnAtras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PanelPrincipal panerlprincipal = new PanelPrincipal();
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PanelEj3.this);
                frame.getContentPane().remove(PanelEj3.this);
                frame.getContentPane().add(panerlprincipal);
                panerlprincipal.setVisible(true);
                frame.revalidate();
                frame.repaint();
            }
        });
        add(btnAtras);

        JLabel lblSimulaciones = new JLabel("Número de simulaciones:");
        lblSimulaciones.setBounds(24, 86, 134, 37);
        add(lblSimulaciones);

        numSim = new JTextField();
        numSim.setBounds(192, 89, 134, 31);
        add(numSim);
        numSim.setColumns(10);

        JScrollPane spResultadosSimulaciones = new JScrollPane();
        spResultadosSimulaciones.setBounds(455, 150, 515, 256);
        add(spResultadosSimulaciones);

        // Crear la tabla inicial con los encabezados
        String[] columnNames = {"Z", "X1", "X2", "X3"};
        Object[][] data = {}; // No hay datos inicialmente
        table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(515, 256));
        table.setFillsViewportHeight(true);

        // Establecer la tabla como la vista del JScrollPane
        spResultadosSimulaciones.setViewportView(table);

        JLabel lblParametros = new JLabel("Parametros de la Simulacion");
        lblParametros.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblParametros.setBounds(24, 143, 190, 14);
        add(lblParametros);

        JLabel lblNumMaxIt = new JLabel("Número máximo de iteraciones (NMI):");
        lblNumMaxIt.setBounds(24, 168, 190, 31);
        add(lblNumMaxIt);

        tfNMI = new JTextField();
        tfNMI.setColumns(10);
        tfNMI.setBounds(224, 168, 134, 31);
        add(tfNMI);

        JLabel lblFunc = new JLabel("Función a maximizar:");
        lblFunc.setBounds(24, 216, 114, 31);
        add(lblFunc);

        tfX1 = new JTextField();
        tfX1.setBounds(48, 261, 77, 20);
        add(tfX1);
        tfX1.setColumns(10);

        tfX2 = new JTextField();
        tfX2.setColumns(10);
        tfX2.setBounds(175, 261, 77, 20);
        add(tfX2);

        tfX3 = new JTextField();
        tfX3.setColumns(10);
        tfX3.setBounds(300, 261, 77, 20);
        add(tfX3);

        JLabel lblZ = new JLabel("Z =                              * X1 +                               * X2  +                              * X3");
        lblZ.setBounds(24, 264, 396, 14);
        add(lblZ);

        JLabel lblRestricciones = new JLabel("Restricciones:");
        lblRestricciones.setBounds(24, 292, 114, 31);
        add(lblRestricciones);

        tfX1X2 = new JTextField();
        tfX1X2.setColumns(10);
        tfX1X2.setBounds(232, 335, 77, 20);
        add(tfX1X2);

        tfMenorX1 = new JTextField();
        tfMenorX1.setColumns(10);
        tfMenorX1.setBounds(61, 378, 77, 20);
        add(tfMenorX1);

        tfMayorX1 = new JTextField();
        tfMayorX1.setColumns(10);
        tfMayorX1.setBounds(232, 378, 77, 20);
        add(tfMayorX1);

        tfMenorX2 = new JTextField();
        tfMenorX2.setColumns(10);
        tfMenorX2.setBounds(61, 419, 77, 20);
        add(tfMenorX2);

        tfMayorX2 = new JTextField();
        tfMayorX2.setColumns(10);
        tfMayorX2.setBounds(232, 419, 77, 20);
        add(tfMayorX2);

        tfMenorX3 = new JTextField();
        tfMenorX3.setColumns(10);
        tfMenorX3.setBounds(61, 465, 77, 20);
        add(tfMenorX3);

        tfMayorX3 = new JTextField();
        tfMayorX3.setColumns(10);
        tfMayorX3.setBounds(232, 465, 77, 20);
        add(tfMayorX3);

        JLabel lblX1X2 = new JLabel("X1 + X2 ≥");
        lblX1X2.setBounds(152, 338, 70, 14);
        add(lblX1X2);

        JLabel lblX1 = new JLabel("≤ X1 ≤");
        lblX1.setBounds(162, 381, 41, 14);
        add(lblX1);

        JLabel lblX2 = new JLabel("≤ X2 ≤");
        lblX2.setBounds(162, 422, 41, 14);
        add(lblX2);

        JLabel lblX3 = new JLabel("≤ X3 ≤");
        lblX3.setBounds(162, 468, 41, 14);
        add(lblX3);

        JButton btnSimular = new JButton("Simular");
        btnSimular.setBounds(455, 81, 120, 46);
        add(btnSimular);

        JButton btnLimpiar = new JButton("Limpiar Todo");
        btnLimpiar.setBounds(647, 81, 120, 46);
        add(btnLimpiar);

        JLabel lblPromedios = new JLabel("Promedios de los resultados de las simulaciones");
        lblPromedios.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblPromedios.setBounds(455, 439, 292, 14);
        add(lblPromedios);

        JLabel lblPromedioZ = new JLabel("Función Objetivo (Z):");
        lblPromedioZ.setBounds(455, 485, 146, 14);
        add(lblPromedioZ);

        JLabel lblPromedioX1 = new JLabel("Variable de decisión 1 (X1):");
        lblPromedioX1.setBounds(455, 523, 170, 14);
        add(lblPromedioX1);

        JLabel lblPromedioX2 = new JLabel("Variable de decisión 2 (X2):");
        lblPromedioX2.setBounds(455, 559, 170, 14);
        add(lblPromedioX2);

        JLabel lblPromedioX3 = new JLabel("Variable de decisión 3 (X3):");
        lblPromedioX3.setBounds(455, 599, 170, 14);
        add(lblPromedioX3);

        tfPromedioZ = new JTextField();
        tfPromedioZ.setBounds(635, 482, 132, 20);
        add(tfPromedioZ);
        tfPromedioZ.setColumns(10);

        tfPromedioX1 = new JTextField();
        tfPromedioX1.setColumns(10);
        tfPromedioX1.setBounds(635, 520, 132, 20);
        add(tfPromedioX1);

        tfPromedioX2 = new JTextField();
        tfPromedioX2.setColumns(10);
        tfPromedioX2.setBounds(635, 556, 132, 20);
        add(tfPromedioX2);

        tfPromedioX3 = new JTextField();
        tfPromedioX3.setColumns(10);
        tfPromedioX3.setBounds(635, 596, 132, 20);
        add(tfPromedioX3);

        // Eventos para botones
        btnSimular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí va el código para simular
                System.out.println("Simulando...");
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Limpiar campos de texto
                numSim.setText("");
                tfNMI.setText("");
                tfX1.setText("");
                tfX2.setText("");
                tfX3.setText("");
                tfX1X2.setText("");
                tfMenorX1.setText("");
                tfMayorX1.setText("");
                tfMenorX2.setText("");
                tfMayorX2.setText("");
                tfMenorX3.setText("");
                tfMayorX3.setText("");
                tfPromedioZ.setText("");
                tfPromedioX1.setText("");
                tfPromedioX2.setText("");
                tfPromedioX3.setText("");
            }
        });
    }
}
