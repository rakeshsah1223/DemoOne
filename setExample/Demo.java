package setExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		HashMap<Integer,Car> map = new HashMap<Integer, Car>();
		map.put(100, new Car("honda",12000,2018));
		map.put(101, new Car("hundai",14000,2019));
		map.put(102, new Car("tata",15000,2015));
		map.put(103, new Car("bmw",10000,2020));
		
		System.out.println("welcome to car website");
		for(Map.Entry<Integer, Car> c: map.entrySet()) {
			System.out.println(c.getKey());
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the model num you want to search");
		int searchModel = sc.nextInt();
		if(map.containsKey(searchModel)) {
			System.out.println("The model number "+searchModel +" is found");
			System.out.println("The details of car is: "+map.get(searchModel)+"");
		}
		else {
			System.out.println("Model not found");
		}
	}
}
