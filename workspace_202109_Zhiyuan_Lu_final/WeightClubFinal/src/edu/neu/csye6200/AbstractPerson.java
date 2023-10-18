package edu.neu.csye6200;

public abstract class AbstractPerson {
	public abstract int getId();
	public abstract void setId(int id);
	public abstract int getAge();
	public abstract void setAge(int age);
	public abstract String getName();
	public abstract void setName(String Name);
	
	public abstract int getWeightLbs();
	public abstract void setWeightLbs(int weightLbs);
	
	public abstract Integer getWeightLossLbs();
	public abstract void setWeightLossLbs(int weightLossLbs);
	
	public abstract void sortandshow();
	
}