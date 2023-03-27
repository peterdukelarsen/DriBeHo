package com.dribeho.rest.json;

import com.dribeho.api.CafesApi;
import com.dribeho.beans.Cafe;

import javax.ws.rs.Path;
import java.util.*;

@Path("/cafes")
public class CafeResource implements CafesApi {
    private Map<UUID, Cafe> cafes = Collections.synchronizedMap(new LinkedHashMap<>());

    public CafeResource() {
        Cafe littleCanal = Cafe.builder()
                .id(UUID.randomUUID())
                .name("Little Canal")
                .state("NY")
                .zipcode("10002")
                .address("TODO")
                .build();
        Cafe cafeGrumpy = Cafe.builder()
                .id(UUID.randomUUID())
                .name("Cafe Grumpy")
                .state("NY")
                .zipcode("10002")
                .address("TODO")
                .build();
        cafes.put(littleCanal.getId(), littleCanal);
        cafes.put(cafeGrumpy.getId(), cafeGrumpy);
    }

    @Override
    public List<Cafe> cafesGet() {
        return new ArrayList<>(cafes.values());
    }

    @Override
    public Cafe cafesPost(Cafe cafe) {
        cafes.put(cafe.getId(), cafe);
        return cafe;
    }
}
