import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    //starts scanner
    System.out.println("How many types of flowers do you want?");
    int loopamt = input.nextInt();
    
    for(int i = 1; i <= loopamt; i++) {
      
      System.out.println("What kind of flower do you want for flower#" + i + "?" + "\n1 for Roses\n2 for Tulips\n3 for Birds of Paradise");
      int flower1 = input.nextInt();
      if(flower1 == 1) {
        String colorR;
        int amtR = 0;
        boolean removeThornsR = false;

        System.out.println("What color of roses would you like? \n1 for red \n2 for pink \n3 for white \n4 for yellow \n5 for blue");
        int color1 = input.nextInt();
        if(color1 == 1) {
          colorR = "Red";
        } else if (color1 == 2) {
          colorR = "Pink";
        } else if(color1 == 3) {
          colorR = "White";
        } else if(color1 == 4) {
          colorR = "Yellow";
        } else {
          colorR = "Blue";
        }

        System.out.println("How many roses would you like?");
        amtR = input.nextInt();

        System.out.println("Would you like us to remove the thorns for you? \nIt costs $7.00 \n1 for yes \n2 for no");
        int thorns = input.nextInt();
        if(thorns == 1) {
          removeThornsR = true;
        } else {
          removeThornsR = false;
        }
        
        Rose x = new Rose(colorR, false, amtR, removeThornsR);
        System.out.println(x);
      } else if (flower1 == 2) {
        String colorT;
        int amtT = 0;
        String typeT = "";

        System.out.println("What kind of tulips would you like? \n1 for parrot tulips \n2 for triumph tulips \n3 for Darwin hybrid tulips \n4 double tulips");
        int type1 = input.nextInt();
        if(type1 == 1) {
          typeT = "Parrot Tulips";
        } else if(type1 == 2) {
          typeT = "Triumph Tulips";
        } else if(type1 == 3) {
          typeT = "Darwin Hybrid Tulips";
        } else {
          typeT = "Double Tulips";
        }
        
        System.out.println("What color of tulips would you like? \n1 for red \n2 for pink \n3 for orange \n4 for yellow \n5 for purple");
        int color2 = input.nextInt();
        if(color2 == 1) {
          colorT = "Red";
        } else if (color2 == 2) {
          colorT = "Pink";
        } else if(color2 == 3) {
          colorT = "Orange";
        } else if(color2 == 4) {
          colorT = "Yellow";
        } else {
          colorT = "Purple";
        }
        
        System.out.println("How many tulips would you like?");
        amtT = input.nextInt();

        Tulip y = new Tulip(colorT, false, amtT, typeT);
        System.out.println(y);
      } else if (flower1 == 3) {

        System.out.println("How many Birds of Paradise would you like?");
        int amtB = input.nextInt();

        BoP z = new BoP(amtB);
        System.out.println(z);
      }
    }
    
    // Closes the Scanner object
    input.close();
    
  }
}