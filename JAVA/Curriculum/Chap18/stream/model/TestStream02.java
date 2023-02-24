package kr.co.ezenac.stream.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream02 {
	public static void main(String[] args) {
		Stream<Integer> numberStream = Stream.of(3,-5, 7,10,-3);
		Stream<Integer> filteredNumberStream = numberStream.filter(x -> x>0);
		List<Integer> filterNumber = filteredNumberStream.collect(Collectors.toList());
		System.out.println(filterNumber);
		
		
		//처음 선언할 때 부터 최종 데이터타입으로 선언
		List<Integer> numberStream2 = Stream.of(3,-5, 7,10,-3)
				.filter(x -> x>0)
				.collect(Collectors.toList());
		System.out.println(numberStream2);
		
		User user1 = new User()
				.setId(101)
				.setName("Cruise")
				.setVerified(true)
				.setEmailAddress("tom@email.com");
				
		User user2 = new User()
				.setId(102)
				.setName("David")
				.setVerified(false)
				.setEmailAddress("Amse@email.com");
		
		User user3 = new User()
				.setId(103)
				.setName("Jon")
				.setVerified(true)
				.setEmailAddress("Hamm@email.com");
		
		List<User> users = Arrays.asList(user1,user2, user3);
		List<User> verifiedUsers = users.stream()
		.filter(user -> user.isVerified())
		.collect(Collectors.toList());
		System.out.println(verifiedUsers);
		
		List<User> unVerifiedUsers = users.stream()
				.filter(user -> !user.isVerified())
				.collect(Collectors.toList());
		System.out.println(unVerifiedUsers);
				
		

	}
}
