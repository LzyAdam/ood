package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/********writeFoodItems********/
public class FileUtil {
	public void writeFoodItems() throws IOException {
		BufferedWriter bw1=null;
		
		try {
			bw1 = new BufferedWriter(new FileWriter(new File("FoodItemCSV.txt")));
			System.out.println("********writeFoodItems********");
			
		
			String[] food={"10001,Milk,3.99",
					"10005,Coke,3.0",
					"10002,FIJIWater,3.7",
					"10007,beer,5.7"
					};

			for(String fd:food) {
				bw1.write(fd);
				bw1.newLine();
				//System.out.println("******writeFoodItems******");
				}
									
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(bw1!=null) {
				bw1.close();
			}
			

			}	
		}
	/**
	 * [
	 * "1, firstname�� lastname", 
	 * "1, firstname�� lastname"
	 * ]
	 */
	
	/********readFoodItems********/
	public List<FoodItem> readFoodItems() throws IOException {
		List<FoodItem> fooditem=new ArrayList<>();
		
		try(BufferedReader inLine=new BufferedReader(new FileReader(new File("FoodItemCSV.txt")));
	){	String inputLine=null;
		while((inputLine=inLine.readLine())!=null) {
			String[] fields=inputLine.split(",");
			int ID=0;
			double price=0.0;
			try {
				ID = Integer.parseInt(fields[0]);
			} catch (NumberFormatException e) {
				System.out.println("'" + fields[0] + "'" + " is INVALID String representation of int vlaue.");
				e.printStackTrace();
			}

			String name = fields[1];

			try {
				price = Double.parseDouble(fields[2]);
			} catch (NumberFormatException e) {
				System.out.println("'" + fields[2] + "'" + " is INVALID String representation of double vlaue.");
				e.printStackTrace();
			}
			
			//fooditem.add(new FoodItem(ID,name,price));
			//fooditem.add(new FoodItem(ID,name,price));
			/*apply factory method pattern*/
			Factory fooditemfactory=new FoodItemFactory();
			
			fooditem.add((FoodItem) fooditemfactory.create(ID, name, price));
			
			/*1.����ԭ����fooditem.add( fooditemfactory.create());
			()Ҫ�в������ղι������޷�����ID name ��price
			��θģ�factory�ӿ������ ����ÿ��ʵ��factory���඼���
			�ղι��������˲�ǳ
			һ��ʼ��public interface Factory {
					Item create();}
					����ʡ�µ��ǲ���������ȥ���׿�ָ��
			 * 
			 */
			
			/*2.��Ҫǿת������ת�������õ�����<>������û�м̳й�ϵ�ģ�
			�����Ӹ���һ����Ҫǿ��ת��������ת��
			���������ʼ�����ʱ������Ҫ��̬��
			 * ���磺
			 * public class FoodItemFactory implements Factory{
				@Override
				public Item create(int ID, String name, double price) {
				// TODO Auto-generated method stub
				return  new FoodItem( ID,  name,  price);
				//return  new FoodItem();
					}
					
				����Ϊʲô��Item��������Food Item����̬�ԣ��ڽӿ�Factory��
				����д�ӿ�����Item����������ʵ���࣬����ͱ�����Factory����жϣ�
				����д��ʱ����Factory ��ʵ����	FoodItemFactory��
				ElectronicItemFactory��ServiceItemFactory����ֱ����д���ɣ�
				����ʵ������������ȷ��=��List<> list=ArrayList<>();
				���ǹ���ģʽ����չ���ŵ�Ӧ�ã�ֻ���������ҵ֧�кͷ��ͳ�ͻ��
					
					
					
			 */
			
			//Item f=fooditemfactory.create(ID,name,price);
			//fooditem.add( f);
			//fooditem.add( fooditemfactory.create());
			
			//Item fooditems=fooditemfactory.create();
			//fooditem.
			/*
			 * 
			 *  CreateFactory factoryA=new CreateProductAFactory();
				Product producta=factoryA.createProduct();
				producta.create();
			 */

		}	
			
		}
		return fooditem;
		}	
	
	
	
	
	/********writeelectronicItems********/
	public void writeElectronicItems() throws IOException {
				
		BufferedWriter bw2=null;
		
		try {
			
			bw2 = new BufferedWriter(new FileWriter(new File("ElectronicItemCSV.txt")));
			System.out.println("********writeElectronicItems********");
		
			String[] electronic={"10001,iphone13,799.0",
					"10005,iphone13pro,999.0",
					"10002,samsungS21,688.0",
					"10000,macbookpro,1999.0"};
			
			for(String ele:electronic) {
				bw2.write(ele);
				bw2.newLine();
				}
									
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(bw2!=null) {
				bw2.close();
			}
				}	
		}
	
	
	/********readElectronicItems********/
	public List<ElectronicItem> readElectronicItems() throws IOException {
		List<ElectronicItem> electronicitem=new ArrayList<>();
		
		try(BufferedReader inLine=new BufferedReader(new FileReader(new File("ElectronicItemCSV.txt")));
	){	String inputLine=null;
		while((inputLine=inLine.readLine())!=null) {
			String[] fields=inputLine.split(",");
			int ID=0;
			double price=0.0;
			try {
				ID = Integer.parseInt(fields[0]);
			} catch (NumberFormatException e) {
				System.out.println("'" + fields[0] + "'" + " is INVALID String representation of int vlaue.");
				e.printStackTrace();
			}

			String name = fields[1];

			try {
				price = Double.parseDouble(fields[2]);
			} catch (NumberFormatException e) {
				System.out.println("'" + fields[2] + "'" + " is INVALID String representation of double vlaue.");
				e.printStackTrace();
			}
			
			//electronicitem.add(new ElectronicItem(ID,name,price));
			/*apply factory method pattern*/
			Factory electronicitemfactory=ElectronicItemFactory.getInstance();
			electronicitem.add((ElectronicItem) electronicitemfactory.create(ID, name, price));

		}	
			
		}
		return electronicitem;
		}	
	
	/********writeserviceItems********/
	
	public void writeserviceItems() throws IOException {
		
		BufferedWriter bw3=null;
		
		try {
			
			bw3 = new BufferedWriter(new FileWriter(new File("serviceItemCSV.txt")));
			System.out.println("********writeServiceItems********");
		
			String[] service={"10009,chargebattery,49.0",
					"10004,Applecare,9.0",
					"10001,rentacare,9.0",
					};
			
			for(String ser:service) {
				bw3.write(ser);
				bw3.newLine();
				}
									
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(bw3!=null) {
				bw3.close();
			}
			
//			if(br!=null) {
//				br.close();
//				}
			}	
		}
	
	/********readServiceItems********/
	public List<ServiceItem> readServiceItems() throws IOException {
		List<ServiceItem> serviceitem=new ArrayList<>();
		
		try(BufferedReader inLine=new BufferedReader(new FileReader(new File("ServiceItemCSV.txt")));
	){	String inputLine=null;
		while((inputLine=inLine.readLine())!=null) {
			String[] fields=inputLine.split(",");
			int ID=0;
			double price=0.0;
			try {
				ID = Integer.parseInt(fields[0]);
			} catch (NumberFormatException e) {
				System.out.println("'" + fields[0] + "'" + " is INVALID String representation of int vlaue.");
				e.printStackTrace();
			}

			String name = fields[1];

			try {
				price = Double.parseDouble(fields[2]);
			} catch (NumberFormatException e) {
				System.out.println("'" + fields[2] + "'" + " is INVALID String representation of double vlaue.");
				e.printStackTrace();
			}
			
			
			
			//serviceitem.add(new ServiceItem(ID,name,price));
			/*apply factory method pattern*/
			
			Factory serviceitemfactory= ServiceItemFactory.getInstance();
			serviceitem.add((ServiceItem) serviceitemfactory.create(ID, name, price));
			
		}	
			
		}
		return serviceitem;
		}	
	
	
	
	
	
	
}
