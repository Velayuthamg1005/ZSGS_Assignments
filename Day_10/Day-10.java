import java.util.*;
/*
	1. Write a Java program
		a. to create a new array list, add some colours (string) and print out the collection.
		b. to iterate through all elements in an array list.
		c. to insert an element into the array list at the first position.
		d. to retrieve an element (at a specified index) from a given array list.
		e. to update specific array element by given element.
		f. to remove the third element from an array list.
		g. to search an element in an array list.
		h. to sort a given array list.
		i. to copy one array list into another.
		j. to shuffle elements in an array list.
		
*/


class ArrayListExample{
	
	// a. to create a new array list, add some colours (string) and print out the collection.
	
	public static List<String> printList(ArrayList<String> myList){
		myList.add("Blue");
		myList.add("Purple");
		myList.add("Red");
		myList.add("White");
		myList.add("Yellow");
		
		return myList;
	}
	
	// b. to iterate through all elements in an array list.
	
	public static void iterateList(ArrayList<String> myList){
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<=5;i++){
			myList.add(sc.nextLine());
		}
		
		Iterator<String> iter=myList.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
	
	// c. to insert an element into the array list at the first position.
	
	public static List<String> insertElement(ArrayList<String>myList){
		
		myList.add("Vels");
		myList.add("Rahul");
		myList.add("Vishnu");
		
		myList.addFirst("Velayutham");
		return myList;
		
	}
	
	// d. to retrieve an element (at a specified index) from a given array list.
	
	public static String retrieveElement(ArrayList<String> myList){
		myList.add("Plus");
		myList.add("Minus");
		myList.add("Multiply");
		
		return myList.get(2);
	}
	
	// e. to update specific array element by given element.
	
	public static String updateElement(ArrayList<String> myList){
		myList.add("Farhan");
		myList.add("Junaid");
		
		myList.set(1,"Pavi");
		return myList.get(1);
	}
	
	// f. to remove the third element from an array list.
	
	public static List<String> removeElement(ArrayList<String> myList){
		myList.add("Gambhir");
		myList.add("Sachein");
		myList.add("Virat");
		myList.add("Sehwag");
		
		myList.remove(3);
		
		return myList;
	}
	
	// g. to search an element in an array list.
	
	public static boolean searchElement(ArrayList<String> myList){
		myList.add("Vasu");
		myList.add("Thiru");
		myList.add("Daniel");
		
		return myList.contains("Thiru");
	}
	
	// h. to sort a given array list.
	
	public static List<Integer> sortElement(ArrayList<Integer> myList){
		myList.add(34);
		myList.add(12);
		myList.add(67);
		myList.add(10);
		myList.add(32);
		
		Collections.sort(myList);
		Collections.reverse(myList);
		return myList;
	}
	
	// i. to copy one array list into another.
	
	public static List<String> copyElement(ArrayList<String> myList){
		myList.add("Socratees");
		myList.add("Little Flower");
		myList.add("STC");	
		
		ArrayList<String> list2=new ArrayList<>();
		list2.addAll(myList);
		
		return list2;
	}
	
	// j. to shuffle elements in an array list.
	
	public static List<String> shuffleElement(ArrayList<String> myList){
		myList.add("Kane");
		myList.add("Undertaker");
		myList.add("Randy Orton");
		myList.add("John Cena");
		
		Collections.shuffle(myList);
		
		return myList;
	}
	
	
	public static void main(String args[]){
		ArrayList<String> myList=new ArrayList<>();
		
		// System.out.println(printList(myList));	
		
		// iterateList(myList);
		
		// System.out.println(insertElement(myList));
		
		// System.out.println(retrieveElement(myList));
		
		// System.out.println(updateElement(myList));
		
		// System.out.println(removeElement(myList));
		
		// System.out.println(searchElement(myList));
		
		// System.out.println(sortElement(myList));
		
		// System.out.println(copyElement(myList));
		
		System.out.println(shuffleElement(myList));
		
	}
}


/*

	2. Write a Java program to,
		a. append the specified element to the end of a linked list.
		b. iterate through all elements in a linked list.
		c. iterate through all elements in a linked list starting at the specified position.
		d. iterate a linked list in reverse order.
		e. insert the specified element at the specified position in the linked list.
		f. insert elements into the linked list at the first and last position.
		g. insert the specified element at the front of a linked list.
		h. insert the specified element at the end of a linked list.
		i. insert some elements at the specified position into a linked list.
		j. get the first and last occurrence of the specified elements in a linked list.

*/

class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // a. Append the specified element to the end of a linked list.
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After appending elements: " + list);

        // b. Iterate through all elements in a linked list.
        for (String item:list) {
            System.out.print(item + " ");
        }
        System.out.println();

        // c. Iterate through all elements starting at a specified position.
        int startIndex = 1;
        System.out.print("Iterating from index "+startIndex+": ");
        for (int i=startIndex;i<list.size();i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        // d. Iterate a linked list in reverse order.
        System.out.print("Iterating in reverse: ");
        Iterator<String> reverse=list.descendingIterator();
        while (reverse.hasNext()) {
            System.out.print(reverse.next()+ " ");
        }
        System.out.println();

        // e. Insert the specified element at the specified position in the linked list.
        list.add(1, "Orange");
        System.out.println("After inserting 'Orange' at index 1: "+list);

        // f. Insert elements at the first and last position.
        list.addFirst("Mango");
        list.addLast("Grapes");
        System.out.println("After inserting at first and last: "+list);

        // g. Insert the specified element at the front of a linked list.
        list.offerFirst("Pineapple");
        System.out.println("After inserting 'Pineapple' at front: "+list);

        // h. Insert the specified element at the end of a linked list.
        list.offerLast("Watermelon");
        System.out.println("After inserting 'Watermelon' at end: " +list);

        // i. Insert some elements at the specified position into a linked list.
        List<String> newFruits = Arrays.asList("Kiwi", "Strawberry");
        list.addAll(3, newFruits);
        System.out.println("After inserting: "+list);

        // j. Get the first and last occurrence of the specified elements in a linked list.
        list.add("Banana"); // duplicate to test last occurrence
        int firstIndex = list.indexOf("Banana");
        int lastIndex = list.lastIndexOf("Banana");
        System.out.println("First occurrence of 'Banana': " + firstIndex);
        System.out.println("Last occurrence of 'Banana': " + lastIndex);
    }
}


/*
	3. Write a Java program to,
		a. append the specified element to the end of a hash set.
		b. iterate through all elements in a hash list.
		c. get the number of elements in a hash set.
		d. empty the hash set.
		e. test a hash set is empty or not.
		f. clone a hash set to another hash set.
		g. convert a hash set to an array.
		h. convert a hash set to a tree set.
		i. convert a hash set to a List/ArrayList.
		j. compare two hash set.
		
*/


class HashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> hs=new LinkedHashSet<>();

        // a. Append specified elements to the end of a hash set
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Cherry");
		hs.add("Orange");
        System.out.println("After Adding: "+hs);
		

        // b. Iterate through all elements in a hash set
        for (String fruit:hs) {
            System.out.println(fruit);
        }

        // c. Get number of elements in a hash set
        System.out.println("Number of elements: "+hs.size());

        // d. Empty the hash set
        hs.clear();
        System.out.println("After clearing: "+hs);

        // e. Test if a hash set is empty or not
        System.out.println("Test empty? "+hs.isEmpty());

        // Add elements again for further operations
        hs.add("Dog");
        hs.add("Cat");
        hs.add("Horse");

        // f. Clone a hash set to another hash set
        HashSet<String> afterCloned = new HashSet<>(hs);
        System.out.println("After Cloned: "+afterCloned);

        // g. Convert a hash set to an array
        String[] array=hs.toArray(new String[0]);
        System.out.println("Array: "+Arrays.toString(array));

        // h. Convert a hash set to a tree set
        TreeSet<String> treeSet=new TreeSet<>(hs);
        System.out.println("TreeSet: "+treeSet);

        // i. Convert a hash set to a List/ArrayList
        ArrayList<String> arrayList = new ArrayList<>(hs);
        System.out.println("ArrayList: "+arrayList);

        // j. Compare two hash sets
        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Dog");
        anotherSet.add("Cat");

        System.out.println("Comparing: "+hs.equals(anotherSet));
    }
}

/*
	4. Write a Java program to,
		a. create a new tree set, add some colours (string) and print out the tree set.
		b. iterate through all elements in a tree set.
		c. add all the elements of a specified tree set to another tree set.
		d. create a reverse order view of the elements contained in a given tree set.
		e. get the first and last elements in a tree set.
		f. clone a tree set list to another tree set.
		g. get the number of elements in a tree set.
		h. compare two tree sets.
*/


class TreeSetExample {
    public static void main(String[] args) {

        // a. Create a new TreeSet, add some colours and print it
        TreeSet<String> colors=new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Pink");
        System.out.println("TreeSet: "+colors);

        // b. Iterate through all elements in a TreeSet
        for (String color:colors) {
            System.out.println(color);
        }

        // c. Add all elements of one TreeSet to another
        TreeSet<String> moreColors=new TreeSet<>();
        moreColors.add("White");
        moreColors.add("Black");
        moreColors.addAll(colors);
        System.out.println("After adding: "+moreColors);


        // e. Get first and last elements
        System.out.println("First Element: "+moreColors.first());
        System.out.println("Last Element: "+moreColors.last());

        // g. Get number of elements in a TreeSet
        System.out.println("Size of TreeSet: "+moreColors.size());

        // h. Compare two TreeSets
        TreeSet<String> testSet = new TreeSet<>();
        testSet.add("Red");
        testSet.add("Green");
        testSet.add("Blue");

        System.out.println("Comparing TreeSets:");
        System.out.println("equals? " + moreColors.equals(testSet));
    }
}

/*
	5. Write a Java program to,
		1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
		2. iterate through all elements in priority queue.
		3. add all the elements of a priority queue to another priority queue.
		4. insert a given element into a priority queue.
		5. remove all the elements from a priority queue.
		6. count the number of elements in a priority queue.
		7. compare two priority queues.
		8. retrieve the first element of the priority queue.
		9. retrieve and remove the first element.
		10. convert a priority queue to an array containing all of the elements of the queue.

*/

class PriorityQueueOperations{
	public static void main(String args[]){
		// 1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("Lime");
		pq.add("Aqua Blue");
		pq.add("Orange");
		pq.add("Mango Yellow");
		
		System.out.println(pq);
	
	
	// 2. iterate through all elements in priority queue.
	
	Iterator<String> iter=pq.iterator();
	while(iter.hasNext()){
		System.out.println(iter.next());
	}

	// 3. add all the elements of a priority queue to another priority queue.
	
	PriorityQueue<String> pq1=new PriorityQueue<>(pq);
	System.out.println("After Adding: "+pq1);
	
	// 4. insert a given element into a priority queue.
	
	PriorityQueue<String> pqe=new PriorityQueue<>();
	pqe.add("Red");
	pqe.add("White");
	
	System.out.println(pqe);
	
	// 5. remove all the elements from a priority queue.
	
	System.out.println("Before Removing: "+pqe);
	pqe.clear();
	System.out.println("After Removing: "+pqe);
	
	// 6. Count the number of elements in the priority queue
	
    System.out.println("Size: "+pq.size());

	// 7. compare two priority queues.
	
	boolean comparePQ=pq.equals(pq1);
	System.out.println("Equal or Not: "+comparePQ);
	
	// 8. retrieve the first element of the priority queue.
	
	System.out.println(pq.peek());
	
	// 9. retrieve and remove the first element.
	
	System.out.println(pq.peek());
	System.out.println(pq.poll());
	System.out.println(pq.peek());
	
	// 10. convert a priority queue to an array containing all of the elements of the queue.
	
	Object[] arr=pq.toArray();
	System.out.println("Convet PQ to Array: "+Arrays.toString(arr));
	
	}
}

/*
	6. Write a Java program to,
		1. associate the specified value with the specified key in a Tree Map.
		2. copy a Tree Map content to another Tree Map.
		3. search a key in a Tree Map.
		4. search a value in a Tree Map.
		5. get all keys from the given a Tree Map.
		6. delete all elements from a given Tree Map.
		7. sort keys in Tree Map by using comparator.
		8. get a key-value mapping associated with the greatest key and the least key in a map.
		9. get the first (lowest) key and the last (highest) key currently in a map.
		10. get a reverse order view of the keys contained in a given map.

*/

// 1. Create a class for demonstration
class TreeMapExample {
    public static void main(String[] args) {
		
        // 1. Associate the specified value with the specified key in a TreeMap
		
        TreeMap<Integer, String> mp = new TreeMap<>();
        mp.put(3, "Apple");
        mp.put(1, "Banana");
        mp.put(4, "Cherry");
        mp.put(2, "Date");
        System.out.println("TreeMap: "+mp);

        // 2. Copy a TreeMap content to another TreeMap
		
        TreeMap<Integer,String> copyTree=new TreeMap<>(mp);
        System.out.println("After Copied: "+copyTree);

        // 3. Search a key in a TreeMap
		
        int key = 2;
        System.out.println("Key " +key + " exists? " +mp.containsKey(key));
        
        // 4. Search a value in a TreeMap
		
        String searchValue = "Cherry";
        System.out.println("Value: "+ mp.containsValue(searchValue));
        
        // 5. Get all keys from the given TreeMap
		
        Set<Integer> allKeys = mp.keySet();
        System.out.println("All Keys: " + allKeys);

        // 6. Delete all elements from a given TreeMap
		
        TreeMap<Integer, String> tempMap = new TreeMap<>(mp);
        tempMap.clear();
        System.out.println("After clear(): "+tempMap);

        // 7. Sort keys in TreeMap by using comparator (descending order here)
		
        TreeMap<Integer, String> descMap = new TreeMap<>(Collections.reverseOrder());
        descMap.putAll(mp);
        System.out.println("TreeMap sorted by comparator (descending): " + descMap);

        // 8. Get key-value mapping associated with the greatest and least key in a map
		
        Map.Entry<Integer, String> lowest = mp.firstEntry();
        Map.Entry<Integer, String> highest = mp.lastEntry();
        System.out.println("Lowest Entry: " +lowest);
        System.out.println("Greatest Entry: " +highest);

        // 9. Get the first (lowest) key and the last (highest) key
		
        System.out.println("First key: " +mp.firstKey());
        System.out.println("Last key: " +mp.lastKey());

        // 10. Get a reverse order view of the keys contained in a given map
		
        NavigableSet<Integer> reverseKeys = mp.descendingKeySet();
        System.out.println("Reverse order of keys: " + reverseKeys);
    }
}

/*
	7. Write a Java program to,
		1. associate the specified value with the specified key in a HashMap.
		2. count the number of key-value (size) mappings in a map.
		3. copy all of the mappings from the specified map to another map.
		4. remove all of the mappings from a map.
		5. check whether a map contains key-value mappings (empty) or not.
		6. get a shallow copy of a HashMap instance.
		7. test if a map contains a mapping for the specified key.
		8. test if a map contains a mapping for the specified value.
		9. create a set view of the mappings contained in a map.
		10. get the value of a specified key in a map.
		
*/

class LearnHashMap{
	public static void main(String args[]){
		
		// 1. associate the specified value with the specified key in a HashMap.
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(101,"Vels");
		hm.put(102,"Siva");
		
		System.out.println(hm);
		
		// 2. count the number of key-value (size) mappings in a map.
		System.out.println(hm.size());
		
		// 3. copy all of the mappings from the specified map to another map.
		HashMap<Integer,String> hm2=new HashMap<>(hm);
		System.out.println(hm2);
		
		// 4. remove all of the mappings from a map.
		hm2.clear();
		System.out.println(hm2);
		
		// 5. check whether a map contains key-value mappings (empty) or not.
		System.out.println("Check if it contains: "+hm2.isEmpty());
		
		// 6. get a shallow copy of a HashMap instance.
		HashMap<Integer,String> hm3=new HashMap<>(hm);
		System.out.println(hm3);
		
		// 7. test if a map contains a mapping for the specified key.
		System.out.println("Key contains: "+hm.containsKey(101));
		
		// 8. test if a map contains a mapping for the specified value.
		System.out.println("Value contains: "+hm.containsValue("Siva"));
		
		// 9. create a set view of the mappings contained in a map.
		Set<Map.Entry<Integer,String>> entrySet=hm.entrySet();
		
		for(Map.Entry<Integer,String> entry:entrySet){
			System.out.println("Key: "+entry.getKey()+" "+"Value: "+entry.getValue());
		}
		
		// 10. get the value of a specified key in a map.
		System.out.println("Get Value: "+hm.get(102));
	}
	
}

/*
	8. Develop a Java program to manage a list of bank accounts using ArrayList.
		--->Create an Account class with the following attributes:
			a. accountNumber (int)
			b. holderName (String)
			c. balance (double)
		--->Use autoboxing to store the balance and interest as Double wrapper objects.
		--->Use manual boxing to convert a primitive interest rate into a Double object.
		--->Unbox the values (both automatic and manual) to calculate and update the new balance.
		--->Add at least three Account objects to an ArrayList<Account>.
		--->For each account:
			a. Display the holder name, account number, original balance
			b. Apply 5% interest
			c. Show the new balance using primitive values (unboxed).

*/

class Account {
    private int accountNumber;
    private String holderName;
    private Double balance; 

    public Account(int accountNumber,String holderName,double balance) {
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance; 
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public Double getBalance() {
        return balance;
    }

    public void applyInterest(Double interestRate) {
        double currentBalance=balance;
        double rate=interestRate;
        double newBalance=currentBalance+(currentBalance*rate/100);
        this.balance=newBalance; 
    }
}

class Bank{
    public static void main(String[] args) {
      
        double interestPrimitive=5.0;
        Double interestRate=Double.valueOf(interestPrimitive); 

        ArrayList<Account> accounts=new ArrayList<>();

        accounts.add(new Account(1001, "Vels", 5000.0));
        accounts.add(new Account(1002, "Rashuuu", 3000.0));
        accounts.add(new Account(1003, "Alexa", 10000.0));

        for (Account acc:accounts) {
            System.out.println("Account Holder: "+acc.getHolderName());
            System.out.println("Account Number: "+acc.getAccountNumber());
           
            double originalBalance = acc.getBalance();
            System.out.println("Original Balance: "+originalBalance);

           
            acc.applyInterest(interestRate);

            double newBalance = acc.getBalance();
            System.out.println("New Balance after: "+newBalance);
			System.out.println();
        }
    }
}


