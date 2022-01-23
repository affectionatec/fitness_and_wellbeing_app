package com.team4.fitness_and_wellbeing;

import com.team4.fitness_and_wellbeing.model.Details;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class details_DTO_test {


    @Test
    void detailsDTOTest(){
        Details details = new Details("1","male","180","180","demo","demo","demo","demo");
        assertEquals(details.getId(), "1");
        assertEquals(details.getSex(), "male");
        assertEquals(details.getHeight(), "180");
        assertEquals(details.getWeight(), "180");
        assertEquals(details.getLevel(), "demo");
        assertEquals(details.getSpeciality(), "demo");
        assertEquals(details.getOrganisation(),"demo");
        assertEquals(details.getQualification(),"demo");

    }
}
