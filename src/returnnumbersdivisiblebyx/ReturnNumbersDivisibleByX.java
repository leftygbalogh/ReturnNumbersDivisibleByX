/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package returnnumbersdivisiblebyx;

/**
 *
 * @author lefty
 */
public class ReturnNumbersDivisibleByX {

    /**
     * @param args the command line arguments
     */
    
    public static int[] ReturnNumbers (int divisor, int[] array)
    {
        int[] new_array = new int [array.length];
        int new_counter = 0;
        
        for (int i = 0; i<array.length; i++)
        {
            if (array[i]%divisor == 0){
                new_array[new_counter]=array[i];
                new_counter++;
            }
        }
        
        int length = FindLastNumberInArray(new_array);
        
        int[] small = new int[length];
        small = SqueezeArray(new_array, length);
        PrintArray(small);
        
        
        return small;
    }
    
    public static void PrintArray(int[] array)
    {
        for (int i=0;i<array.length;i++)
        {
            System.out.println("["+i+"]= "+array[i]);
        }
        System.out.println("--------");
        System.out.println("");
    }
    
    public static int FindLastNumberInArray (int[] array)
    {
        for (int i=0;i<array.length;i++)
        {
            if (array[i]== 0){
                return i;
            }
        }
        return array.length;
    }
    
    public static int[] SqueezeArray (int[] big_array, int new_size)
    {
        int[] small_array = new int [new_size];
        for (int i=0;i<new_size;i++)
        {
            small_array[i]=big_array[i];
        }
        return small_array;
        
    }
    
    public static void main(String[] args) {
        int[] numbers = {1,3,5,6,8,10,9,13};
        System.out.println("----------------------");
        ReturnNumbers(2,numbers);
        
        ReturnNumbers(3,numbers);
        
        ReturnNumbers(13,numbers);
        
        

    }
    
}
