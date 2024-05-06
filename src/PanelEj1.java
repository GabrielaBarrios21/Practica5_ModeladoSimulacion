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
        setBackground(new Color(204, 255, 255));
        setLayout(null);
        JLabel lblTitulo = new JLabel("Depósito en un banco");
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
        spResultadosSimulaciones.setBounds(455, 150, 515, 349);
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
        lblTiempoDeposito.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblTiempoDeposito.setBounds(42, 238, 314, 30);
        add(lblTiempoDeposito);

        tfT = new JTextField();
        tfT.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfT.setBounds(42, 279, 314, 30);
        add(tfT);
        tfT.setColumns(10);

        JLabel lblInteres = new JLabel("Tasa de interés anual (i):");
        lblInteres.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblInteres.setBounds(42, 341, 314, 30);
        add(lblInteres);

        tfInteres = new JTextField();
        tfInteres.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfInteres.setColumns(10);
        tfInteres.setBounds(42, 376, 314, 30);
        add(tfInteres);

        JLabel lblPorcentaje = new JLabel("%");
        lblPorcentaje.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPorcentaje.setBounds(366, 374, 46, 30);
        add(lblPorcentaje);

        JLabel lblCapital = new JLabel("Capital inicial (K):");
        lblCapital.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCapital.setBounds(42, 434, 314, 30);
        add(lblCapital);

        tfCapital = new JTextField();
        tfCapital.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfCapital.setColumns(10);
        tfCapital.setBounds(42, 469, 314, 30);
        add(tfCapital);

        JLabel lblBs = new JLabel("Bs.");
        lblBs.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBs.setBounds(366, 468, 46, 30);
        add(lblBs);

        JLabel lblKFinal = new JLabel("Capital final:");
        lblKFinal.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblKFinal.setBounds(455, 530, 89, 30);
        add(lblKFinal);

        tfK_final = new JTextField();
        tfK_final.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfK_final.setBackground(new Color(255, 255, 255));
        tfK_final.setEditable(false); // No se puede editar manualmente
        tfK_final.setBounds(567, 532, 185, 30);
        add(tfK_final);
        tfK_final.setColumns(10);

        JLabel lblBs_1 = new JLabel("Bs.");
        lblBs_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBs_1.setBounds(762, 530, 46, 30);
        add(lblBs_1);

        JLabel lblAnios = new JLabel("Años");
        lblAnios.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblAnios.setBounds(366, 277, 46, 30);
        add(lblAnios);

        tfDecimales = new JTextField();
        tfDecimales.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfDecimales.setColumns(10);
        tfDecimales.setBounds(221, 150, 191, 30);
        add(tfDecimales);

        JLabel lblCantDecimales = new JLabel("Cantidad de decimales: ");
        lblCantDecimales.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCantDecimales.setBounds(42, 153, 200, 30);
        add(lblCantDecimales);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setBounds(42, 200, 370, 3);
        add(panel);

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
