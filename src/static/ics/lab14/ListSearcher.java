import java.util.Random;

/**
 * This class implements various algorithms on a list of integers
 * (e.g. searching, median-finding)
 * 
 * This class also contains methods for populating the list
 * 
 * @author David
 * @version 3/31/2015
 */

public class ListSearcher {
    // constants
    private static final int DEFAULT_SIZE = 10;

    // instance variables
    private int[] list;
    private Random randGen;
    
    /**
     * Constructs an array of the given size
     * @param size Length of the list
     */
    public ListSearcher(int size){
        randGen = new Random();
        if(size <= 0){
            list = new int[DEFAULT_SIZE];
        }
        else{
            list = new int[size];            
        }
    }
    
    
    /**
     * Returns the size of the list
     */
    public int getListSize(){
        return list.length;
    }
   
    
    /**
     * Fills the list with the numbers 0, 1, 2, ..., N in order
     */
    public void generateOrderedData(){
        for(int i = 0; i < list.length; i++){
            list[i] = i;
        }
    }
    
    
    /**
     * Fills the list with the numbers 0, 1, 2, ..., N in random order
     */
    public void generateUnorderedData(){
        generateOrderedData();
        shuffle();
    }
    

    /** 
     * Gets the String representation of the list
     * @return The string representing
     */
    public String toString(){
        String str = "";
        for (int i=0; i<list.length-1; i += 1)
            str += list[i] + ", ";
        return "[" + str + list[list.length-1] + "]";
    }
    
    /**
     * Runs linear search for the key
     * @return index of first occurrence of key, or -1 if not found
     */
    public int linearSearch(int key) {
        // loop through the list from beginning to end
         for(int i = 0; i < list.length; i++){
            if(list[i] == key){ // found the key
                return i;
            }
        }
        // didn't find the key!
        return -1;
    }

    
    /**
     * Runs binary search for the key
     * @return index of first occurrence of key, or -1 if not found
     */
    public int binarySearch(int key){
        int left = 0;
        int right = list.length-1;        
        
        while(left <= right){
            int mid = (left+right)/2;
            
            if(key == list[mid]){
                return mid; // we found the index of k in the array
            }
            // Search for k in the upper half 
            else if(key > list[mid]){
                left = mid + 1;
            }
            // Search for k in the lower half
            else {
                right = mid - 1;
            }
        }        
        
        // The value k does not occur in the array
        return -1;                 
    }

    
    /**
     * Finds the median value in an unsorted list
     * @return The index of the median value in the list
     */
    public int findMedian(){
        for(int i = 0; i < list.length; i++){
            int lessThan = 0;   // counts how many numbers are less than list[i]
            int grtThan = 0;    // counts how many numbers are greater than list[i]
            
            for(int j = 0; j < list.length; j++){
                
                if(list[j] < list[i]){
                    lessThan++;
                }
                else if(list[j] > list[i]){
                    grtThan++;
                }
            }
            
            // If the list has odd length, there is a unique median
            if(list.length%2 == 1 && lessThan == grtThan){
                return i;
            }
            // If the list has even length, there are 2 medians. We return 
            // the first one that we come across
            else if( list.length%2 == 0 && lessThan == grtThan-1){
                return i;
            }
        }

        return -1;
    }
    
    /*----------------------------------------------------------
     *                  PRIVATE METHODS
     *---------------------------------------------------------*/
    
     /**
     * This "shuffles" the elements around in the list
     * Like shuffling a deck of cards
     */
    public void shuffle(){
        for(int i = 0; i < list.length; i++){
            int indx1 = randGen.nextInt(list.length);
            int indx2 = randGen.nextInt(list.length);
            int temp = list[indx1];
            list[indx1] = list[indx2];
            list[indx2] = temp;
        }
    }   
}