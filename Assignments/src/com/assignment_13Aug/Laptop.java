package com.assignment_13Aug;
//4. Create Class Laptop which has variables noOfUSBPort, processorSpeed of
//type int. Create getter, setter methods for the variables. In main method,
//1> create Laptop object 2> set values of variables noOfUSBPort,
//processorSpeed using setter methods. 3> print variables noOfUSBPort,
//processorSpeed using getter methods.

public class Laptop {
	private int noOfUSBPort;
	private int processorSpeed;
	
	public void setNoOfUSBPort(int noOfUSBPort)
	{
		this.noOfUSBPort= noOfUSBPort;
	}
	
	public int getNoOfUSBPort()
	{
		return noOfUSBPort;
	}
	public void setProcessorSpeed(int processorSpeed)
	{
		this.processorSpeed= processorSpeed;
	}
	
	public int getProcessorSpeed()
	{
		return processorSpeed;
	}

	
	

}
