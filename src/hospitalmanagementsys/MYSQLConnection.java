/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsys;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BERKAY
 */
public class MYSQLConnection {
    
    private String kullaniciAdi="root";
    private String parola="12345678";

    private String db_Ismi="hospital_db";
    private String host="localhost";
    private int port=3306;
    
   private Connection con=getConnection();
    
    private Statement statement=null;
    
    private static MYSQLConnection instance=null;

    private MYSQLConnection(){
    }
         public static MYSQLConnection getInstance(){
    if(instance==null){
    synchronized (MYSQLConnection.class) {
        if (instance==null) {
	instance=new MYSQLConnection();
        }
    }
   
}
  return instance;
    }
         
    public Connection getConnection(){
      	 String url="jdbc:mysql://"+host+":"+port+"/"+db_Ismi;
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("No Found Driver");
        }
        
        try {
           con=(Connection) DriverManager.getConnection(url,kullaniciAdi,parola);
            System.out.println("Connection Succesfull");
            
        } catch (SQLException ex) {
            System.out.println("Connection Unsuccesfull");
        }
    
		return con;
	
    }
    
    
    public void addPatient(String query){
        try {
            
            statement=con.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void updatePatient(String query){
        try {
            
            statement=con.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void updateDoctor(String query){
        try {
            
            statement=con.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void updateAppointment(String query){
        try {
            
            statement=con.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    public void deleteAppointment(String query){
        try {
            
            statement=con.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    public void addAppointment(String query){
        try {
            
            statement=con.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void addDoctor(String query){
        try {
            
            statement=con.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void addHospital(String query){
        try {
            
            statement=con.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    
    
    
    public boolean controlPatientLogin(String id,String password){
    String sorgu="Select patient_id,patient_password From patient_table";
        try {
            statement=con.createStatement();           
          ResultSet rs=  statement.executeQuery(sorgu);  
          while(rs.next()){
          String patient_id=rs.getString("patient_id");
          String patient_password=rs.getString("patient_password");
          if(patient_id.equals(id)&&patient_password.equals(password)){
             return true;
          }
          
          }  
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    
    }
    
    public boolean controlDoctorLogin(String id,String password){
    String sorgu="Select doctor_id,doctor_password From doctor_table";
        try {
            statement=con.createStatement();           
          ResultSet rs=  statement.executeQuery(sorgu);  
          while(rs.next()){
          String doctor_id=rs.getString("doctor_id");
          String doctor_password=rs.getString("doctor_password");
          if(doctor_id.equals(id)&&doctor_password.equals(password)){
             return true;
          }
          
          }  
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    
    }
    
    public void showHospitals(JComboBox box){
    String sorgu="Select hospital_name From hospital_table";
        try {
            statement=con.createStatement();
            
          ResultSet rs=  statement.executeQuery(sorgu);
            
          while(rs.next()){
          String item=rs.getString("hospital_name");
          box.addItem(item);
          
          }  
          
          
          
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void showDoctors(JComboBox doctorBox,JComboBox hospitalBox,JComboBox departmentbox){
    String sorgu="Select doctor_name,doctor_surname,doctor_hospital,doctor_department From doctor_table where doctor_hospital="+"'"+hospitalBox.getSelectedItem()+"'"+"AND doctor_department ="+"'"+departmentbox.getSelectedItem()+"'";
        try {
            statement=con.createStatement();
            
          ResultSet rs=  statement.executeQuery(sorgu);
          doctorBox.removeAllItems();
          while(rs.next()){
          String item=rs.getString("doctor_name");
          String item2=rs.getString("doctor_surname");
          doctorBox.addItem(item+" "+item2);
          
          }  
          
          
          
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public String findDoctorID(JComboBox doctorBox,JComboBox hospitalBox,JComboBox departmentbox,JComboBox name){
            String sorgu="Select doctor_id,doctor_name,doctor_surname From doctor_table where doctor_hospital="+"'"+hospitalBox.getSelectedItem()+"'"+"AND doctor_department ="+"'"+departmentbox.getSelectedItem()+"'";
        try {
            statement=con.createStatement();
          ResultSet rs=  statement.executeQuery(sorgu);
          
          while(rs.next()){
          String item=rs.getString("doctor_name");
          String item2=rs.getString("doctor_surname");
          if(name.getSelectedItem().equals(item+" "+item2)){
              String id=rs.getString("doctor_id");    
              return id;
          }
          }  
          
          
          
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    
    
    public void showAppointments(JTable table){
    String sorgu="Select * From appointment_table where patient_id="+"'"+LoginScreen.patientid+"'";
        try {
            statement=con.createStatement();
            
          ResultSet rs=  statement.executeQuery(sorgu);
          DefaultTableModel model=(DefaultTableModel)table.getModel();
          while(rs.next()){
          String item=rs.getString("patient_id");
          String item2=rs.getString("hospital_name");
          String item3=rs.getString("doctor_name");
          
          Object add[]={item,item2,item3};
          model.addRow(add);
          }  
          
          
          
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public void showDoctorAppointments(JTable table){
        String sorgu="Select * From patient_table where patient_id in ("+"Select patient_id from appointment_table where doctor_id="+"'"+LoginScreen.doctorid+"'"+")";
        try {
            statement=con.createStatement();
            
          ResultSet rs=  statement.executeQuery(sorgu);
          DefaultTableModel model=(DefaultTableModel)table.getModel();
          while(rs.next()){
          String item=rs.getString("patient_id");
          String item2=rs.getString("patient_name");
          String item3=rs.getString("patient_surname");
          Object add[]={item,item2,item3};
          model.addRow(add);
          }  
          
          
          
        } catch (SQLException ex) {
            Logger.getLogger(MYSQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    
    public void showDepartments(JComboBox box){
    String [] items={"Cardiology","Dermatology","Endocrinologist","Hematologist","Neurologist","Oncolosist","Pathologists","Physiatrist"};
  
    for(int i=0;i<items.length;i++){
    box.addItem(items[i].toString());
    
    }
    }
    
    
    
    
    
    
}
