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
        lblSimulaciones.setBounds(24, 127, 174, 37);
        add(lblSimulaciones);

        numSim = new JTextField();
        numSim.setBounds(208, 130, 134, 31);
        add(numSim);
        numSim.setColumns(10);

        JScrollPane spResultadosSimulaciones = new JScrollPane();
        spResultadosSimulaciones.setBounds(455, 150, 515, 256);
        add(spResultadosSimulaciones);

        // Crear la tabla inicial con los encabezados
        String[] columnNames = {"NSIM", "Z", "X1", "X2", "X3"};
        Object[][] data = {}; // No hay datos inicialmente
        table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(515, 256));
        table.setFillsViewportHeight(true);

        // Establecer la tabla como la vista del JScrollPane
        spResultadosSimulaciones.setViewportView(table);

        JLabel lblParametros = new JLabel("Parámetros de la Simulación");
        lblParametros.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblParametros.setBounds(24, 184, 190, 14);
        add(lblParametros);

        JLabel lblNumMaxIt = new JLabel("Número máximo de iteraciones (NMI):");
        lblNumMaxIt.setBounds(24, 209, 223, 31);
        add(lblNumMaxIt);

        tfNMI = new JTextField();
        tfNMI.setColumns(10);
        tfNMI.setBounds(257, 209, 134, 31);
        add(tfNMI);

        JLabel lblFunc = new JLabel("Función a maximizar:");
        lblFunc.setBounds(24, 251, 134, 31);
        add(lblFunc);

        tfX1 = new JTextField();
        tfX1.setBounds(48, 302, 77, 20);
        add(tfX1);
        tfX1.setColumns(10);

        tfX2 = new JTextField();
        tfX2.setColumns(10);
        tfX2.setBounds(175, 302, 77, 20);
        add(tfX2);

        tfX3 = new JTextField();
        tfX3.setColumns(10);
        tfX3.setBounds(300, 302, 77, 20);
        add(tfX3);

        JLabel lblZ = new JLabel("Z =                              * X1 +                               * X2  +                              * X3");
        lblZ.setBounds(24, 305, 396, 14);
        add(lblZ);

        JLabel lblRestricciones = new JLabel("Restricciones:");
        lblRestricciones.setBounds(24, 333, 114, 31);
        add(lblRestricciones);

        tfX1X2 = new JTextField();
        tfX1X2.setColumns(10);
        tfX1X2.setBounds(232, 376, 77, 20);
        add(tfX1X2);

        tfMenorX1 = new JTextField();
        tfMenorX1.setColumns(10);
        tfMenorX1.setBounds(61, 419, 77, 20);
        add(tfMenorX1);

        tfMayorX1 = new JTextField();
        tfMayorX1.setColumns(10);
        tfMayorX1.setBounds(232, 419, 77, 20);
        add(tfMayorX1);

        tfMenorX2 = new JTextField();
        tfMenorX2.setColumns(10);
        tfMenorX2.setBounds(61, 460, 77, 20);
        add(tfMenorX2);

        tfMayorX2 = new JTextField();
        tfMayorX2.setColumns(10);
        tfMayorX2.setBounds(232, 460, 77, 20);
        add(tfMayorX2);

        tfMenorX3 = new JTextField();
        tfMenorX3.setColumns(10);
        tfMenorX3.setBounds(61, 506, 77, 20);
        add(tfMenorX3);

        tfMayorX3 = new JTextField();
        tfMayorX3.setColumns(10);
        tfMayorX3.setBounds(232, 506, 77, 20);
        add(tfMayorX3);

        JLabel lblX1X2 = new JLabel("X1 + X2 ≥");
        lblX1X2.setBounds(152, 379, 70, 14);
        add(lblX1X2);

        JLabel lblX1 = new JLabel("≤ X1 ≤");
        lblX1.setBounds(162, 422, 41, 14);
        add(lblX1);

        JLabel lblX2 = new JLabel("≤ X2 ≤");
        lblX2.setBounds(162, 463, 41, 14);
        add(lblX2);

        JLabel lblX3 = new JLabel("≤ X3 ≤");
        lblX3.setBounds(162, 509, 41, 14);
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
                String numeroSimulaciones = numSim.getText();
                String numeroMaximoIteraciones = tfNMI.getText();
                String coefX1 = tfX1.getText();
                String coefX2 = tfX2.getText();
                String coefX3 = tfX3.getText();
                String x1masx2 = tfX1X2.getText();
                String x1Menor = tfMenorX1.getText();
                String x1Mayor = tfMayorX1.getText();
                String x2Menor = tfMenorX2.getText();
                String x2Mayor = tfMayorX2.getText();
                String x3Menor = tfMenorX3.getText();
                String x3Mayor = tfMayorX3.getText();

                numeroSimulaciones = numeroSimulaciones.replace(',', '.');
                numeroMaximoIteraciones = numeroMaximoIteraciones.replace(',', '.');
                coefX1 = coefX1.replace(',', '.');
                coefX2 = coefX2.replace(',', '.');
                coefX3 = coefX3.replace(',', '.');
                x1masx2 = x1masx2.replace(',', '.');
                x1Menor = x1Menor.replace(',', '.');
                x1Mayor = x1Mayor.replace(',', '.');
                x2Menor = x2Menor.replace(',', '.');
                x2Mayor = x2Mayor.replace(',', '.');
                x3Menor = x3Menor.replace(',', '.');
                x3Mayor = x3Mayor.replace(',', '.');

                if (numeroSimulaciones.isEmpty() || numeroMaximoIteraciones.isEmpty() || coefX1.isEmpty() || coefX2.isEmpty() || coefX3.isEmpty() || x1masx2.isEmpty() ||
                        x1Menor.isEmpty() || x1Mayor.isEmpty() || x2Menor.isEmpty() || x2Mayor.isEmpty() || x3Menor.isEmpty() || x3Mayor.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!numeroSimulaciones.matches("[-0-9.,]+") || !numeroMaximoIteraciones.matches("[-0-9.,]+") || !coefX1.matches("[-0-9.,]+") || !coefX2.matches("[-0-9.,]+") || !coefX3.matches("[-0-9.,]+") || !x1masx2.matches("[-0-9.,]+") ||
                        !x1Menor.matches("[-0-9.,]+") || !x1Mayor.matches("[-0-9.,]+") || !x2Menor.matches("[-0-9.,]+") || !x2Mayor.matches("[-0-9.,]+") || !x3Menor.matches("[-0-9.,]+") || !x3Mayor.matches("[-0-9.,]+")) {
                    JOptionPane.showMessageDialog(null, "Error en los datos ingresados", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(numeroSimulaciones) <= 0) {
                    JOptionPane.showMessageDialog(null, "El número de simulaciones debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!numeroSimulaciones.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "El número de simulaciones debe ser entero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(numeroMaximoIteraciones) <= 0) {
                    JOptionPane.showMessageDialog(null, "El número máximo de iteraciones (NMI) debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!numeroMaximoIteraciones.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "El número máximo de iteraciones (NMI) debe ser entero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(x1Menor) >= Double.parseDouble(x1Mayor)) {
                    JOptionPane.showMessageDialog(null, "El límite inferior de X1 debe ser menor que su límite superior", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(x2Menor) >= Double.parseDouble(x2Mayor)) {
                    JOptionPane.showMessageDialog(null, "El límite inferior de X2 debe ser menor que su límite superior", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(x3Menor) >= Double.parseDouble(x3Mayor)) {
                    JOptionPane.showMessageDialog(null, "El límite inferior de X3 debe ser menor que su límite superior", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    long numSim = Long.parseLong(numeroSimulaciones);
                    long NMI = Long.parseLong(numeroMaximoIteraciones);
                    double cX1 = Double.parseDouble(coefX1);
                    double cX2 = Double.parseDouble(coefX2);
                    double cX3 = Double.parseDouble(coefX3);
                    double rX1X2 = Double.parseDouble(x1masx2);
                    double rX1menor = Double.parseDouble(x1Menor);
                    double rX1mayor = Double.parseDouble(x1Mayor);
                    double rX2menor = Double.parseDouble(x2Menor);
                    double rX2mayor = Double.parseDouble(x2Mayor);
                    double rX3menor = Double.parseDouble(x3Menor);
                    double rX3mayor = Double.parseDouble(x3Mayor);

                    long NSIM = 0;
                    double sumZ = 0;
                    double sumX1 = 0;
                    double sumX2 = 0;
                    double sumX3 = 0;

                    // Limpiar contenido previo del JScrollPane
                    String[] columnNames = {"NSIM", "Z", "X1", "X2", "X3"};
                    Object[][] data = new Object[(int) numSim][5];

                    // Realizar la simulación y llenar los datos
                    do {
                        NSIM += 1;

                        long CIT = 0;
                        double Z = 0;
                        double X1 = 0;
                        double X2 = 0;
                        double X3 = 0;

                        double zc;
                        double x1c;
                        double x2c;
                        double x3c;
                        double r1;
                        double r2;
                        double r3;

                        do {
                            CIT += 1;
                            r1 = Math.random();
                            r2 = Math.random();
                            x1c = rX1menor + (rX1mayor - rX1menor)*r1 ;
                            x2c = Math.round(rX2menor + (rX2mayor - rX1menor)*r2);
                            if(x1c + x2c >= rX1X2){
                                r3 = Math.random();
                                x3c = rX3menor + (rX3mayor - rX3menor)*r3;
                                zc = cX1*x1c + cX2*x2c + cX3*x3c;
                                if(zc > Z){
                                    Z = zc;
                                    X1 = x1c;
                                    X2 = x2c;
                                    X3 = x3c;
                                }
                            }
                        } while(CIT < NMI);

                        data[(int) (NSIM-1)] = new Object[]{NSIM, Z, X1, X2, X3};
                        sumZ += Z;
                        sumX1 += X1;
                        sumX2 += X2;
                        sumX3 += X3;

                    } while (NSIM < numSim);

                    // Crear la tabla con los datos y los encabezados
                    table = new JTable(data, columnNames);
                    table.setPreferredScrollableViewportSize(new Dimension(515, 256));
                    table.setFillsViewportHeight(true);

                    // Agregar la tabla al JScrollPane
                    spResultadosSimulaciones.setViewportView(table);

                    // Mostrar Promedios
                    tfPromedioZ.setText(String.valueOf(sumZ / numSim));
                    tfPromedioX1.setText(String.valueOf(sumX1 / numSim));
                    tfPromedioX2.setText(String.valueOf(sumX2 / numSim));
                    tfPromedioX3.setText(String.valueOf(sumX3 / numSim));

                }
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

                // Limpiar datos de la tabla (excepto los encabezados)
                String[] columnNames = {"NSIM", "Z", "X1", "X2", "X3"};
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
