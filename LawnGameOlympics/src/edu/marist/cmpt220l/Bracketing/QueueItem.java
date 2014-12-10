package edu.marist.cmpt220l.Bracketing;

import edu.marist.cmpt220l.teams.Team;

/**
 * Created by mjo95_000 on 12/4/2014.
 */
public class QueueItem {

    // variables to be used
    public QueueItem next;
    public int value;
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

    public int getValue() {

        return value;

    }

    public void setValue(int value) {

        this.value = value;

    }


}
