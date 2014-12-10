package edu.marist.cmpt220l.Stacking;

/**
 * Created by mjo95_000 on 12/10/2014.
 */
public class Stack {

    private int length;
    private StackItem top;


    public void push(int team){

        StackItem X = new StackItem(team);

        if(top == null){

            top = X;

        }else{

            X.next = top;
            top = X;

        }
    }

    public int pop(){

        int pop = -1;

        if(top != null){

            pop = top.value;
            top = top.next;
            length--;

        }

            return pop;

        }


}
