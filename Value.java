

public enum Value {
  TWO(2),
  THREE(3),
  FOUR(4),
  FIVE(5),
  SIX(6),
  SEVEN(7),
  EIGHT(8),
  NINE(9),
  TEN(10),
  JACK(11),
  QUEEN(13),
  KING(14),
  ACE(15);

  private int value; 

  private Value(int value) { 
    this.value = value;
   }

  public int getRank(){
    return value
  }
}