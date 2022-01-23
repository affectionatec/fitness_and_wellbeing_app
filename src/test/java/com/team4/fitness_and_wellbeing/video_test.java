package com.team4.fitness_and_wellbeing;

import com.team4.fitness_and_wellbeing.model.Video;
import com.team4.fitness_and_wellbeing.service.VideoService;
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
public class video_test {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private VideoService videoService;


    @Test
    public void videoTest() throws Exception{
        Video video = new Video(1,"url","description","title","way");
        given(this.videoService.selectVideo()).willReturn(Arrays.asList(video));
        this.mockMvc.perform(get("/search")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("description")));

    }
}
