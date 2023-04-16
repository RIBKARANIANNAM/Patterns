package question22;

import java.util.ArrayList;
import java.util.List;

public class ImmutableDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		ImmutableClass obj = new ImmutableClass(10, "John", numbers);

		System.out.println(obj.getValue()); // Output: 10
		System.out.println(obj.getName()); // Output: John
		System.out.println(obj.getNumbers()); // Output: [1, 2, 3]

		numbers.add(4); // modifying the original list

		System.out.println(obj.getNumbers()); // Output: [1, 2, 3]


	}

}
