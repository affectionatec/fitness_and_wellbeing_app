package com.team4.fitness_and_wellbeing;


import com.team4.fitness_and_wellbeing.model.UserDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class user_DTO_test {

    @Test

    void userDTOTest(){

        UserDto userDto = new UserDto(1l,"username","user_fullname","client");
        assertEquals(userDto.getUser_id(), "1");
        assertEquals(userDto.getUsername(), "username");
        assertEquals(userDto.getFull_name(),"user_fullname");
        assertEquals(userDto.getUser_type(),"client");

    }
}
