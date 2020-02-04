public class CurrencyConversion {

      public static void main(String[] args) {
          double cad, usd, eur;
          final double usdRate = 0.75;
          final double eurRate = 0.68;

          cad = 5;
          usd = cad * usdRate;
          eur = cad * eurRate;

          System.out.println("\n" + " We have " + cad + "Canadian Dollars");
          System.out.println( cad + " Canadian Dollars is equal to " + usd + " American Dollars");
          System.out.println( cad + " Canadian Dollars is equal to " + eur + " Euros");
      }
}
