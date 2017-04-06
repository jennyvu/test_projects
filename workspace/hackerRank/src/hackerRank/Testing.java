package hackerRank;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(apple.getColor());
		//Jeep newjeep = new Jeep();
		//System.out.println(newjeep.getColor());
		Contacts contacts = new Contacts();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add")){
            	contacts.addName(contact);
            }
            if(op.equals("find")){
            	contacts.findPartial(contact);
            }
            
        }
        //System.out.println(contacts.getContacts().toString());
        in.close();
	}
}
