package 访问者模式.code;

public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}