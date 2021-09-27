package main

import "fmt"

func IsValidSubsequence(array []int, sequence []int) bool {	
	subseq := 0;
	for _, num := range array {		
		if subseq < len(sequence) && num == sequence[subseq] && {			
			fmt.Println(subseq)
			subseq++;
		}
	}
	
	return len(sequence) == subseq
}
