package com.dribeho.rest.json;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@Path("/cafes")
public class CafeResource {
    private Set<Cafe> cafes = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public CafeResource() {
        cafes.add(new Cafe("Little Canal", "Small shop with food near dimes square."));
        cafes.add(new Cafe("Cafe Grumpy", "Tiny cafe focusing on espresso."));
    }
    @GET
    public Set<Cafe> list() {
        return cafes;
    }

    @POST
    public void add(Cafe cafe) {
        cafes.add(cafe);
    }

    @DELETE
    public void delete(Cafe cafe) {
        cafes.removeIf(existingCafe -> existingCafe.name.contentEquals(cafe.name));
    }
}
