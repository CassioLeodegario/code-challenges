package main

import "sort"

// O(n^2) time | O(n) space
func ThreeNumberSum(array []int, target int) [][]int {	
	result := [][]int{}
	sort.Ints(array)
	for i, value := range array {
		idxL := i+1
		idxR := len(array)-1
		for idxL < idxR {
			if value + array[idxL] + array[idxR] ==  target {
				result = append(result, []int{value, array[idxL], array[idxR]})
				idxL++
				idxR--			
				continue
			}
			if value + array[idxL] + array[idxR] < target {
				idxL++
			}else{
				idxR--
			}
			
		}
	}	
	return result
}
