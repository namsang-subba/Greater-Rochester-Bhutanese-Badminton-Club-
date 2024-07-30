package GRBBC.api.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

/**
 * A single badminton event that club member(s) attended
 * Player position will only be used when added to player class
 */
@Document(collection="events")
@Component
public class Event {
    private String name;
    private String location;
    private String status; 

    public Event (String name, String location, String status){
        this.name = name;
        this.location = location;
        this.status = status;
    }

    public Event(){}
    
    public String getName(){
        return this.name;
    }
    public String location(){
        return this.location;
    }
    public String getEventStatus(){
        return this.status;
    }
}
