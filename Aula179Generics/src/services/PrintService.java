package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService <T>{
	
	List <T> valuesList = new ArrayList<>();
	
	public void addValue(T value) {
		valuesList.add(value);
	}
	
	public T first() {
		if(valuesList.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return valuesList.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if(!valuesList.isEmpty()) {
			System.out.print(valuesList.get(0));
		}
		for(int i = 1; i < valuesList.size(); i++) {
			System.out.print(", " +valuesList.get(i));
		}
		System.out.print("]");
		
	}

}
