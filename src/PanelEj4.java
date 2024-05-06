import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelEj4 extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField numSim;
    private JTextField tfNML;
    private JTextField tfIUJ;
    private JTextField tfPUC;
    private JTextField tfGNC_promedio;
    private JTextField tfNJC_promedio;
    private JTextField tfPJC_promedio;
    private JTable table; // Agregar la variable para la tabla

    /**
     * Create the panel.
     */
    public PanelEj4() {
        setBackground(new Color(204, 255, 255));
        setLayout(null);
        JLabel lblTitulo = new JLabel("Juego de dados");
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
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PanelEj4.this);
                frame.getContentPane().remove(PanelEj4.this);
                frame.getContentPane().add(panerlprincipal);
                panerlprincipal.setVisible(true);
                frame.revalidate();
                frame.repaint();
            }
        });
        add(btnAtras);

        JLabel lblSimulaciones = new JLabel("Número de simulaciones:");
        lblSimulaciones.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblSimulaciones.setBounds(25, 121, 190, 37);
        add(lblSimulaciones);

        numSim = new JTextField();
        numSim.setFont(new Font("Tahoma", Font.PLAIN, 14));
        numSim.setBounds(205, 125, 170, 30);
        add(numSim);
        numSim.setColumns(10);

        JButton btnSimular = new JButton("Simular");
        btnSimular.setBounds(455, 81, 120, 46);
        add(btnSimular);

        JButton btnLimpiar = new JButton("Limpiar Todo");
        btnLimpiar.setBounds(647, 81, 120, 46);
        add(btnLimpiar);

        JLabel lblParametros = new JLabel("Parámetros de la Simulación");
        lblParametros.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblParametros.setBounds(24, 169, 350, 30);
        add(lblParametros);

        JScrollPane spResultadosSimulaciones = new JScrollPane();
        spResultadosSimulaciones.setBounds(455, 150, 515, 256);
        add(spResultadosSimulaciones);

        // Crear la tabla inicial con los encabezados
        String[] columnNames = {"NSIM", "GNC", "NJC", "PJC"};
        Object[][] data = {}; // No hay datos inicialmente
        table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(515, 256));
        table.setFillsViewportHeight(true);

        // Establecer la tabla como la vista del JScrollPane
        spResultadosSimulaciones.setViewportView(table);

        JLabel lblPromedios = new JLabel("Promedios de los resultados de las simulaciones");
        lblPromedios.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblPromedios.setBounds(455, 439, 438, 30);
        add(lblPromedios);

        JLabel lblNML = new JLabel("Número máximo de lanzamientos (NML):");
        lblNML.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNML.setBounds(25, 217, 350, 30);
        add(lblNML);

        tfNML = new JTextField();
        tfNML.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfNML.setBounds(25, 245, 350, 30);
        add(tfNML);
        tfNML.setColumns(10);

        JLabel lblIUJ = new JLabel("Ingreso unitario del juego (IUJ): ");
        lblIUJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblIUJ.setBounds(24, 300, 351, 30);
        add(lblIUJ);

        tfIUJ = new JTextField();
        tfIUJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfIUJ.setColumns(10);
        tfIUJ.setBounds(25, 328, 279, 30);
        add(tfIUJ);

        JLabel lblPUJ = new JLabel("Pérdida unitaria de la casa (PUC):");
        lblPUJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPUJ.setBounds(25, 392, 350, 30);
        add(lblPUJ);

        tfPUC = new JTextField();
        tfPUC.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfPUC.setColumns(10);
        tfPUC.setBounds(25, 422, 279, 30);
        add(tfPUC);

        JLabel lblGNC = new JLabel("Ganancia neta de la casa (GNC):");
        lblGNC.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblGNC.setBounds(455, 486, 239, 30);
        add(lblGNC);

        tfGNC_promedio = new JTextField();
        tfGNC_promedio.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfGNC_promedio.setColumns(10);
        tfGNC_promedio.setBounds(701, 487, 190, 30);
        add(tfGNC_promedio);

        JLabel lblNJC = new JLabel("Nro. de juegos ganados por la casa (NJC):");
        lblNJC.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNJC.setBounds(455, 539, 287, 30);
        add(lblNJC);

        tfNJC_promedio = new JTextField();
        tfNJC_promedio.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfNJC_promedio.setColumns(10);
        tfNJC_promedio.setBounds(751, 540, 142, 30);
        add(tfNJC_promedio);

        JLabel lblPJC = new JLabel("Porcentaje juegos ganados por la casa (PJC):");
        lblPJC.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPJC.setBounds(455, 589, 296, 30);
        add(lblPJC);

        tfPJC_promedio = new JTextField();
        tfPJC_promedio.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfPJC_promedio.setColumns(10);
        tfPJC_promedio.setBounds(751, 590, 142, 30);
        add(tfPJC_promedio);

        JLabel lblBsLanz = new JLabel("Bs./lanzamiento");
        lblBsLanz.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBsLanz.setBounds(314, 327, 127, 30);
        add(lblBsLanz);

        JLabel lblBsLanz_1 = new JLabel("Bs./lanzamiento");
        lblBsLanz_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBsLanz_1.setBounds(314, 423, 127, 30);
        add(lblBsLanz_1);

        JLabel lblBs = new JLabel("Bs.");
        lblBs.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBs.setBounds(892, 486, 78, 30);
        add(lblBs);

        JLabel lblLanzamiento = new JLabel("lanzamiento");
        lblLanzamiento.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblLanzamiento.setBounds(903, 539, 98, 30);
        add(lblLanzamiento);

        JLabel lblBs_1 = new JLabel(" %");
        lblBs_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBs_1.setBounds(903, 589, 78, 30);
        add(lblBs_1);

        btnSimular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String numSimulaciones = numSim.getText();
                String numMaxLanzamiento = tfNML.getText();
                String ingresoUnitarioJuego = tfIUJ.getText();
                String perdidaUnitariaCasa = tfPUC.getText();

                numSimulaciones = numSimulaciones.replace(',', '.');
                numMaxLanzamiento = numMaxLanzamiento.replace(',', '.');;
                ingresoUnitarioJuego = ingresoUnitarioJuego.replace(',', '.');
                perdidaUnitariaCasa = perdidaUnitariaCasa.replace(',', '.');

                // Realizar las validaciones
                if (numSimulaciones.isEmpty() || numMaxLanzamiento.isEmpty() || ingresoUnitarioJuego.isEmpty() || perdidaUnitariaCasa.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!numSimulaciones.matches("[-0-9.,]+") || !numMaxLanzamiento.matches("[-0-9.,]+") || !ingresoUnitarioJuego.matches("[-0-9.,]+") || !perdidaUnitariaCasa.matches("[-0-9.,]+")) {
                    JOptionPane.showMessageDialog(null, "Error en los datos ingresados", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(numSimulaciones) <= 0) {
                    JOptionPane.showMessageDialog(null, "El número de simulaciones debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!numSimulaciones.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "El número de simulaciones debe ser entero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(numMaxLanzamiento) <= 0) {
                    JOptionPane.showMessageDialog(null, "El número de lanzamientos debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!numMaxLanzamiento.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "El número de lanzamientos debe ser entero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(ingresoUnitarioJuego) <= 0) {
                    JOptionPane.showMessageDialog(null, "El ingreso debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(perdidaUnitariaCasa) <= 0) {
                    JOptionPane.showMessageDialog(null, "La pérdida de la casa debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    long numSim = Long.parseLong(numSimulaciones);
                    long NML = Long.parseLong(numMaxLanzamiento);
                    double IUJ = Double.parseDouble(ingresoUnitarioJuego);
                    double PUC = Double.parseDouble(perdidaUnitariaCasa);

                    // Limpiar contenido previo del JScrollPane
                    String[] columnNames = {"NSIM", "GNC", "NJC", "PJC"};
                    Object[][] data = new Object[(int) numSim][4];

                    long NSIM = 0;
                    double suma_GNC = 0;
                    double suma_NJC = 0;
                    double suma_PJC = 0;

                    // Realizar la simulación y llenar los datos
                    do {
                        NSIM += 1;
                        long CL = 0;
                        double GNC = 0;
                        long NJC = 0;
                        long PJC;
                        int d1, d2;
                        double r1, r2;
                        int sd;
                        do {
                            CL += 1;
                            GNC = GNC + IUJ;
                            r1 = Math.random();
                            r2 = Math.random();
                            d1 = (int) Math.round(1 + 5*r1);
                            d2 = (int) Math.round(1 + 5*r2);
                            if(d1 + d2 == 7){
                                GNC -= PUC;
                            } else {
                                NJC +=1;
                            }
                        } while(CL < NML);

                        PJC = 100 * NJC / NML;

                        data[(int) (NSIM-1)] = new Object[]{NSIM, GNC, NJC, PJC};
                        suma_GNC += GNC;
                        suma_NJC += NJC;
                        suma_PJC += PJC;

                    } while (NSIM < numSim);

                    // Crear la tabla con los datos y los encabezados
                    table = new JTable(data, columnNames);
                    table.setPreferredScrollableViewportSize(new Dimension(515, 256));
                    table.setFillsViewportHeight(true);

                    // Agregar la tabla al JScrollPane
                    spResultadosSimulaciones.setViewportView(table);

                    // Mostrar Promedios
                    tfGNC_promedio.setText(String.valueOf(suma_GNC / numSim));
                    tfNJC_promedio.setText(String.valueOf(suma_NJC / numSim));
                    tfPJC_promedio.setText(String.valueOf(suma_PJC / numSim));
                }

            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numSim.setText("");
                tfNML.setText("");
                tfIUJ.setText("");
                tfPUC.setText("");
                tfGNC_promedio.setText("");
                tfNJC_promedio.setText("");
                tfPJC_promedio.setText("");

                // Limpiar datos de la tabla (excepto los encabezados)
                String[] columnNames = {"NSIM", "GNC", "NJC", "PJC"};
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
