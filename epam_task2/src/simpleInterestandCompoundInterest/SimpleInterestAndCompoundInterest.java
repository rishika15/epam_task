package simpleInterestandCompoundInterest;

public class SimpleInterestAndCompoundInterest{
	
	double principle,rate,time,n;

	public SimpleInterestAndCompoundInterest(double principle,double rate,double time,double n) {
		this.principle=principle;
		this.rate=rate;
		this.time=time;	
		this.n=n;
	}
	
	public double simpleInterest() {
		return (principle*rate*time)/n;
	}
	
	public double compoundInterest() {
		return principle*Math.pow((1+rate/n),(n*time));
	}
	
}
