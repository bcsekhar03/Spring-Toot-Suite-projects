package com.chandra;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;
@Repository
public interface studentRepo extends CrudRepository<student10,Integer> {
}
