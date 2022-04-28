/**
 * This is the Car class. This class creates a car with a make, model, license plate,
 * doors, and passengers.
 *
 * @author Madison Archer
 * date: 4/28/22
 */

//Class
public class Car extends Vehicle
{
	//Instance variables
	private int doors;
	private int passengers;
	
	/**
	 * This method is the constructor. It creates a car with a make, model, license
	 * plate, number of doors, and the number of passengers in it. 
	 * @param make, the make of the car
	 * @param model, the model of the car
	 * @param plate, the license plate of the car
	 * @param theDoors, the number of doors of the car
	 * @param thePassengers, the number of passengers in the car
	 */
	public Car(String make, String model, String plate, int theDoors, int thePassengers)
	{
		super(make, model, plate);
		this.doors = theDoors;
		this.passengers = thePassengers;
	}
	
	/**
	 * This method gets the number of doors of the car.
	 * @return the number of doors
	 */
	public int getDoors()
	{
		//return the doors
		return this.doors;
	}
	
	/**
	 * This method gets the number of passengers in the car.
	 * @return the number of passengers
	 */
	public int getPassengers()
	{
		//return the passengers
		return this.passengers;
	}
	
	/**
	 * This method creates a string for the car information.
	 * @returns a string of the car information
	 */
	@Override
	public String toString()
	{
		//create a string
		String string = String.format("%d-doors %s %s with license %s.", this.doors, getMake(), getModel(), getPlate()); 
		//return string
		return string;
	}
	
	/**
	 * This method determines if two cars are the same in all attributes.
	 * @param other, the other car
	 * @return boolean value determining if two cars are equal or not
	 */
	@Override 
	public boolean equals(Object other)
	{
		if(!(other instanceof Car))
		{
			return false;
		}
		Car otherCar = (Car) other;
		if(otherCar.getDoors() == this.doors && otherCar.getPassengers() == this.passengers)
		{
			return super.equals(other);
		}
		return false;				
	}
	
	/**
	 * This method creates a new copy of the car with the same attributes.
	 * @return the new copy of the car
	 */
	public Car copy()
	{
		String make = getMake();
		String model = getModel();
		String plate = getPlate();
		int theDoors = this.doors;
		int thePassengers = this.passengers;
		
		//create copy of the car
		Car theCopy = new Car(make, model, plate, theDoors, thePassengers);
		//return the copy of the car
		return theCopy;		
	}
	
}//end class
	
	
		
