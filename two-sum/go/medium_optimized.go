package main

func TwoNumberSum(array []int, target int) []int {	
	var numS = make(map[int]bool)
	for _, num := range array {
		tempTarget := target-num
		if _, ok := numS[tempTarget]; ok {
			return []int{tempTarget, num}
		}
		numS[num]  = true
	}
	return []int{}
}
