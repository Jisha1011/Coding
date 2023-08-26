import java.util.Arrays;
import java.util.*;
public class asteriods {
	
	
public static int[] asteroidCollision(int[] asteroids) {
     int[] arr = {1,1} ;  
     
    Stack<Integer> stack = new Stack<Integer>();
    for(int i=0;i<asteroids.length;i++)
    {
    	if(stack.isEmpty()||asteroids[i]>0)	
    	{
    		System.out.println("II");
    		stack.push(asteroids[i]);
    	}
    	else 
    	{
    		while(true)
    		{
    			int peek = stack.peek();
    			System.out.println(peek);
    			if(peek<0)
    			{
    				stack.push(asteroids[i]);
    				break;
    			}
    			else if(peek == -asteroids[i])
    			{
    				stack.pop();
    			}
    			
    			else if (peek > -asteroids[i])
    			{
    				break;
    				
    			}
    			else
    			{
    				stack.pop();
    				if(stack.isEmpty())
    				{
    					stack.push(asteroids[i]);
    					break;
    				}
    			}
    		}
    	}
    	
    }
    
    int[] output = new int[stack.size()];
    for(int i= stack.size()-1;i>=0;i--)
    {
    	output[i]=stack.pop();
    	System.out.println("The stack "+output[i]);
    }
	return output;
    }
	
	public static void main(String args[])
	{int[] arr = {5,10,-5};
		asteroidCollision(arr);
		Math.pow(0, 0);
	}

}
