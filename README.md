######################################################################################

You are given 9 pool balls. They all appear exactly the same in color and size. There
are no distinguishing characteristics between each ball, however - 1 of the 9 balls 
is heavier than all the rest. you have at your disposal a 2 sided scale to determine 
which ball is heavier

Your task? 

Find the heavy ball with the least amount of measurements.
A measurement can be defined as anytime either measureBallList() or measureBalls() 
is called from the ScaledOfJustice class

There are 3 classes - App, Ball, and ScalesOfJustice

Ball.java - Class to represent a SINGLE ball - has an ID and a weight
    - Nothing to implement here

Implement this first!
ScalesOfJustice.java - Class to represent the measurement tool
    - Implement the following methods:
        - measureBalls()
            - Takes a two balls as an argument and return whichever one is larger
            - If both balls are equal, return null

        - measureBallList()
            - Takes two lists of balls and return whichever list is heavier (contains the heavy ball)
            - If both lists are equal, return null

Implement this class LAST!
App.java - contains your main method and creates a list containing 9 Ball objects, one with a higher weight
    -Implement the following
        - Split the list into 3 smaller lists (clue: ArrayList.sublist will be useful here)
        - Find the heavy list by calling measureBallList() from ScalesOfJustice
        - Call findHeavyBall() and print out the message telling the user which ball was heavier

######################################################################################