package com.revature;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestAccountSorting {
	public static void main(String[] args) {

		Account acct1 = new Account("A101", "Naresh", 1000);
		Account acct2 = new Account("A102", "Arun", 5000);
		Account acct3 = new Account("A103", "Karthik", 3000);

		List<Account> list = new ArrayList<Account>();
		list.add(acct1);
		list.add(acct2);
		list.add(acct3);

		System.out.println("Before Sort:" + list);

		Collections.sort(list);

		System.out.println("After Sort by Balance field:" + list);

	}

}
