package project7;

/**
 * Title:        Project #7
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class ArrayHeap extends ArrayBinaryTree implements Heap {

    Comparator heapComp;

    public ArrayHeap(Comparator newComp) {
        this (newComp, DEFAULT_SIZE);
    }

    public ArrayHeap(Comparator newComp, int newSize) {
        super (newSize);
        heapComp = newComp;
    }


  public void add(Object newKey, Object newElement) throws InvalidObjectException {
      // TODO: add code here
      return null;
  }

  public Object removeRoot() throws EmptyHeapException {
      // TODO: add code here
      return null;
  }

        // you may want to expand main; it is just provided as a sample
    public static void main (String[] args) {
	    Comparator myComp = new IntegerComparator();
        Heap myHeap = new ArrayHeap (myComp, 8);

        myHeap.add(new Integer(14),new Integer(14));
        myHeap.add(new Integer(17),new Integer(17));
        myHeap.add(new Integer(3),new Integer(3));
        myHeap.add(new Integer(2),new Integer(21));
        myHeap.add(new Integer(8),new Integer(8));
        myHeap.add(new Integer(7),new Integer(18));
        myHeap.add(new Integer(1),new Integer(1));
        myHeap.add(new Integer(19),new Integer(11));
        myHeap.add(new Integer(17),new Integer(17));
        myHeap.add(new Integer(25),new Integer(6));

        System.out.println(myHeap.size());
        while (!myHeap.isEmpty()) {

            Item removedItem = (Item) myHeap.removeRoot();
            System.out.print("Key:   " + removedItem.key() + "     ");
            System.out.println("Removed " + removedItem.element());
        }
        System.out.println("All nodes removed");
    }
}
