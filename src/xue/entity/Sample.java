package xue.entity;

import java.io.Serializable;
import java.util.Map;

public class Sample implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private Map<String,Integer> map;
	
	
	public Sample() {
		super();
	}
	public Sample(String name, int age, Map<String, Integer> map) {
		super();
		this.name = name;
		this.age = age;
		this.map = map;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Map<String, Integer> getMap() {
		return map;
	}
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
}
