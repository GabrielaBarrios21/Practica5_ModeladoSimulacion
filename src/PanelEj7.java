import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelEj7 extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField numSim;
    private JTextField tfNumMaxDia;
    private JTable table; // Agregar la variable para la tabla
    private JTextField tfPrecioHuevo;
    private JTextField tfPrecioPolllo;
    private JTextField tfMediaCantHuevo;
    private JTextField tfProbRoto;
    private JTextField tfProbPollo;
    private JTextField tfProbHuevo;
    private JTextField tfProbMuere;
    private JTextField tfProbVive;
    private JTextField tfGN_promedio;
    private JTextField tfGNP_promedio;
    private JTextField tfTHR_promedio;
    private JTextField tfTPO_promedio;
    private JTextField tfTHUE_promedio;

    /**
     * Create the panel.
     */
    public PanelEj7() {
        setBackground(new Color(204, 255, 255));
        setLayout(null);
        JLabel lblTitulo = new JLabel("Gallina");
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
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PanelEj7.this);
                frame.getContentPane().remove(PanelEj7.this);
                frame.getContentPane().add(panerlprincipal);
                panerlprincipal.setVisible(true);
                frame.revalidate();
                frame.repaint();
            }
        });
        add(btnAtras);

        JLabel lblSimulaciones = new JLabel("Número de simulaciones:");
        lblSimulaciones.setBounds(24, 86, 187, 37);
        add(lblSimulaciones);

        numSim = new JTextField();
        numSim.setBounds(221, 89, 134, 31);
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
        String[] columnNames = {"NSIM", "GN", "GNP", "THR", "PVIV", "THUE"};
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

        JLabel lblNMD = new JLabel("Número máximo de días (NMD):");
        lblNMD.setBounds(25, 177, 200, 14);
        add(lblNMD);

        tfNumMaxDia = new JTextField();
        tfNumMaxDia.setBounds(235, 174, 120, 20);
        add(tfNumMaxDia);
        tfNumMaxDia.setColumns(10);

        JLabel lblPrecioUnitarioPor = new JLabel("Precio unitario por huevo (PUH):");
        lblPrecioUnitarioPor.setBounds(24, 202, 200, 14);
        add(lblPrecioUnitarioPor);

        tfPrecioHuevo = new JTextField();
        tfPrecioHuevo.setColumns(10);
        tfPrecioHuevo.setBounds(235, 199, 120, 20);
        add(tfPrecioHuevo);

        JLabel lblPrecioPollo = new JLabel("Precio unitario por pollo (PUP):");
        lblPrecioPollo.setBounds(24, 229, 200, 14);
        add(lblPrecioPollo);

        tfPrecioPolllo = new JTextField();
        tfPrecioPolllo.setColumns(10);
        tfPrecioPolllo.setBounds(235, 226, 120, 20);
        add(tfPrecioPolllo);

        JLabel lblHuevosPuestosPor = new JLabel("Huevos puestos por día (Dist. Poisson)");
        lblHuevosPuestosPor.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblHuevosPuestosPor.setBounds(24, 263, 259, 14);
        add(lblHuevosPuestosPor);

        JLabel tfMedia = new JLabel("Media:");
        tfMedia.setBounds(34, 288, 72, 14);
        add(tfMedia);

        tfMediaCantHuevo = new JTextField();
        tfMediaCantHuevo.setColumns(10);
        tfMediaCantHuevo.setBounds(103, 285, 120, 20);
        add(tfMediaCantHuevo);

        JLabel lblDestinoDeHuevo = new JLabel("Destino de huevo");
        lblDestinoDeHuevo.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblDestinoDeHuevo.setBounds(24, 313, 229, 14);
        add(lblDestinoDeHuevo);

        JLabel lblDestino = new JLabel("Destino");
        lblDestino.setHorizontalAlignment(SwingConstants.CENTER);
        lblDestino.setBounds(34, 338, 72, 14);
        add(lblDestino);

        JLabel lblProbabilidad = new JLabel("Probabilidad");
        lblProbabilidad.setHorizontalAlignment(SwingConstants.CENTER);
        lblProbabilidad.setBounds(34, 358, 72, 14);
        add(lblProbabilidad);

        tfProbRoto = new JTextField();
        tfProbRoto.setColumns(10);
        tfProbRoto.setBounds(116, 355, 72, 20);
        add(tfProbRoto);

        JLabel lblRoto = new JLabel("Roto");
        lblRoto.setHorizontalAlignment(SwingConstants.CENTER);
        lblRoto.setBounds(116, 338, 72, 14);
        add(lblRoto);

        tfProbPollo = new JTextField();
        tfProbPollo.setColumns(10);
        tfProbPollo.setBounds(192, 355, 72, 20);
        add(tfProbPollo);

        JLabel lblPollo = new JLabel("Pollo");
        lblPollo.setHorizontalAlignment(SwingConstants.CENTER);
        lblPollo.setBounds(192, 338, 72, 14);
        add(lblPollo);

        tfProbHuevo = new JTextField();
        tfProbHuevo.setColumns(10);
        tfProbHuevo.setBounds(268, 355, 72, 20);
        add(tfProbHuevo);

        JLabel lblHuevo = new JLabel("Huevo");
        lblHuevo.setHorizontalAlignment(SwingConstants.CENTER);
        lblHuevo.setBounds(268, 338, 72, 14);
        add(lblHuevo);

        JLabel lblDestinoDePollo = new JLabel("Destino de pollo");
        lblDestinoDePollo.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblDestinoDePollo.setBounds(24, 391, 229, 14);
        add(lblDestinoDePollo);

        JLabel lblDestino_1 = new JLabel("Destino");
        lblDestino_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblDestino_1.setBounds(34, 416, 72, 14);
        add(lblDestino_1);

        JLabel lblProbabilidad_1 = new JLabel("Probabilidad");
        lblProbabilidad_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblProbabilidad_1.setBounds(34, 436, 72, 14);
        add(lblProbabilidad_1);

        tfProbMuere = new JTextField();
        tfProbMuere.setColumns(10);
        tfProbMuere.setBounds(116, 433, 72, 20);
        add(tfProbMuere);

        JLabel lblRoto_1 = new JLabel("Muere");
        lblRoto_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblRoto_1.setBounds(116, 416, 72, 14);
        add(lblRoto_1);

        tfProbVive = new JTextField();
        tfProbVive.setColumns(10);
        tfProbVive.setBounds(192, 433, 72, 20);
        add(tfProbVive);

        JLabel lblPollo_1 = new JLabel("Vive");
        lblPollo_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblPollo_1.setBounds(192, 416, 72, 14);
        add(lblPollo_1);

        JLabel lblGananciaNetaPor = new JLabel("Ganancia neta (GN):");
        lblGananciaNetaPor.setBounds(455, 471, 200, 14);
        add(lblGananciaNetaPor);

        JLabel lblGananciaNetaPromedio = new JLabel("Ganancia neta promedio (GNP):");
        lblGananciaNetaPromedio.setBounds(455, 502, 200, 14);
        add(lblGananciaNetaPromedio);

        JLabel lblTotalPermanecenComo = new JLabel("Total huevos rotos (THR):");
        lblTotalPermanecenComo.setBounds(455, 537, 200, 14);
        add(lblTotalPermanecenComo);

        JLabel lblTotalPollostpo = new JLabel("Total pollos vivos vendidos (TVIV):");
        lblTotalPollostpo.setBounds(455, 571, 200, 14);
        add(lblTotalPollostpo);

        JLabel lblTotalPermanecenComo_1 = new JLabel("Total huevos vendidos(THUE):");
        lblTotalPermanecenComo_1.setBounds(455, 606, 207, 14);
        add(lblTotalPermanecenComo_1);

        tfGN_promedio = new JTextField();
        tfGN_promedio.setColumns(10);
        tfGN_promedio.setBounds(659, 468, 128, 20);
        add(tfGN_promedio);

        tfGNP_promedio = new JTextField();
        tfGNP_promedio.setColumns(10);
        tfGNP_promedio.setBounds(659, 499, 128, 20);
        add(tfGNP_promedio);

        tfTHR_promedio = new JTextField();
        tfTHR_promedio.setColumns(10);
        tfTHR_promedio.setBounds(659, 534, 128, 20);
        add(tfTHR_promedio);

        tfTPO_promedio = new JTextField();
        tfTPO_promedio.setColumns(10);
        tfTPO_promedio.setBounds(659, 568, 128, 20);
        add(tfTPO_promedio);

        tfTHUE_promedio = new JTextField();
        tfTHUE_promedio.setColumns(10);
        tfTHUE_promedio.setBounds(659, 603, 128, 20);
        add(tfTHUE_promedio);

        JLabel lblBs = new JLabel("Bs.");
        lblBs.setBounds(797, 471, 72, 14);
        add(lblBs);

        JLabel lblBs_1 = new JLabel("Bs.");
        lblBs_1.setBounds(797, 502, 72, 14);
        add(lblBs_1);

        JLabel lblBs_1_1 = new JLabel("huevos");
        lblBs_1_1.setBounds(797, 537, 72, 14);
        add(lblBs_1_1);

        JLabel lblBs_1_1_1 = new JLabel("pollos");
        lblBs_1_1_1.setBounds(797, 571, 72, 14);
        add(lblBs_1_1_1);

        JLabel lblBs_1_1_1_1 = new JLabel("huevos");
        lblBs_1_1_1_1.setBounds(797, 606, 72, 14);
        add(lblBs_1_1_1_1);

        btnSimular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String numeroSimulaciones = numSim.getText();
                String numMaxDias = tfNumMaxDia.getText();
                String precioHuevo = tfPrecioHuevo.getText();
                String precioPollo = tfPrecioPolllo.getText();
                String mediaHuevos = tfMediaCantHuevo.getText();
                String probRoto = tfProbRoto.getText();
                String probPollo = tfProbPollo.getText();
                String probHuevo = tfProbHuevo.getText();
                String probMuere = tfProbMuere.getText();
                String probVive = tfProbVive.getText();

                // Reemplazar comas por puntos para manejar números decimales correctamente
                numeroSimulaciones = numeroSimulaciones.replace(',', '.');
                numMaxDias = numMaxDias.replace(',', '.');
                precioHuevo = precioHuevo.replace(',', '.');
                precioPollo = precioPollo.replace(',', '.');
                mediaHuevos = mediaHuevos.replace(',', '.');
                probRoto = probRoto.replace(',', '.');
                probPollo = probPollo.replace(',', '.');
                probHuevo = probHuevo.replace(',', '.');
                probMuere = probMuere.replace(',', '.');
                probVive = probVive.replace(',', '.');

                // Realizar las validaciones
                if (numeroSimulaciones.isEmpty() || numMaxDias.isEmpty() || precioHuevo.isEmpty() || precioPollo.isEmpty() ||
                        mediaHuevos.isEmpty() || probRoto.isEmpty() || probPollo.isEmpty() || probHuevo.isEmpty() ||
                        probMuere.isEmpty() || probVive.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!numeroSimulaciones.matches("[-0-9.,]+") || !numMaxDias.matches("[-0-9.,]+") || !precioHuevo.matches("[-0-9.,]+") ||
                        !precioPollo.matches("[-0-9.,]+") || !mediaHuevos.matches("[-0-9.,]+") || !probRoto.matches("[-0-9.,]+") ||
                        !probPollo.matches("[-0-9.,]+") || !probHuevo.matches("[-0-9.,]+") || !probMuere.matches("[-0-9.,]+") ||
                        !probVive.matches("[-0-9.,]+")) {
                    JOptionPane.showMessageDialog(null, "Error en los datos ingresados", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(numeroSimulaciones) <= 0) {
                    JOptionPane.showMessageDialog(null, "El número de simulaciones debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!numeroSimulaciones.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "El número de simulaciones debe ser entero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(numMaxDias) <= 0) {
                    JOptionPane.showMessageDialog(null, "El número máximo de días debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!numMaxDias.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "El número máximo de días debe ser entero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(precioHuevo) <= 0) {
                    JOptionPane.showMessageDialog(null, "El precio unitario por huevo debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(precioPollo) <= 0) {
                    JOptionPane.showMessageDialog(null, "El precio unitario por pollo debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(mediaHuevos) <= 0) {
                    JOptionPane.showMessageDialog(null, "La media de huevos puestos por día debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(probRoto) < 0 || Double.parseDouble(probRoto) > 1 ||
                        Double.parseDouble(probPollo) < 0 || Double.parseDouble(probPollo) > 1 ||
                        Double.parseDouble(probHuevo) < 0 || Double.parseDouble(probHuevo) > 1 ||
                        Double.parseDouble(probMuere) < 0 || Double.parseDouble(probMuere) > 1 ||
                        Double.parseDouble(probVive) < 0 || Double.parseDouble(probVive) > 1) {
                    JOptionPane.showMessageDialog(null, "Las probabilidades deben estar entre 0 y 1", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(probPollo) + Double.parseDouble(probHuevo) + Double.parseDouble(probRoto) != 1) {
                    JOptionPane.showMessageDialog(null, "La suma de las probabilidades de pollo, huevo y roto debe ser igual a 1", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Double.parseDouble(probMuere) + Double.parseDouble(probVive) != 1) {
                    JOptionPane.showMessageDialog(null, "La suma de las probabilidades de muere y vive debe ser igual a 1", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    long numSim = Long.parseLong(numeroSimulaciones);
                    long NMD = Long.parseLong(numMaxDias);
                    double PUH = Double.parseDouble(precioHuevo);
                    double PUP = Double.parseDouble(precioPollo);
                    double mHuevos = Double.parseDouble(mediaHuevos);
                    //para las probs
                    double prob0 = poisson(mHuevos , 0);
                    double prob1 = poisson(mHuevos , 1);
                    double prob2 = poisson(mHuevos , 2);
                    double prob3 = poisson(mHuevos , 3);
                    double prob4 = poisson(mHuevos , 4);
                    double prob5 = poisson(mHuevos , 5);

                    double pRoto = Double.parseDouble(probRoto);
                    double pPollo = Double.parseDouble(probPollo);
                    double pHuevo = Double.parseDouble(probHuevo);

                    double pMuere = Double.parseDouble(probMuere);
                    double pVive = Double.parseDouble(probVive);

                    long NSIM = 0;
                    double sumaGN = 0;
                    double sumaGNP = 0;
                    double sumaTHR = 0;
                    double sumaPVIV = 0;
                    double sumaTHUE = 0;

                    // Limpiar contenido previo del JScrollPane
                    String[] columnNames = {"NSIM", "GN", "GNP", "THR", "TVIV", "THUE"};
                    Object[][] data = new Object[(int) numSim][6];

                    // Realizar la simulación y llenar los datos
                    do {
                        NSIM += 1;
                        long CD = 0;
                        long THR = 0;
                        long TPO = 0;
                        long THUE = 0;
                        long PMUE = 0;
                        long PVIV = 0;
                        double GN = 0;
                        double GNP = 0;

                        double r_hue;
                        int HUE = 0;

                        double r_DPO;

                        do {
                            CD += 1;
                            r_hue = Math.random();
                            if(r_hue>=0 && r_hue <= prob0){
                                HUE = 0;
                            } else if (r_hue<prob0 && r_hue<=(prob0 + prob1)){
                                HUE = 1;
                            } else if (r_hue<(prob0 + prob1) && r_hue<=(prob0 + prob1 + prob2)){
                                HUE = 2;
                            } else if (r_hue<(prob0 + prob1 + prob2) && r_hue<=(prob0 + prob1 + prob2 + prob3)){
                                HUE = 3;
                            } else if (r_hue<(prob0 + prob1 + prob2 + prob3) && r_hue<=(prob0 + prob1 + prob2 + prob3 + prob4)){
                                HUE = 4;
                            } else if (r_hue<(prob0 + prob1 + prob2 + prob3 + prob4) && r_hue<=(prob0 + prob1 + prob2 + prob3 + prob4 + prob5)){
                                HUE = 5;
                            } else {
                                HUE = 6;
                            }
                            while (HUE>0){
                                HUE -= 1;
                                r_hue = Math.random();
                                if(r_hue >= 0 && r_hue <= pRoto){
                                    THR += 1;
                                } else if (r_hue > pRoto && r_hue <= (pRoto + pPollo) ){
                                    TPO += 1;
                                    r_DPO = Math.random();
                                    if(r_DPO >= 0 && r_DPO <= pMuere){
                                        PMUE += 1;
                                    } else {
                                        PVIV += 1;
                                    }
                                } else {
                                    THUE += 1;
                                }
                            }
                        } while(CD < NMD);

                        GN = PUP*PVIV + PUH*THUE;
                        GNP = GN / NMD;
                        data[(int) (NSIM-1)] = new Object[]{NSIM, GN, GNP, THR, PVIV, THUE};
                        sumaGN += GN;
                        sumaGNP += GNP;
                        sumaTHR += THR;
                        sumaPVIV += PVIV;
                        sumaTHUE += THUE;


                    } while (NSIM < numSim);

                    // Crear la tabla con los datos y los encabezados
                    table = new JTable(data, columnNames);
                    table.setPreferredScrollableViewportSize(new Dimension(515, 256));
                    table.setFillsViewportHeight(true);

                    // Agregar la tabla al JScrollPane
                    spResultadosSimulaciones.setViewportView(table);

                    // Mostrar Promedios
                    tfGN_promedio.setText(String.valueOf(sumaGN / NSIM));
                    tfGNP_promedio.setText(String.valueOf(sumaGNP / NSIM));
                    tfTHR_promedio.setText(String.valueOf(sumaTHR / NSIM));
                    tfTPO_promedio.setText(String.valueOf(sumaPVIV / NSIM));
                    tfTHUE_promedio.setText(String.valueOf(sumaTHUE / NSIM));
                }
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numSim.setText("");
                tfNumMaxDia.setText("");
                tfPrecioHuevo.setText("");
                tfPrecioPolllo.setText("");
                tfMediaCantHuevo.setText("");
                tfProbRoto.setText("");
                tfProbPollo.setText("");
                tfProbHuevo.setText("");
                tfProbMuere.setText("");
                tfProbVive.setText("");
                tfGN_promedio.setText("");
                tfGNP_promedio.setText("");
                tfTHR_promedio.setText("");
                tfTPO_promedio.setText("");
                tfTHUE_promedio.setText("");

                // Limpiar datos de la tabla (excepto los encabezados)
                String[] columnNames = {"NSIM", "GN", "GNP", "THR", "PVIV", "THUE"};
                Object[][] data = {}; // No hay datos inicialmente
                table = new JTable(data, columnNames);
                table.setPreferredScrollableViewportSize(new Dimension(515, 256));
                table.setFillsViewportHeight(true);

                // Establecer la tabla como la vista del JScrollPane
                spResultadosSimulaciones.setViewportView(table);
            }
        });

    }
    // Función factorial
    public static long factorial(long n) {
        if (n == 0)
            return 1;
        long fact = 1;
        for (long i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Función de distribución de Poisson
    public static double poisson(double m, int x) {
        return (Math.exp(-m) * Math.pow(m, x)) / factorial(x);
    }
}
