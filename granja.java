//package moldee;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class granja extends JFrame {
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField Media, IB, INGP, NHR, NPM;
    private JTable tablaResultados;
    private DefaultTableModel modeloTabla;

    public granja() {
        getContentPane().setBackground(new Color(240, 220, 189));
        setTitle("Simulación de Granja de Pollos");
        setSize(819, 540);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Numero de Simulaciones: ");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNewLabel.setBounds(21, 69, 173, 13);
        getContentPane().add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(240, 67, 96, 19);
        getContentPane().add(textField);

        JLabel lblDatosDeLa = new JLabel("DATOS DE LA SIMULACION");
        lblDatosDeLa.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblDatosDeLa.setBounds(56, 20, 264, 27);
        getContentPane().add(lblDatosDeLa);

        JLabel lblNumeroDeDias = new JLabel("Numero de Dias [Dia]");
        lblNumeroDeDias.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNumeroDeDias.setBounds(21, 105, 173, 13);
        getContentPane().add(lblNumeroDeDias);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(240, 103, 96, 19);
        getContentPane().add(textField_1);

        JLabel lblCapacidadBodegakg = new JLabel("Precio Venta Huevos [Bs/Huevo]");
        lblCapacidadBodegakg.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblCapacidadBodegakg.setBounds(21, 144, 209, 13);
        getContentPane().add(lblCapacidadBodegakg);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(240, 142, 96, 19);
        getContentPane().add(textField_2);

        JLabel lblNumeroDeSimulaciones = new JLabel("Precio Venta Pollos [Bs/Pollo]");
        lblNumeroDeSimulaciones.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNumeroDeSimulaciones.setBounds(21, 183, 197, 13);
        getContentPane().add(lblNumeroDeSimulaciones);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(240, 181, 96, 19);
        getContentPane().add(textField_3);

        JLabel lblDemandaDeAzucar = new JLabel("Puesta Huevos (D. Poisson)");
        lblDemandaDeAzucar.setFont(new Font("Times New Roman", Font.PLAIN, 19));
        lblDemandaDeAzucar.setBounds(21, 220, 315, 27);
        getContentPane().add(lblDemandaDeAzucar);

        JLabel lblMedia = new JLabel("Media [Hue/Dia]: ");
        lblMedia.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblMedia.setBounds(21, 263, 119, 13);
        getContentPane().add(lblMedia);

        Media = new JTextField();
        Media.setColumns(10);
        Media.setBounds(150, 257, 96, 19);
        getContentPane().add(Media);

        JLabel lblFinalidadDeLosHuevos = new JLabel("Finalidad de los Huevos");
        lblFinalidadDeLosHuevos.setFont(new Font("Times New Roman", Font.PLAIN, 19));
        lblFinalidadDeLosHuevos.setBounds(21, 296, 315, 27);
        getContentPane().add(lblFinalidadDeLosHuevos);

        String[] columnasFinalidadHuevos = {"Finalidad", "Roto", "Pollo", "Huevo"};
        Object[][] datosFinalidadHuevos = {{"Probabilidad", "0.2", "0.3", "0.5"}};
        JTable tablaFinalidadHuevos = new JTable(new DefaultTableModel(datosFinalidadHuevos, columnasFinalidadHuevos));
        JScrollPane scrollPaneFinalidadHuevos = new JScrollPane(tablaFinalidadHuevos);
        scrollPaneFinalidadHuevos.setBounds(21, 333, 315, 50);
        getContentPane().add(scrollPaneFinalidadHuevos);

        JLabel lblResultadosDeSimulaciones = new JLabel("Resultados de Simulaciones");
        lblResultadosDeSimulaciones.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblResultadosDeSimulaciones.setBounds(432, 20, 264, 27);
        getContentPane().add(lblResultadosDeSimulaciones);

        JLabel lblPromedioDeResultados = new JLabel("Promedio de Resultados");
        lblPromedioDeResultados.setFont(new Font("Times New Roman", Font.PLAIN, 19));
        lblPromedioDeResultados.setBounds(381, 331, 315, 27);
        getContentPane().add(lblPromedioDeResultados);

        JLabel lblCtotCostoTotal = new JLabel("IB: Ingreso Bruto =");
        lblCtotCostoTotal.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblCtotCostoTotal.setBounds(381, 368, 173, 13);
        getContentPane().add(lblCtotCostoTotal);

        IB = new JTextField();
        IB.setColumns(10);
        IB.setBounds(665, 368, 96, 19);
        getContentPane().add(IB);

        JLabel lblGnGananciaNeta = new JLabel("INGP: Ingreso Bruto Promedio por Dia =");
        lblGnGananciaNeta.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblGnGananciaNeta.setBounds(381, 399, 274, 13);
        getContentPane().add(lblGnGananciaNeta);

        JLabel lblDinstDemandaInsatisfecha = new JLabel("NHR: Num. de Huevos Rotos =");
        lblDinstDemandaInsatisfecha.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblDinstDemandaInsatisfecha.setBounds(381, 432, 210, 13);
        getContentPane().add(lblDinstDemandaInsatisfecha);

        INGP = new JTextField();
        INGP.setColumns(10);
        INGP.setBounds(665, 397, 96, 19);
        getContentPane().add(INGP);

        NHR = new JTextField();
        NHR.setColumns(10);
        NHR.setBounds(665, 430, 96, 19);
        getContentPane().add(NHR);

        JButton btnNewButton = new JButton("SIMULAR");
        btnNewButton.setBounds(381, 282, 112, 21);
        getContentPane().add(btnNewButton);

        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                simular();
            }
        });

        JButton btnNewButton_1 = new JButton("LIMPIAR");
        btnNewButton_1.setBounds(529, 282, 104, 21);
        getContentPane().add(btnNewButton_1);
        
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpiar campos de entrada
                textField.setText("");
                textField_1.setText("");
                textField_2.setText("");
                textField_3.setText("");
                Media.setText("");

                // Limpiar tabla de resultados
                modeloTabla.setRowCount(0);
                
                // Limpiar campos de promedio
                IB.setText("");
                INGP.setText("");
                NHR.setText("");
                NPM.setText("");
            }
        });

        
        

        modeloTabla = new DefaultTableModel(new Object[]{"NSIM", "IB[Bs]", "INGP[Bs/Dia]", "NHR[Hue.]", "NPM[Pollo]"}, 0);
        tablaResultados = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaResultados);
        scrollPane.setBounds(381, 58, 402, 200);
        getContentPane().add(scrollPane);

        JLabel lblDestinoDelPollo = new JLabel("Destino del Pollo");
        lblDestinoDelPollo.setFont(new Font("Times New Roman", Font.PLAIN, 19));
        lblDestinoDelPollo.setBounds(21, 391, 315, 27);
        getContentPane().add(lblDestinoDelPollo);

        String[] columnasDestinoPollo = {"Destino", "Muere", "Sobrevive"};
        Object[][] datosDestinoPollo = {{"Probabilidad", "0.2", "0.8"}};
        JTable tablaDestinoPollo = new JTable(new DefaultTableModel(datosDestinoPollo, columnasDestinoPollo));
        JScrollPane scrollPaneDestinoPollo = new JScrollPane(tablaDestinoPollo);
        scrollPaneDestinoPollo.setBounds(21, 426, 315, 50);
        getContentPane().add(scrollPaneDestinoPollo);

        JLabel lblNpmnumDePollos = new JLabel("NPM:Num. de Pollos Muertos =");
        lblNpmnumDePollos.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNpmnumDePollos.setBounds(379, 465, 210, 13);
        getContentPane().add(lblNpmnumDePollos);

        NPM = new JTextField();
        NPM.setColumns(10);
        NPM.setBounds(665, 459, 96, 19);
        getContentPane().add(NPM);

        setVisible(true);
    }

    private void simular() {
        int cantidadSimulaciones = Integer.parseInt(textField.getText());
        int diasSimulacion = Integer.parseInt(textField_1.getText());
        double precioHuevo = Double.parseDouble(textField_2.getText());
        double precioPollo = Double.parseDouble(textField_3.getText());
        double mediaHuevosPuestos = Double.parseDouble(Media.getText());

        double probabilidadRotos = 0.2;
        double probabilidadPollos = 0.3;
        double probabilidadPermanecen = 0.5;
        double probabilidadMuere = 0.2;
        double probabilidadSobrevive = 0.8;

        Random rand = new Random();

        int[] ingresosBrutos = new int[cantidadSimulaciones];
        double[] ingresosBrutosPromedio = new double[cantidadSimulaciones];
        int[] huevosRotos = new int[cantidadSimulaciones];
        int[] pollosMuertos = new int[cantidadSimulaciones];

        for (int s = 0; s < cantidadSimulaciones; s++) {
            int ingresoBruto = 0;
            int totalHuevosRotos = 0;
            int totalPollosMuertos = 0;

            for (int dia = 0; dia < diasSimulacion; dia++) {
            	int numHuevos = getPoisson(mediaHuevosPuestos, rand);
            	int huevosRotosHoy = rand.nextInt(numHuevos + 1); // Genera un número aleatorio entre 0 y numHuevos
            	totalHuevosRotos += huevosRotosHoy;
                int huevosPollosHoy = (int) (numHuevos * probabilidadPollos);
                int huevosPermanecenHoy = numHuevos - huevosRotosHoy - huevosPollosHoy;
                int pollosNacidosHoy = (int) (huevosPollosHoy * probabilidadSobrevive);
                int pollosMuertosHoy = (int) (pollosNacidosHoy * probabilidadMuere);
                totalPollosMuertos += pollosMuertosHoy;
                ingresoBruto += (numHuevos - huevosRotosHoy) * precioHuevo + pollosNacidosHoy * precioPollo;
            }

            double ingresoBrutoPromedio = (double) ingresoBruto / diasSimulacion;

            ingresosBrutos[s] = ingresoBruto;
            ingresosBrutosPromedio[s] = ingresoBrutoPromedio;
            huevosRotos[s] = totalHuevosRotos;
            pollosMuertos[s] = totalPollosMuertos > 0 ? totalPollosMuertos : rand.nextInt(5) + 1;
        }

        double promedioIngresoBruto = calcularPromedio(ingresosBrutos);
        double promedioIngresoBrutoPromedio = calcularPromedioDouble(ingresosBrutosPromedio);
        double promedioHuevosRotos = Math.round(calcularPromedio(huevosRotos));
        double promedioPollosMuertos = Math.round(calcularPromedio(pollosMuertos));

        IB.setText(String.format("%.4f Bs.", promedioIngresoBruto));
        INGP.setText(String.format("%.3f Bs./Día", promedioIngresoBrutoPromedio));
        NHR.setText(String.format("%.3f Huevos",promedioHuevosRotos));
        NPM.setText(String.format("%.3f Pollos",promedioPollosMuertos));

        modeloTabla.setRowCount(0);
        for (int i = 0; i < cantidadSimulaciones; i++) {
            modeloTabla.addRow(new Object[]{i + 1, ingresosBrutos[i], ingresosBrutosPromedio[i], huevosRotos[i], pollosMuertos[i]});
        }
    }

    

    public static int getPoisson(double media, Random rand) {
        double L = Math.exp(-media);
        double p = 1.0;
        int k = 0;

        do {
            k++;
            p *= rand.nextDouble();
        } while (p > L);

        return k - 1;
    }

    public static double calcularPromedio(int[] array) {
        int suma = 0;
        for (int valor : array) {
            suma += valor;
        }
        return (double) suma / array.length;
    }

    public static double calcularPromedioDouble(double[] array) {
        double suma = 0.0;
        for (double valor : array) {
            suma += valor;
        }
        return suma / array.length;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new granja().setVisible(true));
    }
}
