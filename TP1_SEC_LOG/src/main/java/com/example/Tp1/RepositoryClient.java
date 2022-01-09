package com.example.Tp1;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class RepositoryClient {

    private static final Map<String, Client> Users = new HashMap<>();


    private static void initDATA() {

        Client user1 = new Client(1, "uu","uu");
        Client admin = new Client(2, "aa","aa");


        Users.put(user1.getNom(),user1);
        Users.put(admin.getNom(),admin);
    }
}
