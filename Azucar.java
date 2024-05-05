//package moldee;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Azucar extends JFrame {
    // Componentes de la interfaz
    private JTextField txtNMD, txtCB, txtCOR, txtCUI, txtCUA, txtPUV;
    private JButton btnSimular;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_12;
    private JTable tablaResultados;
    private DefaultTableModel modeloTabla;

    public Azucar() {
        getContentPane().setBackground(new Color(234, 215, 233));
        setTitle("Simulación de Inventario de Azúcar");
        setSize(819, 511);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configurando layout como null para mover los componentes libremente
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Numero de Simulaciones: ");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNewLabel.setBounds(21, 69, 173, 13);
        getContentPane().add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(224, 67, 96, 19);
        getContentPane().add(textField);
        textField.setColumns(10);

        JLabel lblDatosDeLa = new JLabel("DATOS DE LA SIMULACION");
        lblDatosDeLa.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblDatosDeLa.setBounds(56, 20, 264, 27);
        getContentPane().add(lblDatosDeLa);

        JLabel lblNumeroDeDias = new JLabel("Numero de Dias [Dia]");
        lblNumeroDeDias.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNumeroDeDias.setBounds(21, 105, 173, 13);
        getContentPane().add(lblNumeroDeDias);

        JLabel lblCapacidadBodegakg = new JLabel("Capacidad Bodega [Kg] ");
        lblCapacidadBodegakg.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblCapacidadBodegakg.setBounds(21, 144, 173, 13);
        getContentPane().add(lblCapacidadBodegakg);

        JLabel lblNumeroDeSimulaciones = new JLabel("Costo Unitario de Inv. [Bs/Kg]");
        lblNumeroDeSimulaciones.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNumeroDeSimulaciones.setBounds(21, 183, 197, 13);
        getContentPane().add(lblNumeroDeSimulaciones);

        JLabel lblCostoUnitarioDe = new JLabel("Costo Unitario de Venta [Bs/Kg]");
        lblCostoUnitarioDe.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblCostoUnitarioDe.setBounds(21, 206, 197, 45);
        getContentPane().add(lblCostoUnitarioDe);

        JLabel lblNewLabel_5 = new JLabel("Costo Unitario de Adq. [Bs/Kg]");
        lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNewLabel_5.setBounds(21, 261, 197, 13);
        getContentPane().add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("Costo Reorden [Bs/Orden]");
        lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNewLabel_6.setBounds(21, 299, 173, 13);
        getContentPane().add(lblNewLabel_6);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(224, 103, 96, 19);
        getContentPane().add(textField_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(224, 142, 96, 19);
        getContentPane().add(textField_2);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(224, 181, 96, 19);
        getContentPane().add(textField_3);

        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(224, 220, 96, 19);
        getContentPane().add(textField_4);

        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(224, 259, 96, 19);
        getContentPane().add(textField_5);

        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(224, 297, 96, 19);
        getContentPane().add(textField_6);

        JLabel lblDemandaDeAzucar = new JLabel("Demanda de Azucar ( D. Exponencial)");
        lblDemandaDeAzucar.setFont(new Font("Times New Roman", Font.PLAIN, 19));
        lblDemandaDeAzucar.setBounds(21, 331, 315, 27);
        getContentPane().add(lblDemandaDeAzucar);

        JLabel lblMedia = new JLabel("Media: ");
        lblMedia.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblMedia.setBounds(21, 368, 66, 13);
        getContentPane().add(lblMedia);

        textField_7 = new JTextField();
        textField_7.setColumns(10);
        textField_7.setBounds(98, 366, 96, 19);
        getContentPane().add(textField_7);

        JLabel lblTiempoDeEntrega = new JLabel("Tiempo de Entrega (D. Uniforme)");
        lblTiempoDeEntrega.setFont(new Font("Times New Roman", Font.PLAIN, 19));
        lblTiempoDeEntrega.setBounds(21, 391, 315, 27);
        getContentPane().add(lblTiempoDeEntrega);

        JLabel lblMin = new JLabel("Min: ");
        lblMin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblMin.setBounds(23, 428, 39, 13);
        getContentPane().add(lblMin);

        textField_8 = new JTextField();
        textField_8.setColumns(10);
        textField_8.setBounds(56, 426, 96, 19);
        getContentPane().add(textField_8);

        JLabel lblMax = new JLabel("Max: ");
        lblMax.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblMax.setBounds(162, 428, 48, 13);
        getContentPane().add(lblMax);

        textField_9 = new JTextField();
        textField_9.setColumns(10);
        textField_9.setBounds(205, 426, 96, 19);
        getContentPane().add(textField_9);

        JLabel lblResultadosDeSimulaciones = new JLabel("Resultados de Simulaciones");
        lblResultadosDeSimulaciones.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblResultadosDeSimulaciones.setBounds(432, 20, 264, 27);
        getContentPane().add(lblResultadosDeSimulaciones);

        JLabel lblPromedioDeResultados = new JLabel("Promedio de Resultados");
        lblPromedioDeResultados.setFont(new Font("Times New Roman", Font.PLAIN, 19));
        lblPromedioDeResultados.setBounds(381, 331, 315, 27);
        getContentPane().add(lblPromedioDeResultados);

        JLabel lblCtotCostoTotal = new JLabel("CTOT: Costo Total = ");
        lblCtotCostoTotal.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblCtotCostoTotal.setBounds(381, 368, 173, 13);
        getContentPane().add(lblCtotCostoTotal);

        textField_10 = new JTextField();
        textField_10.setColumns(10);
        textField_10.setBounds(599, 366, 96, 19);
        getContentPane().add(textField_10);

        JLabel lblGnGananciaNeta = new JLabel("GN: Ganancia Neta =");
        lblGnGananciaNeta.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblGnGananciaNeta.setBounds(381, 399, 173, 13);
        getContentPane().add(lblGnGananciaNeta);

        JLabel lblDinstDemandaInsatisfecha = new JLabel("DINST: Demanda Insatisfecha = ");
        lblDinstDemandaInsatisfecha.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblDinstDemandaInsatisfecha.setBounds(379, 428, 210, 13);
        getContentPane().add(lblDinstDemandaInsatisfecha);

        textField_11 = new JTextField();
        textField_11.setColumns(10);
        textField_11.setBounds(599, 397, 96, 19);
        getContentPane().add(textField_11);

        textField_12 = new JTextField();
        textField_12.setColumns(10);
        textField_12.setBounds(599, 426, 96, 19);
        getContentPane().add(textField_12);

     // Configurando la tabla y el modelo de tabla
        modeloTabla = new DefaultTableModel(new Object[]{"NSIM", "CTOT", "GN", "DINST"}, 0);

        btnSimular = new JButton("Simular");

        // Evento del botón para iniciar la simulación
        btnSimular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                simular();
            }
        });
     // Agregar el botón a la interfaz
        btnSimular.setBounds(438, 282, 85, 21);
        getContentPane().add(btnSimular);

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(548, 282, 85, 21);
        getContentPane().add(btnLimpiar);

        // ActionListener para el botón de limpiar
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });
        
        
        
        // Agregando la tabla de resultados
        modeloTabla = new DefaultTableModel(new Object[]{"NSIM", "CTOT", "GN", "DINST"}, 0);
        tablaResultados = new JTable(modeloTabla);
        JScrollPane scrollPane1 = new JScrollPane(tablaResultados);
        scrollPane1.setBounds(381, 58, 402, 200);
        getContentPane().add(scrollPane1);

        btnSimular = new JButton("Simular");

        // Evento del botón para iniciar la simulación
        btnSimular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                simular();
            }
        });

    }

    private void addComponent(JPanel panel, JComponent comp, int x, int y, int width, int height) {
    }

    private void simular() {
        // Obtener los valores ingresados por el usuario
        int SIMULACIONES = Integer.parseInt(textField.getText());
        int DIAS_SIMULACION = Integer.parseInt(textField_1.getText());
        double capacidadBodega = Double.parseDouble(textField_2.getText());
        double costoUnitarioInventario = Double.parseDouble(textField_3.getText());
        double costoUnitarioVenta = Double.parseDouble(textField_4.getText());
        double costoUnitarioAdquisicion = Double.parseDouble(textField_5.getText());
        double costoReorden = Double.parseDouble(textField_6.getText());
        double mediaDemanda = Double.parseDouble(textField_7.getText());
        int minTiempoEntrega = Integer.parseInt(textField_8.getText());
        int maxTiempoEntrega = Integer.parseInt(textField_9.getText());

        // Variables para almacenar los resultados de las simulaciones
        double[] costosTotales = new double[SIMULACIONES];
        double[] gananciasNetas = new double[SIMULACIONES];
        double[] demandasInsatisfechas = new double[SIMULACIONES];

        // Realizar las simulaciones
        for (int i = 0; i < SIMULACIONES; i++) {
            // Inicializar variables para esta simulación
            double costoTotal = 0;
            double gananciaNeta = 0;
            double demandaInsatisfecha = 0;
            double inventario = capacidadBodega; // Capacidad inicial de la bodega
            Random random = new Random();

            // Simular el comportamiento del inventario durante DIAS_SIMULACION días
            for (int dia = 1; dia <= DIAS_SIMULACION; dia++) {
                // Generar la demanda del día
                double demanda = generarDemanda(mediaDemanda);

                // Verificar si se puede satisfacer la demanda
                if (demanda <= inventario) {
                    inventario -= demanda; // Satisfacer la demanda
                    gananciaNeta += (costoUnitarioVenta - costoUnitarioAdquisicion) * demanda; // Ganancia por venta
                } else {
                    double demandaInsatisfechaParcial = demanda - inventario; // Demanda insatisfecha parcial
                    demandaInsatisfecha += demandaInsatisfechaParcial; // Actualizar la demanda insatisfecha
                    gananciaNeta += (costoUnitarioVenta - costoUnitarioAdquisicion) * inventario; // Ganancia por venta de lo disponible
                    inventario = 0; // La bodega queda vacía
                }

                // Realizar el pedido si es necesario
                if (dia % 7 == 0) {
                    double cantidadAOrdenar = capacidadBodega - inventario; // Cantidad a ordenar para llenar la bodega
                    costoTotal += costoReorden; // Costo de ordenar
                    inventario += cantidadAOrdenar; // Recibir el pedido
                }

                // Actualizar el inventario al final del día (considerando la entrega)
                int diasEntrega = random.nextInt(maxTiempoEntrega - minTiempoEntrega + 1) + minTiempoEntrega; // Entre min y max días de entrega
                inventario += generarDemanda(mediaDemanda) * diasEntrega; // Recibir azúcar durante la entrega
            }

            // Calcular costo total al final de la simulación
            costoTotal += costoUnitarioInventario * inventario; // Costo de llevar el inventario
            costosTotales[i] = costoTotal;
            gananciasNetas[i] = gananciaNeta;
            demandasInsatisfechas[i] = demandaInsatisfecha;
        }

        // Mostrar los resultados en la tabla
        mostrarResultados(costosTotales, gananciasNetas, demandasInsatisfechas);

        // Calcular y mostrar los promedios de las variables de simulación
        double promedioCostoTotal = calcularPromedio(costosTotales);
        double promedioGananciaNeta = calcularPromedio(gananciasNetas);
        double promedioDemandaInsatisfecha = calcularPromedio(demandasInsatisfechas);
        mostrarPromedios(promedioCostoTotal, promedioGananciaNeta, promedioDemandaInsatisfecha);

        // Calcular la capacidad de la bodega necesaria para maximizar la ganancia neta
        double capacidadOptima = calcularCapacidadOptima(promedioGananciaNeta);
        calcularCapacidadOptima(capacidadOptima);
    }


    // Método para generar la demanda diaria (distribución exponencial con media)
    private double generarDemanda(double mediaDemanda) {
        Random random = new Random();
        return -mediaDemanda * Math.log(1 - random.nextDouble()); // Inversa de la distribución exponencial
    }

 // Método para calcular el promedio de un arreglo de números
    private double calcularPromedio(double[] arreglo) {
        double suma = 0;
        for (double valor : arreglo) {
            suma += valor;
        }
        return suma / arreglo.length;
    }

    /// Método para mostrar los resultados en la tabla
    private void mostrarResultados(double[] costosTotales, double[] gananciasNetas, double[] demandasInsatisfechas) {
        // Limpiar la tabla
        modeloTabla.setRowCount(0);

        // Llenar la tabla con los resultados de las simulaciones
        for (int i = 0; i < costosTotales.length; i++) {
            modeloTabla.addRow(new Object[]{i + 1, costosTotales[i], gananciasNetas[i], demandasInsatisfechas[i]});
        }
    }

 // Método para mostrar los promedios de las variables de simulación
    private void mostrarPromedios(double promedioCostoTotal, double promedioGananciaNeta, double promedioDemandaInsatisfecha) {
        // Mostrar los promedios en los JTextField correspondientes
        textField_10.setText(String.format("%.2f", promedioCostoTotal));
        textField_11.setText(String.format("%.2f", promedioGananciaNeta));
        textField_12.setText(String.format("%.2f", promedioDemandaInsatisfecha));
    }

    // Método para calcular la capacidad óptima de la bodega en función a la máxima ganancia neta
    private double calcularCapacidadOptima(double promedioGananciaNeta) {
        // La capacidad óptima se alcanza cuando el inventario medio es igual a la demanda media
        // El inventario medio es igual a la capacidad de la bodega dividida por 2
        // Por lo tanto, la capacidad óptima es igual al doble de la demanda media
        // La demanda media es igual a la ganancia neta media dividida por el precio de venta (5 Bs/Kg)
        double demandaMedia = promedioGananciaNeta / 5;
        return 2 * demandaMedia;
    }
    
    private void limpiarCampos() {
        textField.setText("");
        textField_1.setText("");
        textField_2.setText("");
        textField_3.setText("");
        textField_4.setText("");
        textField_5.setText("");
        textField_6.setText("");
        textField_7.setText("");
        textField_8.setText("");
        textField_9.setText("");
        textField_10.setText("");
        textField_11.setText("");
        textField_12.setText("");
        modeloTabla.setRowCount(0); // Limpiar la tabla de resultados
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new Azucar().setVisible(true));
    }
}
