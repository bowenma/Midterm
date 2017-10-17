package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		ArrayList<Staff> TestStaff = new ArrayList<Staff>();
		
		Staff A = new Staff("AAA", "AAA", "AAA", new Date(1998, 1, 1), "310 Academy Street", "(111)-111-1111", "AAA@udel.edu", "None", 6, 10000.00, new Date(2000, 1, 20), eTitle.MS);
		TestStaff.add(One);
		
		Staff B = new Staff("BBB", "BBB", "BBB", new Date(1997,5,1), "311 Broad Street", "(222)-111-2222", "Add@udel.edu", "None", 5,700000.00, new Date(2000,5,6), eTitle.MS);
		TestStaff.add(Two);
		
		Staff C = new Staff("CCC", "CCC", "CCC", new Date(1996,5,4), "312 Call Street", "(333)-666-9898", "adf@udel.edu", "None", 5, 800000.00, new Date(2000,8,9), eTitle.MS);
		TestStaff.add(Three);
		
		Staff D = new Staff("DDD", "DDD", "DDD", new Date(1995,5,15), "313 Java Street", "(444)-666-7777", "HHH@udel.edu", "None", 5, 300000.00, new Date(2000,9,9), eTitle.MS);
		TestStaff.add(Four);
		
		Staff E = new Staff("EEE", "EEE", "EEE", new Date(1994,6,6), "314 Cise Street", "(555)-999-8888", "d55a@udel.edu", "None", 5, 90800.00, new Date(2000,7,7), eTitle.MS);
		
		TestStaff.add(A);
		TestStaff.add(B);
		TestStaff.add(C);
		TestStaff.add(D));
		TestStaff.add(E);
		
		
	}	

}
