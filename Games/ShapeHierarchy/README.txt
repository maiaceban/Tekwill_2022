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

Test:
Create 12 objects 2 of each type. 
Create a method to print the areas of an object and print all areas for those objects. 
Implement a method that prints perimeter for a 2d object and print perimeters for all 2d objects. 
Implement a method that prints volume for 3d objects and print volumes for all 3d objects.