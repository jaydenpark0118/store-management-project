public class BoP extends Flower {

  private int stock = 25;
  //no argument 
  public BoP() {
    super("Yellow", "Birds of Paradise", 4.00, true, 0);
  }

  /*Assigns all variables
  uses super and calculatePrice from Flower superclass
  */
  public BoP(int amt) {
    super("Yellow", "Birds of Paradise", 4.00, true, amt);
    calculatePrice(4.00, amt, stock, false);
  }

  /*Reassigns the current stock
  Changes money values
  */
  public String newStock(int stock) {
    this.stock -= getAmt();
    return "Remaing Birds of Paradise stock: " + this.stock;
  }

  //returns remaining stock
  public int getStock() {
    return stock;
  }

  //Supers the toString and adds the new stock
  public String toString() {
  return "------------------\n" + super.toString() + "\n------------------" + "\n" + newStock(stock);  
  }
}