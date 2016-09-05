/* ------------------------------
 * File: Triangle.java
 * Name: Dan Fleck
 * Assignment: N/A
 * Lab Section: All of them 
 * Creation Date: Nov 10, 2008
 * 
 * References:
 * Comments:
 * ------------------------------
 */

// package junitexample;

/**
 *
 * @author dfleck
 */
public class Triangle {

    // -------------------------
    // Class Attributes 
    // -------------------------
    private String side1;
    private String side2;
    private String side3;

    // -------------------------
    // Constructors
    // -------------------------
    public Triangle() {
        // Create a default triangle
        this("0", "0", "0");
    }
    
    public Triangle(String s1, String s2, String s3) {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    
    // -------------------------
    // Methods
    // -------------------------
    public String determineTriangleType() {
        
        String type = "";
        
        // This code runs when the user pushes the button
        int s1 = -1, s2=-1, s3 = -1, temp=-1;
        String err = "";
        try {
            s1 = Integer.parseInt(side1);
        } catch (NumberFormatException e) {
           err += "Side 1 is not a number!\n";
        }
        try {
            s2 = Integer.parseInt(side2);
        } catch (NumberFormatException e) {
           err += "Side 2 is not a number!\n";
        }
        try {
            s3 = Integer.parseInt(side3);
        } catch (NumberFormatException e) {
           err += "Side 3 is not a number!\n";
        }
        
        // Check that nothing is negative
        if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
               err += "At least one length is less than 0!\n";            
        }
        
        if (s1 > s3) {
        	temp = s3;
        	s3 = s1;
        	s1 = temp;
        }
        
        if (s2 > s3) {
        	temp = s3;
        	s3 = s2;
        	s2 = temp;
        }
        
        if (s1 > s2) {
        	temp = s2;
        	s2 = s1;
        	s1 = temp;
        }
        
        // Check for side length
        if ((s1 + s2 <= s3)) {
               err += "The lengths of the triangles do not form a valid triangle!\n";
        }  
        
        if (s1 + s2 + s3 > 1000000) {
            err += "I feel your triangle is too big\n";
        } 
        
        if (err.length() > 0) {
           type = err;   
        } else {            
        	if ((s1 == s2) && (s2 == s3)) {
               type= "Equilateral";
           } else if ((s1 == s2) || (s2 == s3)) {
               type = "Isosceles";
           } else if (((s1 * s1) + (s2 * s2) == (s3 * s3))) {
               type = "Right Angled";
           } else {
               type = "Scalene";
           }                 
        }
        
        return type;        
    }

    public Double Area() {

    	int s1 = -1, s2=-1, s3 = -1, temp=-1;
        boolean err = false;
        try {
            s1 = Integer.parseInt(side1);
        } catch (NumberFormatException e) {
           err = true;
        }
        try {
            s2 = Integer.parseInt(side2);
        } catch (NumberFormatException e) {
           err = true;
        }
        try {
            s3 = Integer.parseInt(side3);
        } catch (NumberFormatException e) {
           err = true;
        }
        
        // Check that nothing is negative
        if (s1 < 0 || s2 < 0 || s3 < 0) {
               err = true;
        }
        
        if (s1 > s3) {
        	temp = s3;
        	s3 = s1;
        	s1 = temp;
        }
        
        if (s2 > s3) {
        	temp = s3;
        	s3 = s2;
        	s2 = temp;
        }
        
        if (s1 > s2) {
        	temp = s2;
        	s2 = s1;
        	s1 = temp;
        }
        
        // Check for side length
        if ((s1 + s2 < s3)) {
               err = true;
        }
        
        double result = -1.0;
        
        if (!err) {
        	int p = s1 + s2 + s3;
        	result = (Math.sqrt(p*(p-(2*s1))*(p-(2*s2))*(p-(2*s3)))/4);
        }
        
        return result;
    }
}
