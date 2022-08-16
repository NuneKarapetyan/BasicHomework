package stack;

public class Stack {
    int[] stack = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
            System.out.println("Stack full . ");
        else
            stack[ ++tos ] =item;
    }
    int рор () {
        if ( tos < 0) {
            System . out . println ( "Stack not loaded . " ) ;
            return 0;
        }else
            return stack [ tos-- ];
    }
}