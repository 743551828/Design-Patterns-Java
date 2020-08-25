package 解释器模式.code;

public class TerminalExpression implements Expression {
   
   private final String data;
 
   public TerminalExpression(String data){
      this.data = data; 
   }
 
   @Override
   public boolean interpret(String context) {
      return context.contains(data);
   }
}