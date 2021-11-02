package main

import "fmt"

const HOME_TEAM_WON = 1

func TournamentWinner(competitions [][]string, results []int) string {
	var pointsMap = make(map[string]int)
	for i := 0; i<len(results); i++ {
		if results[i] == 0 {
			pointsMap[competitions[i][1]] = pointsMap[competitions[i][1]] + 1
		}else{
			pointsMap[competitions[i][0]] = pointsMap[competitions[i][0]] + 1
		}
	}
	fmt.Println(pointsMap)
	maximum := 0;
	mainKey  := ""
	for key, value := range pointsMap{
		if(value > maximum){
			maximum = value
			mainKey = key
		}
	}
	return mainKey
}
