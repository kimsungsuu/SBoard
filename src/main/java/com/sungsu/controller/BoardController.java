package com.sungsu.controller;

import com.sungsu.dto.Board;
import com.sungsu.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/boards")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    //게시판 목록 출력
    @GetMapping
    public String main(Model model){
        model.addAttribute("boards",boardService.boardList());
        return "board/boardList";
    }

    @GetMapping("/{num}")
    public String detailBoard(@PathVariable int num, Model model){
        Board byId = boardService.findById(num);
        model.addAttribute("byId",byId);
        return "board/detailBoard";
    }

}
