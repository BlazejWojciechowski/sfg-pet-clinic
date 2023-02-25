package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;
import org.yaml.snakeyaml.events.Event;

import java.util.Set;

public interface PetService extends CrudService<Pet, Long> {

}
