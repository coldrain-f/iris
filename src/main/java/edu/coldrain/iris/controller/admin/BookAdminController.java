package edu.coldrain.iris.controller.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/admin/*")
public class BookAdminController {

    @GetMapping("/book")
    public String bookAdminForm() {
        log.info("BookAdminController.bookAdminForm()");

        return "admin/book-admin";
    }

    @GetMapping("/book/registration")
    public String bookRegistrationView() {
        log.info("BookAdminController.bookRegistrationView");

        return "admin/bookRegistrationView";
    }
}