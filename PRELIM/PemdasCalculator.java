import java.util.Scanner;

public class PemdasCalculator{
   public static void main(String[] args) throws Exception{
	   
      Scanner scan = new Scanner(System.in);
      
      while(true) {
    	  System.out.print("Enter an expression (e.g. 1+(2-3)*4) | Enter 0 to Exit: ");
    	  String expression = scan.nextLine();
    	  
    	  if(expression.equals("0")) break;
    	  else {
    		  double result = evaluation1(expression);
    		  System.out.println("Result: " + result);
    	  }
      }
   }
   
   public static double evaluation1(String expression) throws Exception {
      expression = expression.replaceAll("\\s+", ""); 
      return evaluation2(expression);
   }

   private static double evaluation2(String expression) throws Exception {
      if (expression.isEmpty()) { System.out.println("You entered an empty expression"); }

      try { return Double.parseDouble(expression); } 
      catch (NumberFormatException e) { }

      int parentCtr = 0;     
      for (int i = expression.length() - 1; i >= 0; i--){
         char c = expression.charAt(i);
         
         if (c == ')') { parentCtr++; } 
         else if (c == '(') { parentCtr--; }

         if (parentCtr == 0 && (c == '+' || c == '-') && i > 0){
            char operator = c;
            String leftOp = expression.substring(0, i);
            String rightOp = expression.substring(i + 1);

            if (operator == '+') { return evaluation2(leftOp) + evaluation2(rightOp); } 
            else { return evaluation2(leftOp) - evaluation2(rightOp); }
         }
      }

      parentCtr = 0;       
      for (int i = expression.length() - 1; i >= 0; i--){
         char c = expression.charAt(i);
         
         if (c == ')') { parentCtr++; } 
         else if (c == '(') { parentCtr--; }

         if (parentCtr == 0 && (c == '*' || c == '/') && i > 0) {
            char operator = c;
            String leftOp = expression.substring(0, i);
            String rightOp = expression.substring(i + 1);

            if (operator == '*') { return evaluation2(leftOp) * evaluation2(rightOp); } 
            else { return evaluation2(leftOp) / evaluation2(rightOp); }
         }
      }
      
      if (expression.charAt(0) == '(' && expression.charAt(expression.length() - 1) == ')'){
         return evaluation2(expression.substring(1, expression.length() - 1));
      }
      
      throw new Exception("Invalid expression: " + expression);
   }
}
