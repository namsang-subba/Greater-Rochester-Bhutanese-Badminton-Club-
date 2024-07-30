package GRBBC.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import GRBBC.api.model.Event;

public interface EventRepository extends MongoRepository<Event, String> {
    
}
