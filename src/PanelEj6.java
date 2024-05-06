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
        setBackground(new Color(204, 255, 255));
        setLayout(null);
        JLabel lblTitulo = new JLabel("Llegada de clientes");
        lblTitulo.setBounds(0, 0, 1000, 46);
        lblTitulo.setFont(new Font("Dialog", Font.BOLD, 20));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setForeground(Color.BLACK);
        add(lblTitulo);

        //setBackground(Color.decode("#2B4F60"));
        setSize(1000, 670);

        JButton btnAtras = new JButton("<<Atrás");
        btnAtras.setBounds(10, 25, 89, 40);
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
        lblSimulaciones.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblSimulaciones.setBounds(24, 86, 196, 30);
        add(lblSimulaciones);

        numSim = new JTextField();
        numSim.setBounds(221, 88, 134, 31);
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
        lblPromedios.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblPromedios.setBounds(455, 417, 461, 30);
        add(lblPromedios);

        JLabel lblParametros = new JLabel("Parámetros de la Simulación");
        lblParametros.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblParametros.setBounds(24, 149, 243, 30);
        add(lblParametros);

        JLabel lblNMH = new JLabel("Número máximo de horas (NMH): ");
        lblNMH.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNMH.setBounds(24, 193, 302, 20);
        add(lblNMH);

        tfNMH = new JTextField();
        tfNMH.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfNMH.setBounds(24, 218, 302, 30);
        add(tfNMH);
        tfNMH.setColumns(10);

        JLabel lblCF = new JLabel("Costo fijo diario (CF): ");
        lblCF.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCF.setBounds(24, 252, 200, 14);
        add(lblCF);

        tfCF = new JTextField();
        tfCF.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfCF.setColumns(10);
        tfCF.setBounds(24, 277, 302, 30);
        add(tfCF);

        JLabel lblCUA = new JLabel("Costo unitario por artículo (CUA):");
        lblCUA.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCUA.setBounds(24, 314, 302, 14);
        add(lblCUA);

        tfCUA = new JTextField();
        tfCUA.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfCUA.setColumns(10);
        tfCUA.setBounds(24, 339, 302, 30);
        add(tfCUA);

        JLabel lblPVU = new JLabel("Precio de venta unitario (PVU): ");
        lblPVU.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPVU.setBounds(24, 374, 218, 14);
        add(lblPVU);

        tfPVU = new JTextField();
        tfPVU.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfPVU.setColumns(10);
        tfPVU.setBounds(24, 399, 302, 30);
        add(tfPVU);

        JLabel lblLlegadaCli = new JLabel("Llegada de clientes por hora (Dist. Uniforme)");
        lblLlegadaCli.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblLlegadaCli.setBounds(24, 451, 368, 20);
        add(lblLlegadaCli);

        JLabel lblMinU = new JLabel("Mínimo:");
        lblMinU.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblMinU.setBounds(24, 483, 58, 14);
        add(lblMinU);

        tfMinCli = new JTextField();
        tfMinCli.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfMinCli.setBounds(92, 480, 73, 30);
        add(tfMinCli);
        tfMinCli.setColumns(10);

        JLabel lblMaxU = new JLabel("Máximo:");
        lblMaxU.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblMaxU.setBounds(200, 483, 58, 14);
        add(lblMaxU);

        tfMaxCli = new JTextField();
        tfMaxCli.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfMaxCli.setColumns(10);
        tfMaxCli.setBounds(268, 480, 73, 30);
        add(tfMaxCli);

        JLabel lblCompraPorCliente = new JLabel("Artículos comprados por cliente");
        lblCompraPorCliente.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblCompraPorCliente.setBounds(24, 532, 302, 20);
        add(lblCompraPorCliente);

        JLabel lblArticulos = new JLabel("Artículos");
        lblArticulos.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblArticulos.setBounds(24, 559, 75, 14);
        add(lblArticulos);

        JLabel lblProb = new JLabel("Probabilidad");
        lblProb.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblProb.setBounds(24, 582, 89, 14);
        add(lblProb);

        JLabel lbl0 = new JLabel("0");
        lbl0.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbl0.setHorizontalAlignment(SwingConstants.CENTER);
        lbl0.setBounds(109, 559, 46, 14);
        add(lbl0);

        tf0 = new JTextField();
        tf0.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tf0.setBounds(109, 575, 49, 30);
        add(tf0);
        tf0.setColumns(10);

        JLabel lbl1 = new JLabel("1");
        lbl1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbl1.setHorizontalAlignment(SwingConstants.CENTER);
        lbl1.setBounds(165, 559, 46, 14);
        add(lbl1);

        tf1 = new JTextField();
        tf1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tf1.setColumns(10);
        tf1.setBounds(165, 575, 49, 30);
        add(tf1);

        JLabel lbl2 = new JLabel("2");
        lbl2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbl2.setHorizontalAlignment(SwingConstants.CENTER);
        lbl2.setBounds(221, 559, 46, 14);
        add(lbl2);

        tf2 = new JTextField();
        tf2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tf2.setColumns(10);
        tf2.setBounds(221, 575, 49, 30);
        add(tf2);

        JLabel lbl3 = new JLabel("3");
        lbl3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbl3.setHorizontalAlignment(SwingConstants.CENTER);
        lbl3.setBounds(277, 559, 46, 14);
        add(lbl3);

        tf3 = new JTextField();
        tf3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tf3.setColumns(10);
        tf3.setBounds(277, 575, 49, 30);
        add(tf3);

        JLabel lblTAV_promedio = new JLabel("Total artículos vendidos por día (TAV): ");
        lblTAV_promedio.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblTAV_promedio.setBounds(455, 464, 253, 30);
        add(lblTAV_promedio);

        JLabel lblGN = new JLabel("Ganacia Neta (GN):");
        lblGN.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblGN.setBounds(455, 518, 145, 30);
        add(lblGN);

        tfTAV_promedio = new JTextField();
        tfTAV_promedio.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfTAV_promedio.setBounds(718, 467, 145, 30);
        add(tfTAV_promedio);
        tfTAV_promedio.setColumns(10);

        tfGN_promedio = new JTextField();
        tfGN_promedio.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfGN_promedio.setColumns(10);
        tfGN_promedio.setBounds(628, 519, 183, 30);
        add(tfGN_promedio);

        JLabel lblNewLabel = new JLabel("horas");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(334, 225, 46, 14);
        add(lblNewLabel);

        JLabel lblBs = new JLabel("Bs./ día");
        lblBs.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBs.setBounds(333, 284, 59, 14);
        add(lblBs);

        JLabel lblBsArtculo = new JLabel("Bs./ artículo");
        lblBsArtculo.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBsArtculo.setBounds(336, 346, 83, 14);
        add(lblBsArtculo);

        JLabel lblBsArtculo_1 = new JLabel("Bs./ artículo");
        lblBsArtculo_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBsArtculo_1.setBounds(336, 406, 83, 14);
        add(lblBsArtculo_1);

        JLabel lblArtculos = new JLabel("artículos");
        lblArtculos.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblArtculos.setBounds(885, 474, 73, 14);
        add(lblArtculos);

        JLabel lblBs_2_1 = new JLabel("Bs.");
        lblBs_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBs_2_1.setBounds(843, 526, 73, 14);
        add(lblBs_2_1);

        btnSimular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String numeroSimulaciones = numSim.getText();
                String numeroHoras = tfNMH.getText();
                String costoFijo = tfCF.getText();
                String costoArticulo = tfCUA.getText();
                String precioVenta = tfPVU.getText();
                String minimoCliente = tfMinCli.getText();
                String maximoCliente = tfMaxCli.getText();
                String probCli0 = tf0.getText();
                String probCli1 = tf1.getText();
                String probCli2 = tf2.getText();
                String probCli3 = tf3.getText();

                // Reemplazar comas por puntos para manejar números decimales correctamente
                numeroSimulaciones = numeroSimulaciones.replace(',', '.');
                numeroHoras = numeroHoras.replace(',', '.');
                costoFijo = costoFijo.replace(',', '.');
                costoArticulo = costoArticulo.replace(',', '.');
                precioVenta = precioVenta.replace(',', '.');
                minimoCliente = minimoCliente.replace(',', '.');
                maximoCliente = maximoCliente.replace(',', '.');
                probCli0 = probCli0.replace(',', '.');
                probCli1 = probCli1.replace(',', '.');
                probCli2 = probCli2.replace(',', '.');
                probCli3 = probCli3.replace(',', '.');

                // Realizar las validaciones
                if (numeroSimulaciones.isEmpty() || numeroHoras.isEmpty() || costoFijo.isEmpty() || costoArticulo.isEmpty() || precioVenta.isEmpty() || minimoCliente.isEmpty() || maximoCliente.isEmpty() ||
                        probCli0.isEmpty() || probCli1.isEmpty() || probCli2.isEmpty() || probCli3.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!numeroSimulaciones.matches("[-0-9.,]+") || !numeroHoras.matches("[-0-9.,]+") || !costoFijo.matches("[-0-9.,]+") || !costoArticulo.matches("[-0-9.,]+") || !precioVenta.matches("[-0-9.,]+") ||
                        !minimoCliente.matches("[-0-9.,]+") || !maximoCliente.matches("[-0-9.,]+") || !probCli0.matches("[-0-9.,]+") || !probCli1.matches("[-0-9.,]+") || !probCli2.matches("[-0-9.,]+") || !probCli3.matches("[-0-9.,]+")) {
                    JOptionPane.showMessageDialog(null, "Error en los datos ingresados", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(numeroSimulaciones) <= 0) {
                    JOptionPane.showMessageDialog(null, "El número de simulaciones debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!numeroSimulaciones.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "El número de simulaciones debe ser entero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(numeroHoras) <= 0) {
                    JOptionPane.showMessageDialog(null, "El número máximo de horas debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!numeroHoras.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "El número máximo de horas debe ser entero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(costoFijo) <= 0) {
                    JOptionPane.showMessageDialog(null, "El costo fijo debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(costoArticulo) <= 0) {
                    JOptionPane.showMessageDialog(null, "El costo unitario por artículo debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(precioVenta) <= 0) {
                    JOptionPane.showMessageDialog(null, "El precio de venta del artículo debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(minimoCliente) < 0) {
                    JOptionPane.showMessageDialog(null, "El mínimo de clientes por hora debe ser mayor o igual a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!minimoCliente.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "El mínimo de clientes por hora debe ser entero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(maximoCliente) < 0) {
                    JOptionPane.showMessageDialog(null, "El máximo de clientes por hora debe ser mayor o igual a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!maximoCliente.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "El máximo de clientes por hora debe ser entero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(probCli0) < 0 || Double.parseDouble(probCli0) > 1 || Double.parseDouble(probCli1) < 0 || Double.parseDouble(probCli1) > 1 ||
                        Double.parseDouble(probCli2) < 0 || Double.parseDouble(probCli2) > 1 || Double.parseDouble(probCli3) < 0 || Double.parseDouble(probCli3) > 1) {
                    JOptionPane.showMessageDialog(null, "Las probabilidades deben estar entre 0 y 1", "Error", JOptionPane.ERROR_MESSAGE);
                } else if(Double.parseDouble(probCli0) + Double.parseDouble(probCli1) + Double.parseDouble(probCli2) + Double.parseDouble(probCli3) != 1){
                    JOptionPane.showMessageDialog(null, "Las probabilidades deben sumar 1", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    long numSim = Long.parseLong(numeroSimulaciones);
                    long NMH = Long.parseLong(numeroHoras);
                    double CF = Double.parseDouble(costoFijo);
                    double CUA = Double.parseDouble(costoArticulo);
                    double PVU = Double.parseDouble(precioVenta);
                    double minCli = Double.parseDouble(minimoCliente);
                    double maxCli = Double.parseDouble(maximoCliente);
                    double prob0 = Double.parseDouble(probCli0);
                    double prob1 = Double.parseDouble(probCli1);
                    double prob2 = Double.parseDouble(probCli2);
                    double prob3 = Double.parseDouble(probCli3);

                    long NSIM = 0;
                    double suma_TAV = 0;
                    double suma_GN = 0;

                    // Limpiar contenido previo del JScrollPane
                    String[] columnNames = {"NSIM", "TAV", "GN"};
                    Object[][] data = new Object[(int) numSim][3];

                    // Realizar la simulación y llenar los datos
                    do {
                        NSIM += 1;
                        long CH = 0;
                        long TAV = 0;
                        double GN = 0;

                        long llecli;
                        double r_llecli;
                        long vac;
                        double r_vac;

                        do {
                            CH += 1;
                            r_llecli = Math.random();
                            llecli = Math.round(minCli + (maxCli-minCli) *r_llecli);
                            if (llecli != 0){
                                do{
                                    llecli -= 1;
                                    r_vac = Math.random();
                                    if(r_vac>0 && r_vac <= prob0){
                                        vac = 0;
                                    } else if(r_vac>prob0 && r_vac<=(prob0 + prob1) ){
                                        vac = 1;
                                    } else if(r_vac>(prob0 + prob1) && r_vac <= (prob0 + prob1 + prob2)){
                                        vac = 2;
                                    } else {
                                        vac = 3;
                                    }
                                    TAV += vac;
                                } while(llecli > 0);
                            }
                        } while(CH < NMH);
                        GN = TAV*(PVU-CUA) - CF;
                        data[(int) (NSIM-1)] = new Object[]{NSIM, TAV, GN};
                        suma_GN += GN;
                        suma_TAV += TAV;

                    } while (NSIM < numSim);

                    // Crear la tabla con los datos y los encabezados
                    table = new JTable(data, columnNames);
                    table.setPreferredScrollableViewportSize(new Dimension(515, 256));
                    table.setFillsViewportHeight(true);

                    // Agregar la tabla al JScrollPane
                    spResultadosSimulaciones.setViewportView(table);

                    // Mostrar Promedios
                    tfTAV_promedio.setText(String.valueOf(suma_TAV / numSim));
                    tfGN_promedio.setText(String.valueOf(suma_GN / numSim));
                }
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



