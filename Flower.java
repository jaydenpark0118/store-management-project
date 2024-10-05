public class Flower {
  
  private String color;
  private String name;
  private double price;
  private boolean isExotic;
  private int amt;

  //no argument constructor
  public Flower() {
    color = "not picked";
    name = "not picked";
    price = 0.00;
    isExotic = false;
    int amt = 0;
    calculatePrice(price, amt, 0, false);
  }

  //assigns values to all instance variables
  public Flower(String color, String name, double price, boolean isExotic, int amt) {
    this.color = color;
    this.name = name;
    setPrice(price);
    this.isExotic = isExotic;
    this.amt = amt;
    calculatePrice(price, amt, 0, false);
  }

  //calculates price based on what the user picked
  public double calculatePrice(double price, int amt, int stock, boolean removeThorns) {
    if(isExotic == false && removeThorns == false) {
      this.price = price * amt;
    } else if (removeThorns == true) {
      this.price = (price * amt) + 6.00;
    } else {
      if(stock < 10) {
        this.price = (price * amt) + 12.00;
      } else if (stock < 20){
        this.price = (price * amt) + 8.00;
      } else {
        this.price = (price * amt) + 4.00;
      }
    }
    return price;
  }
  /*
  All accessor methods
  returns each variable
  */
  public String getColor() {
    return color;
  }

  public String getName() {
    return name;
  }

  public boolean getIsExotic() {
    return isExotic;
  }

  public int getAmt() {
    return amt;
  }

  /*
  All mutator methods
  Reassigns all variables
  */
  public void setColor(String color) {
    this.color = color;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setIsExotic(boolean isExotic) {
    this.isExotic = isExotic;
  }

  public void setAmt(int amt) {
    this.amt = amt;
  }

  //Prints out all information
  public String toString() {
    return "Name: " + name + "\nColor: " + color + "\nExotic? " + isExotic + "\nAmount: " + amt + "\nPrice: " + price;
  }
}