package edu.ucsb.cs56.projects.games.fish_animation;

import java.awt.geom.AffineTransform;

/** Creates a JellyFish object which
    holds its x position and y position

    @author Josephine Vo
    @author Jenna Cryan
    @version for CS56, Winter 2014, UCSB
 */

public class JellyFish extends ScumOfTheSea{
    double x, y;
    boolean move;
    int count;
    double speed;
    
    JellyFish(double x, double y, double speed){
	this.x = x;
	this.y = y;
	this.move = false;
	this.speed = speed;
	count = 0;
    }
    
    /** Gets the X position of the JellyFish
	@return X is the position of the JellyFish
    */	
    @Override 
    public double getXPos() {
	return x;
    }
    
    /** Gets the Y position of the JellyFish
	@return Y is the position of the JellyFish
    */
    @Override 
    public double getYPos() {
	return y;
    }

    /** Sets the X position of the JellyFish
	@param X is the position of the JellyFish
    */
    @Override 
    public void setX(double x) { 
	this.x = x;
    }

    /** Sets the Y position of the JellyFish
	@param Y the position of the JellyFish
    */
    @Override 
    public void setY(double y) { 
	this.y = y;
    }
    
    /** Sets the move of the JellyFish
	@param Boolean b will set the state of the JellyFish
    */
    public void setMove(boolean b) {
	this.move = b; 
    }

    /** Checks if the JellyFish is moving or not
	@return True or False whether the JellyFish is moving
    */
    public boolean checkJellyFish() {
	return move;
    }

    /** Moves the positon of the JellyFish
	@param m moves the Y position of the JellyFish
    */
    @Override 
    public void move(double m) { 
	y -= m;
    }

    /** Sets the count of the JellyFish
	Incrementer for count which is par of the JellyFish object
    */
    public void setCount() {
	this.count += 1;
    }
    
    /** Gets the Count of the JellyFish, will be able to delay the movement
	@return Count of the JellyFish
    */
    public int getCount() {
	return count;
    }
    
    /** Gets the speed that each different Jellyfish moves at.  
	@return the speed of the Jellyfish
    */
    public double getSpeed() {
	return speed;
    }
}
	
