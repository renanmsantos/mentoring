package com.training.mentoring.endpoints;

import com.training.mentoring.MentoringTests;
import org.junit.Test;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ClientEndpointTest extends MentoringTests {

    @Test
    public void shouldReturnCreatedForClientCreation() throws Exception {
        this.mockMvc.perform(post(ClientEndpoint.CLIENT_RESOURCE_PATH)
                .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isCreated());
    }

}
