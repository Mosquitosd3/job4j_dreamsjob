package ru.job4j.dream.store;

import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.Post;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Store {
    private static final Store INST = new Store();

    private final Map<Integer, Post> posts = new HashMap<>();

    private final Map<Integer, Candidate> candidates = new HashMap<>();

    private Store() {
        posts.put(1, new Post(1, "Junior java job"));
        posts.put(2, new Post(2, "Middle java job"));
        posts.put(3, new Post(3, "Senior java job"));
        candidates.put(1, new Candidate(1, "Junior Java"));
        candidates.put(2, new Candidate(2, "Middle Java"));
        candidates.put(3, new Candidate(3, "Senior Java"));
    }

    public static Store instOf() {
        return INST;
    }

   public Collection<Post> findAllPost() {
        return posts.values();
   }

   public Collection<Candidate> findAllCandidates() {
        return candidates.values();
   }
}
