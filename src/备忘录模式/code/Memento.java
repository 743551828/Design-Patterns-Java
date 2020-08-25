package 备忘录模式.code;

public class Memento {
   private final String state;
 
   public Memento(String state){
      this.state = state;
   }
 
   public String getState(){
      return state;
   }  
}