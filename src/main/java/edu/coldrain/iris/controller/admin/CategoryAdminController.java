package edu.coldrain.iris.controller.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/admin/*")
public class CategoryAdminController {

    @GetMapping("/category")
    public String categoryAdminForm() {
        log.info("CategoryAdminController.categoryAdminForm()");

        return "/admin/category-admin";
    }
}
