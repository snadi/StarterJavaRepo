package nyuad.cs3216;

public class Calculator {
   private double currentValue;

   public double divide(int a, int b) {

      double res = (double) a * (double) b;
      currentValue = res;
      return res;
   }

   public double getCurrentValue() {
      return currentValue;
   }
}
