package User;

import java.util.HashSet;
import java.util.Set;

public class User {
	String userName;
	String password;
	String email;
	Set<Integer> orderIds;
	
	public User(String userName, String password, String email, Set<Integer> orderIds) {
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.orderIds = orderIds;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set orders = new HashSet();
		orders.add(12345);
		
		User Kathy = new User("kathyx", "password01", "kathy.x@test.com", orders);

	}

}
