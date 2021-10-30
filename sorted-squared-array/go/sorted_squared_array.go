package main

import "fmt"
import "math"

func SortedSquaredArray(array []int) []int {
	// Write your code here.
	startIndex := 0
	endIndex := len(array) - 1;
	array2 := make([]int, len(array))
	for i := len(array) - 1; i >= 0 ; i-- {		
		fmt.Println("valor de i", i)
		fmt.Println("valor de array", array)
		startIndexPow := int(math.Pow(float64(array[startIndex]), 2))
		fmt.Println(startIndexPow)
		endIndexPow := int(math.Pow(float64(array[endIndex]), 2))
		fmt.Println(endIndexPow)
		if startIndexPow > endIndexPow{
			array2[i] = startIndexPow;
			startIndex++;
		}else {
			array2[i] = endIndexPow;
			endIndex--;
		}
	}	
	return array2
}
