/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Control.AdminJpaController;
import Control.CafeteriaJpaController;
import Control.EgresosJpaController;
import Control.EntityMan;
import Control.OrdenJpaController;
import Control.PersonalJpaController;
import Control.PizzeriaJpaController;
import Control.ProductosJpaController;
import Control.exceptions.NonexistentEntityException;
import Control.exceptions.PreexistingEntityException;
import Tablas.Admin;
import Tablas.Cafeteria;
import Tablas.Egresos;
import Tablas.Orden;
import Tablas.Personal;
import Tablas.Pizzeria;
import Tablas.Productos;
import Vista.App;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.jboss.logging.Logger;

/**
 *
 * @author mac
 */
public class Metodos {
    
    public  DefaultListModel modeloLista;
    public DefaultListModel modeloLista2;
    public DefaultListModel modeloLista3;
    public DefaultListModel modeloLista4;
    public DefaultListModel modeloLista5;
     public DefaultListModel modeloLista6;
      public DefaultListModel modeloLista7;
     
     
    public ArrayList<String> VENTA_id_producto = new ArrayList<String>();
    ArrayList<Long> VENTA_cantidad = new ArrayList<Long>();
    ArrayList<String> VENTA_producto = new ArrayList<String>();
     ArrayList<Long> VENTA_precio = new ArrayList<Long>();
     ArrayList<String> VENTA_nota = new ArrayList<String>();
    
    public String [] productos_id;
    String [] productos_nombre;
    int [] productos_precio;
    String [] productos_descripcion;
    
    int [] personal_id ;
    String [] personal_nombre ;
    String [] personal_direccion;
    String [] personal_usuario ;
    String [] personal_contrasena ;
    String [] personal_sexo ;
    String [] personal_estado ;
    
    public int maximo=0;
    public int maximoPersonal=0;
    long subtotal=0;
    public String adminUsuario="";
    public String adminNombre="";
    public String adminContrasena="";
    
    
    public void inicializar(){
    
        
        
        
       llenarTablasProducto();
       llenarTablasPersonal();
       
    }
    
    public void llenarTablasProducto(){
    
     ProductosJpaController pro = new ProductosJpaController(EntityMan.getInstance());
       
      
        try{
        
            
            List<Productos> listProductos=pro.findProductosEntities();
            
            maximo=listProductos.size();
            
            productos_id=new String [listProductos.size()];
            productos_nombre=new String [listProductos.size()];
            productos_precio=new int [listProductos.size()];
            productos_descripcion=new String [listProductos.size()];
            
            
            for(int i =0; i<listProductos.size();i++){
            
            productos_id[i]=listProductos.get(i).getIpProducto();
            productos_nombre[i]=listProductos.get(i).getNombre();
            productos_precio[i]=listProductos.get(i).getPrecio();
            productos_descripcion[i]=listProductos.get(i).getDescripcion();
            
            }
            
            
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
     public void llenarTablasPersonal(){
    
     PersonalJpaController pro = new PersonalJpaController(EntityMan.getInstance());
       
      
        try{
        
            
            List<Personal> listPersonal=pro.findPersonalEntities();
            
            maximoPersonal=listPersonal.size();
            
            personal_id=new int [listPersonal.size()];
            personal_nombre=new String [listPersonal.size()];
            personal_direccion=new String [listPersonal.size()];
            personal_usuario=new String [listPersonal.size()];
            personal_contrasena=new String [listPersonal.size()];
            personal_sexo=new String [listPersonal.size()];
            personal_estado=new String [listPersonal.size()];
           
            
            
            for(int i =0; i<listPersonal.size();i++){
            
            personal_id[i]=listPersonal.get(i).getIdPersonal();
            personal_nombre[i]=listPersonal.get(i).getNombre();
            personal_direccion[i]=listPersonal.get(i).getDireccion();
            personal_usuario[i]=listPersonal.get(i).getUsuario();
            personal_contrasena[i]=listPersonal.get(i).getPassword();
            personal_sexo[i]=listPersonal.get(i).getSexo();
            personal_estado[i]=listPersonal.get(i).getEstado();
            
            }
            
            
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    
    public void mostrarProductos(javax.swing.JList listaP,
            String producto){
    
        
        modeloLista = new DefaultListModel();
        listaP.setModel(modeloLista);
        
        
        
        
    for (int i = 0; i < productos_nombre.length; i++){
     if(productos_nombre[i].substring(0, producto.length()).equals(producto)){
     modeloLista.addElement(productos_id[i]+") "+productos_nombre[i]+" $"+productos_precio[i]+" ("+productos_descripcion[i]+") ");
     }
        
    }
    
    
    
    }

    public void modificarProductos(String cod, javax.swing.JTextField nom, javax.swing.JTextField pre, javax.swing.JTextField des){
    
        int pos=0;
        for(int i =0; i<maximo;i++){
        
            if(cod.equals(productos_id[i])){
            
              pos=i;  
            
            }
        
        }
        
        nom.setText(productos_nombre[pos]);
        pre.setText(""+productos_precio[pos]);
        des.setText(productos_descripcion[pos]);
        
    
    }
    
    public void agregarProducto (javax.swing.JTextField nom, javax.swing.JTextField pre, javax.swing.JTextField des, String codigo) {
    
        boolean hecho=false;
        int aum=1;
        ProductosJpaController pro = new ProductosJpaController(EntityMan.getInstance());
        Productos p = new Productos();
        p.setIpProducto(codigo);
        p.setNombre(nom.getText());
        p.setPrecio(Integer.parseInt(pre.getText()));
        p.setDescripcion(des.getText());
        
        do{
        try{
        
        pro.create(p);
        JOptionPane.showMessageDialog(null,"PRODUCTO AGREGADO");
        llenarTablasProducto();
        hecho=true;
        } catch (Exception ex) {
            
            p.setIpProducto(""+codigo.charAt(1)+"_"+(maximo+aum));
            aum++;
            
          //  java.util.logging.Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }}while(hecho==false);
        
    }
     public boolean validarProducto (javax.swing.JLabel a, String nom, String pre, String des){
    
         a.setText("");
     boolean valor=false;
String patronN = "[a-zA-Z -]+"; //Los que estan entre la h y la m


Pattern p = Pattern.compile(patronN);   
        



//Busca patron en el texto
Matcher matcher = p.matcher(nom);

if(matcher.matches()){
    a.setText("");
    valor=true;
    System.out.println("NOMBRE CORRECTO");
    
}else{
     a.setText(a.getText()+"Ingrese un nombre correcto(menos de 20 caracteres alfabeticos). ");
     valor=false;
}

if(valor==true){
String patronP= "[0-9]+"; //Los que estan entre la h y la m


Pattern pp = Pattern.compile(patronP);   
        



//Busca patron en el texto
Matcher matcher1 = pp.matcher(pre);

if(matcher1.matches()){
    a.setText("");
    valor=true;
    System.out.println("PRECIO CORRECTO");
}else{
     a.setText(a.getText()+"El precio debe contener numeros sin puntos o comas. ");
     valor=false;
}

           if(valor==true){ 
     
     String patronPP= "[a-zA-Z 0-9,.]+"; //Los que estan entre la h y la m


Pattern ppp = Pattern.compile(patronPP);   
        



//Busca patron en el texto
Matcher matcher11 = ppp.matcher(des);

if(matcher11.matches()){
    a.setText("");
    System.out.println("DESCRIPCION CORRECTA");
    valor=true;
}else{
     a.setText(a.getText()+"La descripcion acepta solo caracteres alfanumericos y comas. ");
     valor=false;
}
}}
return valor;
            }
     
     public boolean validarProducto2 (javax.swing.JLabel a, String nom, String pre, String des){
    
         a.setText("");
     boolean valor=false;
String patronN = "[a-zA-Z -]+"; //Los que estan entre la h y la m


Pattern p = Pattern.compile(patronN);   
        



//Busca patron en el texto
Matcher matcher = p.matcher(nom);

if(matcher.matches()){
    a.setText("");
    valor=true;
    System.out.println("NOMBRE CORRECTO");
    
}else{
     a.setText(a.getText()+"Ingrese un nombre correcto(menos de 20 caracteres alfabeticos). ");
     valor=false;
}

if(valor==true){
String patronP= "[0-9]+"; //Los que estan entre la h y la m


Pattern pp = Pattern.compile(patronP);   
        



//Busca patron en el texto
Matcher matcher1 = pp.matcher(pre);

if(matcher1.matches()){
    a.setText("");
    valor=true;
    System.out.println("PRECIO CORRECTO");
}else{
     a.setText(a.getText()+"El precio debe contener numeros sin puntos o comas. ");
     valor=false;
}

           if(valor==true){ 
     
     String patronPP= "[a-zA-Z 0-9,.]+"; //Los que estan entre la h y la m


Pattern ppp = Pattern.compile(patronPP);   
        



//Busca patron en el texto
Matcher matcher11 = ppp.matcher(des);

if(matcher11.matches()){
    a.setText("");
    System.out.println("DESCRIPCION CORRECTA");
    valor=true;
}else{
     a.setText(a.getText()+"La descripcion acepta solo caracteres alfanumericos y comas. ");
     valor=false;
}
}}
return valor;
            }


    
     
     public boolean validarPersonal (javax.swing.JLabel a, String nom, String dir, String usu, String con){
    
         a.setText("");
     boolean valor=false;
String patronN = "[a-zA-Z -]+"; //Los que estan entre la h y la m


Pattern p = Pattern.compile(patronN);   
        



//Busca patron en el texto
Matcher matcher = p.matcher(nom);

if(matcher.matches()){
    a.setText("");
    valor=true;
   
    
}else{
     a.setText(a.getText()+"Ingrese un nombre correcto(menos de 40 caracteres alfabeticos). ");
     valor=false;
}

if(valor==true){
String patronP= "[a-zA-Z /.,]+"; //Los que estan entre la h y la m


Pattern pp = Pattern.compile(patronP);   
        



//Busca patron en el texto
Matcher matcher1 = pp.matcher(dir);

if(matcher1.matches()){
    a.setText("");
    valor=true;
    
}else{
     a.setText(a.getText()+"Formato de direccion incorrecto (solo numeros, letras, puntos y comas). ");
     valor=false;
}

           if(valor==true){ 
     
     String patronPP= "[a-zA-Z0-9]+"; //Los que estan entre la h y la m


Pattern ppp = Pattern.compile(patronPP);   
        



//Busca patron en el texto
Matcher matcher11 = ppp.matcher(usu);

if(matcher11.matches()){
    a.setText("");
    valor=true;
}else{
     a.setText(a.getText()+"Formato de usuario incorrecto (maximo 10 caracteres alfanumericos).");
     valor=false;
}

if(usu.length()>10){
 a.setText(a.getText()+"Formato de usuario incorrecto (maximo 10 caracteres alfanumericos).");
     valor=false;

}

           if(valor==true){
           
         



//Busca patron en el texto


if(con.length()<20&&con.length()>5){
    a.setText("");
    valor=true;
}else{
     a.setText(a.getText()+"El tamaño maximo de la contraseña es de 20 caracteres y minimo de 5.");
     valor=false;
}
           
           
           }
           
           
           
           
           }}
return valor;
            }


   public boolean validarPersonal2 (javax.swing.JLabel a, String nom, String dir, String usu, String con){
    
         a.setText("");
     boolean valor=false;
String patronN = "[a-zA-Z -]+"; //Los que estan entre la h y la m


Pattern p = Pattern.compile(patronN);   
        



//Busca patron en el texto
Matcher matcher = p.matcher(nom);

if(matcher.matches()){
    a.setText("");
    valor=true;
   
    
}else{
     a.setText(a.getText()+"Ingrese un nombre correcto(menos de 40 caracteres alfabeticos). ");
     valor=false;
}

if(valor==true){
String patronP= "[a-zA-Z /.,]+"; //Los que estan entre la h y la m


Pattern pp = Pattern.compile(patronP);   
        



//Busca patron en el texto
Matcher matcher1 = pp.matcher(dir);

if(matcher1.matches()){
    a.setText("");
    valor=true;
    
}else{
     a.setText(a.getText()+"Formato de direccion incorrecto (solo numeros, letras, puntos y comas). ");
     valor=false;
}

           if(valor==true){ 
     
     String patronPP= "[a-zA-Z0-9]+"; //Los que estan entre la h y la m


Pattern ppp = Pattern.compile(patronPP);   
        



//Busca patron en el texto
Matcher matcher11 = ppp.matcher(usu);

if(matcher11.matches()){
    a.setText("");
    valor=true;
}else{
     a.setText(a.getText()+"Formato de usuario incorrecto (maximo 5 caracteres alfanumericos).");
     valor=false;
}

           if(valor==true){
           
         



//Busca patron en el texto


if(con.length()<20&&con.length()>5){
    a.setText("");
    valor=true;
}else{
     a.setText(a.getText()+"El tamaño maximo de la contraseña es de 20 caracteres y minimo de 5.");
     valor=false;
}
           
           
           }
           
           
           
           
           }}
return valor;
            }


   public void mostrarPersonal(javax.swing.JList listaP,
            String personal){
    
        
        modeloLista2 = new DefaultListModel();
        listaP.setModel(modeloLista2);
        
        
        
        
    for (int i = 0; i < personal_nombre.length; i++){
     if(personal_nombre[i].substring(0, personal.length()).equals(personal)){
     modeloLista2.addElement(personal_id[i]+") "+personal_nombre[i]+" ("+personal_sexo[i]+"). "+personal_direccion[i]+" ");
     }
        
    }
    
    
    
    }

    public void modificarPersonal(int pos, javax.swing.JTextField nom, javax.swing.JTextField dir, javax.swing.JTextField usu
    , javax.swing.JTextField con, javax.swing.JRadioButton hom, javax.swing.JRadioButton muj, javax.swing.JCheckBox act){
    
        int nuevaPos=0;
        
        
        for(int i=0; i<personal_nombre.length;i++){
        
        if(personal_id[i]==pos){
        
        nuevaPos=i;
        }
        
        }
        
        
        
        nom.setText(personal_nombre[nuevaPos]);
        dir.setText(personal_direccion[nuevaPos]);
        usu.setText(personal_usuario[nuevaPos]);
        con.setText(personal_contrasena[nuevaPos]);
        if(personal_estado[nuevaPos].equals("Activo")){
        
            act.setSelected(true);
        
        }else{
        
            act.setSelected(false);
        
        }
        
        if(personal_sexo[nuevaPos].equals("Hombre")){
        
            hom.setSelected(true);
        
        }else{
        
            muj.setSelected(true);
        
        }
        
        
    
    }
    

    public void verProductosVenta(String cod, javax.swing.JLabel nom, javax.swing.JTextField pre){
    
        int pos=0;
        
        for(int i=0; i<productos_nombre.length;i++){
        
            if(productos_id[i].equals(cod)){
            pos=i;
            }
        
        }
        nom.setText(productos_nombre[pos]);
        pre.setText(""+productos_precio[pos]);
        
        
    
    }
    

  public void mostrarProductos2(javax.swing.JList listaP,
            String producto){
    
        
        modeloLista3 = new DefaultListModel();
        listaP.setModel(modeloLista3);
        
        
        
        
    for (int i = 0; i < productos_nombre.length; i++){
     if(productos_nombre[i].substring(0, producto.length()).equals(producto)){
     modeloLista3.addElement(productos_id[i]+") "+productos_nombre[i]+" ("+productos_descripcion[i]+") ");
     }
        
    }
    
    
    
    }


  
  public void preventa(String cod, String nombrePro, int precioPro, int cantidadPro, String notaPro, javax.swing.JLabel total){
  
     
      
      
      
  VENTA_id_producto.add(cod);
  VENTA_producto.add(nombrePro);
  VENTA_precio.add((long)precioPro);
  VENTA_cantidad.add((long)cantidadPro);
  VENTA_nota.add(notaPro);
  
  subtotal=0;
  for(int i=0; i<VENTA_precio.size();i++){
  
  subtotal=subtotal+(VENTA_precio.get(i)*VENTA_cantidad.get(i));
      
  }
  
  total.setText("$"+subtotal+".00");
  
  
  }
  
  
  public void validarSubventa () {
  
  
  }
  
  
    public void mostrarPedido(javax.swing.JList listaP){
    
        
        modeloLista4 = new DefaultListModel();
        listaP.setModel(modeloLista4);
        
        
        
        
    for (int i = 0; i < VENTA_producto.size(); i++){

     modeloLista4.addElement(VENTA_id_producto.get(i)+") "+VENTA_cantidad.get(i)+" "+VENTA_producto.get(i)+
             " ( $"+(VENTA_cantidad.get(i)*VENTA_precio.get(i))+") ");
     
        
    }
    
    
    
    }

    
    public void modicarSub(String pos, javax.swing.JLabel nom, javax.swing.JTextField cantidad, javax.swing.JTextField nota,
            javax.swing.JTextField precio){
    
        int aux=0;
     
    for(int i=0;i<VENTA_producto.size();i++){
    
        if(VENTA_id_producto.get(i).equals(pos)){
        
            aux=i;
        
        }
    
    }
    
    
    
    nom.setText(""+VENTA_producto.get(aux));
    cantidad.setText(""+VENTA_cantidad.get(aux));
    nota.setText(""+VENTA_nota.get(aux));
    precio.setText(""+VENTA_precio.get(aux));
    
    
    }
    
    
    public void modificarPedido (String id ,javax.swing.JTextField can, javax.swing.JTextField nota, javax.swing.JLabel total){
    
        int pos=0;
        boolean enc=false;
        int j=0;
        
        System.out.println("IDES REGISTRANDOS EN VENTAS");
        for(int i =0; i<VENTA_producto.size();i++){
        
            System.out.println(VENTA_id_producto.get(i));
        
        }
        System.out.println("VALOR DE ID A MODIFICIAR= "+ id);
        
        
        while(enc==false){
        
        if(VENTA_id_producto.get(j).equals(id))
        {enc=true; pos=j;
        
        
        }
        j++;
        }
        
        System.out.println("SE MODIFICARA LA POSICION " + pos);
        
    VENTA_cantidad.set(pos, Long.parseLong(can.getText()));
    VENTA_nota.set(pos, nota.getText());
    
    can.setText(""+VENTA_cantidad.get(pos));
    nota.setText(""+VENTA_nota.get(pos));
    
    subtotal=0;
  for(int i=0; i<VENTA_precio.size();i++){
  
  subtotal=subtotal+(VENTA_precio.get(i)*VENTA_cantidad.get(i));
      
  }
  
  total.setText("$"+subtotal+".00");
  
  modeloLista4.clear();
   for (int i = 0; i < VENTA_producto.size(); i++){
       
     
     modeloLista4.addElement(VENTA_id_producto.get(i)+") "+VENTA_cantidad.get(i)+" "+VENTA_producto.get(i)+
             " ( $"+(VENTA_cantidad.get(i)*VENTA_precio.get(i))+") ");
     
        
    }
    
    
    }
  
    
    public void agregarPersonal (javax.swing.JTextField nom, javax.swing.JTextField dir, String sex,
            javax.swing.JTextField usuario, javax.swing.JTextField pass, javax.swing.JCheckBox estado) {
    
        String es="";
        if(estado.isSelected()==true){
        es="Activo";
        }else{
        es="Desactivo";
        }
        
        PersonalJpaController per = new PersonalJpaController(EntityMan.getInstance());
        Personal p = new Personal();
        
        p.setNombre(nom.getText());
        p.setDireccion(dir.getText());
        p.setSexo(sex);
        p.setUsuario(usuario.getText());
        p.setPassword(pass.getText());
        p.setEstado(es);
        
        try{
        per.create(p);
        JOptionPane.showMessageDialog(null,"PERSONAL AGREGADO");
        
        inicializar();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
    }
   
    
    
    public void actualizarProducto(){}
    
    public void ingresar(javax.swing.JPasswordField con, javax.swing.JTextField usu, javax.swing.JFrame ppal){
    
      
     if(usu.getText().length()<11&&con.getText().length()<11){   
     AdminJpaController pro = new AdminJpaController(EntityMan.getInstance());
     boolean acceso=false; 
            List<Admin> listAdmin=pro.findAdminEntities();
            
            
            for(int i=0; i<listAdmin.size();i++){
            
                if(listAdmin.get(i).getUsuario().equals(""+usu.getText())&&listAdmin.get(i).getPassword().equals(""+con.getText())){
                acceso=true;
                adminUsuario=listAdmin.get(i).getUsuario();
                adminNombre=listAdmin.get(i).getNombre();
                adminContrasena=listAdmin.get(i).getPassword();
                    
                }
            
            }
            
     if(acceso==true){
     
         App control = new App(adminUsuario,adminNombre,adminContrasena);
         control.setVisible(true);
         ppal.setVisible(false);
     
     }
     }
     
    
    
    }
    
    
    public boolean modificarAdmin(javax.swing.JTextField usu, javax.swing.JTextField con, javax.swing.JTextField nom,
            javax.swing.JLabel a){
    
        a.setText("");
        
    boolean valor=true;    
    String patronN = "[a-zA-Z0-9]+"; //Los que estan entre la h y la m
    

Pattern p = Pattern.compile(patronN);   
        



//Busca patron en el texto
Matcher matcher = p.matcher(usu.getText());

if(matcher.matches()){
    a.setText("");
    valor=true;
    System.out.println("NOMBRE CORRECTO");
    
}else{
     a.setText(a.getText()+"Usuario debe contener caracteres afanumericos");
     valor=false;
}

if(valor==true){
String patronP= "[A-Za-z ]+"; //Los que estan entre la h y la m


Pattern pp = Pattern.compile(patronP);   
        



//Busca patron en el texto
Matcher matcher1 = pp.matcher(nom.getText());

if(matcher1.matches()){
    a.setText("");
    valor=true;
    System.out.println("PRECIO CORRECTO");
}else{
     a.setText(a.getText()+"Solo caracteres alfabeticos para el nombre");
     valor=false;
}

           if(valor==true){ 
     
     

if(con.getText().length()<20&&con.getText().length()>5){
    a.setText("");
    System.out.println("DESCRIPCION CORRECTA");
    valor=true;
}else{
     a.setText(a.getText()+"Minimo 5 digitos y maximo 20 para la contrasena");
     valor=false;
}
}}
return valor;
            }
     
    public void actulizacionProductoConfirmada(javax.swing.JTextField nom, javax.swing.JTextField pre, 
            javax.swing.JTextField des, String id){
    
    try{
    ProductosJpaController pro = new ProductosJpaController(EntityMan.getInstance());
    Productos pEdit= new Productos();
    pEdit.setIpProducto(id);
    pEdit.setNombre(nom.getText());
    pEdit.setDescripcion(des.getText());
    pEdit.setPrecio(Integer.parseInt(pre.getText()));
    pro.edit(pEdit);
    JOptionPane.showMessageDialog(null,"Producto actualizado");
    
    llenarTablasProducto();
    
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, ""+e.getMessage());
    
    }
    
    
    
    
    }
    
    public void eliminarProducto(String id){
    
    try{ProductosJpaController pro = new ProductosJpaController(EntityMan.getInstance());
    pro.destroy(id);
     JOptionPane.showMessageDialog(null,"Producto eliminado");
    
    llenarTablasProducto();
    
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, ""+e.getMessage());
    }
    
    }

    
    
     public void actulizacionPersonalConfirmada(javax.swing.JTextField nom, javax.swing.JTextField dir, 
            javax.swing.JTextField usu, javax.swing.JTextField con, String sexo, String estado, int id){
    
    try{
    PersonalJpaController per = new PersonalJpaController(EntityMan.getInstance());
    Personal pEditar= new Personal();
    pEditar.setIdPersonal(id);
    pEditar.setNombre(nom.getText());
    pEditar.setSexo(sexo);
    pEditar.setDireccion(dir.getText());
    pEditar.setEstado(estado);
    pEditar.setUsuario(usu.getText());
    pEditar.setPassword(con.getText());
    
    per.edit(pEditar);
    JOptionPane.showMessageDialog(null,"Datos de personal actualizados");
    llenarTablasPersonal();
    
    
   }    catch (NonexistentEntityException ex) {
            java.util.logging.Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
  

    
    
    
    
    }
     
     
     public void eliminarPersonal(int id){
    
    try{PersonalJpaController per = new PersonalJpaController(EntityMan.getInstance());
    per.destroy(id);
    JOptionPane.showMessageDialog(null,"Personal eliminado");
    
    llenarTablasPersonal();
    
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, ""+e.getMessage());
    }
    
    }
     
    public void eliminarSub(String id){
    
        int pos=0;
        
        for(int i=0; i<VENTA_precio.size();i++){
        
            if(VENTA_id_producto.get(i).equals(id)){
            
                pos=i;
            
            }
        
        }
        
        
    try{
    VENTA_id_producto.remove(id);
    VENTA_cantidad.remove(id);
    VENTA_producto.remove(id);
    VENTA_precio.remove(id);
    VENTA_nota .remove(id);
   
    }catch(Exception e){JOptionPane.showMessageDialog(null, ""+e.getMessage());}
    
    
    }
    

    public boolean validarRepeticion(String id){
    
        boolean regreso=true;
        
    for(int i=0; i<VENTA_precio.size();i++){
        
            if(VENTA_id_producto.get(i).equals(id)){
            
                regreso=false;
                System.out.println("COINCIDENCIA");
            }
        
        }
    return regreso;
    }
    
    public void guardarOrden(){
    
        Calendar fecha = new GregorianCalendar();
        
        int anio = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        
        long tC=0;
        long tP=0;
        long tT=0;
        String ordenC="";
        String ordenP="";
        
       
        
        for(int i=0;i<VENTA_id_producto.size();i++){
        
            if(VENTA_id_producto.get(i).charAt(0)=='P'){
            tP=tP+(VENTA_precio.get(i)*VENTA_cantidad.get(i));
            ordenP=ordenP+"<br>- "+VENTA_cantidad.get(i)+" "+VENTA_producto.get(i)+"("+VENTA_nota.get(i)+")";
            }
            if(VENTA_id_producto.get(i).charAt(0)=='C'){
            tC=tC+(VENTA_precio.get(i)*VENTA_cantidad.get(i));
            ordenC=ordenC+"<br>- "+VENTA_cantidad.get(i)+" "+VENTA_producto.get(i)+"("+VENTA_nota.get(i)+")";
            }
        
        }
        
        System.out.println("ORDEN P= " + ordenP);
        
        System.out.println("ORDEN C= " + ordenC);
        
        tT=tC+tP;
        
        boolean filaC=false;
        String estadoC="";
        boolean filaP=false;
        String estadoP="";
        int sigC=0;
        int sigP=0;
        boolean sinDes=false;
        boolean sinDesP=false;
        
        
        
        
        
        OrdenJpaController orden = new OrdenJpaController(EntityMan.getInstance());
        Orden o = new Orden();
        
        CafeteriaJpaController caf = new CafeteriaJpaController(EntityMan.getInstance());
        Cafeteria c = new Cafeteria();
        
        List<Cafeteria> listCafeteria=caf.findCafeteriaEntities();
        sigC=listCafeteria.size()+1;
        
        PizzeriaJpaController pizza = new PizzeriaJpaController(EntityMan.getInstance());
        Pizzeria pic = new Pizzeria();
        
        List<Pizzeria> listPizza=pizza.findPizzeriaEntities();
        sigP=listPizza.size()+1;
        for(int i=0;i<listCafeteria.size();i++){
        
            if(listCafeteria.get(i).getEstado().equals("F")){
            
            filaC=true;
            }
            if(listCafeteria.get(i).getEstado().equals("D")){
            
                sinDes=true;
            }
        
        }
        
        if(filaC==true){
        
            estadoC="F";
        
        } else if(filaC==false&&sinDes==true){
        
            estadoC="F";
        
        }else if(sinDes==false&&filaC==false){
        
            estadoC="D";
        
        }
        
        for(int i=0;i<listPizza.size();i++){
        
            if(listPizza.get(i).getEstado().equals("F")){
            
            filaP=true;
            }
            if(listPizza.get(i).getEstado().equals("D")){
            
                sinDesP=true;
            }
        
        }
        
        if(filaP==true){
        
            estadoP="F";
        
        } else if(filaP==false&&sinDesP==true){
        
            estadoP="F";
        
        }else if(sinDesP==false&&filaP==false){
        
            estadoP="D";
        
        }
        
        
        if(tP==0){
        
            sigP=0;
        
        }
        if(tC==0){
        
            sigC=0;
        
        }
        
        
        
         if(tC!=0){
        
        c.setArticulos(ordenC);
        c.setEstado(estadoC);
        }
         
        if(tP!=0){
        
        pic.setArticulos(ordenP);
        pic.setEstado(estadoP);
        
        }
        
     
        
       
        
        
        
        o.setAnio(anio);
        o.setDia(dia);
        o.setHora(""+hora+":"+minuto);
        o.setIdCafeteria(sigC);
        o.setIdPersonal(100);
        o.setIdPizzeria(sigP);
        o.setMes(mes);
        o.setOrdenDia(100);
        o.setTotal((int)tT);
        o.setTotalC((int)tC);
        o.setTotalP((int)tP);
        
       
        try{
             if(tC!=0){
        
       caf.create(c);
        }
        
        if(tP!=0){
        
       pizza.create(pic);
        
        }
        
        orden.create(o);
        
        JOptionPane.showMessageDialog(null,"Venta Registrada");
        
        inicializar();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"CAUSA: "+ex.getCause()+" MENSAJE: "+ex.getMessage());
        }
      
       
        
    
    }
    
    
    public void limpiarVenta(){
    
     VENTA_id_producto.clear();
    VENTA_cantidad.clear();
    VENTA_producto.clear();
    VENTA_precio.clear();
    VENTA_nota.clear();
    
    
    
    
    
    }
    
    
    public void agregarEgreso(String des, int total){
    
     
        EgresosJpaController egre = new EgresosJpaController(EntityMan.getInstance());
        Egresos e = new Egresos();
        
        e.setDescripcion(des);
        e.setTotal(total);
        
        try{
        egre.create(e);
        JOptionPane.showMessageDialog(null,"SALIDA DE DINERO REGISTRADA");
        
        inicializar();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public void mostrarEgresos(javax.swing.JList listaE){
    
     EgresosJpaController e = new EgresosJpaController(EntityMan.getInstance());
     List<Egresos> listEgresos=e.findEgresosEntities();
     
     modeloLista5 = new DefaultListModel();
        listaE.setModel(modeloLista5);
        
        
        
        
    for (int i = 0; i < listEgresos.size(); i++){
    
     modeloLista5.addElement(listEgresos.get(i).getDescripcion()+" $"+listEgresos.get(i).getTotal()+".");
     
        
    }
     
     
     
    
    
    }
    
    public void cuentas(javax.swing.JLabel tC, javax.swing.JLabel tP, javax.swing.JLabel tT,
            javax.swing.JLabel eg, javax.swing.JLabel TOTAL){
        
    OrdenJpaController o = new OrdenJpaController(EntityMan.getInstance());
     List<Orden> listOrden=o.findOrdenEntities();
     
     long totalesC=0;
     long totalesP=0;
     long totales=0;
     long totalesE=0;
     long caja=0;
     
     for(int i=0; i<listOrden.size(); i++){
     
     totalesC=totalesC+listOrden.get(i).getTotalC();
     totalesP=totalesP+listOrden.get(i).getTotalP();
     totales=totales+listOrden.get(i).getTotal();
     
     }
     
     EgresosJpaController e = new EgresosJpaController(EntityMan.getInstance());
     List<Egresos> listEgresos=e.findEgresosEntities();
     
     for(int i=0; i<listEgresos.size();i++){
     totalesE=totalesE+listEgresos.get(i).getTotal();
     
     }
     
     caja=totales-totalesE;
     
     tC.setText("$"+totalesC+".00");
     tP.setText("$"+totalesP+".00");
     tT.setText("$"+totales+".00");
     eg.setText("$"+totalesE+".00");
     TOTAL.setText("$"+caja+".00");
    
    
    
    }
    
    public void ventaMesero(int id, javax.swing.JLabel totalC, javax.swing.JLabel totalP, javax.swing.JLabel totalT,
            javax.swing.JLabel ventas){
    
    
         OrdenJpaController o = new OrdenJpaController(EntityMan.getInstance());
     List<Orden> listOrden=o.findOrdenEntities();
     
     long totalesC=0;
     long totalesP=0;
     long totales=0;
     long ven=0;
     
     for(int i=0; i<listOrden.size(); i++){
     
         if(listOrden.get(i).getIdPersonal()==id){
     totalesC=totalesC+listOrden.get(i).getTotalC();
     totalesP=totalesP+listOrden.get(i).getTotalP();
     totales=totales+listOrden.get(i).getTotal();
     ven++;
         }
     }
     
     
     totalC.setText("$"+totalesC+".00");
     totalP.setText("$"+totalesP+".00");
     totalT.setText("$"+totales+".00");
     ventas.setText(""+ven+" ordenes");
        
        
    }
    
    
    
}