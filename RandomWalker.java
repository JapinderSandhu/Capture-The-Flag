
/*
  * 
  * COMP 1406, Assignment 7, Problem 4 (RandomWalker)
  * Japinder Sandhu, 101021899, 11/21/2016 
  * 
  *
  */

public class RandomWalker extends Player{
  
    
   @Override
  public void play(Field field){
    // play is the logic for the player
    // you should make changes to the player's speed here
    // you should not update position
    if( Math.random() < 0.5){
      this.speedX *= 0.99;
    }
    if( Math.random() < 0.0005){
      this.speedY *= -1;
    }

    //
    // should not update position here
    //      updatePosition(1,field);
    // this is now removed.  
    //
    
    //if object is within barrier
    if(( (x <= field.maxX-15) && (y <= field.maxY-15) ) && ( (x >= field.minX) && (y >= field.minY) )){
      //do nothing
      
    }
    
    //if else negate the speed
    else{
      this.speedX = -this.speedX;
      this.speedY = -this.speedY;
    
   
   
   
    }
   }
   
  
  @Override
  public void update(Field field){}
 
  
  /** create a player that has some random motion 
    * <p>
    * the player starts in a random direction
    *
    * @param f is the field the player will be playing on
    * @param side is the side of the field the player will play on
    * @param name is this player's name 
    * @param number is this player's number
    * @param team is this player's team's name
    * @param symbol is a character representation of this player
    * @param x is the initial x position of this player
    * @param y is the initial y position of this player
    */
  public RandomWalker(Field f, int side, String name, int number, String team,char symbol, double x, double y){
    super(f, side, name, number, team, symbol, x, y);
    this.speedX = Math.random()*6-2;
    this.speedY = Math.random()*6-2;
  }
  
}
  
