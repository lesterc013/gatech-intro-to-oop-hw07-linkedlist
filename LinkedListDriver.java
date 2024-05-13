public class LinkedListDriver {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        /*
         * Testing for addAtIndex, isEmpty(), and size() and getAtIndex
         */
        // ll1.addAtIndex(2, -1);
        // ll1.addAtIndex(null, 0);
        // ll1.addAtIndex(1, 0);
        // // System.out.println(ll1.getHead().getData());
        // // System.out.println(ll1.getTail().getData());
        
        // ll1.addAtIndex(2, 1);
        // ll1.addAtIndex(3, 2);
        // ll1.addAtIndex(4, 2);
        // ll1.addAtIndex(5, 3);
        // ll1.addAtIndex(6, 5); // Out of list bounds. Maximum it can go up to is the index = size() i.e. in this case 5
        // System.out.println(ll1);
        // System.out.println();
        // // System.out.println(ll1.getAtIndex(4));
        // System.out.println(ll1.getSize());
        // System.out.println(ll1.getHead().getData());
        // System.out.println(ll1.getTail().getData());
        // System.out.println(ll1.isEmpty());
        // System.out.println(ll1.size());

        /*
         * Testing removeAtIndex
         */

         // Removal of only one node LL
        //  ll1.addAtIndex(1, 0);
        //  ll1.addAtIndex(2, 1);
        //  ll1.addAtIndex(3, 2);
        //  ll1.addAtIndex(4, 1);
        //  ll1.addAtIndex(5, 3);
        //  System.out.println("LL Printed: " + ll1);
        //  System.out.println("Removed Value: " + ll1.removeAtIndex(0));
        //  System.out.println("LL Printed: " + ll1);
        //  System.out.println(ll1.getHead().getData());
        //  System.out.println(ll1.getTail().getData());
        //  System.out.println(ll1.size());
        //  System.out.println(ll1.isEmpty());
        
        /*
        * Testing remove
        */
        
        // Remove data that is at the first index and LL only one node
        // ll1.addAtIndex(1, 0);
        // System.out.println("Removed: " + ll1.remove(1));
        //  System.out.println(ll1.getHead());
        //  System.out.println(ll1.getTail());
        //  System.out.println(ll1.size());
        //  System.out.println(ll1.isEmpty());
        
        // Remove data at first index but has more than one node
        // Remove data that is at the last index
        // Remove data that is in the middle indexes
        // Null data input
        // No such data input
        // ll1.addAtIndex(1, 0);
        // ll1.addAtIndex(2, 1);
        // ll1.addAtIndex(3, 2);
        // ll1.addAtIndex(4, 3);
        // ll1.addAtIndex(5, 4);
        // System.out.println(ll1.remove(6));
        // System.out.println(ll1);
        // System.out.println(ll1.getHead().getData());
        // System.out.println(ll1.getTail().getData());
        // System.out.println(ll1.size());
        
        ll1.addAtIndex(1, 0);
        ll1.addAtIndex(2, 1);
        ll1.addAtIndex(3, 2);
        ll1.addAtIndex(4, 3);
        ll1.addAtIndex(5, 4);
        System.out.println(ll1.isEmpty());
        
        ll1.clear();
        System.out.println(ll1.isEmpty());

    }
}
