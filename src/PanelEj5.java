import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelEj5 extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField numSim;
    private JTextField tfNMT;
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

        JLabel lblNMT = new JLabel("Número máximo de tiros (NMT): ");
        lblNMT.setBounds(24, 169, 180, 14);
        add(lblNMT);

        tfNMT = new JTextField();
        tfNMT.setBounds(224, 166, 112, 20);
        add(tfNMT);
        tfNMT.setColumns(10);

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
                String numSimulaciones = numSim.getText();
                String numeroTiros = tfNMT.getText();
                String gananciajugador = tfGUJ.getText();
                String perdidajugador = tfPUJ.getText();

                // Reemplazar comas por puntos para manejar números decimales correctamente
                numSimulaciones = numSimulaciones.replace(',', '.');
                numeroTiros = numeroTiros.replace(',', '.');
                gananciajugador = gananciajugador.replace(',', '.');
                perdidajugador = perdidajugador.replace(',', '.');

                // Realizar las validaciones
                if (numSimulaciones.isEmpty() || numeroTiros.isEmpty() || gananciajugador.isEmpty() || perdidajugador.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!numSimulaciones.matches("[-0-9.,]+") || !numeroTiros.matches("[-0-9.,]+") || !gananciajugador.matches("[-0-9.,]+") || !perdidajugador.matches("[-0-9.,]+")) {
                    JOptionPane.showMessageDialog(null, "Error en los datos ingresados", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(numSimulaciones) <= 0) {
                    JOptionPane.showMessageDialog(null, "El número de simulaciones debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!numSimulaciones.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "El número de simulaciones debe ser entero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(numeroTiros) <= 0) {
                    JOptionPane.showMessageDialog(null, "El número de tiros debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!numeroTiros.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "El número de tiros debe ser entero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(gananciajugador) <= 0) {
                    JOptionPane.showMessageDialog(null, "La ganancia del jugador debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(perdidajugador) <= 0) {
                    JOptionPane.showMessageDialog(null, "La pérdida del jugador debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    long numSim = Long.parseLong(numSimulaciones);
                    long NMT = Long.parseLong(numeroTiros);
                    double GUJ = Double.parseDouble(gananciajugador);
                    double PUJ = Double.parseDouble(perdidajugador);

                    // Limpiar contenido previo del JScrollPane
                    String[] columnNames = {"NSIM", "GJT"};
                    Object[][] data = new Object[(int) numSim][2];

                    long NSIM = 0;
                    double suma_GJT = 0;

                    // Realizar la simulación y llenar los datos
                    do {
                        NSIM += 1;
                        long CT = 0;
                        double GJT = 0;

                        int m1, m2, m3;
                        double r1, r2, r3;
                        do {
                            CT += 1;
                            r1 = Math.random();
                            r2 = Math.random();
                            r3 = Math.random();
                            m1 = (int) Math.round(r1);
                            m2 = (int) Math.round(r2);
                            m3 = (int) Math.round(r3);
                            if(m1+m2+m3 == 0 || m1+m2+m3 == 3){
                                GJT = GJT + GUJ;
                            } else {
                                GJT = GJT - PUJ;
                            }
                        } while(CT < NMT);

                        data[(int) (NSIM-1)] = new Object[]{NSIM, GJT};
                        suma_GJT += GJT;

                    } while (NSIM < numSim);

                    // Crear la tabla con los datos y los encabezados
                    table = new JTable(data, columnNames);
                    table.setPreferredScrollableViewportSize(new Dimension(515, 256));
                    table.setFillsViewportHeight(true);

                    // Agregar la tabla al JScrollPane
                    spResultadosSimulaciones.setViewportView(table);

                    // Mostrar Promedios
                    tfGJT_promedio.setText(String.valueOf(suma_GJT / numSim));
                }
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Limpiar campos de texto
                numSim.setText("");
                tfNMT.setText("");
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
