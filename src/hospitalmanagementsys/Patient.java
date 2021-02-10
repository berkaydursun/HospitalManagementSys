/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsys;

/**
 *
 * @author BERKAY
 */
public class Patient {
    private String patientID;
    private String patientName;
    private String patientSurname;
    private String patientPassword;
    
    public Patient(){
    
    }
    
    public Patient(String patientID,String patientName,String patientSurname,String patientPassword){
    this.patientID=patientID;
    this.patientName=patientName;
    this.patientSurname=patientSurname;
    this.patientPassword=patientPassword;
    }
    
    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientSurname() {
        return patientSurname;
    }

    public void setPatientSurname(String patientSurname) {
        this.patientSurname = patientSurname;
    }

    public String getPatientPassword() {
        return patientPassword;
    }

    public void setPatientPassword(String patientPassword) {
        this.patientPassword = patientPassword;
    }
    
       
    
    
    
    
}
