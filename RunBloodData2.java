public class RunBloodData {
    public static void main(String[] args) {
        BloodData bd = new BloodData("A", "+");
        System.out.println("Blood Type: " + bd.getBloodType());
        bd.setRhFactor("-");  
        bd.display();  
    }
}