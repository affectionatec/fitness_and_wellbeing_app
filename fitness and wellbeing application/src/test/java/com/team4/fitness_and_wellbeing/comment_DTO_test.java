package com.team4.fitness_and_wellbeing;

import com.team4.fitness_and_wellbeing.Comment.Comment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class comment_DTO_test {
    @Test

    void commentDTOTest(){
        Comment comment = new Comment(1,"comment");
        assertEquals(comment.getId(), 1);
        assertEquals(comment.getContent(), "comment");

    }



}
