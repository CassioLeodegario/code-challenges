package main

func TwoNumberSum(array []int, target int) []int {
	// Write your code here.
	result := []int{}
	for i, n1 := range array {
		for j, n2 := range array {
			if (i != j && n1 + n2 == target){
				result = append(result, n1)
				result = append(result, n2)
				return result
			}
		}
	}
	return result
}
