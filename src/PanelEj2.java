import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class PanelEj2 extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField tfT;
    private JTextField tfTasaNatalidad;
    private JTextField tfPBol;
    private JTable table; // Agregar la variable para la tabla
    private JTextField tfPBol_final;
    //private JTextField tfDecimales;
    private JTextField tfTasaMortandad;

    /**
     * Create the panel.
     */
    public PanelEj2() {
        setBackground(new Color(204, 255, 255));
        setLayout(null);
        JLabel lblTitulo = new JLabel("Población de Bolivia");
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
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PanelEj2.this);
                frame.getContentPane().remove(PanelEj2.this);
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
        spResultadosSimulaciones.setBounds(377, 170, 578, 355);
        add(spResultadosSimulaciones);

        // Crear la tabla inicial con los encabezados
        String[] columnNames = {"CT", "Nacimientos", "Muertes", "PBol"};
        Object[][] data = {}; // No hay datos inicialmente
        table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(578, 294));
        table.setFillsViewportHeight(true);

        // Establecer la tabla como la vista del JScrollPane
        spResultadosSimulaciones.setViewportView(table);

        JLabel lblAnio = new JLabel("Año del cual se quiere conocer la población:");
        lblAnio.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblAnio.setBounds(40, 170, 320, 30);
        add(lblAnio);

        tfT = new JTextField();
        tfT.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfT.setBounds(40, 200, 300, 30);
        add(tfT);
        tfT.setColumns(10);

        JLabel lbTasaNatalidad = new JLabel("Tasa de natalidad (TN):");
        lbTasaNatalidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbTasaNatalidad.setBounds(40, 256, 153, 30);
        add(lbTasaNatalidad);

        tfTasaNatalidad = new JTextField();
        tfTasaNatalidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfTasaNatalidad.setColumns(10);
        tfTasaNatalidad.setBounds(40, 286, 300, 30);
        add(tfTasaNatalidad);

        JLabel lblPorcentaje = new JLabel("nacimientos / 1000 personas");
        lblPorcentaje.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPorcentaje.setBounds(40, 319, 200, 14);
        add(lblPorcentaje);

        JLabel lblPobBol = new JLabel("Población en Bolivia el 2012");
        lblPobBol.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPobBol.setBounds(40, 467, 200, 30);
        add(lblPobBol);

        tfPBol = new JTextField();
        tfPBol.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfPBol.setColumns(10);
        tfPBol.setBounds(40, 500, 300, 25);
        add(tfPBol);

        JLabel lblBs = new JLabel("Personas.");
        lblBs.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBs.setBounds(40, 525, 60, 30);
        add(lblBs);

        JLabel lblPBolFinal = new JLabel("Población en Bolivia (PBol):");
        lblPBolFinal.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPBolFinal.setBounds(387, 549, 163, 30);
        add(lblPBolFinal);

        tfPBol_final = new JTextField();
        tfPBol_final.setBackground(new Color(255, 255, 255));
        tfPBol_final.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfPBol_final.setEditable(false); // No se puede editar manualmente
        tfPBol_final.setBounds(568, 550, 300, 30);
        add(tfPBol_final);
        tfPBol_final.setColumns(10);

        /*
        tfDecimales = new JTextField();
        tfDecimales.setColumns(10);
        tfDecimales.setBounds(42, 117, 104, 20);
        add(tfDecimales);

        JLabel lblCantDecimales = new JLabel("Cantidad de decimales: ");
        lblCantDecimales.setBounds(42, 92, 140, 14);
        add(lblCantDecimales);
         */

        JLabel lbTasaMortandad = new JLabel("Tasa de mortandad (TM):");
        lbTasaMortandad.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbTasaMortandad.setBounds(40, 357, 300, 30);
        add(lbTasaMortandad);

        tfTasaMortandad = new JTextField();
        tfTasaMortandad.setFont(new Font("Tahoma", Font.PLAIN, 14));
        tfTasaMortandad.setColumns(10);
        tfTasaMortandad.setBounds(40, 388, 300, 30);
        add(tfTasaMortandad);

        JLabel lblPorcentaje_1 = new JLabel("muertes / 1000 personas");
        lblPorcentaje_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPorcentaje_1.setBounds(40, 422, 200, 14);
        add(lblPorcentaje_1);

        JLabel lblBs_1 = new JLabel("Personas.");
        lblBs_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBs_1.setBounds(895, 549, 60, 30);
        add(lblBs_1);

        btnSimular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tiempo = tfT.getText();
                String tasaNatalidad = tfTasaNatalidad.getText();
                String tasaMortandad = tfTasaMortandad.getText();
                String poblacion = tfPBol.getText();

                tiempo = tiempo.replace(',', '.');
                tasaNatalidad = tasaNatalidad.replace(',', '.');
                tasaMortandad = tasaMortandad.replace(',', '.');
                poblacion = poblacion.replace(',', '.');

                if (tiempo.isEmpty() || tasaNatalidad.isEmpty() || poblacion.isEmpty() || tasaMortandad.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!tiempo.matches("[-0-9.,]+") || !tasaNatalidad.matches("[-0-9.,]+") || !tasaMortandad.matches("[-0-9.,]+") || !poblacion.matches("[-0-9.,]+")) {
                    JOptionPane.showMessageDialog(null, "Error en los datos ingresados", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(tiempo) <= 0) {
                    JOptionPane.showMessageDialog(null, "El año debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!tiempo.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "El año debe ser entero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(tasaNatalidad) <= 0) {
                    JOptionPane.showMessageDialog(null, "La tasa de natalidad debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(tasaMortandad) <= 0) {
                    JOptionPane.showMessageDialog(null, "La tasa de mortandad debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(poblacion) <= 0) {
                    JOptionPane.showMessageDialog(null, "La población debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!poblacion.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "La población debe ser entera", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(tiempo) <= 2012) {
                    JOptionPane.showMessageDialog(null, "El año debe ser mayor al 2012", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    long T = Long.parseLong(tiempo);
                    double TN = Double.parseDouble(tasaNatalidad) / 1000;
                    double TM = Double.parseDouble(tasaMortandad) / 1000;
                    double PBol = Double.parseDouble(poblacion);
                    long CT = 2012;

                    long NAC;
                    long MUE;

                    int i=0;

                    String[] columnNames = {"CT", "Nacimientos", "Muertes", "PBol"};
                    Object[][] data = new Object[(int) (T-CT)][4];

                    do {
                        CT += 1;
                        NAC = Math.round(PBol * TN);
                        MUE = Math.round(PBol * TM);
                        PBol = PBol + NAC - MUE;
                        data[(int) CT-2013] = new Object[]{CT, NAC, MUE, String.format("%d", (long) PBol)}; // Formatear PBol como un entero sin notación científica
                        System.out.println(PBol);
                    } while (CT < T);

                    table = new JTable(data, columnNames);
                    table.setPreferredScrollableViewportSize(new Dimension(515, 256));
                    table.setFillsViewportHeight(true);

                    spResultadosSimulaciones.setViewportView(table);

                    tfPBol_final.setText(String.format("%d", (long) PBol)); // Formatear y mostrar PBol como un entero sin notación científica
                }
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Limpiar campos de texto
                tfT.setText("");
                tfTasaNatalidad.setText("");
                tfTasaMortandad.setText("");
                tfPBol.setText("");

                // Limpiar datos de la tabla (excepto los encabezados)
                String[] columnNames = {"CT", "Nacimientos", "Muertes", "PBol"};
                Object[][] data = {}; // No hay datos inicialmente
                table = new JTable(data, columnNames);
                table.setPreferredScrollableViewportSize(new Dimension(578, 294));
                table.setFillsViewportHeight(true);

                // Establecer la tabla como la vista del JScrollPane
                spResultadosSimulaciones.setViewportView(table);

                // Limpiar población final de Bolivia
                tfPBol_final.setText("");
            }
        });
    }
}
