package com.team4.fitness_and_wellbeing;

import com.team4.fitness_and_wellbeing.Comment.Comment;
import com.team4.fitness_and_wellbeing.model.AuthenticationRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthenticationRequest_DTO_test {
    @Test

    void authDTOTest(){
        Comment comment = new Comment(1,"comment");
        AuthenticationRequest authenticationRequest = new AuthenticationRequest("username","password");
        assertEquals(authenticationRequest.getUsername(),"username");
        assertEquals(authenticationRequest.getPassword(),"password");

    }
}
