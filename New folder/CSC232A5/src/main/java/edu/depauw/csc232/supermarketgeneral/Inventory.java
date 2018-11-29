package edu.depauw.csc232.supermarketgeneral;

public class Inventory {
   public Inventory() {
      for(int i = 0;i < 4; i++) {
         for(int j = 0;j < 100; j++) {
            storage[i][j]=false;
         }
            
         
         
      }
         
      
   }

   private boolean [][] storage = new boolean[4][100];
   
   public void sold(String itemName, int numberofitems)
   {
      int j=0;

      for(int i=0; i<numberofitems; i++)
      {
         for(int k=0; k<100; k++ )
         {
         
         while(j==0)
         {
            int f=itemNametonumber(itemName);
            if(storage[f][k]==true)
            {
               storage[f][k]=false;
            }
               j++;
            }
         }
      }
      
   }
   
   public void stock(String itemName, int numbertoStock) {
      for(int i = 0;i < numbertoStock; i++) { 
      storage[itemNametonumber(itemName)][i]=true;}
      
   }
      
      public int itemNametonumber(String item)
      {
         if(item=="apple")
         {
            return 0;
         }
         else if(item=="orange")
         {
            return 1;
         }
         else if(item=="shoe")
         {
            return 2;
         }
         else
         {
            return 3;
         }
         
      }
      
      int numberofapple;
      int numberoforanges;

      public String numitems(String item) {
         // TODO Auto-generated method stub
         return null;
      }
}
   
   
   
   
   
   
   
   


