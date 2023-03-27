package com.dribeho.rest.json;

import com.dribeho.api.ReviewsApi;
import com.dribeho.beans.Review;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.*;

@Path("/reviews")
public class ReviewResource implements ReviewsApi {
    private Map<UUID, Map<UUID, Review>> cafesToReviews = Collections.synchronizedMap(new LinkedHashMap<>());

    public ReviewResource() {
    }

    @Override
    public List<Review> reviewsGet(UUID cafeId) {
        return new ArrayList<>(cafesToReviews.getOrDefault(cafeId, Collections.emptyMap()).values());
    }

    @Override
    public Review reviewsPost(Review review) {
        if (!cafesToReviews.containsKey(review.getCafeId())) {
            cafesToReviews.put(review.getCafeId(), Collections.synchronizedMap(new LinkedHashMap<>()));
        }
        cafesToReviews.get(review.getCafeId()).put(review.getId(), review);
        return review;
    }
}
