package codewars7kyu.FunWithListsLength;


import java.util.Arrays;

public class FunWithListsLength {
    public static int length(Node head) {
        int sum = 1;
        if (head == null) {
            return 0;
        } else {
           while (head.next!=null){
               head=head.next;
               sum++;
           }
        }
        return sum;
    }

}



