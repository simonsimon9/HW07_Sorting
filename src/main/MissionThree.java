package main;

import java.util.ArrayList;

public class MissionThree {

	/**
	 * Merges two sorted arrays, and computer the difference in scores
	 * 
	 * @param person1 a sorted array of medals
	 * @param person2 a sorted array of medals
	 * @return the difference in score of person1 and person2
	 */
	public static <T extends Comparable<? super T>> int merge(T[] person1, T[] person2) {
		T[] mergedArray = (T[]) new Comparable[person1.length+person2.length];
		int indexMArray = 0;
		int indexPerson1 = 0;
		int indexPerson2 = 0;
		int tallyPerson1 = 0;
		int tallyPerson2 = 0;
		while(indexPerson1 != person1.length && indexPerson2 != person2.length) {
			
			if(person1[indexPerson1].compareTo(person2[indexPerson2]) < 0) {
				mergedArray[indexMArray] = person1[indexPerson1];
				tallyPerson1 = tallyPerson1 + indexMArray + 1;
				indexMArray++;
				indexPerson1++;
				
			}else if(person1[indexPerson1].compareTo(person2[indexPerson2]) > 0) {
				mergedArray[indexMArray] = person2[indexPerson2];
				tallyPerson2 = tallyPerson2 + indexMArray + 1;
				indexMArray++;
				indexPerson2++;
			}
			
		}
		
		if(indexPerson1 == person1.length) {
			
			for(int i = indexPerson2; i < person2.length; i++) {
				mergedArray[indexMArray] = person2[i];
				tallyPerson2 = tallyPerson2 + indexMArray + 1;
				indexMArray++;
			}
		}else if(indexPerson2 == person2.length) {
			for(int i = indexPerson1; i < person1.length; i++) {
				mergedArray[indexMArray] = person1[i];
				tallyPerson1 = tallyPerson1 + indexMArray + 1;
				indexMArray++;
			}
		}
		

		return tallyPerson1 - tallyPerson2;
		
		
	}
	
}