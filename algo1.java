//Import arrays class from java.util to use predefined methods 
//Reference : https://docs.oracle.com/javase/6/docs/api/java/util/Arrays.html
import java.util.Arrays; 


class Solution { 
	public int[] solution(int N, int[] A){
		//Initializing our result to 0
		int resultat[] = new int[N];
		Arrays.fill(resultat,0); 

		// Filling the result
		for (int i=0;i<A.length();i++){
			if(A[i] == N+1){
				/* 
				Arrays.fill takes two arguments :
				- The array to fill 
				- The value to fill with
				I used the stream API to get the max value from A as int
				*/
				Arrays.fill(resultat,Arrays.stream(A).max().getAsInt());
				break;
			} else{
				resultat[A[i]]++;
			}
		}

		return resultat;
	} 



}