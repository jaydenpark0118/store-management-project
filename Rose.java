public class Rose extends Flower {
  
  private boolean removeThorns;
  //No argument constructor
  public Rose() {
    super("Red", "Rose", 2.50, false, 0);
  }
  /*Assigns all variables
  uses super and calculatePrice from Flower superclass
  */
  public Rose(String color, boolean isExotic, int amt, boolean removeThorns) {
    super(color, "Rose", 2.50, isExotic, amt);
    calculatePrice(2.50, amt, 0, removeThorns);
    setRemoveThorns(removeThorns);
  }
  //Reassigns removeThorns variable
  public void setRemoveThorns(boolean removeThorns) {
    this.removeThorns = removeThorns;
  }
  //Returns removeThorns
  public boolean getRemoveThorns() {
    return removeThorns;
  }
  //Supers toString in superclass and adds the remove thorns
  public String toString() {
    return "------------------\n" + super.toString() + "\nRemove thorns? " + removeThorns + "\n------------------";
  }
}