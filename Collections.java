
package examples;


import java.util.*;

public class Collections {

    public static void main(String[] args) {

        List relative = new ArrayList();
        relative.add("Alex");
        relative.add("Christina");
        relative.add("Daniel");
        System.out.println("List:");
        for (int i = 0; i < relative.size(); i++) {
            System.out.println("\t" + relative.get(i));
        }
        
        LinkedList relativeList = new LinkedList(relative);
        relativeList.add("Gayle");
        relativeList.add("Scott");
        Object sibling = relativeList.get(1);
        Object s = relativeList.get(2);
        relativeList.set(1, sibling + " (younger sister)");
        relativeList.set(2, s + " (oldest brother)");
        System.out.println();
        System.out.println("Linked List: " +"\t" + relativeList);
        

        Set relative1 = new HashSet();
        relative1.add("Katy");
        relative1.add("Mark");
        relative1.add("Isaac");
        System.out.println();
        System.out.println("Set");
        System.out.print("\t" + relative1);

        relative1.remove("Isaac");
        System.out.println();
        System.out.println("New Set");
        System.out.println("\t" + relative1);

        Map loc = new HashMap();
        loc.put("Alex", "3");
        loc.put("Christina", "4");
        loc.put("Katy", "1");
        System.out.println();
        System.out.println("Map");
        System.out.print("\t" + loc);

        TreeSet t = new TreeSet();
        t.add("Brian");
        t.add("Melissa");
        t.add("Matthew");
        t.add("Chloe");
        t.add("Alex");
        System.out.println();
        System.out.println("Tree: ");
        System.out.println("\t" + t);

        
        t.add("Christina");
        Iterator tree;
        tree = t.iterator();
       
        System.out.println();
        System.out.println("Tree: ");
        while (tree.hasNext()) 
            System.out.println(tree.next() + " ");  

    }

}
