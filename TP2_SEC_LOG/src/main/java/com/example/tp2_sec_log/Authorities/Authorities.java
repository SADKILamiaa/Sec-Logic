package com.example.tp2_sec_log.Authorities;

import com.example.tp2_sec_log.User.User;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Data //pour generer les getters & setters ...
@Entity
@FieldDefaults(level= AccessLevel.PRIVATE) //pour rendre les attributs privés
public class Authorities implements Serializable {

        @javax.persistence.Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        @Column(nullable=false, updatable=false)
        String Autority;

        //jointure
        @ManyToOne
        @JoinColumn(name="Username", nullable=false)
        private User user;


}
