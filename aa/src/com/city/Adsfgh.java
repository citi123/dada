package com.city;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

class Student {
	private String name;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}

}
enum School{
	CHUZHONG("初中","a"),
	GAOZHONG("高中","b"),
	DAXUE("大学","c");

	private String name;
	private String code;

	School(String name,String code){
		this.name = name;
		this.code = code;
	}
}
public class Adsfgh {
	public static void main(String[] args) {
		ConcurrentHashMap<String, String> m = new ConcurrentHashMap<>();
		String a = m.putIfAbsent("a", "a");
		System.out.println("a:" + a);
		System.out.println(m);

		a = m.putIfAbsent("a", "b");
		System.out.println("a:" + a);
		System.out.println(m);

		System.out.println();

	}
	static void dd(){
		//对方告诉对方告诉对方
		HashMap<String, Object> treeMap = new HashMap<>();
		treeMap.put("a", "a");
		treeMap.put("c", "c");
		treeMap.put("d", "d");
		treeMap.put("b", "b");

		Iterator<Object> iterrator = treeMap.values().iterator();
		while(iterrator.hasNext()){
			System.out.println(iterrator.next());
		}
	}
	static void cc() {
		String content = "[员工姓名],你好。欢迎你来为公司奉献";

		String a = content.replaceAll("[员工姓名]", "小沈");
		String b = content.replaceAll("\\[员工姓名\\]", "小沈");

		System.out.println(content.indexOf("["));
		System.out.println(content.indexOf("]"));

		System.out.println(a);
		System.out.println(b);
		System.out.println("\\[员工姓名\\]");
		String sdf = "[我是神]";
		sdf = sdf.replace("[", "\\[");
		sdf = sdf.replace("]", "\\]");

		System.out.println(sdf);
	}

	static void bb() {
		Boolean a = false;

		System.out.println(a.getClass().getName());
		System.out.println(a.getClass().getName());
		System.out.println(a.getClass().getName());

		boolean b = false;

		System.out.println(int.class.isPrimitive());

		Long c = 5L;
		long d = 5L;

		aa(c);
		aa(d);

		System.out.println(Asset.coupon);

		ArrayList<Long> list = new ArrayList<>();
		list.add(100L);
		list.add(100L);
		list.add(100L);
		list.add(100L);
		list.add(100L);
		list.add(200L);
		list.add(200L);
		Set<Long> set = new HashSet<>(list);
		System.out.println("list.size():" + list.size());
		System.out.println("set.size():" + set.size());

		BigDecimal bigDecimal = new BigDecimal("1.23");
		System.out.println(bigDecimal.toString());

		Pattern p = Pattern.compile("^\\d+(\\.\\d\\d{0,1}){0,1}$");
		String aa = "2.36";
		System.out.println(aa + ":" + p.matcher(aa).matches());

		aa = "2.363";
		System.out.println(aa + ":" + p.matcher(aa).matches());

		aa = "3222.363";
		System.out.println(aa + ":" + p.matcher(aa).matches());

		aa = "3222.3";
		System.out.println(aa + ":" + p.matcher(aa).matches());

		Pattern integerPattern = Pattern.compile("^\\d+(\\.0){0,1}0*$");
		String bb = "15645.00000000000";
		System.out.println(bb + ":" + integerPattern.matcher(bb).matches());

		bb = "15645";
		System.out.println(bb + ":" + integerPattern.matcher(bb).matches());

		bb = "15645.0";
		System.out.println(bb + ":" + integerPattern.matcher(bb).matches());

		bb = "15645.00";
		System.out.println(bb + ":" + integerPattern.matcher(bb).matches());
	}

	static void aa(Long a) {
		System.out.println(a.intValue());
	}

	static void bb(){
		// 注释注释
		// 刚才写错了点东西
		// xiugai
		// xiugai 2
		// xiugai 2
		// xiugai 2
		// xiugai 2
		// xiugai 2
	}
}
