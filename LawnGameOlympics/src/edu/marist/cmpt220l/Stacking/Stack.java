package edu.marist.cmpt220l.Stacking;

import edu.marist.cmpt220l.olympians.Olympian;
import edu.marist.cmpt220l.olympians.Sex;
import edu.marist.cmpt220l.teams.Team;

/**
 * Created by mjo95_000 on 12/10/2014.
 */
public class Stack {

    private StackItem top;

    // pushes a team onto the stack
    public void push(Team team){

        StackItem X = new StackItem(team);

        if(top != null){

            top = X;

        }else{

            X.next = top;
            top = X;

        }
    }

    // pops a team off of the stack
    public Team pop(){

        Team pop = null;

        if(top != null){

            System.out.println(top.value);
            pop = top.value;
            top = top.next;

        }

        return pop;

    }

    public StackItem getTop(){

        return top;

    }

}
