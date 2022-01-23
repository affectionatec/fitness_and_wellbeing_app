package com.team4.fitness_and_wellbeing;


import com.team4.fitness_and_wellbeing.model.Video;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class video_DTO_test {
    @Test

    void videoDTOTest(){

        Video video = new Video(1l,"www.google.com","description","video_title","way");
        assertEquals(video.getId(),1l);
        assertEquals(video.getUrl(),"www.google.com");
        assertEquals(video.getDescription(),"description");
        assertEquals(video.getTitle(), "video_title");
        assertEquals(video.getWay(),"way");

    }
}
