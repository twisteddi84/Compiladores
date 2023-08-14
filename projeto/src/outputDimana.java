import java.util.*;
import java.io.*;

public class outputDimana {
    public static void main(String[] args) {
        System.out.println("Length created"); 
        System.out.println("Time created"); 
        System.out.println("Mass created"); 
        System.out.println("Temperature created"); 
        System.out.println("ElectricCurrent created"); 
        System.out.println("AmountOfSubstance created"); 
        System.out.println("LuminousIntensity created"); 
        System.out.println("Convertion: inch,in = 0.0254*meter"); 
        System.out.println("Velocity created"); 
        System.out.println("Acceleration created"); 
        System.out.println("Area created"); 
        System.out.println("Volume created"); 
        System.out.println("Force created"); 
        DimGenerator x = new DimGenerator("Length", "meter", "double") ;
        DimGenerator y = new DimGenerator("Length", "meter", "double") ;
        String TestString ;

        x.setValue1(10*1);

        y.setValue1(5*1);

        int TestInteger = 5 ;
        if ((int) x.getValue1()>(int) y.getValue1()) {
            System.out.println("x is greater than y."); 
        }
        else {
            System.out.println("x is not greater than y."); 
        }
    }
}