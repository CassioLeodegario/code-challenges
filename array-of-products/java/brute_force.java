class ProductArray  
{  
  public static int[] findProduct(int arr[])  
  {    
    // write your code here
    int finalResult[] = new int[arr.length];
    for(int i =0; i<arr.length; i++){
      finalResult[i] = 1;
      for(int j = 0; j<arr.length; j++){        
        System.out.println(arr[j]);
        if(j!=i){
          finalResult[i] *=  arr[j];
        }
      }
    }

    return finalResult; 
   } 
} 
