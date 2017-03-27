package com.mySpring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Restuarant {
	private Map<Integer,Integer> map_Waiters_List;
	private Set<String> set_Waiters_List;
	private List<String> list_Waiters_List;
	private String welcome;
	 public void setmap_Waiters_List(Map map_Waiters_List)
	 {
		 this.map_Waiters_List=map_Waiters_List;
	 }
	 public void setset_Waiters_List(Set set_Waiters_List)
	 {
		 this.set_Waiters_List=set_Waiters_List;
	 }
	 public void setlist_Waiters_List(List list_Waiters_List)
	 {
		 this.list_Waiters_List=list_Waiters_List;
	 }
	 public void displayWaitersList()
	 {
		 System.out.println(map_Waiters_List+" "+set_Waiters_List+" "+list_Waiters_List);
	 }
	public String getWelcome() {
		return welcome;
	}
	public void setWelcome(String welcome) {
		this.welcome = welcome;
	}
	 
	
}
