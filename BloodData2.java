public class BloodData {
    
    private String bloodType;
    private String rhFactor;

    public BloodData() {
        this.bloodType = "O";
        this.rhFactor = "+"; 
    }
    public BloodData(String bloodtype, String rhFactor){
        this.bloodType = bloodtype;
        this.rhFactor = rhFactor;
    }
    public String getbloodType(){
        return bloodType;
    }
    public void setbloodType(String bloodtype) {
        this.bloodType = bloodtype;
    }
    public String getrhFactor() {
        return rhFactor;
    }
    public void setrhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }
    public void display() {
        System.out.println(bloodType + rhFactor + " is added to the blood bank.");
    }
 }
