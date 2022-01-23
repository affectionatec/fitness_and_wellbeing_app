package com.team4.fitness_and_wellbeing;

import com.team4.fitness_and_wellbeing.Comment.Comment;
import com.team4.fitness_and_wellbeing.Comment.CommentMapper;

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
public class list_comment_test {

    @MockBean
    private CommentMapper commentMapper;
    @Autowired
    private MockMvc mockMvc;


    @Test
    public void getCommentTest() throws Exception{
        Comment comment = new Comment(1,"comment");

        given(this.commentMapper.findAll()).willReturn(Arrays.asList(comment));

        this.mockMvc.perform(get("/showcomments")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("comment")));
    }

}
