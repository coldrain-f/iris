package edu.coldrain.iris.controller.board;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping("/list")
    public String list() {
        log.info("BoardController.list()");
        return "home/board/boardList";
    }

    @GetMapping("/write")
    public String write() {
        log.info("BoardController.write()");
        return "home/board/boardWrite";
    }

    @GetMapping("/detail")
    public String detail() {
        log.info("BoardController.detail()");
        return "home/board/boardDetail";
    }

    @GetMapping("/modify")
    public String modify() {
        log.info("BoardController.modify()");
        return "home/board/boardModify";
    }

}
