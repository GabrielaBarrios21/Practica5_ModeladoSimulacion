import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelEj1 extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField tfT;
    private JTextField tfInteres;
    private JTextField tfCapital;
    private JTable table; // Agregar la variable para la tabla
    private JTextField tfK_final;
    private JTextField tfDecimales;

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

        JButton btnSimular = new JButton("Simular");
        btnSimular.setBounds(455, 81, 120, 46);
        add(btnSimular);

        JButton btnLimpiar = new JButton("Limpiar Todo");
        btnLimpiar.setBounds(647, 81, 120, 46);
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Imprimir en la consola
                System.out.println("Limpiando campos...");
            }
        });
        add(btnLimpiar);

        JScrollPane spResultadosSimulaciones = new JScrollPane();
        spResultadosSimulaciones.setBounds(455, 150, 515, 256);
        add(spResultadosSimulaciones);

        // Crear la tabla inicial con los encabezados
        String[] columnNames = {"CT", "I", "K"};
        Object[][] data = {}; // No hay datos inicialmente
        table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(515, 256));
        table.setFillsViewportHeight(true);

        // Establecer la tabla como la vista del JScrollPane
        spResultadosSimulaciones.setViewportView(table);

        JLabel lblTiempoDeposito = new JLabel("Tiempo de depósito a plazo fijo (T):");
        lblTiempoDeposito.setBounds(42, 155, 240, 14);
        add(lblTiempoDeposito);

        tfT = new JTextField();
        tfT.setBounds(42, 181, 166, 20);
        add(tfT);
        tfT.setColumns(10);

        JLabel lblInteres = new JLabel("Tasa de interés anual (i):");
        lblInteres.setBounds(42, 225, 153, 14);
        add(lblInteres);

        tfInteres = new JTextField();
        tfInteres.setColumns(10);
        tfInteres.setBounds(42, 250, 104, 20);
        add(tfInteres);

        JLabel lblPorcentaje = new JLabel("%");
        lblPorcentaje.setBounds(149, 253, 46, 14);
        add(lblPorcentaje);

        JLabel lblCapital = new JLabel("Capital inicial (K):");
        lblCapital.setBounds(42, 293, 200, 14);
        add(lblCapital);

        tfCapital = new JTextField();
        tfCapital.setColumns(10);
        tfCapital.setBounds(42, 314, 104, 20);
        add(tfCapital);

        JLabel lblBs = new JLabel("Bs.");
        lblBs.setBounds(149, 317, 46, 14);
        add(lblBs);

        JLabel lblKFinal = new JLabel("Capital final:");
        lblKFinal.setBounds(455, 455, 89, 14);
        add(lblKFinal);

        tfK_final = new JTextField();
        tfK_final.setEditable(false); // No se puede editar manualmente
        tfK_final.setBounds(554, 452, 166, 20);
        add(tfK_final);
        tfK_final.setColumns(10);

        JLabel lblBs_1 = new JLabel("Bs.");
        lblBs_1.setBounds(730, 455, 46, 14);
        add(lblBs_1);

        JLabel lblAnios = new JLabel("Años");
        lblAnios.setBounds(218, 184, 46, 14);
        add(lblAnios);

        tfDecimales = new JTextField();
        tfDecimales.setColumns(10);
        tfDecimales.setBounds(42, 117, 104, 20);
        add(tfDecimales);

        JLabel lblCantDecimales = new JLabel("Cantidad de decimales: ");
        lblCantDecimales.setBounds(42, 92, 140, 14);
        add(lblCantDecimales);

        btnSimular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener el texto de los campos de texto
                String tiempo = tfT.getText();
                String interes = tfInteres.getText();
                String capital = tfCapital.getText();
                String decimales = tfDecimales.getText();

                // Reemplazar "," por "." para asegurar compatibilidad
                tiempo = tiempo.replace(',', '.');
                interes = interes.replace(',', '.');
                capital = capital.replace(',', '.');
                decimales = decimales.replace(',', '.');

                // Verificar si al menos un campo está vacío
                if (tiempo.isEmpty() || interes.isEmpty() || capital.isEmpty() || decimales.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!tiempo.matches("[-0-9.,]+") || !interes.matches("[-0-9.,]+") || !capital.matches("[-0-9.,]+" ) || !decimales.matches("[-0-9.,]+")) {
                    JOptionPane.showMessageDialog(null, "Error en los datos ingresados", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(tiempo) <= 0) {
                    JOptionPane.showMessageDialog(null, "El tiempo de depósito a plazo fijo (T) debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else  if (!tiempo.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "El tiempo de depósito a plazo fijo debe ser entero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(interes) <= 0) {
                    JOptionPane.showMessageDialog(null, "La tasa de interés (i) debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(capital) <= 0) {
                    JOptionPane.showMessageDialog(null, "El capital inicial (K) debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(decimales) <= 0) {
                    JOptionPane.showMessageDialog(null, "La cantidad de decimales debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!decimales.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "La cantidad de decimales debe ser entera", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    double T = Double.parseDouble(tiempo);
                    long CT = 0;
                    double I; // I = K*i
                    double K = Double.parseDouble(capital);
                    double i = Double.parseDouble(interes) / 100;
                    long dec = Long.parseLong(decimales);

                    // Limpiar contenido previo del JScrollPane
                    String[] columnNames = {"CT", "I", "K"};
                    Object[][] data = new Object[(int) T][3];

                    // Realizar la simulación y llenar los datos
                    do {
                        CT += 1;
                        I = K * i;
                        I = Math.round(I * Math.pow(10, dec)) / Math.pow(10, dec);
                        K = K + I;
                        K = Math.round(K * Math.pow(10, dec)) / Math.pow(10, dec);
                        data[(int) (CT-1)] = new Object[]{CT, I, K};
                    } while (CT < T);

                    // Crear la tabla con los datos y los encabezados
                    table = new JTable(data, columnNames);
                    table.setPreferredScrollableViewportSize(new Dimension(515, 256));
                    table.setFillsViewportHeight(true);

                    // Agregar la tabla al JScrollPane
                    spResultadosSimulaciones.setViewportView(table);

                    // Mostrar el resultado final de K en el JTextField
                    tfK_final.setText(String.valueOf(K));
                }
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Limpiar campos de texto
                tfDecimales.setText("");
                tfT.setText("");
                tfInteres.setText("");
                tfCapital.setText("");

                // Limpiar datos de la tabla (excepto los encabezados)
                String[] columnNames = {"CT", "I", "K"};
                Object[][] data = {}; // No hay datos inicialmente
                table = new JTable(data, columnNames);
                table.setPreferredScrollableViewportSize(new Dimension(515, 256));
                table.setFillsViewportHeight(true);

                // Establecer la tabla como la vista del JScrollPane
                spResultadosSimulaciones.setViewportView(table);

                // Limpiar K final
                tfK_final.setText("");
            }
        });
    }
}
