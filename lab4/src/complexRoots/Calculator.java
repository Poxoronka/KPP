package complexRoots;
import  java.lang.Math;

public class Calculator extends Thread{
    Calculator(
            double realPart,
            double imaginaryPart,
            double rootPower,
            double num){
        real = realPart;
        imaginary = imaginaryPart;
        power = rootPower;
        n = num;
    }

    double real, imaginary, power, n,
            modulus, argument;
    String result;

    public  void  run()
    {
        modulus = Math.hypot(real, imaginary);
        argument = Math.atan(imaginary/real);

        double resultRealPart = Math.pow(modulus, 1/power)*
                Math.cos((argument+2*n*Math.PI)/power);
        double resultImaginaryPart = Math.pow(modulus, 1/power)*
                Math.sin((argument+2*n*Math.PI)/power);

        result = String.valueOf(resultRealPart) + String.valueOf(resultImaginaryPart) + " i";

    }

    public String getResult() {
        return result;
    }
}
