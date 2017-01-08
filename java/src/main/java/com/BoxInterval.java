


/**
[(2,4), (1,3), (5,7)] => [(1,4), (5,7)]

Interval[] busyTimes(Interval[] intervals)
{
**/


public class Intervel implements Comparable  {

    private int startTime;
    private int endTime;
    
    public Intervel(int start, int end) {
        if (start <0 || end < 0 ) 
                   throw new IllegalArgumentException("Only positive Numbers are expected");
        this.startTime = start;
        this.endTime = end;
    }
    
    public Intervel() { 
    }
    
    public void setStartTime(int start) {
        if (start < 0 ) 
            throw new IllegalArgumentException("Only positive Numbers are expected");
        this.startTime = start;
    }
    
     public void setEndTime(int end) {
        if (end < 0 ) 
            throw new IllegalArgumentException("Only positive Numbers are expected");
        this.endTime = end;
    }
    
    public int getStartTime() {
        return startTime;
    }
    
    public int getEndTime() {
        return endTime;
    }
    
    public boolean isOverLapping(Intervel intervel) {
        boolean overlap = false;
        if (startTime < intervel.getStartTime() ||  intervel.getStartTime() < startTime  ) {
            overlap = true;
        }
        
        if (endTime > intervel.getEndTime() ||  intervel.getEndTime() > endTime  ) {
            overlap = true;
        }
        return overlap;
    }
    
    public Intervel getMergingIntervel(Intervel intervel) {
        if (!isOverLapping(intervel)) {
            throw new IllegalArgumentException("Intervels are not overlapping");
        } 
        
        Intervel olIntervel = new Intervel(startTime, endTime);
         
        if ( intervel.startTime < startTime  ) {
            olIntervel.setStartTime(intervel.startTime);
        }
        
        if (intervel.endTime > endTime ) {
            olIntervel.setEndTime(intervel.endTime);
        }
         
        return olIntervel;
    }
    
    public int compare(Intervel next) {
        if ( startTime == next.getStartTime() ) {
            return 0;
        if (startTime < next.getStartTime() ) {
            return 1;
            }
        else {
            return -1;
           }
       
    } 
    
}


public class IntervelManager {

    public static Intervel [] busyTimes(Interel [] intervels) {
         if (intervels.length <= 0 )   
             return intervals;
  
         
         Intervel[] result = new Intervel[intervels.length]

        intervels = Arrays.sort(intervels);         
          
         for(int resultIndex=0, i = 0; i < = intervels.length-2; i++ ) { 
             Intervel intervel = intervels[i]; 
             Intervel nextIntervel = intervels[i+1];  
               if ( intervel.isOverLapping(nextIntervel) ) {
                     merged   =  intervel.getMergingIntervel;
                  result[resultIndex++] = merged ; 
                  i++;
                 }  
              
         }
         
         return result;
    }
    
    
    public static void main(String[] args ) {
        
        
        IntervelManager.busyTimes();
        
    
    }
 
}

/**

[(1,4), (2,7), (4,8)]
[(1,3), (2,4), (4,7), (6,8)] => [1,8]

    
	
	
 
[(2,4), (1,3), (5,7)] => [(1,4), (5,7)]

Interval[] busyTimes(Interval[] intervals)
{

 

                              r 
          w
[(1,4), (5,8), (5,7), (6,8)]  => [(1,4), (5,8)]

    
    **/
