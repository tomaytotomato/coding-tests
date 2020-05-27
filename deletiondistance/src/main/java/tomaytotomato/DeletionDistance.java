package tomaytotomato;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Return back the number of deletions before two strings match
 *
 * This problem is a version of the Longest Common Subsequence problem
 */
public class DeletionDistance
{
    public static void main( String[] args )
    {
        System.out.println( "Deletion Distance!" );
    }

    public static int deletionDistance(String leftStr, String rightStr) {

        if (leftStr == null || rightStr == null) {
            return 0;
        }

        if (leftStr.equals(rightStr)) {
            return 0;
        }

        if (leftStr.isEmpty()) {
            return rightStr.length();
        } else if (rightStr.isEmpty()) {
            return leftStr.length();
        }

        int[][] matrix = new int[leftStr.length()+1][rightStr.length()+1];

        IntStream.rangeClosed(0, rightStr.length()).forEach(rightStringCount -> matrix[0][rightStringCount] = rightStringCount);

        for (int leftStringCount = 1; leftStringCount <= leftStr.length(); leftStringCount++){
            for (int lcsCount = 0; lcsCount <= rightStr.length(); lcsCount++){
                if(lcsCount == 0){
                    matrix[leftStringCount][lcsCount] = matrix[leftStringCount-1][lcsCount]+1;
                }else {
                    if(leftStr.charAt(leftStringCount-1) != rightStr.charAt(lcsCount-1)){
                        matrix[leftStringCount][lcsCount] = Math.min(matrix[leftStringCount-1][lcsCount], matrix[leftStringCount][lcsCount-1])+1;
                    }else {
                        matrix[leftStringCount][lcsCount] = matrix[leftStringCount-1][lcsCount-1];
                    }
                }
            }
        }

        return (matrix[leftStr.length()][rightStr.length()]);
    }
}
