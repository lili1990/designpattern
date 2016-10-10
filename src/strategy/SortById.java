package strategy;

import java.util.Comparator;

public class SortById implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		return p1.id - p2.id;
	}

}
