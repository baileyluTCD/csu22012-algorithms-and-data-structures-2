package baileylu.tcd.ie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class ActorIndex {
    // Map from Actor -> int (vertex index)
    private Map<Actor, Integer> actorToId;
    // Inverse mapping: index -> Actor
    private List<Actor> idToActor;

    public ActorIndex() {
        actorToId = new HashMap<>();
        idToActor = new ArrayList<>();
    }

    /**
     * Returns the vertex index corresponding to 'actor',
     * creating a new index if this actor was not seen before.
     */
    public int getOrCreateId(Actor actor) {
        Integer id = actorToId.get(actor);
        if (id == null) {
            id = actorToId.size();
            actorToId.put(actor, id);
            idToActor.add(actor);
        }
        return id;
    }

    /**
     * Returns the vertex index if 'actor' is known, or -1 if not found.
     */
    public int getId(Actor actor) {
        return actorToId.get(actor);
    }

    public Actor getActor(int id) {
        return idToActor.get(id);
    }

    /**
     * Number of distinct actors we have indexed.
     */
    public int size() {
        return actorToId.size();
    }
}
