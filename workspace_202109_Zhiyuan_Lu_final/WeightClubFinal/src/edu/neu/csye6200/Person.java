package edu.neu.csye6200;

public class Person extends AbstractPerson{
	private int id;
	private int age;
	private String name;
	private int weightLbs;
	private int weightLossLbs;
	
	public Person(String csvData) {
		super();
		String[] tokens=csvData.split(",");
		this.id = getIntFromString(tokens[0]);
		this.age = getIntFromString(tokens[1]);
		this.name = tokens[2];
		this.weightLbs = getIntFromString(tokens[3]);
		this.weightLossLbs = getIntFromString(tokens[4]);
	}

	@Override
	public int getId() {
	
	return id;
	}
	@Override
	public void setId(int id) {
	
	this.id=id;
	}
	@Override
	public int getAge() {
		
		return age;
	}
	@Override
	public void setAge(int age) {
		
		this.age=age;
	}
	@Override
	public String getName() {
	
	return name;
	}
	@Override
	public void setName(String Name) {
	
		this.name=name;
	}
	@Override
	public int getWeightLbs() {
	
		return weightLbs;
	}
	@Override
	public void setWeightLbs(int weightLbs) {
	
		this.weightLbs=weightLbs;
	}
	@Override
	public Integer getWeightLossLbs() {
	
	return weightLossLbs;
	}
	@Override
	public void setWeightLossLbs(int weightLossLbs) {
	
		this.weightLossLbs=weightLossLbs;
	}
	@Override
	public void sortandshow() {
	this.toString();
	
	}
	public int getIntFromString(String s) {
		int n=0;
		try {
			n=Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("Invalidated input "+s);
			e.printStackTrace();
		}
		return n;
		
	}
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("\n");
		sb.append("Person List");
		sb.append("  id:").append(getId());
		sb.append("  Age:").append(getAge());
		sb.append("  Name:").append(getName());
		sb.append("  WeightLbs:").append(getWeightLbs());
		sb.append("  WeightLossLbs:").append(getWeightLossLbs());
		sb.append("\n");
		return sb.toString();
	}
	
	
	
	
	
	
}
