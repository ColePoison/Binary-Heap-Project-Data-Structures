public class Main {
	public static void main(String[] args)
	{
		BinaryHeap<String> heap = new BinaryHeap<String>();
        heap.insert("W");
        heap.insert("E");
        heap.insert("A");
        heap.insert("F");
        heap.insert("C");
        heap.insert("B");
        heap.insert("G");
        heap.insert("H");
        heap.insert("K");
        heap.insert("X");
        heap.insert("M");
        heap.insert("Z");


		System.out.println("- - - - - - - - - - - - - - -");
		while (!heap.isEmpty()) {
			System.out.println(heap.remove());
		}

		heap.clear();
		heap.insert("Hello");
		heap.insert("Hola");
		heap.insert("Manuel");
		heap.insert("Joe");
		heap.insert("Xanadu");
		heap.insert("Bbb");
		heap.insert("Ccc");
		heap.insert("Aaa");
		heap.insert("Xxx");

		System.out.println("- - - - - - - - - - - - - - -");
		while (!heap.isEmpty()) {
			String s = heap.remove();
			System.out.println(s);
		}

BinaryHeap<Integer> hint = new BinaryHeap<>();
hint.insert(100);
hint.insert(75);
hint.insert(150);
hint.insert(25);
hint.insert(250);
System.out.println("- - - - - - - - - - - - - - -");
while (!hint.isEmpty()) {
	Integer s = hint.remove();
	System.out.println(s);
}


	}
}