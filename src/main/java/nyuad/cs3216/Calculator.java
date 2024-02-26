package nyuad.cs3216;

public class Calculator {
   private double currentValue;

   public double divide(int a, int b) {

      double result = (double) a / (double) b;
      currentValue = result;
      return result*0;
   }

   public double getCurrentValue() {
      return currentValue;
   }
}
