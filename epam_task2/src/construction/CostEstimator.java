package construction;

public class CostEstimator {
	
	int standard;
	int area;
	boolean isAutomate;
	
	/*
	 * Arguments are of type Standard , int , boolean to the constructor of class CostEstimator
	 */
	
	public CostEstimator(Standard standard,int area,boolean isAutomate) {
		
		this.standard=standard.getValue();
		this.area=area;
		this.isAutomate=isAutomate;	
	
	}
	
	// constructionCost method to evaluate cost of construction
	
	public long constructionCost() {
		 long cost=0;
			if(standard==0 && !isAutomate &&area>0) {
				cost=1200*area;
			}
			else if(standard==1 && !isAutomate && area>0){
				cost=1500*area;
			}
			else if(standard==2 && !isAutomate && area>0) {
				cost=1800*area;
			}
			else if(standard==2 && isAutomate && area>0) {
				cost=2500*area;
			}
			else {
				throw new IllegalArgumentException("Enter correct values");
			}
			return cost;
	}
	
}

// Standard class to evaluate standards of meterial

class Standard{
	  private int standard;
	  Standard(String str){
	    if(str.equalsIgnoreCase("standard")){
	      standard=0;
	    }
	    else if(str.equalsIgnoreCase("above standard")){
	      standard=1;
	    }
	    else if(str.equalsIgnoreCase("high standard")){
	      standard=2;
	    }
	  }
	  public int getValue(){
	    return standard;
	  }
	}