package mergesort;


public class MainClass 
{

    public static void main(String args[])  
    {  
        int unsorted[] = {3, 123, 53, 42, 79, 44, 23, 98};  
        int unsortedLength = unsorted.length;
        
        MainClass sortedArray = new MainClass(); 
        
        System.out.println("The unsorted array is: ");  
        for (int i = 0; i < unsorted.length; i++)
        {
            System.out.print(unsorted[i] + " ");
        }

        sortedArray.mergeSort(unsorted, 0, unsortedLength - 1); 
        
        System.out.println("\nThe sorted array is: ");
        for (int i = 0; i < unsorted.length; i++)
        {
            System.out.print(unsorted[i] + " ");
        }
        
          
    }  
    //===================================================
    void mergeSort(int unsorted[], int begin, int end)  
    {  
        
        
        if (begin < end)   
        {  
            
            int middle = (begin + end) / 2;  
            
            mergeSort(unsorted, begin, middle);  
            mergeSort(unsorted, middle + 1, end);  
            mergeTempArrays(unsorted, begin, middle, end);  
            
            
        }  
        
    }      
    //========================================================
    void mergeTempArrays(int unsorted[], int begin, int middle, int end)    
    {    
    int i, j;  
    int firstHalf = middle - begin + 1;    
    int secondHalf = end - middle;    
      
     
        int leftHalf[] = new int[firstHalf];  
        int rightHalf[] = new int[secondHalf];  
      
      
    for (i = 0; i < firstHalf; i++)  
    {
        leftHalf[i] = unsorted[begin + i]; 
    }
    
    for (j = 0; j < secondHalf; j++)  
    {
        rightHalf[j] = unsorted[middle + 1 + j];    
    } 
    //=================================================
    i = 0; 
    j = 0;   
    int z = begin;  
    
      
    while (i < firstHalf && j < secondHalf)    
    {    
        
        if(leftHalf[i] <= rightHalf[j])    
        {    
            unsorted[z] = leftHalf[i];    
            i++;  
            
        }   
        
        else    
        {    
            unsorted[z] = rightHalf[j];    
            j++;    
        }    
        z++;   
        
    }  
    
    while (i < firstHalf)    
    {    
        unsorted[z] = leftHalf[i];    
        i++;    
        z++; 
        
    }    
      
    while (j < secondHalf)    
    {    
        unsorted[z] = rightHalf[j];    
        j++;    
        z++; 
        
    }
    
}    
  
    
  
}
