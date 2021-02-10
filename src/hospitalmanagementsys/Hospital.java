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
public class Hospital {
    private String hospitalName;
    private String hospitalLocation;
    private int hospitalCapacity;

    public Hospital(String hospitalName, String hospitalLocation, int hospitalCapacity) {
        this.hospitalName = hospitalName;
        this.hospitalLocation = hospitalLocation;
        this.hospitalCapacity = hospitalCapacity;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalLocation() {
        return hospitalLocation;
    }

    public void setHospitalLocation(String hospitalLocation) {
        this.hospitalLocation = hospitalLocation;
    }

    public int getHospitalCapacity() {
        return hospitalCapacity;
    }

    public void setHospitalCapacity(int hospitalCapacity) {
        this.hospitalCapacity = hospitalCapacity;
    }
    
    
    
}
