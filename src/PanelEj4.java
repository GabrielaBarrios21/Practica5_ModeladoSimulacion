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
        setLayout(null);
        JLabel lblTitulo = new JLabel("Juego de dados");
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

        JLabel lblParametros = new JLabel("Parámetros de la Simulación");
        lblParametros.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblParametros.setBounds(24, 149, 190, 14);
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
        lblPromedios.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblPromedios.setBounds(455, 439, 292, 14);
        add(lblPromedios);

        JLabel lblNML = new JLabel("Número máximo de lanzamientos (NML):");
        lblNML.setBounds(25, 197, 220, 14);
        add(lblNML);

        tfNML = new JTextField();
        tfNML.setBounds(255, 194, 120, 20);
        add(tfNML);
        tfNML.setColumns(10);

        JLabel lblIUJ = new JLabel("Ingreso unitario del juego (IUJ): ");
        lblIUJ.setBounds(24, 240, 190, 14);
        add(lblIUJ);

        tfIUJ = new JTextField();
        tfIUJ.setColumns(10);
        tfIUJ.setBounds(255, 237, 120, 20);
        add(tfIUJ);

        JLabel lblPUJ = new JLabel("Pérdida unitaria de la casa (PUC):");
        lblPUJ.setBounds(24, 293, 190, 14);
        add(lblPUJ);

        tfPUC = new JTextField();
        tfPUC.setColumns(10);
        tfPUC.setBounds(255, 290, 120, 20);
        add(tfPUC);

        JLabel lblGNC = new JLabel("Ganancia neta de la casa (GNC):");
        lblGNC.setBounds(455, 476, 239, 14);
        add(lblGNC);

        tfGNC_promedio = new JTextField();
        tfGNC_promedio.setColumns(10);
        tfGNC_promedio.setBounds(704, 473, 120, 20);
        add(tfGNC_promedio);

        JLabel lblNJC = new JLabel("Nro. de juegos ganados por la casa (NJC):");
        lblNJC.setBounds(455, 516, 239, 14);
        add(lblNJC);

        tfNJC_promedio = new JTextField();
        tfNJC_promedio.setColumns(10);
        tfNJC_promedio.setBounds(704, 513, 120, 20);
        add(tfNJC_promedio);

        JLabel lblPJC = new JLabel("Porcentaje juegos ganados por la casa (PJC):");
        lblPJC.setBounds(455, 563, 249, 14);
        add(lblPJC);

        tfPJC_promedio = new JTextField();
        tfPJC_promedio.setColumns(10);
        tfPJC_promedio.setBounds(704, 560, 120, 20);
        add(tfPJC_promedio);

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
