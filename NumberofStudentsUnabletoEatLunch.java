package Day26Nov2022;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class NumberofStudentsUnabletoEatLunch {
	
	
	@Test
	public void td1() {
		int[] students = {1,1,0,0}, sandwiches = {0,1,0,1};
		int countStudents = countStudents(students,sandwiches);
		System.out.println(countStudents);
	}

	public int countStudents(int[] students, int[] sandwiches) {

		Queue<Integer> q1 = new LinkedList<Integer>();

		int sandwichesIndex = 0, temp = 0;

		for (Integer i1 : students) {
			q1.add(i1);

		}

		while (temp < q1.size()) {
			if (q1.peek() == sandwiches[sandwichesIndex]) {
				sandwichesIndex++;
				q1.poll();
				temp = 0;

			} else {
				q1.add(q1.poll());
				temp++;
			}
		}

		return q1.size();

	}

}
