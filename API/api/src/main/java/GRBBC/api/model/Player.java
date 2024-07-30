package GRBBC.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

/**
 * This class represents a single player in the club
 * Each player is unique
 * Player records are their match records recorded - record: win/loss
 * Events are all the events this player participated in
 */

@Document(collection = "roster")
@Component
public class Player {
    private String name;
    private String photo; //implement last
    private int win;
    private int loss;
    private List<Event> events;

    public Player (String name){
        this.name = name;
        this.win = 0;
        this.loss = 0;
        this.events = new ArrayList<>();
        this.photo = "";
    }

    public Player (String name, int win, int loss){
        this.name = name;
        this.win = win;
        this.loss = loss;
        this.events = new ArrayList<>();
        this.photo = "";
    }

    public Player(){}
    
    public String getName(){
        return this.name;
    }
    public int getWin(){
        return this.win;
    }
    public int getLoss(){
        return this.loss;
    }
    public String toString(){
        return this.name + " win: " + this.win + " loss: " + this.loss;
    }
    // public String getPhoto(){
    //     return this.photo;
    // }
    // public List<Event> getEvents(){
    //     return this.events;
    // }
}
