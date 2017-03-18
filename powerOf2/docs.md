# Power of 2

Print out a series of n values which are powers of 2 
 
i.e.    `n^2`


## Requirements

Non functional requirements are that it should be fast

Therefore simple integer multiplication will not be suitable as the algorithm would run with `O(2^N)` complexity
making it very slow after several iterations.

Since we know it is powers of 2 we can use binary math to calculate the number (bitshift).

    e.g. 2^8 = 256


Each power should be added to get the sum of all values

e.g.

    2^1 --> 2
    2^2 --> 4
    2^3 --> 8
    
    total = 14
   