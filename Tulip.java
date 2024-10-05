public class Tulip extends Flower {

  private String type;

  //no argument
  public Tulip() {
    super("Red", "Tulip", 2.50, false, 0);
  }
  /*Assigns all variables
  uses super and calculatePrice from Flower superclass
  */
  public Tulip(String color, boolean isExotic, int amt, String type) {
    super(color, "Tulip", 2.50, isExotic, amt);
    calculatePrice(2.50, amt, 0, false);
    setType(type);
  }
  //Reassigns type
  public void setType(String type) {
    this.type = type;
  }

  //Returns type
  public String getType() {
    return type;
  }

  // Supers toString and adds type
  public String toString() {
    return "------------------\n" + super.toString() + "\nType: " + type + "\n------------------";
  }
}