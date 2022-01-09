package com.example.tp2_sec_log.User;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Data //pour generer les getters & setters ...
@Entity
@FieldDefaults(level= AccessLevel.PRIVATE) //pour rendre les attributs privés
public class User implements Serializable {

    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(nullable=false, updatable=false)
    String Username;
    String Password;
    boolean Enabled;

}
