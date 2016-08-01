package com.hand;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class App
{
	public static void main(String[] args) {
		System.out.println("随机生成50个小于100的数，分别是：");
		int arr[] = new int[50];
		Random r = new Random();
		List list1 = new ArrayList<Integer>();
		List list2 = new ArrayList<Integer>();
		Map map = new Hashtable<Integer,Integer>();
		int a = 0;
		for(int i=0;i<50;i++){
			a = r.nextInt(100);
			list1.add(a);
			arr[i] = a;
			if(i==49)
				System.out.print(a);
			else
				System.out.print(a+",");
		}
		System.out.println();
		
		list2 = fun1((ArrayList<Integer>) list1);
		System.out.println("除10之后: ");
		for(int i =0 ;i <list2.size();i++){
			if(i==49)
				System.out.print(list2.get(i));
			else
				System.out.print(list2.get(i)+",");
		}
		System.out.println();
		map = fun2((ArrayList<Integer>) list1,(ArrayList<Integer>) list2);
		System.out.println("插入map之后: ");
		System.out.println("写完排序没时间了");
	}
	
	public static ArrayList<Integer> fun1(ArrayList<Integer> list1){
		List list2 = new ArrayList<Integer>();
		for(int i =0 ;i <list1.size();i++){
			list2.add(list1.get(i)/10);
		}
		return (ArrayList<Integer>) list2;
	}
	
	public static Hashtable<Integer,Integer> fun2(ArrayList<Integer> list1,ArrayList<Integer> list2){
		Map map = new Hashtable<Integer,Integer>();
		for(int i =0 ;i <list1.size();i++){
			map.put(list2.get(i),list1.get(i));
		}
		return (Hashtable<Integer, Integer>) map;
	}
	
	private static void test(int[] arr) {
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
		}
	}

	
	
	
}