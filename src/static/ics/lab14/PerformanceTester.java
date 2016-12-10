import java.util.Random;

/**
 * This class runs empirical experiments to determine the time complexity of 
 * three different algorithms: linear search, binary search, and a median finding
 * algorithm
 * 
 * @author David
 * @version 3/31/2015
 */
public class PerformanceTester {
    private static Random randGen = new Random();
    
    
    /**
     * Runs a linear search experiment with the given configurations.
     * 
     * @param N The list size
     * @param numTrials The number of times we call linearSearch
     * @param unordered   Specifies whether an unordered (or ordered) list should be used
     */
    private static void testLinearSearch(int N, int numTrials, boolean unordered) {
        int maxComps = Integer.MIN_VALUE, minComps = Integer.MAX_VALUE, totalComps = 0;
                
        // Creates a ListSearcher and generates (un)ordered data
        ListSearcher s = new ListSearcher(N);
        if (unordered){
            s.generateUnorderedData();
        }
        else {
            s.generateOrderedData();
        }

        // Runs the trials
        for (int trial = 0; trial < numTrials; trial++) {
            s.resetComparisons();               //reset comparison count
            int key = randGen.nextInt(N);       //generate a random key from 0 to N-1
            s.linearSearch(key);                //call linearSearch
            int numComps = s.getComparisons();  //retrieve number of comparisons
            
            //update max, min, and total number of comparisons
            if (numComps > maxComps){                
                maxComps = numComps;
            }
            if (numComps < minComps){
                minComps = numComps;
            }
            totalComps += numComps;
        }

        System.out.println("N=" + N + ", " 
            + "best=" + minComps + " (expected 1), " 
            + "worst=" + maxComps + " (expected " + N + "), "
            + "avg=" + (int) ((double)totalComps/numTrials) + " (expected " + (int) Math.ceil(N/2.0) + ")");
    }
    

    /**
     * Runs a binary search experiment with the given configurations.
     * 
     * @param N The list size
     * @param numTrials The number of times we call linearSearch
     */
    private static void testBinarySearch(int N, int numTrials) {
        int maxComps = Integer.MIN_VALUE, minComps = Integer.MAX_VALUE, totalComps = 0;
        
        // Create a ListSearcher and generate unordered data
        ListSearcher s = new ListSearcher(N);
        s.generateOrderedData();

        // Runs the trials
        for (int trial = 0; trial < numTrials; trial++) {

            // Count number of comparisons it takes to find the key
            s.resetComparisons();               //reset comparison count
            int key = randGen.nextInt(N);       //generate a random key from 0 to N-1
            s.binarySearch(key);                //call binarySearch
            int numComps = s.getComparisons();  //retrieve number of comparisons

            //update max, min, and total number of comparisons
            if (numComps > maxComps){
                maxComps = numComps;
            }
            if (numComps < minComps){
                minComps = numComps;
            }
            totalComps += numComps;
        }
        
        // Print out a summary of the number of comparisions across all trials
        System.out.println("N=" + N + ", " 
            + "best=" + minComps + " (expected 1), " 
            + "worst=" + maxComps + " (expected " + (int) Math.ceil(Math.log(N)/Math.log(2.0)) + "), "
            + "avg=" + (int) ((double)totalComps/numTrials) + " (expected ???)");
    }


    /**
     * Runs a median finding experiment with the given configurations
     * @param N The list size
     * @param numTrials the number of runs per new problem size
     */
    private static void testMedian(int N, int numTrials){
        int maxComps = Integer.MIN_VALUE, minComps = Integer.MAX_VALUE, totalComps = 0;
        
        // Create a ListSearcher and generate unordered data
        ListSearcher s = new ListSearcher(N);
        
        // Runs the trials
        for(int trial = 0; trial < numTrials; trial++){

            // Generate unordered data
            s.generateUnorderedData();

            // Count number of comparisons to find the median
            s.resetComparisons();                   // reset comparison count
            s.findMedian();                         // find the median
            int numComps = s.getComparisons();      // retrieve number of comparisons

            // update max, min, and total number of comparisons
            if(numComps > maxComps){
                maxComps = numComps;
            }
            if(numComps < minComps){
                minComps = numComps;
            }
            totalComps += numComps;
        }
        
        // Print out a summary of the number of comparisons across all trials
        System.out.println("N=" + N + ", " 
            + "best=" + minComps + ", " 
            + "worst=" + maxComps + ", "
            + "avg=" + (int) ((double)totalComps/numTrials));
    }

    /**
     * Runs experiments
     */
    public static void main(String[] args){
         testLinearSearch(1000, 1, true);
    }
}