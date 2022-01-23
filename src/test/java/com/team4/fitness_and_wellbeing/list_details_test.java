package com.team4.fitness_and_wellbeing;

import com.team4.fitness_and_wellbeing.mapper.DetailsMapper;
import com.team4.fitness_and_wellbeing.model.Details;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class list_details_test {


    @MockBean
    private DetailsMapper detailsMapper;
    @Autowired
    private MockMvc mockMvc;


    @Test
    public void getDetailsTest() throws Exception{
        Details details = new Details("1","male","180","180","demo","demo","demo","demo");

        given(this.detailsMapper.findAll()).willReturn(Arrays.asList(details));

        this.mockMvc.perform(get("/showDetails")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("1")));


    }
}
