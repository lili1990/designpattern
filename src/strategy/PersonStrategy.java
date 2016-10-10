package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonStrategy {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person(3, "aaa"));
		list.add(new Person(1, "ccc"));
		list.add(new Person(2, "ddd"));
		list.add(new Person(4, "bbb"));
		Collections.sort(list, new SortById());
		System.out.println(list.toString());
		Collections.sort(list, new SortByName());
		System.out.println(list.toString());
	}

}
