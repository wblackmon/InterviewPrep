//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
    // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>./*System.out.printf("Hello and welcome!");*/
    public static void main(String[] args) {

        // Linked lists
        //LinkedLists.ListNode node = LinkedLists.implementSingleList();
        ListNode node = LinkedLists.buildLinkedList(5);
        LinkedLists.printLinkedList(node);
        System.out.println("Linked list length: " + LinkedLists.getLinkedListLength(node, 0));

        // Hashing
        //String sentence = "thequickbrownfoxjumpsoverthelazydog";
//        String sentence = "leetcode";
//        boolean result = Hashing.checkIfPangram(sentence);
//        System.out.println("The sentence is a pangram: " + result);

        // Arrays and strings
//        char[] s = new char[] {'H','a','b','c','d','h'};
//        ArraysStrings.reverseString(s);
    }
}