import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelEj6 extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField numSim;
    private JTextField tfNMH;
    private JTextField tfCF;
    private JTextField tfCUA;
    private JTextField tfPVU;
    private JTextField tfMinCli;
    private JTextField tfMaxCli;
    private JTextField tf0;
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tfTAV_promedio;
    private JTextField tfGN_promedio;
    private JTable table; // Agregar la variable para la tabla

    /**
     * Create the panel.
     */
    public PanelEj6() {
        setLayout(null);
        JLabel lblTitulo = new JLabel("Llegada de clientes");
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
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PanelEj6.this);
                frame.getContentPane().remove(PanelEj6.this);
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
        String[] columnNames = {"NSIM", "TAV", "GN"};
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

        JLabel lblParametros = new JLabel("Parámetros de la Simulación");
        lblParametros.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblParametros.setBounds(24, 149, 190, 14);
        add(lblParametros);

        JLabel lblNMH = new JLabel("Número máximo de horas (NMH): ");
        lblNMH.setBounds(24, 185, 200, 14);
        add(lblNMH);

        tfNMH = new JTextField();
        tfNMH.setBounds(234, 182, 83, 20);
        add(tfNMH);
        tfNMH.setColumns(10);

        JLabel lblCF = new JLabel("Costo fijo diario (CF): ");
        lblCF.setBounds(24, 225, 200, 14);
        add(lblCF);

        tfCF = new JTextField();
        tfCF.setColumns(10);
        tfCF.setBounds(234, 222, 83, 20);
        add(tfCF);

        JLabel lblCUA = new JLabel("Costo unitario por artículo (CUA):");
        lblCUA.setBounds(24, 265, 200, 14);
        add(lblCUA);

        tfCUA = new JTextField();
        tfCUA.setColumns(10);
        tfCUA.setBounds(234, 262, 83, 20);
        add(tfCUA);

        JLabel lblPVU = new JLabel("Precio de venta unitario (PVU): ");
        lblPVU.setBounds(24, 309, 200, 14);
        add(lblPVU);

        tfPVU = new JTextField();
        tfPVU.setColumns(10);
        tfPVU.setBounds(234, 306, 83, 20);
        add(tfPVU);

        JLabel lblLlegadaCli = new JLabel("Llegada de clientes por hora (Dist. Uniforme)");
        lblLlegadaCli.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblLlegadaCli.setBounds(24, 356, 302, 14);
        add(lblLlegadaCli);

        JLabel lblMinU = new JLabel("Mínimo:");
        lblMinU.setBounds(24, 392, 58, 14);
        add(lblMinU);

        tfMinCli = new JTextField();
        tfMinCli.setBounds(92, 389, 73, 20);
        add(tfMinCli);
        tfMinCli.setColumns(10);

        JLabel lblMaxU = new JLabel("Máximo:");
        lblMaxU.setBounds(200, 392, 58, 14);
        add(lblMaxU);

        tfMaxCli = new JTextField();
        tfMaxCli.setColumns(10);
        tfMaxCli.setBounds(268, 389, 73, 20);
        add(tfMaxCli);

        JLabel lblCompraPorCliente = new JLabel("Artículos comprados por cliente");
        lblCompraPorCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblCompraPorCliente.setBounds(24, 439, 302, 14);
        add(lblCompraPorCliente);

        JLabel lblArticulos = new JLabel("Artículos");
        lblArticulos.setBounds(24, 476, 75, 14);
        add(lblArticulos);

        JLabel lblProb = new JLabel("Probabilidad");
        lblProb.setBounds(24, 495, 75, 14);
        add(lblProb);

        JLabel lbl0 = new JLabel("0");
        lbl0.setHorizontalAlignment(SwingConstants.CENTER);
        lbl0.setBounds(109, 476, 46, 14);
        add(lbl0);

        tf0 = new JTextField();
        tf0.setBounds(109, 492, 49, 20);
        add(tf0);
        tf0.setColumns(10);

        JLabel lbl1 = new JLabel("1");
        lbl1.setHorizontalAlignment(SwingConstants.CENTER);
        lbl1.setBounds(165, 476, 46, 14);
        add(lbl1);

        tf1 = new JTextField();
        tf1.setColumns(10);
        tf1.setBounds(165, 492, 49, 20);
        add(tf1);

        JLabel lbl2 = new JLabel("2");
        lbl2.setHorizontalAlignment(SwingConstants.CENTER);
        lbl2.setBounds(221, 476, 46, 14);
        add(lbl2);

        tf2 = new JTextField();
        tf2.setColumns(10);
        tf2.setBounds(221, 492, 49, 20);
        add(tf2);

        JLabel lbl3 = new JLabel("3");
        lbl3.setHorizontalAlignment(SwingConstants.CENTER);
        lbl3.setBounds(277, 476, 46, 14);
        add(lbl3);

        tf3 = new JTextField();
        tf3.setColumns(10);
        tf3.setBounds(277, 492, 49, 20);
        add(tf3);

        JLabel lblTAV_promedio = new JLabel("Total artículos vendidos por día (TAV): ");
        lblTAV_promedio.setBounds(455, 464, 200, 14);
        add(lblTAV_promedio);

        JLabel lblGN = new JLabel("Ganacia Neta (GN):");
        lblGN.setBounds(455, 495, 145, 14);
        add(lblGN);

        tfTAV_promedio = new JTextField();
        tfTAV_promedio.setBounds(667, 461, 120, 20);
        add(tfTAV_promedio);
        tfTAV_promedio.setColumns(10);

        tfGN_promedio = new JTextField();
        tfGN_promedio.setColumns(10);
        tfGN_promedio.setBounds(667, 492, 120, 20);
        add(tfGN_promedio);

        JLabel lblNewLabel = new JLabel("horas");
        lblNewLabel.setBounds(333, 185, 46, 14);
        add(lblNewLabel);

        JLabel lblBs = new JLabel("Bs./ día");
        lblBs.setBounds(333, 225, 46, 14);
        add(lblBs);

        JLabel lblBsArtculo = new JLabel("Bs./ artículo");
        lblBsArtculo.setBounds(333, 265, 83, 14);
        add(lblBsArtculo);

        JLabel lblBsArtculo_1 = new JLabel("Bs./ artículo");
        lblBsArtculo_1.setBounds(333, 309, 83, 14);
        add(lblBsArtculo_1);

        JLabel lblArtculos = new JLabel("artículos");
        lblArtculos.setBounds(797, 464, 73, 14);
        add(lblArtculos);

        JLabel lblBs_2_1 = new JLabel("Bs.");
        lblBs_2_1.setBounds(797, 495, 73, 14);
        add(lblBs_2_1);

        btnSimular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí va la lógica para simular
                // Puedes implementarla de manera similar a como lo hiciste en el otro panel
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Limpiar campos de texto
                numSim.setText("");
                tfNMH.setText("");
                tfCF.setText("");
                tfCUA.setText("");
                tfPVU.setText("");
                tfMinCli.setText("");
                tfMaxCli.setText("");
                tf0.setText("");
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                tfTAV_promedio.setText("");
                tfGN_promedio.setText("");

                // Limpiar datos de la tabla (excepto los encabezados)
                String[] columnNames = {"NSIM", "TAV", "GN"};
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



