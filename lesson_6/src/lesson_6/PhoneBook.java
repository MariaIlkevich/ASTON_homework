package lesson_6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

	public Map<String, List<String>> phoneBookMap = new HashMap<>();
	private static PhoneBook phoneBook;

	public void add(String lastName, String phoneNumber) {
		phoneBookMap.putIfAbsent(lastName, new ArrayList<>());
		phoneBookMap.get(lastName).add(phoneNumber);
	}

	public List<String> get(String lastName) {
		return phoneBookMap.getOrDefault(lastName, Collections.emptyList());
	}

	public static void result() {
		List<String> kotovaNumber = phoneBook.get("Kotova");
		System.out.println("Numbers: " + kotovaNumber);
	}

}
