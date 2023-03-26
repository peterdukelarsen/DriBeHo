package com.dribeho.rest.json;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.*;

@Path("/reviews")
public class ReviewResource {
    private Map<String, Set<Review>> cafesToReviews = Collections.synchronizedMap(new LinkedHashMap<>());
    public ReviewResource() {
    }
    @GET
    @Path("/{cafe}")
    public Set<Review> listReviewsForCafe(String cafe) {
        return cafesToReviews.get(cafe);
    }

    @POST
    public void add(Review review) {
        if (!cafesToReviews.containsKey(review.cafeName)) {
            cafesToReviews.put(review.cafeName, new HashSet<>());
        }
        cafesToReviews.get(review.cafeName).add(review);
    }

    @DELETE
    public void delete(Review review) {
        Optional.ofNullable(cafesToReviews.get(review.cafeName))
                .ifPresent(reviews -> reviews
                        .removeIf(existingReview -> existingReview.title.contentEquals(review.title)));
    }
}
