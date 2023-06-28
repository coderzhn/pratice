import org.w3c.dom.Node;

import java.util.Stack;

/**
 * @ProjectName: Algorithm_Study
 * @Package: PACKAGE_NAME
 * @ClassName: CQueue
 * @Date: 2023/6/12 14:57
 */
public class CQueue {
   private Stack<Integer> inStack;
   private Stack<Integer> outStack;
   public CQueue(){
      inStack = new Stack<>();
      outStack = new Stack<>();
   }
   public void appendTail(int value){
      inStack.push(value);
   }
   public int deleteHead() {
      if (!outStack.isEmpty()) {
         return outStack.pop();
      } else {
         while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
         }
         return outStack.isEmpty() ? -1 : outStack.pop();
      }
   }
}
