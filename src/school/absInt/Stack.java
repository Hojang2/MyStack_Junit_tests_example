package school.absInt;


import java.util.LinkedList;

public class Stack {
    LinkedList<String> list;
    public Stack(){
        this.list = new LinkedList<String>();
    }

    public void add(String text){
        this.list.push(text);
    }

    public String removeLast(){
        return this.list.pop();
    }
    public String getLast(){
        return this.list.peek();
    }
    public int size(){
        return this.list.size();
    }
}
