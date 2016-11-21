
/*
  * 
  * COMP 1406, Assignment 7, Problem 5 (Chaser)
  * Japinder Sandhu, 101021899, 11/21/2016 
  * 
  *
  */

public class Chaser extends Player{
  
    
   @Override
  public void play(Field field){
     setSpeed(field);
       //if object picks up flag, switch speed to zero
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
  public Chaser(Field f, int side, String name, int number, String team,char symbol, double x, double y){
    super(f, side, name, number, team, symbol, x, y);
    //this.speedX = Math.random()*4-2;
    //this.speedY = Math.random()*4-2;
    
  }
  
  //attributes
  double speed = Math.random()*4;
  double multiplier = 0;
    
  double directionX = 0;
  double directionY = 0;
  private void setSpeed(Field field){
   
    
    if( this.team.equals("reds") ){
      
      
    //gets coordinates of other team object
      directionX = field.team1.get(0).x-x;
      directionY = field.team1.get(0).y-y;
    
    }
    else{
     //gets coordinates of other team object
      directionX = field.team2.get(0).x-x;
      directionY = field.team2.get(0).y-y;
    
    }
    
    //equation for direct path towards set object
    multiplier = Math.sqrt(Math.pow(speed,2)/(Math.pow(directionX,2)+Math.pow(directionY,2)));
    speedX = directionX*multiplier;
    speedY = directionY*multiplier;
    
    }
        
    
  }
    

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  