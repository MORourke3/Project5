package edu.marist.cmpt220l.Bracketing;

import edu.marist.cmpt220l.teams.Team;

/**
 * Created by mjo95_000 on 12/4/2014.
 */
public class Queue {

    // variables used to make the list logic easier
    private QueueItem head;
    private QueueItem tail;
    private QueueItem currItem;

    // method used to add a team to the queue
    public void enqueue(Team team){

        QueueItem A = new QueueItem(team);

        if(head == null){

            head = tail = currItem = A;

        }else{

            tail = A;
            currItem.setNext(A);
            currItem = A;

        }
    }

    // method used to remove a team from the queue
    public Team dequeue(){

        if(head == null){

            System.out.println("No items on the list");
            return null;

        }else{

            Team team = head.getValue();
            head = head.getNext();
            return team;

        }
    }

    // method used to create a bracket by adding all of the teams to it
    public void makeBracket(Team[] team){

        Queue make = new Queue();

        for(int i = 0; i < team.length; i++){

            make.enqueue(team[i]);

        }
    }

    // method used to remove both teams from the bracket
    public void removeTwo (){

        Queue remove = new Queue();

        for(int i = 0; i < 1; i++){

            remove.dequeue();
            remove.dequeue();

        }
    }

    // method used to add the winner back into the bracket
    public void addWinnerBack (Team team1){

        enqueue(team1);

    }









}
