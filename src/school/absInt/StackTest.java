package school.absInt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {


    @Test
    public void add() {
        Stack list = new Stack();
        int lenght = list.size();
        list.add("Something");
        int lenght2 = list.size();
        assertEquals(lenght +1, lenght2,"Add");

    }

    @Test
    public void removeLast() {
        Stack list = new Stack();
        list.add("Something");
        list.add("Something");
        list.add("Something");
        int lenght = list.size();
        String last = list.removeLast();
        int lenght2 = list.size();
        assertEquals(lenght2, lenght-1,"Item wasn't removed");
        assertEquals(last, "Something","last item wasn't added last");
    }

    @Test
    public void getLast() {
        Stack list = new Stack();
        list.add("Something");
        list.add("Something");
        int lenght = list.size();
        String last = list.getLast();
        assertEquals(lenght, list.size(),"the lenght is not the same");
        assertEquals(last, list.getLast(),"last item wasn't added last");
    }
    @Test
    public void isEmpty(){
        Stack list = new Stack();
        assertEquals(0, list.size(),"is not empty");
    }
}