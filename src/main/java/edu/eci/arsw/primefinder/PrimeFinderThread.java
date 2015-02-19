package edu.eci.arsw.primefinder;

import edu.eci.arsw.utils2.MathUtilities;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class PrimeFinderThread extends Thread{
        
	
        private BigInteger a,b;
	
	private List<BigInteger> primes=new LinkedList<BigInteger>();
                
        private MathUtilities mt=new MathUtilities();
        
        private int itCount=0;
        
	public PrimeFinderThread(BigInteger a, BigInteger b) {
		super("("+a+".."+b+")");
		this.a = a;
		this.b = b;
	}

	public void run(){
            
                BigInteger i=a;
                while (i.compareTo(b)<=0){
                    itCount++;
                    if (mt.isPrime(i)){
                        primes.add(i);
                    }
                    if (itCount%1000==0){
                        System.out.println("Thread"+this.getName()+":"+itCount+
                                " numbers processed. "+primes.size()+" prime numbers found");
                    }

                    i=i.add(BigInteger.ONE);
                }
                
	}
	


	public List<BigInteger> getPrimes() {
		return primes;
	}
	
	
	
	
}
