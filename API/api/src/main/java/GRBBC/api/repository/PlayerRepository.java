package GRBBC.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import GRBBC.api.model.Player;

public interface PlayerRepository extends MongoRepository<Player, String> {
    public Player findByName(String name);
}
