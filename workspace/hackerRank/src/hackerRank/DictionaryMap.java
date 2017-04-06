package hackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> englishToVietnameseDict = new HashMap<String, String>();
		englishToVietnameseDict.put("Monday", "Thu Hai");
		englishToVietnameseDict.put("Tuesday", "Thu Ba");
		englishToVietnameseDict.put("Wednesday", "Thu Tu");
		englishToVietnameseDict.put("Thursday", "Thu Nam");
		englishToVietnameseDict.put("Friday", "Thu Sau");
		englishToVietnameseDict.put("Saturday", "Thu Bay");
		englishToVietnameseDict.put("Sunday", "Chu Nhat");
		
		Map<String, String> englishToSpanishDict = new HashMap<String, String>();
		englishToSpanishDict.put("Monday", "Lunes");
		englishToSpanishDict.put("Tuesday", "Martes");
		englishToSpanishDict.put("Wednesday", "Miércoles");
		englishToSpanishDict.put("Thursday", "Jueves");
		englishToSpanishDict.put("Friday", "Viernes");
		englishToSpanishDict.put("Saturday", "Sábado");
		englishToSpanishDict.put("Sunday", "Domingo");
		
		System.out.println(englishToSpanishDict.get("Monday"));
		System.out.println(englishToSpanishDict.keySet());
		System.out.println(englishToSpanishDict.entrySet());
		System.out.println(englishToSpanishDict.size());
		
		System.out.println();
		Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
		shoppingList.put("Ham", Boolean.TRUE);
		shoppingList.put("Bread", Boolean.TRUE);
		shoppingList.put("Cereal", Boolean.TRUE);
		shoppingList.put("Sugar", Boolean.FALSE);
		shoppingList.put("Eggs", Boolean.FALSE);
		
		System.out.println(shoppingList.get("Ham"));
		System.out.println(shoppingList.get("Sugar"));
		System.out.println(shoppingList.toString());
		shoppingList.remove("Eggs");
		System.out.println(shoppingList.toString());
		shoppingList.replace("Bread", true, false);
		System.out.println(shoppingList.toString());
		shoppingList.clear();
		System.out.println(shoppingList.isEmpty());
		System.out.println(shoppingList.toString());
		
		//phone book
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneBook.get(s) == null){
            	System.out.println("Not found");
            }
            else{
            	System.out.println(s + "=" + Integer.toString(phoneBook.get(s)));
            }
            
        }
        in.close();
    }

}
