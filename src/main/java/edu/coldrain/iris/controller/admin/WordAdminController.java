package edu.coldrain.iris.controller.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/admin/*")
public class WordAdminController {

    @GetMapping("/word")
    public String wordAdminForm() {
        log.info("WordAdminController.wordAdminForm()");

        return "/admin/word-admin";
    }
}
