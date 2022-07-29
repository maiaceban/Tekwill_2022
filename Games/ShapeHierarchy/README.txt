Shape Hierarchy

Implement the Shape hierarchy shown in figure below. 
Each TwoDimensionalShape should contain methods getArea and getPerimeter to calculate the area and perimeter of the two-dimensional shape. 
Each ThreeDimensionalShape should have methods getArea and getVolume to calculate the surface area and volume, respectively, of the three-dimensional shape.
Create a program that uses an array of Shape references to objects of each concrete class in the hierarchy. 
The program should print a text description of the object to which each array element refers.

1. Create an interface Shape
2. Create an abstract class TwoDimensionalShape that implements Shape and has:
	a. Two private instance variables Dimension1 and Dimension2
3. Create an abstract class ThreeDimensionalShape that implements Shape and has:
	a. Three private instance variables Dimension1 , Dimension2 and Dimension3
4. Create classes Circle, Square and Triangle from TwoDimensionalShape with:
	a. Methods getArea() and getPerimeter()
5. Create classes Cube, Sphere and Tetrahedron from ThreeDimensionalShape with:
	a. Methods getArea() and getVolume()