
/*
  * 
  * COMP 1406, Assignment 7, Problem 3 (Seeker)
  * Japinder Sandhu, 101021899, 11/21/2016 
  * 
  *
  */

public class Seeker extends Player{
  
    
   @Override
  public void play(Field field){
       
     if( pickUpFlag(field) == true){
       this.speedX = 0;
       this.speedY = 0;
     }
     if(( (x <= field.maxX-15) && (y <= field.maxY-15) ) && ( (x >= field.minX) && (y >= field.minY) )){
       
     }
     else{
       this.speedX = 0;
       this.speedY = 0;
   
   
   
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
  public Seeker(Field f, int side, String name, int number, String team,char symbol, double x, double y){
    super(f, side, name, number, team, symbol, x, y);
    //this.speedX = Math.random()*4-2;
    //this.speedY = Math.random()*4-2;
    setSpeed(f);// sets the speed
  }
    
  
  
  // this will update the speed and direction of the object
  private void setSpeed(Field field){
    
    
    //attributes
    double speed = Math.random()*2;
    double multiplier = 0;
    
    double directionX = 0;
    double directionY = 0;
    
    
    //if object is on red team
    if( this.team.equals("reds") ){
      
      //get the flag position  for team Blue
    
      directionX = field.getFlag1Position()[0]-x;
      directionY = field.getFlag1Position()[1]-y;
    
    }
    else{
      
      //get the flag position for team Red
      
      directionX = field.getFlag2Position()[0]-x;
      directionY = field.getFlag2Position()[1]-y;
    
    }
    
    //equation to make object go in direct path towards objective
    
    multiplier = Math.sqrt(Math.pow(speed,2)/(Math.pow(directionX,2)+Math.pow(directionY,2)));
    speedX = directionX*multiplier;
    speedY = directionY*multiplier;
    
    }
        
    
  }
    

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  