public class ChuteLadder{
   private boolean chute;
   private int start= 0;
   private int end = 0;
   private Color c;
   
   public Chute(Color other, Boolean chute){
        this.chute = chute;
        c = other;
        if(chute){
        while(end >= start || (end / 10) == (start / 10) || start == (end / 10 + 10)){
         end = (int)((math.random() * 100) + 1);
         start = (int)((math.random() * 100) + 1);
        }
        }else
         while(end <= start || (end / 10) == (start / 10) || end == (start / 10 + 10)){
         end = (int)((math.random() * 100) + 1);
         start = (int)((math.random() * 100) + 1);

         
   }
   
   public int getStart(){
      return start;
   }
   
   public int getEnd(){
      return end;
   }
}