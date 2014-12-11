package edu.marist.cmpt220l.Bracketing;

import edu.marist.cmpt220l.Stacking.Stack;
import edu.marist.cmpt220l.teams.Team;

/**
 * Created by mjo95_000 on 12/4/2014.
 */
public class Queue {

    // variables used to make the list logic easier
    private QueueItem head;
    private QueueItem tail;
    private QueueItem currItem;
    private int i = 0;

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

    public Team[] PeakNextTeams(){

        Team[] A = {head.value, head.next.value};

        return A;

    }

    public Team[] GetNextTeams(){

        removeTwo();

        return PeakNextTeams();

    }

    // method used to add the winner back into the bracket
    public void ReturnTeams(Team winner, Team loser){

        Stack Losers = new Stack();

        enqueue(winner);

        Losers.push(loser);

    }

    // method used to remove both teams from the bracket
    public Team[] removeTwo (){

        if(head == null) {

            return null;

        }else{

            Team t1 = dequeue();
            Team t2 = dequeue();

            Team[] nextTeams = new Team[2];

            nextTeams[0] = t1;
            nextTeams[1] = t2;
            i = i - 2;

            return nextTeams;
        }
    }

}
