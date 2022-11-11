package towersofhanoi4;

public class MainClass 
{

    
   public static void main(String[] args)
    {
        towerOfHanoi(4, "A", "B", "C", "D");
        
        
        
    }
    static void towerOfHanoi(int numOfDisks, String from, String to, String helper, String helper2)
    {
        
        
        
        if(numOfDisks == 0)
        {
           
            return;
            
        }
        if(numOfDisks == 1)
        {
            System.out.println("Move disk " + numOfDisks + " from rod " + from + " to rod " + to);
            
            
            return;
        }
        
        towerOfHanoi(numOfDisks - 2, from, helper, to, helper2 );
        System.out.println("Move disk " + (numOfDisks - 1) + " from rod " + from + " to rod " + helper2);
        System.out.println("Move disk " + numOfDisks + " from rod " + from + " to rod " + to);
        System.out.println("Move disk " + (numOfDisks - 1) + " from rod " + helper2 + " to rod " + to);
        towerOfHanoi(numOfDisks - 2, from, helper, to, helper2); 
        
        
    }
    
}
