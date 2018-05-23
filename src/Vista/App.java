/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author mac
 */
public class App extends javax.swing.JFrame {

    Controlador.Metodos me = new Controlador.Metodos();
    DefaultListModel modeloLista;
    DefaultListModel modeloLista2;
    DefaultListModel modeloLista3;
    DefaultListModel modeloLista4;
    DefaultListModel modeloLista5;
    DefaultListModel modeloLista6;
    DefaultListModel modeloLista7;

    /**
     * Creates new form App
     */
    public App(String a, String b, String c) {
        initComponents();

        Calendar fecha = new GregorianCalendar();

        int anio = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int nombreDia = fecha.get(Calendar.DAY_OF_WEEK);
        switch (nombreDia) {

            case 1:
                etqFecha.setText("Domingo " + dia);
                switch (mes) {
                    case 0:
                        etqFecha.setText(etqFecha.getText()+" de Enero de "+ anio);
                        break;

                    case 1:
                         etqFecha.setText(etqFecha.getText()+" de Febrero de "+ anio);
                        break;

                    case 2:
                         etqFecha.setText(etqFecha.getText()+" de Marzo de "+ anio);
                        break;

                    case 3:
                         etqFecha.setText(etqFecha.getText()+" de Abril de "+ anio);
                        break;

                    case 4:
                         etqFecha.setText(etqFecha.getText()+" de Mayo de "+ anio);
                        break;

                    case 5:
                         etqFecha.setText(etqFecha.getText()+" de Junio de "+ anio);
                        break;

                    case 6:
                         etqFecha.setText(etqFecha.getText()+" de Julio de "+ anio);
                        break;

                    case 7:
                         etqFecha.setText(etqFecha.getText()+" de Agosto de "+ anio);
                        break;

                    case 8:
                         etqFecha.setText(etqFecha.getText()+" de Septiembre de "+ anio);
                        break;

                    case 9:
                         etqFecha.setText(etqFecha.getText()+" de Octubre de "+ anio);
                        break;

                    case 10:
                         etqFecha.setText(etqFecha.getText()+" de Noviembre de "+ anio);
                        break;
                    case 11:
                         etqFecha.setText(etqFecha.getText()+" de Diciembre de "+ anio);
                        break;

                }
                break;
            case 2:
                etqFecha.setText("Lunes " + dia);
                switch (mes) {
                    case 0:
                        etqFecha.setText(etqFecha.getText()+" de Enero de "+ anio);
                        break;

                    case 1:
                         etqFecha.setText(etqFecha.getText()+" de Febrero de "+ anio);
                        break;

                    case 2:
                         etqFecha.setText(etqFecha.getText()+" de Marzo de "+ anio);
                        break;

                    case 3:
                         etqFecha.setText(etqFecha.getText()+" de Abril de "+ anio);
                        break;

                    case 4:
                         etqFecha.setText(etqFecha.getText()+" de Mayo de "+ anio);
                        break;

                    case 5:
                         etqFecha.setText(etqFecha.getText()+" de Junio de "+ anio);
                        break;

                    case 6:
                         etqFecha.setText(etqFecha.getText()+" de Julio de "+ anio);
                        break;

                    case 7:
                         etqFecha.setText(etqFecha.getText()+" de Agosto de "+ anio);
                        break;

                    case 8:
                         etqFecha.setText(etqFecha.getText()+" de Septiembre de "+ anio);
                        break;

                    case 9:
                         etqFecha.setText(etqFecha.getText()+" de Octubre de "+ anio);
                        break;

                    case 10:
                         etqFecha.setText(etqFecha.getText()+" de Noviembre de "+ anio);
                        break;
                    case 11:
                         etqFecha.setText(etqFecha.getText()+" de Diciembre de "+ anio);
                        break;

                }
                break;
            case 4:
                etqFecha.setText("Miercoles " + dia);
                switch (mes) {
                    case 0:
                        etqFecha.setText(etqFecha.getText()+" de Enero de "+ anio);
                        break;

                    case 1:
                         etqFecha.setText(etqFecha.getText()+" de Febrero de "+ anio);
                        break;

                    case 2:
                         etqFecha.setText(etqFecha.getText()+" de Marzo de "+ anio);
                        break;

                    case 3:
                         etqFecha.setText(etqFecha.getText()+" de Abril de "+ anio);
                        break;

                    case 4:
                         etqFecha.setText(etqFecha.getText()+" de Mayo de "+ anio);
                        break;

                    case 5:
                         etqFecha.setText(etqFecha.getText()+" de Junio de "+ anio);
                        break;

                    case 6:
                         etqFecha.setText(etqFecha.getText()+" de Julio de "+ anio);
                        break;

                    case 7:
                         etqFecha.setText(etqFecha.getText()+" de Agosto de "+ anio);
                        break;

                    case 8:
                         etqFecha.setText(etqFecha.getText()+" de Septiembre de "+ anio);
                        break;

                    case 9:
                         etqFecha.setText(etqFecha.getText()+" de Octubre de "+ anio);
                        break;

                    case 10:
                         etqFecha.setText(etqFecha.getText()+" de Noviembre de "+ anio);
                        break;
                    case 11:
                         etqFecha.setText(etqFecha.getText()+" de Diciembre de "+ anio);
                        break;

                }
                
                break;
            case 5:
                etqFecha.setText("Jueves " + dia);
                switch (mes) {
                    case 0:
                        etqFecha.setText(etqFecha.getText()+" de Enero de "+ anio);
                        break;

                    case 1:
                         etqFecha.setText(etqFecha.getText()+" de Febrero de "+ anio);
                        break;

                    case 2:
                         etqFecha.setText(etqFecha.getText()+" de Marzo de "+ anio);
                        break;

                    case 3:
                         etqFecha.setText(etqFecha.getText()+" de Abril de "+ anio);
                        break;

                    case 4:
                         etqFecha.setText(etqFecha.getText()+" de Mayo de "+ anio);
                        break;

                    case 5:
                         etqFecha.setText(etqFecha.getText()+" de Junio de "+ anio);
                        break;

                    case 6:
                         etqFecha.setText(etqFecha.getText()+" de Julio de "+ anio);
                        break;

                    case 7:
                         etqFecha.setText(etqFecha.getText()+" de Agosto de "+ anio);
                        break;

                    case 8:
                         etqFecha.setText(etqFecha.getText()+" de Septiembre de "+ anio);
                        break;

                    case 9:
                         etqFecha.setText(etqFecha.getText()+" de Octubre de "+ anio);
                        break;

                    case 10:
                         etqFecha.setText(etqFecha.getText()+" de Noviembre de "+ anio);
                        break;
                    case 11:
                         etqFecha.setText(etqFecha.getText()+" de Diciembre de "+ anio);
                        break;

                }
                break;
            case 6:
                etqFecha.setText("Viernes " + dia);
                switch (mes) {
                    case 0:
                        etqFecha.setText(etqFecha.getText()+" de Enero de "+ anio);
                        break;

                    case 1:
                         etqFecha.setText(etqFecha.getText()+" de Febrero de "+ anio);
                        break;

                    case 2:
                         etqFecha.setText(etqFecha.getText()+" de Marzo de "+ anio);
                        break;

                    case 3:
                         etqFecha.setText(etqFecha.getText()+" de Abril de "+ anio);
                        break;

                    case 4:
                         etqFecha.setText(etqFecha.getText()+" de Mayo de "+ anio);
                        break;

                    case 5:
                         etqFecha.setText(etqFecha.getText()+" de Junio de "+ anio);
                        break;

                    case 6:
                         etqFecha.setText(etqFecha.getText()+" de Julio de "+ anio);
                        break;

                    case 7:
                         etqFecha.setText(etqFecha.getText()+" de Agosto de "+ anio);
                        break;

                    case 8:
                         etqFecha.setText(etqFecha.getText()+" de Septiembre de "+ anio);
                        break;

                    case 9:
                         etqFecha.setText(etqFecha.getText()+" de Octubre de "+ anio);
                        break;

                    case 10:
                         etqFecha.setText(etqFecha.getText()+" de Noviembre de "+ anio);
                        break;
                    case 11:
                         etqFecha.setText(etqFecha.getText()+" de Diciembre de "+ anio);
                        break;

                }
                break;
            case 7:
                etqFecha.setText("Sabado " + dia);
                switch (mes) {
                    case 0:
                        etqFecha.setText(etqFecha.getText()+" de Enero de "+ anio);
                        break;

                    case 1:
                         etqFecha.setText(etqFecha.getText()+" de Febrero de "+ anio);
                        break;

                    case 2:
                         etqFecha.setText(etqFecha.getText()+" de Marzo de "+ anio);
                        break;

                    case 3:
                         etqFecha.setText(etqFecha.getText()+" de Abril de "+ anio);
                        break;

                    case 4:
                         etqFecha.setText(etqFecha.getText()+" de Mayo de "+ anio);
                        break;

                    case 5:
                         etqFecha.setText(etqFecha.getText()+" de Junio de "+ anio);
                        break;

                    case 6:
                         etqFecha.setText(etqFecha.getText()+" de Julio de "+ anio);
                        break;

                    case 7:
                         etqFecha.setText(etqFecha.getText()+" de Agosto de "+ anio);
                        break;

                    case 8:
                         etqFecha.setText(etqFecha.getText()+" de Septiembre de "+ anio);
                        break;

                    case 9:
                         etqFecha.setText(etqFecha.getText()+" de Octubre de "+ anio);
                        break;

                    case 10:
                         etqFecha.setText(etqFecha.getText()+" de Noviembre de "+ anio);
                        break;
                    case 11:
                         etqFecha.setText(etqFecha.getText()+" de Diciembre de "+ anio);
                        break;

                }
                break;
            case 3:
                etqFecha.setText("Martes " + dia);
                switch (mes) {
                    case 0:
                        etqFecha.setText(etqFecha.getText()+" de Enero de "+ anio);
                        break;

                    case 1:
                         etqFecha.setText(etqFecha.getText()+" de Febrero de "+ anio);
                        break;

                    case 2:
                         etqFecha.setText(etqFecha.getText()+" de Marzo de "+ anio);
                        break;

                    case 3:
                         etqFecha.setText(etqFecha.getText()+" de Abril de "+ anio);
                        break;

                    case 4:
                         etqFecha.setText(etqFecha.getText()+" de Mayo de "+ anio);
                        break;

                    case 5:
                         etqFecha.setText(etqFecha.getText()+" de Junio de "+ anio);
                        break;

                    case 6:
                         etqFecha.setText(etqFecha.getText()+" de Julio de "+ anio);
                        break;

                    case 7:
                         etqFecha.setText(etqFecha.getText()+" de Agosto de "+ anio);
                        break;

                    case 8:
                         etqFecha.setText(etqFecha.getText()+" de Septiembre de "+ anio);
                        break;

                    case 9:
                         etqFecha.setText(etqFecha.getText()+" de Octubre de "+ anio);
                        break;

                    case 10:
                         etqFecha.setText(etqFecha.getText()+" de Noviembre de "+ anio);
                        break;
                    case 11:
                         etqFecha.setText(etqFecha.getText()+" de Diciembre de "+ anio);
                        break;

                }
                
                break;

        }
        me.inicializar();
        btnRealizarVenta.setEnabled(false);

        modeloLista = new DefaultListModel();
        listaProductos.setModel(modeloLista);

        modeloLista2 = new DefaultListModel();
        listaPersonal.setModel(modeloLista2);

        modeloLista3 = new DefaultListModel();
        verPV.setModel(modeloLista3);

        modeloLista4 = new DefaultListModel();
        pedido.setModel(modeloLista4);

        modeloLista5 = new DefaultListModel();
        listaEgresos.setModel(modeloLista5);
        
        modeloLista6 = new DefaultListModel();
        meserosVenta.setModel(modeloLista6);
        
       

        btnAgregarProducto.setEnabled(false);
        btnModProducto.setEnabled(false);
        btnRegistrarPersonal.setEnabled(false);
        btnModPersonal.setEnabled(false);

        btnAgregarCuenta.setEnabled(false);
        productoPrecio.setEnabled(false);

        btnModificarSub.setEnabled(false);
        btnEliminarSub.setEnabled(false);
        cantidadProducto2.setEnabled(false);
        precioProducto2.setEnabled(false);
        notaProducto2.setEnabled(false);

        me.adminUsuario = a;
        me.adminNombre = b;
        me.adminContrasena = c;

        userAdmin.setText("" + me.adminNombre);
        adNombre.setText("" + me.adminNombre);
        adUsuario.setText("" + me.adminUsuario);
        adContrasena.setText("" + me.adminContrasena);

        btnModificarAdmin.setEnabled(false);

        me.mostrarEgresos(listaEgresos);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        categoria = new javax.swing.ButtonGroup();
        sexo = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaPersonal1 = new javax.swing.JList();
        buscadorPersonal1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelVentas = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        ventaCliente = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        ventaTelefono = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        ventaDomicilio = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        ventaReferencia = new javax.swing.JTextField();
        total = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        verPV = new javax.swing.JList();
        buscadorProductos1 = new javax.swing.JTextField();
        productoNombre = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cantidadProducto = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        productoPrecio = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        notaProducto = new javax.swing.JTextField();
        btnAgregarCuenta = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        pedido = new javax.swing.JList();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        cantidadProducto2 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        notaProducto2 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        precioProducto2 = new javax.swing.JTextField();
        btnEliminarSub = new javax.swing.JButton();
        btnModificarSub = new javax.swing.JButton();
        btnRealizarVenta = new javax.swing.JButton();
        productoNombre1 = new javax.swing.JLabel();
        btnLimpiarVenta = new javax.swing.JButton();
        panelProductos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        agreDesProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        agrePreProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JButton();
        agreNomProducto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        buscadorProductos = new javax.swing.JTextField();
        btnEliminarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProductos = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        modNomProducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        modPreProducto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        modDesProducto = new javax.swing.JTextField();
        btnModProducto = new javax.swing.JButton();
        productoC = new javax.swing.JRadioButton();
        productoP = new javax.swing.JRadioButton();
        mensajeAPro2 = new javax.swing.JLabel();
        mensajeAPro = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelPersonal = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        agreNombrePersonal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        agreDirPersonal = new javax.swing.JTextField();
        agreHombrePersonal = new javax.swing.JRadioButton();
        agreMujerPersonal = new javax.swing.JRadioButton();
        agreActivoPersonal = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        agreUsuarioPersonal = new javax.swing.JTextField();
        agreContraPersonal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnRegistrarPersonal = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        mensajeAPer = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        buscadorPersonal = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPersonal = new javax.swing.JList();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        agreUsuarioPersonal1 = new javax.swing.JTextField();
        agreNombrePersonal1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        agreContraPersonal1 = new javax.swing.JTextField();
        agreHombrePersonal1 = new javax.swing.JRadioButton();
        agreMujerPersonal1 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        estado2 = new javax.swing.JCheckBox();
        btnModPersonal = new javax.swing.JButton();
        agreDirPersonal1 = new javax.swing.JTextField();
        mensajeAPer1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        panelConfiguraciones = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        userAdmin = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        adNombre = new javax.swing.JTextField();
        adUsuario = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        adContrasena = new javax.swing.JTextField();
        lbel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnModificarAdmin = new javax.swing.JButton();
        textoConfig = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        etqFecha = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        totalDia = new javax.swing.JLabel();
        totalCafe = new javax.swing.JLabel();
        totalPizza = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane6 = new javax.swing.JScrollPane();
        meserosVenta = new javax.swing.JList();
        buscadorPersonal2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        mVenta = new javax.swing.JLabel();
        mCafe = new javax.swing.JLabel();
        mPizza = new javax.swing.JLabel();
        mTotal = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        caja = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        totalEgresos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        desEgreso = new javax.swing.JTextField();
        totEgreso = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        listaEgresos = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();

        listaPersonal1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaPersonal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPersonal1MouseClicked(evt);
            }
        });
        listaPersonal1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                listaPersonal1KeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(listaPersonal1);

        buscadorPersonal1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorPersonal1KeyReleased(evt);
            }
        });

        jButton4.setText("ELIMINAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel21.setText("REALIZAR VENTA");

        jLabel26.setText("CLIENTE:");

        ventaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ventaClienteKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ventaClienteKeyReleased(evt);
            }
        });

        jLabel27.setText("TEL:");

        ventaTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ventaTelefonoKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ventaTelefonoKeyReleased(evt);
            }
        });

        jLabel28.setText("DOMICILIO:");

        ventaDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ventaDomicilioKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ventaDomicilioKeyReleased(evt);
            }
        });

        jCheckBox1.setText("PAGADO");

        jLabel29.setText("REFERENCIA");

        ventaReferencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ventaReferenciaKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ventaReferenciaKeyReleased(evt);
            }
        });

        total.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total.setText("$0000.00");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("T O T A L");

        jCheckBox2.setText("COMER AQUI");

        verPV.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        verPV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verPVMouseClicked(evt);
            }
        });
        verPV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                verPVKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(verPV);

        buscadorProductos1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorProductos1KeyReleased(evt);
            }
        });

        productoNombre.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        productoNombre.setText("- - - - - - -");

        jLabel30.setText("CANTIDAD:");

        cantidadProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadProductoKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantidadProductoKeyReleased(evt);
            }
        });

        jLabel31.setText("P/UNITARIO:");

        jLabel32.setText("NOTA:");

        notaProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                notaProductoKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                notaProductoKeyReleased(evt);
            }
        });

        btnAgregarCuenta.setText("AGREGAR A LA CUENTA");
        btnAgregarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCuentaActionPerformed(evt);
            }
        });

        pedido.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        pedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pedidoMouseClicked(evt);
            }
        });
        pedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pedidoKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(pedido);

        jLabel33.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel33.setText("PEDIDO");

        jLabel34.setText("CANTIDAD:");

        cantidadProducto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadProducto2KeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantidadProducto2KeyReleased(evt);
            }
        });

        jLabel35.setText("NOTA:");

        notaProducto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                notaProducto2KeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                notaProducto2KeyReleased(evt);
            }
        });

        jLabel36.setText("P/UNITARIO:");

        btnEliminarSub.setText("DESHACER");
        btnEliminarSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSubActionPerformed(evt);
            }
        });

        btnModificarSub.setText("MODIFICAR");
        btnModificarSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarSubActionPerformed(evt);
            }
        });

        btnRealizarVenta.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnRealizarVenta.setText("R E A L I Z A R          V E N T A");
        btnRealizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarVentaActionPerformed(evt);
            }
        });

        productoNombre1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        productoNombre1.setText("- - - - - - -");

        btnLimpiarVenta.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnLimpiarVenta.setText("L I M P I A R");
        btnLimpiarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVentasLayout = new javax.swing.GroupLayout(panelVentas);
        panelVentas.setLayout(panelVentasLayout);
        panelVentasLayout.setHorizontalGroup(
            panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentasLayout.createSequentialGroup()
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVentasLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelVentasLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ventaReferencia))
                            .addComponent(jLabel21)
                            .addGroup(panelVentasLayout.createSequentialGroup()
                                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelVentasLayout.createSequentialGroup()
                                        .addComponent(ventaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ventaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ventaDomicilio)))))
                    .addGroup(panelVentasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox2)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1)))
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVentasLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(122, 122, 122))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentasLayout.createSequentialGroup()
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelVentasLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(productoNombre1)
                        .addGap(160, 160, 160))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelVentasLayout.createSequentialGroup()
                        .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buscadorProductos1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE))
                        .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelVentasLayout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(productoNombre))
                            .addGroup(panelVentasLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelVentasLayout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(notaProducto))
                                    .addGroup(panelVentasLayout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(productoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregarCuenta)
                                .addGap(108, 108, 108))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentasLayout.createSequentialGroup()
                        .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRealizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelVentasLayout.createSequentialGroup()
                                    .addComponent(jLabel35)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(notaProducto2))
                                .addGroup(panelVentasLayout.createSequentialGroup()
                                    .addComponent(jLabel34)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cantidadProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel36)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(precioProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentasLayout.createSequentialGroup()
                                    .addComponent(btnEliminarSub, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnModificarSub, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(17, 17, 17)))
                .addGap(23, 23, 23))
        );
        panelVentasLayout.setVerticalGroup(
            panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVentasLayout.createSequentialGroup()
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(panelVentasLayout.createSequentialGroup()
                        .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(ventaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(ventaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(ventaDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(ventaReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscadorProductos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productoNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelVentasLayout.createSequentialGroup()
                        .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(cantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(productoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(notaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarCuenta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(productoNombre1))
                .addGap(12, 12, 12)
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelVentasLayout.createSequentialGroup()
                        .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(cantidadProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)
                            .addComponent(precioProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(notaProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarSub)
                            .addComponent(btnModificarSub))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRealizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("VENTAS", panelVentas);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("AGREGAR PRODUCTO");

        agreDesProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agreDesProductoMouseExited(evt);
            }
        });
        agreDesProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreDesProductoActionPerformed(evt);
            }
        });
        agreDesProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                agreDesProductoKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                agreDesProductoKeyPressed(evt);
            }
        });

        jLabel3.setText("NOMBRE:");

        jLabel4.setText("PRECIO:");

        agrePreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                agrePreProductoKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                agrePreProductoKeyPressed(evt);
            }
        });

        jLabel5.setText("DESCRIPCION:");

        btnAgregarProducto.setText("AGREGAR");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        agreNomProducto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                agreNomProductoMouseMoved(evt);
            }
        });
        agreNomProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agreNomProductoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agreNomProductoMouseExited(evt);
            }
        });
        agreNomProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreNomProductoActionPerformed(evt);
            }
        });
        agreNomProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                agreNomProductoKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                agreNomProductoKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setText("BUSCAR PRODUCTOS");

        buscadorProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorProductosKeyReleased(evt);
            }
        });

        btnEliminarProducto.setText("ELIMINAR");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        listaProductos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaProductosMouseClicked(evt);
            }
        });
        listaProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                listaProductosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(listaProductos);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setText("MODIFICAR PRODUCTO");

        jLabel8.setText("NOMBRE:");

        jLabel9.setText("PRECIO:");

        jLabel10.setText("DESCRIPCION:");

        btnModProducto.setText("ACTUALIZAR");
        btnModProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModProductoActionPerformed(evt);
            }
        });

        categoria.add(productoC);
        productoC.setText("CAFETERIA");
        productoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productoCMouseClicked(evt);
            }
        });
        productoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoCActionPerformed(evt);
            }
        });

        categoria.add(productoP);
        productoP.setText("PIZZERIA");
        productoP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productoPMouseClicked(evt);
            }
        });

        mensajeAPro2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        mensajeAPro2.setForeground(new java.awt.Color(204, 0, 0));

        mensajeAPro.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        mensajeAPro.setForeground(new java.awt.Color(204, 0, 0));

        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProductosLayout = new javax.swing.GroupLayout(panelProductos);
        panelProductos.setLayout(panelProductosLayout);
        panelProductosLayout.setHorizontalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProductosLayout.createSequentialGroup()
                                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(agreDesProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelProductosLayout.createSequentialGroup()
                                        .addComponent(agreNomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(agrePreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(productoC)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelProductosLayout.createSequentialGroup()
                                        .addComponent(productoP)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1))
                                    .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addGroup(panelProductosLayout.createSequentialGroup()
                                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelProductosLayout.createSequentialGroup()
                                        .addComponent(modNomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(modPreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnModProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(modDesProducto)))
                            .addGroup(panelProductosLayout.createSequentialGroup()
                                .addComponent(buscadorProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addComponent(mensajeAPro2, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mensajeAPro, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1))
                        .addGap(0, 21, Short.MAX_VALUE))))
        );
        panelProductosLayout.setVerticalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(agrePreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agreNomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(productoC)
                    .addComponent(productoP)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(agreDesProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensajeAPro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscadorProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(modPreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modNomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btnModProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(modDesProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensajeAPro2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PRODUCTOS", panelProductos);

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel11.setText("AGREGAR PERSONAL");

        jLabel12.setText("NOMBRE:");

        agreNombrePersonal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                agreNombrePersonalKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                agreNombrePersonalKeyReleased(evt);
            }
        });

        jLabel13.setText("DIR:");

        agreDirPersonal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                agreDirPersonalKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                agreDirPersonalKeyReleased(evt);
            }
        });

        sexo.add(agreHombrePersonal);
        agreHombrePersonal.setText("Hombre");
        agreHombrePersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agreHombrePersonalMouseClicked(evt);
            }
        });

        sexo.add(agreMujerPersonal);
        agreMujerPersonal.setText("Mujer");
        agreMujerPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agreMujerPersonalMouseClicked(evt);
            }
        });

        agreActivoPersonal.setText("ACTIVO");
        agreActivoPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agreActivoPersonalMouseClicked(evt);
            }
        });

        jLabel14.setText("USUARIO:");

        agreUsuarioPersonal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                agreUsuarioPersonalKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                agreUsuarioPersonalKeyReleased(evt);
            }
        });

        agreContraPersonal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                agreContraPersonalKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                agreContraPersonalKeyReleased(evt);
            }
        });

        jLabel15.setText("CONTRASEÑA");

        btnRegistrarPersonal.setText("REGISTRAR");
        btnRegistrarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPersonalActionPerformed(evt);
            }
        });

        mensajeAPer.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        mensajeAPer.setForeground(new java.awt.Color(204, 0, 0));

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel16.setText("BUSCAR PERSONAL");

        buscadorPersonal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorPersonalKeyReleased(evt);
            }
        });

        jButton3.setText("ELIMINAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        listaPersonal.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPersonalMouseClicked(evt);
            }
        });
        listaPersonal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                listaPersonalKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(listaPersonal);

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel17.setText("MODIFICAR PERSONAL");

        jLabel22.setText("NOMBRE:");

        jLabel23.setText("USUARIO:");

        agreUsuarioPersonal1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                agreUsuarioPersonal1KeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                agreUsuarioPersonal1KeyReleased(evt);
            }
        });

        agreNombrePersonal1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                agreNombrePersonal1KeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                agreNombrePersonal1KeyReleased(evt);
            }
        });

        jLabel24.setText("CONTRASEÑA");

        agreContraPersonal1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                agreContraPersonal1KeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                agreContraPersonal1KeyReleased(evt);
            }
        });

        sexo.add(agreHombrePersonal1);
        agreHombrePersonal1.setText("Hombre");
        agreHombrePersonal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agreHombrePersonal1MouseClicked(evt);
            }
        });

        sexo.add(agreMujerPersonal1);
        agreMujerPersonal1.setText("Mujer");
        agreMujerPersonal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agreMujerPersonal1MouseClicked(evt);
            }
        });

        jLabel25.setText("DIRECCION:");

        estado2.setText("ACTIVO");
        estado2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estado2MouseClicked(evt);
            }
        });

        btnModPersonal.setText("ACTUALIZAR");
        btnModPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModPersonalActionPerformed(evt);
            }
        });

        agreDirPersonal1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                agreDirPersonal1KeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                agreDirPersonal1KeyReleased(evt);
            }
        });

        mensajeAPer1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        mensajeAPer1.setForeground(new java.awt.Color(204, 0, 0));

        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPersonalLayout = new javax.swing.GroupLayout(panelPersonal);
        panelPersonal.setLayout(panelPersonalLayout);
        panelPersonalLayout.setHorizontalGroup(
            panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPersonalLayout.createSequentialGroup()
                        .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addGap(20, 20, 20)
                        .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPersonalLayout.createSequentialGroup()
                                .addComponent(agreNombrePersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(agreHombrePersonal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(agreMujerPersonal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(agreDirPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                            .addGroup(panelPersonalLayout.createSequentialGroup()
                                .addComponent(agreUsuarioPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addGap(20, 20, 20)
                                .addComponent(agreContraPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(agreActivoPersonal)
                                .addGap(18, 18, 18)
                                .addComponent(btnRegistrarPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panelPersonalLayout.createSequentialGroup()
                        .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addGap(20, 20, 20)
                        .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPersonalLayout.createSequentialGroup()
                                .addComponent(agreNombrePersonal1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(agreHombrePersonal1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(agreMujerPersonal1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(agreDirPersonal1))
                            .addGroup(panelPersonalLayout.createSequentialGroup()
                                .addComponent(agreUsuarioPersonal1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24)
                                .addGap(20, 20, 20)
                                .addComponent(agreContraPersonal1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(estado2)
                                .addGap(18, 18, 18)
                                .addComponent(btnModPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panelPersonalLayout.createSequentialGroup()
                        .addComponent(buscadorPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPersonalLayout.createSequentialGroup()
                        .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(mensajeAPer, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(mensajeAPer1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPersonalLayout.setVerticalGroup(
            panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(agreNombrePersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agreHombrePersonal)
                    .addComponent(agreMujerPersonal)
                    .addComponent(jLabel13)
                    .addComponent(agreDirPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agreUsuarioPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(agreContraPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(agreActivoPersonal)
                    .addComponent(btnRegistrarPersonal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensajeAPer, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscadorPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(agreNombrePersonal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agreHombrePersonal1)
                    .addComponent(agreMujerPersonal1)
                    .addComponent(jLabel25)
                    .addComponent(agreDirPersonal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agreUsuarioPersonal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(agreContraPersonal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(estado2)
                    .addComponent(btnModPersonal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensajeAPer1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PERSONAL", panelPersonal);

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel18.setText("ADMIN");

        userAdmin.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        userAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userAdmin.setText("jLabel19");

        jLabel19.setText("NOMBRE:");

        adNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adNombreKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adNombreKeyReleased(evt);
            }
        });

        adUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adUsuarioKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adUsuarioKeyReleased(evt);
            }
        });

        jLabel20.setText("USUARIO:");

        adContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adContrasenaKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adContrasenaKeyReleased(evt);
            }
        });

        lbel.setText("CONTRASEÑA:");

        btnModificarAdmin.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnModificarAdmin.setText("M O D I F I C A R");
        btnModificarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAdminActionPerformed(evt);
            }
        });

        textoConfig.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        javax.swing.GroupLayout panelConfiguracionesLayout = new javax.swing.GroupLayout(panelConfiguraciones);
        panelConfiguraciones.setLayout(panelConfiguracionesLayout);
        panelConfiguracionesLayout.setHorizontalGroup(
            panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfiguracionesLayout.createSequentialGroup()
                .addGroup(panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConfiguracionesLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(userAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelConfiguracionesLayout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(jLabel18))
                    .addGroup(panelConfiguracionesLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textoConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelConfiguracionesLayout.createSequentialGroup()
                                    .addGroup(panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbel)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel19))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(adNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(adUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(adContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(90, 90, 90)
                                    .addComponent(btnModificarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelConfiguracionesLayout.setVerticalGroup(
            panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfiguracionesLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(userAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(8, 8, 8)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelConfiguracionesLayout.createSequentialGroup()
                        .addGroup(panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(adUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbel)
                            .addComponent(adContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnModificarAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(textoConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        jTabbedPane1.addTab("CONFIGURACIONES", panelConfiguraciones);

        etqFecha.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        etqFecha.setText("Miercoles 14 de Agosto de 2014");

        jLabel37.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel37.setText("VENTAS TOTALES:");

        jLabel38.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel38.setText("T. CAFETERIA:");

        jLabel39.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel39.setText("T. PIZZERIA:");

        totalDia.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        totalDia.setText("$00000.00");

        totalCafe.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        totalCafe.setText("$00000.00");

        totalPizza.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        totalPizza.setText("$00000.00");

        meserosVenta.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        meserosVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                meserosVentaMouseClicked(evt);
            }
        });
        meserosVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                meserosVentaKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(meserosVenta);

        buscadorPersonal2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorPersonal2KeyReleased(evt);
            }
        });

        jButton5.setText("BUSCAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel40.setText("VENTA POR MESERO");

        jLabel41.setText("Ordenes Realizadas:");

        jLabel42.setText("Total Cafeteria:");

        jLabel43.setText("Total Pizzeria:");

        jLabel44.setText("TOTAL:");

        mVenta.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        mVenta.setText("26");

        mCafe.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        mCafe.setText("$00000.00");

        mPizza.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        mPizza.setText("$00000.00");

        mTotal.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        mTotal.setText("$00000.00");

        caja.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        caja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caja.setText("$0000.00");

        jLabel49.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel49.setText("TOTAL EN CAJA");

        jLabel50.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        jLabel50.setText("ENGRESOS");

        totalEgresos.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        totalEgresos.setText("$00000.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buscadorPersonal2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(jLabel49)
                                .addGap(214, 214, 214)))
                        .addGap(159, 159, 159))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator7)
                            .addComponent(jSeparator6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel39))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalDia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel44))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(109, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(totalEgresos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etqFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(totalDia, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38))
                    .addComponent(totalCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel39)
                    .addComponent(totalPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(totalEgresos, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscadorPersonal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(mVenta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(mCafe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(mPizza))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(mTotal))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addGap(38, 38, 38))
        );

        jTabbedPane1.addTab("HOY", jPanel1);

        jLabel51.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel51.setText("REGISTRAR EGRESO");

        jLabel52.setText("DESCRIPCION:");

        jLabel53.setText("TOTAL:");

        jButton6.setText("REGISTRAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel54.setText("EGRESOS");

        listaEgresos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaEgresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaEgresosMouseClicked(evt);
            }
        });
        listaEgresos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                listaEgresosKeyReleased(evt);
            }
        });
        jScrollPane7.setViewportView(listaEgresos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator8)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel53)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(totEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel52)
                                    .addGap(18, 18, 18)
                                    .addComponent(desEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel54)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(desEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(totEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("EGRESOS", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 907, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("LISTO", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void listaPersonal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPersonal1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listaPersonal1MouseClicked

    private void listaPersonal1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaPersonal1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_listaPersonal1KeyReleased

    private void buscadorPersonal1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorPersonal1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorPersonal1KeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void listaEgresosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaEgresosKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_listaEgresosKeyReleased

    private void listaEgresosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaEgresosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listaEgresosMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        me.agregarEgreso(desEgreso.getText(), Integer.parseInt(totEgreso.getText()));
        me.mostrarEgresos(listaEgresos);
        me.cuentas(totalCafe, totalPizza, totalDia, totalEgresos, caja);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void buscadorPersonal2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorPersonal2KeyReleased

        me.mostrarPersonal(meserosVenta, buscadorPersonal2.getText());

        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorPersonal2KeyReleased

    private void meserosVentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_meserosVentaKeyReleased

        int num = 0;
        for (int i = 0; i < 5; i++) {

            if ((me.modeloLista2.getElementAt(listaPersonal.getSelectedIndex()).toString()).charAt(i) == ')') {

            num = Integer.parseInt((me.modeloLista2.getElementAt(listaPersonal.getSelectedIndex()).toString()).substring(0, i));
            System.out.println(num);
        }

        }

        me.ventaMesero(num, mCafe, mPizza, mTotal, mVenta);
        // TODO add your handling code here:
    }//GEN-LAST:event_meserosVentaKeyReleased

    private void meserosVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meserosVentaMouseClicked
        int num = 0;
        for (int i = 0; i < 5; i++) {

            
            if ((me.modeloLista6.getElementAt(meserosVenta.getSelectedIndex()).toString()).charAt(i) == ')') {
                
                    
                
            num = Integer.parseInt((me.modeloLista6.getElementAt(meserosVenta.getSelectedIndex()).toString()).substring(0, i));
            System.out.println(num);
        }

        }
        me.ventaMesero(num, mCafe, mPizza, mTotal, mVenta);

        // TODO add your handling code here:
    }//GEN-LAST:event_meserosVentaMouseClicked

    private void btnModificarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAdminActionPerformed

        if (me.modificarAdmin(adUsuario, adContrasena, adNombre, textoConfig) == true) {

        } else {

            JOptionPane.showMessageDialog(null, "Informacion incorrecta en campos");

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarAdminActionPerformed

    private void adContrasenaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adContrasenaKeyReleased

        if (!adUsuario.getText().equals("") && !adNombre.getText().equals("") && !adContrasena.getText().equals("")) {

            btnModificarAdmin.setEnabled(true);

        } else {

            btnModificarAdmin.setEnabled(false);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_adContrasenaKeyReleased

    private void adContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adContrasenaKeyTyped

        if (!adUsuario.getText().equals("") && !adNombre.getText().equals("") && !adContrasena.getText().equals("")) {

            btnModificarAdmin.setEnabled(true);

        } else {

            btnModificarAdmin.setEnabled(false);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_adContrasenaKeyTyped

    private void adUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adUsuarioKeyReleased

        if (!adUsuario.getText().equals("") && !adNombre.getText().equals("") && !adContrasena.getText().equals("")) {

            btnModificarAdmin.setEnabled(true);

        } else {

            btnModificarAdmin.setEnabled(false);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_adUsuarioKeyReleased

    private void adUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adUsuarioKeyTyped

        if (!adUsuario.getText().equals("") && !adNombre.getText().equals("") && !adContrasena.getText().equals("")) {

            btnModificarAdmin.setEnabled(true);

        } else {

            btnModificarAdmin.setEnabled(false);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_adUsuarioKeyTyped

    private void adNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adNombreKeyReleased

        if (!adUsuario.getText().equals("") && !adNombre.getText().equals("") && !adContrasena.getText().equals("")) {

            btnModificarAdmin.setEnabled(true);

        } else {

            btnModificarAdmin.setEnabled(false);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_adNombreKeyReleased

    private void adNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adNombreKeyTyped

        if (!adUsuario.getText().equals("") && !adNombre.getText().equals("") && !adContrasena.getText().equals("")) {

            btnModificarAdmin.setEnabled(true);

        } else {

            btnModificarAdmin.setEnabled(false);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_adNombreKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        agreNombrePersonal.setText("");
        agreDirPersonal.setText("");
        agreUsuarioPersonal.setText("");
        agreContraPersonal.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void agreDirPersonal1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agreDirPersonal1KeyReleased
        // TODO add your handling code here:

        if (!agreNombrePersonal1.getText().equals("") && !agreDirPersonal1.getText().equals("")
            && !agreUsuarioPersonal1.getText().equals("") && !agreContraPersonal1.getText().equals("")
            && (agreHombrePersonal1.isSelected() == true || agreMujerPersonal1.isSelected() == true)) {
            btnModPersonal.setEnabled(true);

        } else {
            btnModPersonal.setEnabled(false);
        }
    }//GEN-LAST:event_agreDirPersonal1KeyReleased

    private void agreDirPersonal1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agreDirPersonal1KeyTyped
        // TODO add your handling code here:

        if (!agreNombrePersonal1.getText().equals("") && !agreDirPersonal1.getText().equals("")
            && !agreUsuarioPersonal1.getText().equals("") && !agreContraPersonal1.getText().equals("")
            && (agreHombrePersonal1.isSelected() == true || agreMujerPersonal1.isSelected() == true)) {
            btnModPersonal.setEnabled(true);

        } else {
            btnModPersonal.setEnabled(false);
        }
    }//GEN-LAST:event_agreDirPersonal1KeyTyped

    private void btnModPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModPersonalActionPerformed

        int res = JOptionPane.showConfirmDialog(null, "¿Desea actualizar este empleado");

        if (res == 0) {
            if (me.validarPersonal2(mensajeAPer1, agreNombrePersonal1.getText(), agreDirPersonal1.getText(), agreUsuarioPersonal1.getText(),
                agreContraPersonal1.getText()) == true) {

            String sex = "";
            if (agreMujerPersonal.isSelected() == true) {
                sex = "Mujer";

            } else {

                sex = "Hombre";
            }

            String es = "";
            if (estado2.isSelected() == true) {
                es = "Activo";
            } else {
                es = "Desactivo";
            }

            int num = 0;
            for (int i = 0; i < 5; i++) {

                if ((me.modeloLista2.getElementAt(listaPersonal.getSelectedIndex()).toString()).charAt(i) == ')') {

                num = Integer.parseInt((me.modeloLista2.getElementAt(listaPersonal.getSelectedIndex()).toString()).substring(0, i));
                System.out.println(num);
            }

        }

        me.actulizacionPersonalConfirmada(agreNombrePersonal1, agreDirPersonal1, agreUsuarioPersonal1, agreContraPersonal1, sex, es, num);
        me.mostrarPersonal(listaPersonal, buscadorPersonal.getText());

        } else {

            JOptionPane.showMessageDialog(null, "Rectifique sus campos, llene correctamente los campos.");

        }
        }
    }//GEN-LAST:event_btnModPersonalActionPerformed

    private void estado2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estado2MouseClicked
        // TODO add your handling code here:

        if (!agreNombrePersonal1.getText().equals("") && !agreDirPersonal1.getText().equals("")
            && !agreUsuarioPersonal1.getText().equals("") && !agreContraPersonal1.getText().equals("")
            && (agreHombrePersonal1.isSelected() == true || agreMujerPersonal1.isSelected() == true)) {
            btnModPersonal.setEnabled(true);

        } else {
            btnModPersonal.setEnabled(false);
        }
    }//GEN-LAST:event_estado2MouseClicked

    private void agreMujerPersonal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agreMujerPersonal1MouseClicked
        // TODO add your handling code here:

        if (!agreNombrePersonal1.getText().equals("") && !agreDirPersonal1.getText().equals("")
            && !agreUsuarioPersonal1.getText().equals("") && !agreContraPersonal1.getText().equals("")
            && (agreHombrePersonal1.isSelected() == true || agreMujerPersonal1.isSelected() == true)) {
            btnModPersonal.setEnabled(true);

        } else {
            btnModPersonal.setEnabled(false);
        }
    }//GEN-LAST:event_agreMujerPersonal1MouseClicked

    private void agreHombrePersonal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agreHombrePersonal1MouseClicked
        // TODO add your handling code here:

        if (!agreNombrePersonal1.getText().equals("") && !agreDirPersonal1.getText().equals("")
            && !agreUsuarioPersonal1.getText().equals("") && !agreContraPersonal1.getText().equals("")
            && (agreHombrePersonal1.isSelected() == true || agreMujerPersonal1.isSelected() == true)) {
            btnModPersonal.setEnabled(true);

        } else {
            btnModPersonal.setEnabled(false);
        }
    }//GEN-LAST:event_agreHombrePersonal1MouseClicked

    private void agreContraPersonal1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agreContraPersonal1KeyReleased
        // TODO add your handling code here:

        if (!agreNombrePersonal1.getText().equals("") && !agreDirPersonal1.getText().equals("")
            && !agreUsuarioPersonal1.getText().equals("") && !agreContraPersonal1.getText().equals("")
            && (agreHombrePersonal1.isSelected() == true || agreMujerPersonal1.isSelected() == true)) {
            btnModPersonal.setEnabled(true);

        } else {
            btnModPersonal.setEnabled(false);
        }
    }//GEN-LAST:event_agreContraPersonal1KeyReleased

    private void agreContraPersonal1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agreContraPersonal1KeyTyped
        // TODO add your handling code here:

        if (!agreNombrePersonal1.getText().equals("") && !agreDirPersonal1.getText().equals("")
            && !agreUsuarioPersonal1.getText().equals("") && !agreContraPersonal1.getText().equals("")
            && (agreHombrePersonal1.isSelected() == true || agreMujerPersonal1.isSelected() == true)) {
            btnModPersonal.setEnabled(true);

        } else {
            btnModPersonal.setEnabled(false);
        }
    }//GEN-LAST:event_agreContraPersonal1KeyTyped

    private void agreNombrePersonal1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agreNombrePersonal1KeyReleased
        // TODO add your handling code here:

        if (!agreNombrePersonal1.getText().equals("") && !agreDirPersonal1.getText().equals("")
            && !agreUsuarioPersonal1.getText().equals("") && !agreContraPersonal1.getText().equals("")
            && (agreHombrePersonal1.isSelected() == true || agreMujerPersonal1.isSelected() == true)) {
            btnModPersonal.setEnabled(true);

        } else {
            btnModPersonal.setEnabled(false);
        }
    }//GEN-LAST:event_agreNombrePersonal1KeyReleased

    private void agreNombrePersonal1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agreNombrePersonal1KeyTyped
        // TODO add your handling code here:

        if (!agreNombrePersonal1.getText().equals("") && !agreDirPersonal1.getText().equals("")
            && !agreUsuarioPersonal1.getText().equals("") && !agreContraPersonal1.getText().equals("")
            && (agreHombrePersonal1.isSelected() == true || agreMujerPersonal1.isSelected() == true)) {
            btnModPersonal.setEnabled(true);

        } else {
            btnModPersonal.setEnabled(false);
        }
    }//GEN-LAST:event_agreNombrePersonal1KeyTyped

    private void agreUsuarioPersonal1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agreUsuarioPersonal1KeyReleased
        // TODO add your handling code here:

        if (!agreNombrePersonal1.getText().equals("") && !agreDirPersonal1.getText().equals("")
            && !agreUsuarioPersonal1.getText().equals("") && !agreContraPersonal1.getText().equals("")
            && (agreHombrePersonal1.isSelected() == true || agreMujerPersonal1.isSelected() == true)) {
            btnModPersonal.setEnabled(true);

        } else {
            btnModPersonal.setEnabled(false);
        }
    }//GEN-LAST:event_agreUsuarioPersonal1KeyReleased

    private void agreUsuarioPersonal1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agreUsuarioPersonal1KeyTyped
        // TODO add your handling code here:

        if (!agreNombrePersonal1.getText().equals("") && !agreDirPersonal1.getText().equals("")
            && !agreUsuarioPersonal1.getText().equals("") && !agreContraPersonal1.getText().equals("")
            && (agreHombrePersonal1.isSelected() == true || agreMujerPersonal1.isSelected() == true)) {
            btnModPersonal.setEnabled(true);

        } else {
            btnModPersonal.setEnabled(false);
        }
    }//GEN-LAST:event_agreUsuarioPersonal1KeyTyped

    private void listaPersonalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaPersonalKeyReleased

        btnModPersonal.setEnabled(true);

        int num = 0;
        for (int i = 0; i < 5; i++) {

            if ((me.modeloLista2.getElementAt(listaPersonal.getSelectedIndex()).toString()).charAt(i) == ')') {

            num = Integer.parseInt((me.modeloLista2.getElementAt(listaPersonal.getSelectedIndex()).toString()).substring(0, i));
            System.out.println(num);
        }

        }

        me.modificarPersonal(num, agreNombrePersonal1, agreDirPersonal1, agreUsuarioPersonal1, agreContraPersonal1,
            agreHombrePersonal1, agreMujerPersonal1, estado2);

        // TODO add your handling code here:
    }//GEN-LAST:event_listaPersonalKeyReleased

    private void listaPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPersonalMouseClicked

        btnModPersonal.setEnabled(true);

        int num = 0;
        for (int i = 0; i < 5; i++) {

            if ((me.modeloLista2.getElementAt(listaPersonal.getSelectedIndex()).toString()).charAt(i) == ')') {

            num = Integer.parseInt((me.modeloLista2.getElementAt(listaPersonal.getSelectedIndex()).toString()).substring(0, i));
            System.out.println(num);
        }

        }

        me.modificarPersonal(num, agreNombrePersonal1, agreDirPersonal1, agreUsuarioPersonal1, agreContraPersonal1,
            agreHombrePersonal1, agreMujerPersonal1, estado2);

        // TODO add your handling code here:
    }//GEN-LAST:event_listaPersonalMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int res = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este empleado");

        if (res == 0) {

            int num = 0;
            for (int i = 0; i < 5; i++) {

                if ((me.modeloLista2.getElementAt(listaPersonal.getSelectedIndex()).toString()).charAt(i) == ')') {

                num = Integer.parseInt((me.modeloLista2.getElementAt(listaPersonal.getSelectedIndex()).toString()).substring(0, i));
                System.out.println(num);
            }

        }

        me.eliminarPersonal(num);
        me.mostrarPersonal(listaPersonal, buscadorPersonal.getText());

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void buscadorPersonalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorPersonalKeyReleased

        me.mostrarPersonal(listaPersonal, buscadorPersonal.getText());

        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorPersonalKeyReleased

    private void btnRegistrarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPersonalActionPerformed

        int res = JOptionPane.showConfirmDialog(null, "¿Desea registrar este empleado");

        if (res == 0) {
            if (me.validarPersonal(mensajeAPer, agreNombrePersonal.getText(), agreDirPersonal.getText(), agreUsuarioPersonal.getText(),
                agreContraPersonal.getText()) == true) {

            String sex = "";
            if (agreMujerPersonal.isSelected() == true) {
                sex = "Mujer";

            } else {

                sex = "Hombre";
            }

            me.agregarPersonal(agreNombrePersonal, agreDirPersonal, sex, agreUsuarioPersonal, agreContraPersonal, agreActivoPersonal);
            me.mostrarPersonal(listaPersonal, buscadorPersonal.getText());

        } else {

            JOptionPane.showMessageDialog(null, "Rectifique sus campos, llene correctamente los campos.");

        }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarPersonalActionPerformed

    private void agreContraPersonalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agreContraPersonalKeyReleased
        if (!agreNombrePersonal.getText().equals("") && !agreDirPersonal.getText().equals("")
            && !agreUsuarioPersonal.getText().equals("") && !agreContraPersonal.getText().equals("")
            && (agreHombrePersonal.isSelected() == true || agreMujerPersonal.isSelected() == true)) {
            btnRegistrarPersonal.setEnabled(true);

        } else {
            btnRegistrarPersonal.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_agreContraPersonalKeyReleased

    private void agreContraPersonalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agreContraPersonalKeyTyped

        if (!agreNombrePersonal.getText().equals("") && !agreDirPersonal.getText().equals("")
            && !agreUsuarioPersonal.getText().equals("") && !agreContraPersonal.getText().equals("")
            && (agreHombrePersonal.isSelected() == true || agreMujerPersonal.isSelected() == true)) {
            btnRegistrarPersonal.setEnabled(true);

        } else {
            btnRegistrarPersonal.setEnabled(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_agreContraPersonalKeyTyped

    private void agreUsuarioPersonalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agreUsuarioPersonalKeyReleased
        if (!agreNombrePersonal.getText().equals("") && !agreDirPersonal.getText().equals("")
            && !agreUsuarioPersonal.getText().equals("") && !agreContraPersonal.getText().equals("")
            && (agreHombrePersonal.isSelected() == true || agreMujerPersonal.isSelected() == true)) {
            btnRegistrarPersonal.setEnabled(true);

        } else {
            btnRegistrarPersonal.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_agreUsuarioPersonalKeyReleased

    private void agreUsuarioPersonalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agreUsuarioPersonalKeyTyped

        if (!agreNombrePersonal.getText().equals("") && !agreDirPersonal.getText().equals("")
            && !agreUsuarioPersonal.getText().equals("") && !agreContraPersonal.getText().equals("")
            && (agreHombrePersonal.isSelected() == true || agreMujerPersonal.isSelected() == true)) {
            btnRegistrarPersonal.setEnabled(true);

        } else {
            btnRegistrarPersonal.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_agreUsuarioPersonalKeyTyped

    private void agreActivoPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agreActivoPersonalMouseClicked

        if (!agreNombrePersonal.getText().equals("") && !agreDirPersonal.getText().equals("")
            && !agreUsuarioPersonal.getText().equals("") && !agreContraPersonal.getText().equals("")
            && (agreHombrePersonal.isSelected() == true || agreMujerPersonal.isSelected() == true)) {
            btnRegistrarPersonal.setEnabled(true);

        } else {
            btnRegistrarPersonal.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_agreActivoPersonalMouseClicked

    private void agreMujerPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agreMujerPersonalMouseClicked

        if (!agreNombrePersonal.getText().equals("") && !agreDirPersonal.getText().equals("")
            && !agreUsuarioPersonal.getText().equals("") && !agreContraPersonal.getText().equals("")
            && (agreHombrePersonal.isSelected() == true || agreMujerPersonal.isSelected() == true)) {
            btnRegistrarPersonal.setEnabled(true);

        } else {
            btnRegistrarPersonal.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_agreMujerPersonalMouseClicked

    private void agreHombrePersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agreHombrePersonalMouseClicked

        if (!agreNombrePersonal.getText().equals("") && !agreDirPersonal.getText().equals("")
            && !agreUsuarioPersonal.getText().equals("") && !agreContraPersonal.getText().equals("")
            && (agreHombrePersonal.isSelected() == true || agreMujerPersonal.isSelected() == true)) {
            btnRegistrarPersonal.setEnabled(true);

        } else {
            btnRegistrarPersonal.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_agreHombrePersonalMouseClicked

    private void agreDirPersonalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agreDirPersonalKeyReleased
        if (!agreNombrePersonal.getText().equals("") && !agreDirPersonal.getText().equals("")
            && !agreUsuarioPersonal.getText().equals("") && !agreContraPersonal.getText().equals("")
            && (agreHombrePersonal.isSelected() == true || agreMujerPersonal.isSelected() == true)) {
            btnRegistrarPersonal.setEnabled(true);

        } else {
            btnRegistrarPersonal.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_agreDirPersonalKeyReleased

    private void agreDirPersonalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agreDirPersonalKeyTyped

        if (!agreNombrePersonal.getText().equals("") && !agreDirPersonal.getText().equals("")
            && !agreUsuarioPersonal.getText().equals("") && !agreContraPersonal.getText().equals("")
            && (agreHombrePersonal.isSelected() == true || agreMujerPersonal.isSelected() == true)) {
            btnRegistrarPersonal.setEnabled(true);

        } else {
            btnRegistrarPersonal.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_agreDirPersonalKeyTyped

    private void agreNombrePersonalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agreNombrePersonalKeyReleased

        if (!agreNombrePersonal.getText().equals("") && !agreDirPersonal.getText().equals("")
            && !agreUsuarioPersonal.getText().equals("") && !agreContraPersonal.getText().equals("")
            && (agreHombrePersonal.isSelected() == true || agreMujerPersonal.isSelected() == true)) {
            btnRegistrarPersonal.setEnabled(true);

        } else {
            btnRegistrarPersonal.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_agreNombrePersonalKeyReleased

    private void agreNombrePersonalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agreNombrePersonalKeyTyped
        // TODO add your handling code here:

        if (!agreNombrePersonal.getText().equals("") && !agreDirPersonal.getText().equals("")
            && !agreUsuarioPersonal.getText().equals("") && !agreContraPersonal.getText().equals("")
            && (agreHombrePersonal.isSelected() == true) || agreMujerPersonal.isSelected() == true) {
            btnRegistrarPersonal.setEnabled(true);

        } else {
            btnRegistrarPersonal.setEnabled(false);
        }
    }//GEN-LAST:event_agreNombrePersonalKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        agreNomProducto.setText("");
        agreDesProducto.setText("");
        agrePreProducto.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void productoPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productoPMouseClicked

        if (!agreNomProducto.getText().equals("") && !agrePreProducto.getText().equals("") && !agreDesProducto.getText().equals("")
            && (productoP.isSelected() != false || productoC.isSelected() != false)) {

            btnAgregarProducto.setEnabled(true);
            System.out.println("HAB");
        } else {

            btnAgregarProducto.setEnabled(false);
            System.out.println("DESA");
        }
        // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_productoPMouseClicked

    private void productoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productoCActionPerformed

    private void productoCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productoCMouseClicked
        // TODO add your handling code here:
        if (!agreNomProducto.getText().equals("") && !agrePreProducto.getText().equals("") && !agreDesProducto.getText().equals("")
            && (productoP.isSelected() != false || productoC.isSelected() != false)) {

            btnAgregarProducto.setEnabled(true);
            System.out.println("HAB");
        } else {

            btnAgregarProducto.setEnabled(false);
            System.out.println("DESA");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_productoCMouseClicked

    private void btnModProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModProductoActionPerformed

        int res = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el producto");

        if (res == 0) {
            boolean val = false;

            val = me.validarProducto2(mensajeAPro2, modNomProducto.getText(), modPreProducto.getText(), modDesProducto.getText());

            if (val == false) {

                JOptionPane.showMessageDialog(null, "Datos registrados incorrectos, verifique.");
            }
            if (val == true) {

                String num = "";
                for (int i = 0; i < 5; i++) {

                    if ((me.modeloLista.getElementAt(listaProductos.getSelectedIndex()).toString()).charAt(i) == ')') {

                    num = (me.modeloLista.getElementAt(listaProductos.getSelectedIndex()).toString()).substring(0, i);
                    System.out.println(num);
                }

            }

            me.actulizacionProductoConfirmada(modNomProducto, modPreProducto, modDesProducto, num);
            me.mostrarProductos(listaProductos, buscadorProductos.getText());
        }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnModProductoActionPerformed

    private void listaProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaProductosKeyReleased

        String num = "";
        for (int i = 0; i < 5; i++) {

            if ((me.modeloLista.getElementAt(listaProductos.getSelectedIndex()).toString()).charAt(i) == ')') {

            num = (me.modeloLista.getElementAt(listaProductos.getSelectedIndex()).toString()).substring(0, i);
            System.out.println(num);
        }

        }

        me.modificarProductos(num, modNomProducto, modPreProducto, modDesProducto);
        btnModProducto.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_listaProductosKeyReleased

    private void listaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProductosMouseClicked
        String num = "";
        for (int i = 0; i < 5; i++) {

            if ((me.modeloLista.getElementAt(listaProductos.getSelectedIndex()).toString()).charAt(i) == ')') {

            num = (me.modeloLista.getElementAt(listaProductos.getSelectedIndex()).toString()).substring(0, i);
            System.out.println(num);
        }

        }

        me.modificarProductos(num, modNomProducto, modPreProducto, modDesProducto);
        btnModProducto.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_listaProductosMouseClicked

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed

        int res = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el producto");

        if (res == 0) {
            String num = "";
            for (int i = 0; i < 5; i++) {

                if ((me.modeloLista.getElementAt(listaProductos.getSelectedIndex()).toString()).charAt(i) == ')') {

                num = (me.modeloLista.getElementAt(listaProductos.getSelectedIndex()).toString()).substring(0, i);
                System.out.println(num);
            }

        }

        me.eliminarProducto(num);
        me.mostrarProductos(listaProductos, buscadorProductos.getText());

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void buscadorProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorProductosKeyReleased

        me.mostrarProductos(listaProductos, buscadorProductos.getText());

        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorProductosKeyReleased

    private void agreNomProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agreNomProductoKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_agreNomProductoKeyPressed

    private void agreNomProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agreNomProductoKeyTyped

        /// VALIDACION
        //////
        if (!agreNomProducto.getText().equals("") && !agrePreProducto.getText().equals("") && !agreDesProducto.getText().equals("")
            && (productoP.isSelected() != false || productoC.isSelected() != false)) {

            btnAgregarProducto.setEnabled(true);
            System.out.println("HAB");
        } else {

            btnAgregarProducto.setEnabled(false);
            System.out.println("DESA");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_agreNomProductoKeyTyped

    private void agreNomProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreNomProductoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_agreNomProductoActionPerformed

    private void agreNomProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agreNomProductoMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_agreNomProductoMouseExited

    private void agreNomProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agreNomProductoMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_agreNomProductoMouseClicked

    private void agreNomProductoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agreNomProductoMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_agreNomProductoMouseMoved

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed

        int res = JOptionPane.showConfirmDialog(null, "¿Desea registrar el producto");

        if (res == 0) {

            /// PRIMERO SE VALIDA
            boolean val = false;
            String codigo = "";

            val = me.validarProducto(mensajeAPro, agreNomProducto.getText(), agrePreProducto.getText(), agreDesProducto.getText());

            if (val == false) {

                JOptionPane.showMessageDialog(null, "Datos registrados incorrectos, verifique.");
            }
            if (val == true) {

                if (productoC.isSelected() == true) {

                    codigo = "C_" + me.maximo;

                }
                if (productoP.isSelected() == true) {

                    codigo = "P_" + me.maximo;

                }

                me.agregarProducto(agreNomProducto, agrePreProducto, agreDesProducto, codigo);
                me.mostrarProductos(listaProductos, buscadorProductos.getText());

            }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void agrePreProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agrePreProductoKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_agrePreProductoKeyPressed

    private void agrePreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agrePreProductoKeyTyped

        if (!agreNomProducto.getText().equals("") && !agrePreProducto.getText().equals("") && !agreDesProducto.getText().equals("")
            && (productoP.isSelected() != false || productoC.isSelected() != false)) {

            btnAgregarProducto.setEnabled(true);
            System.out.println("HAB");
        } else {

            btnAgregarProducto.setEnabled(false);
            System.out.println("DESA");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_agrePreProductoKeyTyped

    private void agreDesProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agreDesProductoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_agreDesProductoKeyPressed

    private void agreDesProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agreDesProductoKeyTyped

        if (!agreNomProducto.getText().equals("") && !agrePreProducto.getText().equals("") && !agreDesProducto.getText().equals("")
            && (productoP.isSelected() != false || productoC.isSelected() != false)) {

            btnAgregarProducto.setEnabled(true);
            System.out.println("HAB");
        } else {

            btnAgregarProducto.setEnabled(false);
            System.out.println("DESA");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_agreDesProductoKeyTyped

    private void agreDesProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreDesProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agreDesProductoActionPerformed

    private void agreDesProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agreDesProductoMouseExited

        // TODO add your handling code here:
    }//GEN-LAST:event_agreDesProductoMouseExited

    private void btnLimpiarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarVentaActionPerformed

        me.limpiarVenta();
        ventaCliente.setText("");
        ventaTelefono.setText("");
        ventaDomicilio.setText("");
        ventaReferencia.setText("");
        me.mostrarPedido(pedido);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarVentaActionPerformed

    private void btnRealizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarVentaActionPerformed

        me.guardarOrden();
        me.cuentas(totalCafe, totalPizza, totalDia, totalEgresos, caja);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnRealizarVentaActionPerformed

    private void btnModificarSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarSubActionPerformed

        int res = JOptionPane.showConfirmDialog(null, "¿Desea guardar los cambios en el pedido?");

        if (res == 0) {
            String num = "";
            for (int i = 0; i < 5; i++) {

                if ((me.modeloLista4.getElementAt(pedido.getSelectedIndex()).toString()).charAt(i) == ')') {

                num = (me.modeloLista4.getElementAt(pedido.getSelectedIndex()).toString()).substring(0, i);
                System.out.println(num);
            }

        }

        me.modificarPedido(num, cantidadProducto2, notaProducto2, total);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarSubActionPerformed

    private void btnEliminarSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSubActionPerformed

        String num = "";
        for (int i = 0; i < 5; i++) {

            if ((me.modeloLista3.getElementAt(verPV.getSelectedIndex()).toString()).charAt(i) == ')') {

            num = (me.modeloLista3.getElementAt(verPV.getSelectedIndex()).toString()).substring(0, i);
            System.out.println(num);
        }

        }

        me.eliminarSub(num);
        me.mostrarPedido(pedido);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarSubActionPerformed

    private void notaProducto2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_notaProducto2KeyReleased

        if (!cantidadProducto2.getText().equals("") && !notaProducto2.getText().equals("")) {

            btnModificarSub.setEnabled(true);

        } else {

            btnModificarSub.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_notaProducto2KeyReleased

    private void notaProducto2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_notaProducto2KeyTyped
        if (!cantidadProducto2.getText().equals("") && !notaProducto2.getText().equals("")) {

            btnModificarSub.setEnabled(true);

        } else {

            btnModificarSub.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_notaProducto2KeyTyped

    private void cantidadProducto2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadProducto2KeyReleased
        if (!cantidadProducto2.getText().equals("") && !notaProducto2.getText().equals("")) {

            btnModificarSub.setEnabled(true);

        } else {

            btnModificarSub.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadProducto2KeyReleased

    private void cantidadProducto2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadProducto2KeyTyped

        if (!cantidadProducto2.getText().equals("") && !notaProducto2.getText().equals("")) {

            btnModificarSub.setEnabled(true);

        } else {

            btnModificarSub.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadProducto2KeyTyped

    private void pedidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pedidoKeyReleased

        String num = "";
        for (int i = 0; i < 5; i++) {

            if ((me.modeloLista4.getElementAt(pedido.getSelectedIndex()).toString()).charAt(i) == ')') {

            num = (me.modeloLista4.getElementAt(pedido.getSelectedIndex()).toString()).substring(0, i);
            System.out.println(num);
        }

        }

        me.modicarSub(num, productoNombre1, cantidadProducto2, notaProducto2, productoPrecio);

        // TODO add your handling code here:
    }//GEN-LAST:event_pedidoKeyReleased

    private void pedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedidoMouseClicked
        // TODO add your handling code here:

        btnEliminarSub.setEnabled(true);
        cantidadProducto2.setEnabled(true);
        notaProducto2.setEnabled(true);

        if (!cantidadProducto2.getText().equals("") && !notaProducto2.getText().equals("")) {

            btnModificarSub.setEnabled(true);

        } else {

            btnModificarSub.setEnabled(false);
        }

        String num = "";
        for (int i = 0; i < 5; i++) {

            if ((me.modeloLista4.getElementAt(pedido.getSelectedIndex()).toString()).charAt(i) == ')') {

            num = (me.modeloLista4.getElementAt(pedido.getSelectedIndex()).toString()).substring(0, i);
            System.out.println(num);
        }

        }

        me.modicarSub(num, productoNombre1, cantidadProducto2, notaProducto2, productoPrecio);
    }//GEN-LAST:event_pedidoMouseClicked

    private void btnAgregarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCuentaActionPerformed

        if (!ventaCliente.getText().equals("") && !ventaTelefono.getText().equals("")
            && !ventaDomicilio.getText().equals("") && !ventaReferencia.getText().equals("")
            && me.VENTA_id_producto.size() != 0) {

            btnRealizarVenta.setEnabled(true);
        } else {

            btnRealizarVenta.setEnabled(false);

        }

        String nu = "";
        for (int i = 0; i < 5; i++) {

            if ((me.modeloLista3.getElementAt(verPV.getSelectedIndex()).toString()).charAt(i) == ')') {

            nu = (me.modeloLista3.getElementAt(verPV.getSelectedIndex()).toString()).substring(0, i);
            System.out.println(nu);
        }

        }

        if (me.validarRepeticion(nu) == true) {
            /// SE HACE SUMA DEL TOTAL Y SE REGISTRAN PRODUCTOS
            String num = "";
            for (int i = 0; i < 5; i++) {

                if ((me.modeloLista3.getElementAt(verPV.getSelectedIndex()).toString()).charAt(i) == ')') {

                num = (me.modeloLista3.getElementAt(verPV.getSelectedIndex()).toString()).substring(0, i);
                System.out.println(num);
            }

        }

        me.preventa(num, productoNombre.getText(), Integer.parseInt(productoPrecio.getText()),
            Integer.parseInt(cantidadProducto.getText()), notaProducto.getText(), total);

        ////MOSTRAR LO DE VENTA
        me.mostrarPedido(pedido);

        } else {

            JOptionPane.showMessageDialog(null, "PRODUCTO YA AGREGADO, modifique la orden de ser necesario.");

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCuentaActionPerformed

    private void notaProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_notaProductoKeyReleased

        if (!cantidadProducto.getText().equals("") && !notaProducto.getText().equals("")) {

            btnAgregarCuenta.setEnabled(true);

        } else {

            btnAgregarCuenta.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_notaProductoKeyReleased

    private void notaProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_notaProductoKeyTyped

        if (!cantidadProducto.getText().equals("") && !notaProducto.getText().equals("")) {

            btnAgregarCuenta.setEnabled(true);

        } else {

            btnAgregarCuenta.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_notaProductoKeyTyped

    private void cantidadProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadProductoKeyReleased

        if (!cantidadProducto.getText().equals("") && !notaProducto.getText().equals("")) {

            btnAgregarCuenta.setEnabled(true);

        } else {

            btnAgregarCuenta.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadProductoKeyReleased

    private void cantidadProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadProductoKeyTyped

        if (!cantidadProducto.getText().equals("") && !notaProducto.getText().equals("")) {

            btnAgregarCuenta.setEnabled(true);

        } else {

            btnAgregarCuenta.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadProductoKeyTyped

    private void buscadorProductos1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorProductos1KeyReleased

        me.mostrarProductos2(verPV, buscadorProductos1.getText());

        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorProductos1KeyReleased

    private void verPVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verPVKeyReleased

        String num = "";
        for (int i = 0; i < 5; i++) {

            if ((me.modeloLista3.getElementAt(verPV.getSelectedIndex()).toString()).charAt(i) == ')') {

            num = (me.modeloLista3.getElementAt(verPV.getSelectedIndex()).toString()).substring(0, i);
            System.out.println(num);
        }

        }

        me.verProductosVenta(num, productoNombre, productoPrecio);

        cantidadProducto.setText("");
        notaProducto.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_verPVKeyReleased

    private void verPVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verPVMouseClicked
        // TODO add your handling code here:

        //System.out.println("valor de index= "+ verPV.getSelectedIndex());
        String num = "";
        for (int i = 0; i < 5; i++) {

            if ((me.modeloLista3.getElementAt(verPV.getSelectedIndex()).toString()).charAt(i) == ')') {

            num = (me.modeloLista3.getElementAt(verPV.getSelectedIndex()).toString()).substring(0, i);
            System.out.println(num);
        }

        }

        me.verProductosVenta(num, productoNombre, productoPrecio);

        cantidadProducto.setText("");
        notaProducto.setText("");
    }//GEN-LAST:event_verPVMouseClicked

    private void ventaReferenciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ventaReferenciaKeyReleased

        if (!ventaCliente.getText().equals("") && !ventaTelefono.getText().equals("")
            && !ventaDomicilio.getText().equals("") && !ventaReferencia.getText().equals("")
            && me.VENTA_id_producto.size() != 0) {

            btnRealizarVenta.setEnabled(true);
        } else {

            btnRealizarVenta.setEnabled(false);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_ventaReferenciaKeyReleased

    private void ventaReferenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ventaReferenciaKeyTyped

        if (!ventaCliente.getText().equals("") && !ventaTelefono.getText().equals("")
            && !ventaDomicilio.getText().equals("") && !ventaReferencia.getText().equals("")
            && me.VENTA_id_producto.size() != 0) {

            btnRealizarVenta.setEnabled(true);
        } else {

            btnRealizarVenta.setEnabled(false);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_ventaReferenciaKeyTyped

    private void ventaDomicilioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ventaDomicilioKeyReleased

        if (!ventaCliente.getText().equals("") && !ventaTelefono.getText().equals("")
            && !ventaDomicilio.getText().equals("") && !ventaReferencia.getText().equals("")
            && me.VENTA_id_producto.size() != 0) {

            btnRealizarVenta.setEnabled(true);
        } else {

            btnRealizarVenta.setEnabled(false);

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ventaDomicilioKeyReleased

    private void ventaDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ventaDomicilioKeyTyped
        if (!ventaCliente.getText().equals("") && !ventaTelefono.getText().equals("")
            && !ventaDomicilio.getText().equals("") && !ventaReferencia.getText().equals("")
            && me.VENTA_id_producto.size() != 0) {

            btnRealizarVenta.setEnabled(true);
        } else {

            btnRealizarVenta.setEnabled(false);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_ventaDomicilioKeyTyped

    private void ventaTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ventaTelefonoKeyReleased

        if (!ventaCliente.getText().equals("") && !ventaTelefono.getText().equals("")
            && !ventaDomicilio.getText().equals("") && !ventaReferencia.getText().equals("")
            && me.VENTA_id_producto.size() != 0) {

            btnRealizarVenta.setEnabled(true);
        } else {

            btnRealizarVenta.setEnabled(false);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_ventaTelefonoKeyReleased

    private void ventaTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ventaTelefonoKeyTyped
        if (!ventaCliente.getText().equals("") && !ventaTelefono.getText().equals("")
            && !ventaDomicilio.getText().equals("") && !ventaReferencia.getText().equals("")
            && me.VENTA_id_producto.size() != 0) {

            btnRealizarVenta.setEnabled(true);
        } else {

            btnRealizarVenta.setEnabled(false);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_ventaTelefonoKeyTyped

    private void ventaClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ventaClienteKeyReleased

        if (!ventaCliente.getText().equals("") && !ventaTelefono.getText().equals("")
            && !ventaDomicilio.getText().equals("") && !ventaReferencia.getText().equals("")
            && me.VENTA_id_producto.size() != 0) {

            btnRealizarVenta.setEnabled(true);
        } else {

            btnRealizarVenta.setEnabled(false);

        }

    }//GEN-LAST:event_ventaClienteKeyReleased

    private void ventaClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ventaClienteKeyTyped

        if (!ventaCliente.getText().equals("") && !ventaTelefono.getText().equals("")
            && !ventaDomicilio.getText().equals("") && !ventaReferencia.getText().equals("")
            && me.VENTA_id_producto.size() != 0) {

            btnRealizarVenta.setEnabled(true);
        } else {

            btnRealizarVenta.setEnabled(false);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_ventaClienteKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App(null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adContrasena;
    private javax.swing.JTextField adNombre;
    private javax.swing.JTextField adUsuario;
    private javax.swing.JCheckBox agreActivoPersonal;
    private javax.swing.JTextField agreContraPersonal;
    private javax.swing.JTextField agreContraPersonal1;
    private javax.swing.JTextField agreDesProducto;
    private javax.swing.JTextField agreDirPersonal;
    private javax.swing.JTextField agreDirPersonal1;
    private javax.swing.JRadioButton agreHombrePersonal;
    private javax.swing.JRadioButton agreHombrePersonal1;
    private javax.swing.JRadioButton agreMujerPersonal;
    private javax.swing.JRadioButton agreMujerPersonal1;
    private javax.swing.JTextField agreNomProducto;
    private javax.swing.JTextField agreNombrePersonal;
    private javax.swing.JTextField agreNombrePersonal1;
    private javax.swing.JTextField agrePreProducto;
    private javax.swing.JTextField agreUsuarioPersonal;
    private javax.swing.JTextField agreUsuarioPersonal1;
    private javax.swing.JButton btnAgregarCuenta;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnEliminarSub;
    private javax.swing.JButton btnLimpiarVenta;
    private javax.swing.JButton btnModPersonal;
    private javax.swing.JButton btnModProducto;
    private javax.swing.JButton btnModificarAdmin;
    private javax.swing.JButton btnModificarSub;
    private javax.swing.JButton btnRealizarVenta;
    private javax.swing.JButton btnRegistrarPersonal;
    private javax.swing.JTextField buscadorPersonal;
    private javax.swing.JTextField buscadorPersonal1;
    private javax.swing.JTextField buscadorPersonal2;
    private javax.swing.JTextField buscadorProductos;
    private javax.swing.JTextField buscadorProductos1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel caja;
    private javax.swing.JTextField cantidadProducto;
    private javax.swing.JTextField cantidadProducto2;
    private javax.swing.ButtonGroup categoria;
    private javax.swing.JTextField desEgreso;
    private javax.swing.JCheckBox estado2;
    private javax.swing.JLabel etqFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbel;
    private javax.swing.JList listaEgresos;
    private javax.swing.JList listaPersonal;
    private javax.swing.JList listaPersonal1;
    private javax.swing.JList listaProductos;
    private javax.swing.JLabel mCafe;
    private javax.swing.JLabel mPizza;
    private javax.swing.JLabel mTotal;
    private javax.swing.JLabel mVenta;
    private javax.swing.JLabel mensajeAPer;
    private javax.swing.JLabel mensajeAPer1;
    private javax.swing.JLabel mensajeAPro;
    private javax.swing.JLabel mensajeAPro2;
    private javax.swing.JList meserosVenta;
    private javax.swing.JTextField modDesProducto;
    private javax.swing.JTextField modNomProducto;
    private javax.swing.JTextField modPreProducto;
    private javax.swing.JTextField notaProducto;
    private javax.swing.JTextField notaProducto2;
    private javax.swing.JPanel panelConfiguraciones;
    private javax.swing.JPanel panelPersonal;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JPanel panelVentas;
    private javax.swing.JList pedido;
    private javax.swing.JTextField precioProducto2;
    private javax.swing.JRadioButton productoC;
    private javax.swing.JLabel productoNombre;
    private javax.swing.JLabel productoNombre1;
    private javax.swing.JRadioButton productoP;
    private javax.swing.JTextField productoPrecio;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.JLabel textoConfig;
    private javax.swing.JTextField totEgreso;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totalCafe;
    private javax.swing.JLabel totalDia;
    private javax.swing.JLabel totalEgresos;
    private javax.swing.JLabel totalPizza;
    private javax.swing.JLabel userAdmin;
    private javax.swing.JTextField ventaCliente;
    private javax.swing.JTextField ventaDomicilio;
    private javax.swing.JTextField ventaReferencia;
    private javax.swing.JTextField ventaTelefono;
    private javax.swing.JList verPV;
    // End of variables declaration//GEN-END:variables
}
