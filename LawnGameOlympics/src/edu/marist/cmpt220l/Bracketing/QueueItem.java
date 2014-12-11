package edu.marist.cmpt220l.Bracketing;

import edu.marist.cmpt220l.teams.Team;

/**
 * Created by mjo95_000 on 12/4/2014.
 */
public class QueueItem {

    // variables to be used
    public QueueItem next;
    public Team value;
    private Team teams;


    public QueueItem(Team teams){

        this.teams = teams;

    }

    public QueueItem getNext(){

        return next;

    }

    public void setNext(QueueItem next) {

        this.next = next;

    }

    public Team getValue() {

        return value;

    }

    public void setValue(Team value) {

        this.value = value;

    }


}
