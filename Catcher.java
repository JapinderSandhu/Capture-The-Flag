
/*
  * 
  * COMP 1406, Assignment 7, Problem 6 (Catcher)
  * Japinder Sandhu, 101021899, 11/21/2016 
  * 
  *
  */

class Catcher extends Player{
  
    
   @Override
  public void play(Field field){
     setSpeed(field);
       
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
  public Catcher(Field f, int side, String name, int number, String team,char symbol, double x, double y){
    super(f, side, name, number, team, symbol, x, y);
    //this.speedX = Math.random()*4-2;
    //this.speedY = Math.random()*4-2;
    
  }
  double speed = Math.random()*6;
  double multiplier = 0;
    
  double directionX = 0;
  double directionY = 0;
  private void setSpeed(Field field){
   
    
    if( this.team.equals("reds") ){
      
      
    
      directionX = field.team1.get(0).x-x;
      directionY = field.team1.get(0).y-y;
      //if catch player take to jail
      if(field.catchOpponent(this ,(Player) field.team1.get(0))){
        
        directionX = field.getJail2Position()[0]-x;
        directionY = field.getJail2Position()[1]-y;
        field.team1.get(0).x = this.x;
        field.team1.get(0).y = this.y;
        System.out.println("1");
        
        if(Math.hypot(this.x - field.getJail2Position()[0], this.y - field.getJail2Position()[1]) <= field.ARMS_LENGTH){
          field.team1.get(0).x = field.getBase1Position()[0];
          field.team1.get(0).y = field.getBase1Position()[1];
        }
        
        
      }
    
    }
    else{
      
      directionX = field.team2.get(0).x-x;
      directionY = field.team2.get(0).y-y;
     
      if(field.catchOpponent(this ,(Player) field.team2.get(0))){
        directionX = field.getJail1Position()[0]-x;
        directionY = field.getJail1Position()[1]-y;
        field.team2.get(0).x = this.x;
        field.team2.get(0).y = this.y;
        System.out.println("2");
        
        if(Math.hypot(this.x - field.getJail1Position()[0], this.y - field.getJail1Position()[1]) <= field.ARMS_LENGTH){
          field.team2.get(0).x = field.getBase2Position()[0];
          field.team2.get(0).y = field.getBase2Position()[1];
        }
        
        
      }
    
    }
    multiplier = Math.sqrt(Math.pow(speed,2)/(Math.pow(directionX,2)+Math.pow(directionY,2)));
    speedX = directionX*multiplier;
    speedY = directionY*multiplier;
    
    }
        
    
  }
    

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  