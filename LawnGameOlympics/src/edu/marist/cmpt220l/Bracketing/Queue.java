package edu.marist.cmpt220l.Bracketing;

import edu.marist.cmpt220l.Stacking.Stack;
import edu.marist.cmpt220l.events.Event;
import edu.marist.cmpt220l.teams.Team;

/**
 * Created by mjo95_000 on 12/4/2014.
 */
public class Queue {

    // variables used to make the list logic easier
    private QueueItem head;
    private QueueItem tail;
    private int count;

    // method used to add a team to the queue
    public void enqueue(Team team){

        QueueItem A = new QueueItem(team);

        if(head == null){

            head = tail = A;

        }else{

            tail.next = A;
            tail = A;

        }
        count++;
    }

    // method used to remove a team from the queue
    public Team dequeue(){

        if(head == null){

            System.out.println("No items on the list");
            return null;

        }else{

            Team team = head.getValue();
            head = head.getNext();
            count--;
            return team;

        }

    }

    public int count(){

        return this.count;

    }
    public QueueItem getHead(){

        return head;

    }

    public void setHead(QueueItem head){

        this.head = head;

    }



}
