# conwayGameOfLife
To solve m x n matrix Conway's Rule Game of Life challenge with 100 generations

There are comments inside code to explain it.

I assume you have installed java and finished with Environmental variable setup.


Spring STS IDE is used to build the project.
You can use any ide as per your Convinience. 
Recommended: Eclipse or Spring STS.


To run the project:

1: Download the project form the url : https://github.com/abibboyz/conwayGameOfLife
2: Download zip file
3: open your IDE and import project
4: Simply open conwayGameOfLife.java file and click run (Check the console.)



In Java File:
Comments are there to help.

Things to be noted. 

1. int m = 200, n = 200; //this is for 200 x 200 matrix. 
    To reduce matrix(multidimensional array) size change the values here to lesser values do the following 
    eg: 
    int m = 5, n = 5;

2. There are 100 generation printed with while loop with : while(x < 100)
    if you wish to print lesser generation simply change value to while(x < 5) for five generations.


Last important thing to specify is about the input.
I have generated the file randomly with the help of Random class in java as there were 200 x 200 matrix and it was difficult to give input individually.
Random class object are created to allocate dead (0) and live (1) automatically at the initial phase of input with 0 and 1.

Thank You.
