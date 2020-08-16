import java.util.*;
import java.util.stream.*;
public class HowToFindDuplicate {
	public static <T> Set<T> findDuplicateInStream(List<T> list) {
		
		
		return list.stream()
				//Count the frequency of all elements
				//and filter the elements with frequency
				.filter(i->Collections.frequency(list, i)>1)
				.collect(Collectors.toSet());
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,13,4,21,13,2,7,13,5,59,59);
		System.out.println(findDuplicateInStream(list));
	}
}
