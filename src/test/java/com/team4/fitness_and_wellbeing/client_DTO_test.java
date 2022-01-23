package com.team4.fitness_and_wellbeing;


import com.team4.fitness_and_wellbeing.model.Client;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class client_DTO_test {




    @Test

    void clientDTOTest(){

        Client client = new Client("zhe","liu","url");
        assertEquals(client.getFirstName(),"zhe");
        assertEquals(client.getLastName(),"liu");
        assertEquals(client.getPicUrl(),"url");


    }
}
