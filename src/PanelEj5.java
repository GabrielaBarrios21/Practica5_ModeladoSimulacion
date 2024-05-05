import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelEj5 extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField numSim;
    private JTextField tfNMI;
    private JTextField tfGUJ;
    private JTextField tfPUJ;

    private JTable table; // Agregar la variable para la tabla
    private JTextField tfGJT_promedio;
    /**
     * Create the panel.
     */
    public PanelEj5() {
        setLayout(null);
        JLabel lblTitulo = new JLabel("Juego monedas");
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
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PanelEj5.this);
                frame.getContentPane().remove(PanelEj5.this);
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

        JButton btnSimular = new JButton("Simular");
        btnSimular.setBounds(455, 81, 120, 46);
        add(btnSimular);

        JButton btnLimpiar = new JButton("Limpiar Todo");
        btnLimpiar.setBounds(647, 81, 120, 46);
        add(btnLimpiar);

        JScrollPane spResultadosSimulaciones = new JScrollPane();
        spResultadosSimulaciones.setBounds(455, 150, 515, 256);
        add(spResultadosSimulaciones);

        // Crear la tabla inicial con los encabezados
        String[] columnNames = {"NSIM", "GJT"};
        Object[][] data = {}; // No hay datos inicialmente
        table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(515, 256));
        table.setFillsViewportHeight(true);

        // Establecer la tabla como la vista del JScrollPane
        spResultadosSimulaciones.setViewportView(table);

        JLabel lblPromedios = new JLabel("Promedios de los resultados de las simulaciones");
        lblPromedios.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblPromedios.setBounds(455, 439, 292, 14);
        add(lblPromedios);

        JLabel lblParmetrosDeLa = new JLabel("Parámetros de la Simulación");
        lblParmetrosDeLa.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblParmetrosDeLa.setBounds(24, 144, 190, 14);
        add(lblParmetrosDeLa);

        JLabel lblNMT = new JLabel("Número máximo de tiros (NMI): ");
        lblNMT.setBounds(24, 169, 180, 14);
        add(lblNMT);

        tfNMI = new JTextField();
        tfNMI.setBounds(224, 166, 112, 20);
        add(tfNMI);
        tfNMI.setColumns(10);

        JLabel lblGUJ = new JLabel("Ganancia unitaria del jugador (GUJ): ");
        lblGUJ.setBounds(24, 220, 200, 14);
        add(lblGUJ);

        tfGUJ = new JTextField();
        tfGUJ.setColumns(10);
        tfGUJ.setBounds(224, 217, 112, 20);
        add(tfGUJ);

        JLabel lblPrdidaUnitariaDel = new JLabel("Pérdida unitaria del jugador (PUJ): ");
        lblPrdidaUnitariaDel.setBounds(24, 275, 200, 14);
        add(lblPrdidaUnitariaDel);

        tfPUJ = new JTextField();
        tfPUJ.setColumns(10);
        tfPUJ.setBounds(224, 272, 112, 20);
        add(tfPUJ);

        JLabel lblGJT = new JLabel("Ganancia del jugador total (GJT): ");
        lblGJT.setBounds(455, 476, 190, 14);
        add(lblGJT);

        tfGJT_promedio = new JTextField();
        tfGJT_promedio.setBounds(661, 473, 125, 20);
        add(tfGJT_promedio);
        tfGJT_promedio.setColumns(10);

        btnSimular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener los valores de los campos de texto
                int numSimulaciones = Integer.parseInt(numSim.getText());
                int numMaxTiros = Integer.parseInt(tfNMI.getText());
                double gananciaUnitariaJugador = Double.parseDouble(tfGUJ.getText());
                double perdidaUnitariaJugador = Double.parseDouble(tfPUJ.getText());

                // Aquí va la lógica para simular
                // Puedes implementarla de manera similar a como lo hiciste en el otro panel
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Limpiar campos de texto
                numSim.setText("");
                tfNMI.setText("");
                tfGUJ.setText("");
                tfPUJ.setText("");
                tfGJT_promedio.setText("");

                // Limpiar datos de la tabla (excepto los encabezados)
                String[] columnNames = {"NSIM", "GJT"};
                Object[][] data = {}; // No hay datos inicialmente
                table = new JTable(data, columnNames);
                table.setPreferredScrollableViewportSize(new Dimension(515, 256));
                table.setFillsViewportHeight(true);

                // Establecer la tabla como la vista del JScrollPane
                spResultadosSimulaciones.setViewportView(table);
            }
        });

    }
}
