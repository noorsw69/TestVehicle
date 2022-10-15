 interface Vehicle{
    void accelerate();
    void deccelerate();




}
class  Car implements  Vehicle{
    String color;
    String weight;
    String model;
    public void setcolor(String color){
        this.color=color;}
    public void setweight(String weight){
        this.weight=weight;
    } public void setmodel(String model){
        this.model=model;
    }
    String getColor(){
        return color;
    }
    String getWeight(){
        return weight;
    }
    String getmodel(){
        return model;
    }
    public void accelerate() {

    }

    public void deccelerate() {

    }
    public void printDetails(){
        System.out.println("color:"+color);
        System.out.println("weight:"+weight);
        System.out.println("model:"+model);
    }
}
     class Truck implements  Vehicle{
         String color;
         String weight;
         String model;
         public void setcolor(String color){
             this.color=color;}
         public void setweight(String weight){
             this.weight=weight;
         } public void setmodel(String model){
             this.model=model;
         }
         String getColor(){
             return color;
         }
         String getWeight(){
             return weight;
         }
         String getmodel(){
             return model;
         }
     public void accelerate() {

     }

     public void deccelerate() {

     }
         public void printDetails(){
             System.out.println("color:"+color);
             System.out.println("weight:"+weight);
             System.out.println("model:"+model);
         }
 }
 class Bus implements  Vehicle {
     String color;
     String weight;
     String model;

     public void setcolor(String color) {
         this.color = color;
     }

     public void setweight(String weight) {
         this.weight = weight;
     }

     public void setmodel(String model) {
         this.model = model;
     }

     String getColor() {
         return color;
     }

     String getWeight() {
         return weight;
     }

     String getmodel() {
         return model;
     }

     public void accelerate() {

     }

     public void deccelerate() {

     }
     public void printDetails(){
         System.out.println("color:"+color);
         System.out.println("weight:"+weight);
         System.out.println("model:"+model);
     }
 }
 class HondaCar extends Car{
    
    public void CarDetails(){
        printDetails();
    }
 }
 class SchoolBus extends Bus{
    public void BusDetails(){
        printDetails();
    }
 }
 class VigoTruck extends Truck{

     public void TruckDetails(){
         printDetails();
     }
 }

public class TestVehicle {
    public static void main(String[] args) {
        HondaCar h=new HondaCar();
        h.printDetails();
        SchoolBus s=new SchoolBus();
        s.printDetails();
        VigoTruck v=new VigoTruck();
        v.printDetails();


    }
}
