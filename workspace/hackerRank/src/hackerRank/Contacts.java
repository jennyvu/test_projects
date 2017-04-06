package hackerRank;

import java.util.*;

public class Contacts{
	public static List<String> contactList = new ArrayList<String>();
	
	public static void addName(String newName){
		contactList.add(newName);
	}
	
	public static void findPartial(String partial){
		List<String> resultList = new ArrayList<String>();
		int count = 0;
		for(String name: contactList){
			if(name.matches(partial+".*")){
				resultList.add(name);
			}
		}
		count = resultList.size();
		System.out.println(count);
	}
	
	public static List<String> getContacts(){
		return contactList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(apple.getColor());
		//Jeep newjeep = new Jeep();
		//System.out.println(newjeep.getColor());
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add")){
            	addName(contact);
            }
            if(op.equals("find")){
            	findPartial(contact);
            }
            
        }
        //System.out.println(contacts.getContacts().toString());
        in.close();
	}
}
