 class engine {
   void startengine() {
      System.out.println("Engine started");
   }
}

class bikeengine extends engine {
   @Override
   void startengine() {
      System.out.println("Bike engine started");
   }
}

class carengine extends engine {
   @Override
   void startengine() {
      System.out.println("Car engine started");
   }
}

public class Experiment5b{
   public static void main(String[] args) {
      bikeengine bike1 = new bikeengine();
      carengine car1 = new carengine();
      
      bike1.startengine();  
      car1.startengine();   
   } 
}