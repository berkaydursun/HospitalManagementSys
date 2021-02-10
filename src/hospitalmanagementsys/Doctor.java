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
public class Doctor {
    private String doctorID;
    private String doctorName;
    private String doctorSurname;
    private String doctorHospital;
    private String doctorDepartment;
    private String doctorPassword;

    public Doctor(String doctorID, String doctorName, String doctorSurname, String doctorHospital, String doctorDepartment, String doctorPassword) {
        this.doctorID = doctorID;
        this.doctorName = doctorName;
        this.doctorSurname = doctorSurname;
        this.doctorHospital = doctorHospital;
        this.doctorDepartment = doctorDepartment;
        this.doctorPassword = doctorPassword;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSurname() {
        return doctorSurname;
    }

    public void setDoctorSurname(String doctorSurname) {
        this.doctorSurname = doctorSurname;
    }

    public String getDoctorHospital() {
        return doctorHospital;
    }

    public void setDoctorHospital(String doctorHospital) {
        this.doctorHospital = doctorHospital;
    }

    public String getDoctorDepartment() {
        return doctorDepartment;
    }

    public void setDoctorDepartment(String doctorDepartment) {
        this.doctorDepartment = doctorDepartment;
    }

    public String getDoctorPassword() {
        return doctorPassword;
    }

    public void setDoctorPassword(String doctorPassword) {
        this.doctorPassword = doctorPassword;
    }
    
    
    
    
}
