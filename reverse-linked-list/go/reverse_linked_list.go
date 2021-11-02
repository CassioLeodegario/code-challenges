package main


type LinkedList struct {
	Value int
	Next  *LinkedList
}

func ReverseLinkedList(head *LinkedList) *LinkedList {
	
	var previous *LinkedList = nil
	for head != nil {		
		nextNode := head.Next
		head.Next = previous
		previous = head		
		head = nextNode
	}
	return previous
}
