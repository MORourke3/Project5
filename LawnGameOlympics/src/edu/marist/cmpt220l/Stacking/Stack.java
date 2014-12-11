package edu.marist.cmpt220l.Stacking;

import edu.marist.cmpt220l.olympians.Olympian;
import edu.marist.cmpt220l.olympians.Sex;
import edu.marist.cmpt220l.teams.Team;

/**
 * Created by mjo95_000 on 12/10/2014.
 */
public class Stack {

    private StackItem top;


    public void push(Team team){

        StackItem X = new StackItem(team);

        if(top == null){

            top = X;

        }else{

            X.next = top;
            top = X;

        }
    }

    public Team pop(){

        Team pop = null;

        if(top != null){

            pop = top.value;
            top = top.next;

        }

        return pop;

    }

    /*public static void main(String[] args){

        Stack newStack = new Stack();

        newStack.push(new Team(new Olympian("chad", Sex.MALE, 17), new Olympian("George", Sex.MALE, 17)));


    }*/



}
