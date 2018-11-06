public class recursionDriver
{
   
    public static int count(int n)
    {
        // Base case AKA Stop Condition
         if (n==0)
             return 0; 
 
         if (n==1)
             return 4;
 
         return 4+count(n-1); 
         
         
            
    }
    public static int counted(int n)
    {if (n==0)
            return 0;
            
         if (n==1)
            return 20;
            
         return 20 + counted(n-1);
    
    
        }
    public static int counts(int n)
    {if (n==0)
            return 0;
        if (n==1)
            return 10;
            
        return 10 + counts(n-1);
    }
    public static int odd(int n)
    {
        if (n<=0)
            return 0;
        
        if (n%2==1)
            return n + odd(n-2);
            
        return 0;
            
    }
    public static int even(int n)
    {
        if (n<=0)
            return 0;
        
        if (n%2==0)
            return n + even(n-2);
        
        return 0;
        
        
    }
         
        
        
       
    
    
    public static void main(String[] args)
    {
         /*
          * Count 
          * 1. Number of legs  10 elephant have
          * 2. Number of students in a school if each
          *    class has 20 students and there are 12 rooms
          * 3. Number of fingers if there are 8 people
          * 4. Find the sum of odd numbers from 0 to N
          * 5. Find the sum of even numbers from 0 to N
     
          * 
          */   
         int counted=0;

         // Task 1.
         counted = count(10);
         System.out.println(counted);

    }
}
