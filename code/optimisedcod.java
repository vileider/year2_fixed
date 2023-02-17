 public static int findFirstNearestSmallerNumberthanGivenBetweenZeroAndGivenPosition(int []_stockDataAsArr, int givenPosition){

        int smallest = -1;
        //int[] _stockDataAsArr = _stockData.stream().mapToInt(i -> i).toArray();
        int _givenPosition = givenPosition -1;
        int i = _givenPosition ;
        boolean loopstop = false;
        
        while(!loopstop)   {
            if(_stockDataAsArr[i] < _stockDataAsArr[_givenPosition]){
                loopstop = true;
                smallest = i +1;
                
            }
            if(i> 0){
                i--;

            }else{
               loopstop = true; 
               
            }                     
        } 
        return smallest;
        
    }
    
    public static int findFirstNearestSmallerNumberthanGivenBetweenGivenPositionAndMaxRange(int []_stockDataAsArr, int givenPosition){
        
        int smallest = -1;
        //int[] _stockDataAsArr = _stockData.stream().mapToInt(i -> i).toArray();
        int _givenPosition = givenPosition -1;
        int i = _givenPosition ;
        boolean loopstop = false;
        
        while(!loopstop){            
            if(_stockDataAsArr[i] < _stockDataAsArr[_givenPosition]){
                loopstop = true;
                smallest = i +1;
                
            }
            if(i< _stockDataAsArr.length-1){
                i++;    
                
            }else{
               loopstop = true; 
               
            }                    
        } 
        return smallest;
        
    }
    
    public static List<Integer> predictAnswer(List<Integer> stockData, List<Integer> queries) {
    // Write your code here
    ArrayList<Integer> tempArr = new ArrayList<>();
    int[] stockDataAsArr = stockData.stream().mapToInt(i -> i).toArray();
    for(int i =0; i< queries.size(); i++){
        int tempInt = -1;
        int betweenZeroAndGivenPositionTempInt = findFirstNearestSmallerNumberthanGivenBetweenZeroAndGivenPosition(stockDataAsArr, queries.get(i));
            
        int betweenGivenPositionAndMaxRangeTempint =findFirstNearestSmallerNumberthanGivenBetweenGivenPositionAndMaxRange(stockDataAsArr,queries.get(i));
  
        if(betweenZeroAndGivenPositionTempInt != -1){
            //first number exist
            if(betweenGivenPositionAndMaxRangeTempint != -1){
                //both number exists
                //setting up distance between lowest numbers
                int zeroToGivenDistance = queries.get(i) - betweenZeroAndGivenPositionTempInt;
                int givenToArrLenhDistance = betweenGivenPositionAndMaxRangeTempint - queries.get(i);
                //closest int with smaller value written into temp int
                if(zeroToGivenDistance == givenToArrLenhDistance){
                    tempInt = betweenZeroAndGivenPositionTempInt;
                    
                }else if(zeroToGivenDistance < givenToArrLenhDistance){
                    tempInt = betweenZeroAndGivenPositionTempInt;
                    
                }else if(zeroToGivenDistance > givenToArrLenhDistance){
                    tempInt = betweenGivenPositionAndMaxRangeTempint;
                    
                }
                
            }else{
               tempInt= betweenZeroAndGivenPositionTempInt;
               
            }
        }else if(betweenGivenPositionAndMaxRangeTempint != -1){
            //only second number exist and its value is passed to temporary int
            tempInt = betweenGivenPositionAndMaxRangeTempint;
            
        } 
        tempArr.add(tempInt);
        
    }  
        return tempArr;
        
    }

}