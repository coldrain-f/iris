package edu.coldrain.iris.controller.admin;


import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@WebMvcTest(BookAdminController.class)
public class BookAdminControllerTest {

    //@WebMvcTest
    //자동 설정을 비활성화하고 스프링 MVC 테스트와 관련된 구성만 적용된다.
    //JUnit 4에서는 @RunWith(SpringRunner.class)와 같이 사용해야 한다.

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void exist() {
        Assertions.assertThat(mockMvc).isNotNull();
    }

    @Test
    public void request() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/admin/book"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}