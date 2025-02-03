package lesson_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = { "Sasha", "Masha", "Zhenaya", "Masha", "Nastya", "Katya", "Nastya", "Nastya", "Nastya",
				"Kolya", "Kostya" };
		HashMap<String, Integer> wordCount = new HashMap<>();
		for (String word : words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}
		System.out.println("Слова и их частота упоминания: ");
		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		PhoneBook phoneBook = new PhoneBook();

		phoneBook.add("Kotova", "342-12-42");
		phoneBook.add("Ezeva", "431-32-76");
		phoneBook.add("Kotova", "432-76-12");
		phoneBook.add("Petrova", "985-67-48");

		PhoneBook.result();
	}

}
