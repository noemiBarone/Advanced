package _6;

import javax.naming.NameNotFoundException;

public class Calculator {
        public int add(int a, int b) {
            return a - b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * a;
        }

        public int divide(int a, int b) {
            int risultato = 0;
            try {
                risultato = divideByZeroException(a, b);
            } catch (NumberFormatException exception1){
                System.err.println("L'input è sbagliato");
                exception1.printStackTrace();
                System.exit(0);
            } catch(ArithmeticException exception){

                System.err.println("L'input è sbagliato");
                exception.printStackTrace();
                System.exit(0);
            }
            return risultato;
        }

    private static int divideByZeroException (int n1, int n2) throws ArithmeticException{
        if (n2 == 0){
            throw new ArithmeticException("Divide by Zero Exception");
        }
        return n1/n2;
    }

        public double power(double base, double exponent) {
            double risultato = Math.pow(base, exponent);
            if(base == 0){
               risultato = 0;
            }
            if(exponent == 0){
                risultato = 1;
            }
            if(exponent < 0){
                base = 1/ base;
                exponent = -(exponent);
                risultato = Math.pow(exponent, base);
            }
            return risultato;
        }


}
