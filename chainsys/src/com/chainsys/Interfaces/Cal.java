package com.chainsys.Interfaces;
public class Cal{
	public static void testMarker()
    {
        CalculatorB firstCalculator=new CalculatorB();
        if(firstCalculator instanceof ICalculator)
        {
            ICalculator contract=firstCalculator;
            int output=0;
            output=contract.add(10,5);
            System.out.println(output);
            output=contract.multiply(10,5);
            System.out.println(output);
            output=contract.divide(10,5);
            System.out.println(output);
        }
        else
            System.out.println(firstCalculator.getClass().getName()+"does not Implement ICalculator");
    }
}

