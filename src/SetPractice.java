import java.util.*;

/**
 * Practice using a Set.
 */
public class SetPractice {
	/**
	 * Add zero or more items to the set, and print what is being added.
	 * @parameter set is the Set to add items to
	 * @parameter values zero or more Strings to add to set
	 */
	private static void addAll(Set<String> set, String ...values) {
		// add all the values to the set. 
		// print each one as you add it
		for (String arg : values){
			set.add(arg);
			System.out.println("add "+arg);

		}
		System.out.println();
	}
	
	/**
	 * Print all the elements in a set, using an Iterator.
	 */
	private static void print(Set<String> set) {
		// create an Iterator using set.iterator()
		// then use the iterator to print everything in the set
		Iterator<String> iter = set.iterator();
		while(iter.hasNext())
		{
			String next = iter.next();
			System.out.println(next);
		}
		System.out.println();
	}
	
	/**
	 * Explore behavior of a Set.
	 */
	public static void setExplorer( ) {
		// 1. Create a HashSet and add strings: dog, ant, bird, elephant, cat
		Set<String> set = new HashSet<String>();
		addAll(set,"dog","ant","bird");
	
		
		// 2. Print elements in the set using an Iterator over the Set.
		// You're going to need to do this again, so write a method print(Set set) to do it.
		print(set);
		
		// 3. are the elements printed in same order than you added them? 
		// What does this tell you about Sets?
		System.out.println("");
		
		// 4. Remove all the elements from the set, using a method that 
		// defined in Set (and Collection). What is the method to use?
		set.clear();
		
		// 5. Add same elements as exercise 1, but in a different order,
		// such as: "cat", "elephant", "bird", "ant", "dog"
		addAll(set,"cat","elephant","bird","ant","dog");
		
		// 6. Print the elements in the set.  Is the order same as before?
		print(set);
		
		// 7. Add duplicate elements to the set.  Add another "cat" and "dog".
		// To ensure that these are *distinct* objects use 'set.add(new String("cat"))'
		// and new String("dog").
		System.out.println("Add duplicate items to the set ");
		set.add("cat");
		set.add("dog");
		
		
		// 8. Print the elements in set.  Are there any duplicates?
		// What property of Set does this demonstrate?
		System.out.println("Set contains: ");
		print(set);
		
		System.out.println("===================================================");

		// 9. Repeat the exercises using a TreeSet instead of HashSet.
		//  What is different when you use TreeSet?
		TreeSet<String> tree = new TreeSet<String>();
		addAll(tree,"dog","ant","bird");
		
		print(tree);
		System.out.println("");
		
		tree.clear();
		
		addAll(tree,"cat","elephant","bird","ant","dog");
		print(tree);
		
		System.out.println("Add duplicate items to the tree ");
		tree.add("cat");
		tree.add("dog");
		
		System.out.println("Set contains: ");
		print(tree);

		// Hint: Use Polymorphism.  Make the Set object be a *parameter* to the
		// method so you can easily use a different set just by changing the parameter!
		// 10. Repeat again using TreeSet with a Comparator.
		System.out.println("===================================================");
		TreeSet<String> treeCom = new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String t1, String t2) {
				return t1.compareToIgnoreCase(t2);
			}
		});
		addAll(treeCom,"dog","ant","bird");
		
		print(treeCom);
		System.out.println("");
		
		treeCom.clear();
		
		addAll(treeCom,"cat","elephant","bird","ant","dog");
		print(treeCom);
		
		System.out.println("Add duplicate items to the tree ");
		treeCom.add("cat");
		treeCom.add("dog");
		
		System.out.println("Set contains: ");
		print(treeCom);
		
		

		
	}

	public static void main(String[] args) {
		setExplorer();
	}
}
