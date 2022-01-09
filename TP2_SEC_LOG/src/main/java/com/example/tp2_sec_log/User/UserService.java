package com.example.tp2_sec_log.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    //methode pour recuperer tout les comptes
    public List<User> getAll()
    {
        List<Object> cartes= carterepo.afficherall();
        return cartes;
    }
}
