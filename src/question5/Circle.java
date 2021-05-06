/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Keerthi Muli
 */
public class Circle {
    
    
	private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
       
    public double getPiValue(){
        return Math.PI;
    }	

	public double Area() {
	 return getPiValue()*radius*radius;
		
	}

	@Override
	public String toString() {
		return "Circle with radious="+radius +" has Area:"+Area();
	}

	
	
	
	
}

    

