package nyuad.cs3216;

public class Calculator {
   private double currentValue;

   public double divide(int a, int b) {

      double result = (double) a / (double) b;
      currentValue = result;
      return result;
   }

   public double multiply(int a, int b){
      double result = (double) a * (double) b;
      currentValue = result;
      return currentValue;
   }

   // public double getMultiplyValue(){
   //    return multiplyValue;
   // }

   public double getCurrentValue() {
      return currentValue;
   }
}
