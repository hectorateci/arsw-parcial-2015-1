package edu.eci.arsw.primefinder;

import edu.eci.arsw.utils.MouseMovementMonitor;
import edu.eci.arsw.utils.MathTools;
import java.math.BigInteger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrimesFinderTool {

	public static void main(String[] args) {
		
            
            ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
            
            PrimeFinderThread pft1=ac.getBean(PrimeFinderThread.class, new Object[]{new BigInteger("0"),new BigInteger("100")});
            PrimeFinderThread pft2=ac.getBean(PrimeFinderThread.class, new Object[]{new BigInteger("200"),new BigInteger("300")});
            PrimeFinderThread pft3=ac.getBean(PrimeFinderThread.class, new Object[]{new BigInteger("400"),new BigInteger("500")});
            
            pft1.start();
            pft2.start();
            pft3.start();
            
            System.out.println("Números primos encontrados:");
            System.out.println(pft1.getPrimes());
            System.out.println(pft2.getPrimes());
            System.out.println(pft3.getPrimes());
            
	}
	
}
