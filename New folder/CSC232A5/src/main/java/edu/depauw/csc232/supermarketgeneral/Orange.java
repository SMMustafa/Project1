package edu.depauw.csc232.supermarketgeneral;

public class Orange extends Perishable {

   public Orange() {
      
   }

   public Orange(int PerishedItemNum, int DaysOfPerishedItemNum) {
      super(PerishedItemNum, DaysOfPerishedItemNum);
      
   }

 
   
   public static void displayInfo()
   {
      System.out.println("Apple price: $2/kg");
   }
}
