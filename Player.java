public class Player{
   private Hand hand;
   private String name;
   private int position;
   private Board board;
   
   public Player(String name, boolean advanced, Board other){
      this.name = name;
      board = other;
      position = 0;
      if(advanced){
         hand = new Hand();
      }
   }
   
   //returns an int between 1 and 6
   public int spin(){
      return (int)((math.random() * 6) + 1);
   }
   
   //moves the player's position according to spin
   public void move(){
      position += spin();
   }
   
   //moves player to a certain position
   public void moveTo(int position){
      this.position = position;
   }
   
   //returns player's Name
   public String getName(){
      return name;
   }
   
   //returns player's position
   public int getPosition(){
      return position;
   }
   
   //for advanced mode only
   //moves another player down a chute 
   public void downChute(Player other){
      if(!(advanced)){
         // print error
      }
        int i = 0;
        int j;
      while(i < board.chuteLength()){
        if(other.getPositon() == board.chuteArray[i].getstart()){
          j = i;
          i = chuteArray.length();  
        }
        i++;
      }
      hand.discard(board.chuteArray(j).getCards(), chuteArray(j).getColor());
      other.moveTo(board.chuteArray(j).getEnd());
   }
   
   //for advanced mode only
   //moves this player up a ladder
   public void upLadder(){           //more efficiant way to write this?
      if(!(advanced)){
         // print error
      }
        int i = 0;
        int j;
      while(i < board.ladderLength()){
        if(other.getPositon() == board.ladderArray[i].getstart()){
          j = i;
          i = ladderArray.length();  
        }
        i++;
      }
      hand.discard(board.ladderArray(j).getCards(), ladderArray(j).getColor());
      other.moveTo(board.ladderArray(j).getEnd());

   }
   
}