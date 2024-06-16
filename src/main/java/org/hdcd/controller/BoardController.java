package org.hdcd.controller;

import lombok.extern.slf4j.Slf4j;
import org.hdcd.domain.Board;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController //RestController = Controller + ResponseBody
@RequestMapping("/boards")
public class BoardController {

    @GetMapping()
    public ResponseEntity<List<Board>> list(){

        log.info("list");

        List<Board> boardList = new ArrayList<>();

        Board board = new Board();
        board.setBoardNo(1);
        board.setTitle("향수");
        board.setContent("넓은 벌 동쪽 끝으로");
        board.setWriter("hongkd");
        board.setRegDate(LocalDateTime.now());
        boardList.add(board);

        board = new Board();
        board.setBoardNo(2);
        board.setTitle("첫 마음");
        board.setContent("날마다 새로우며 깊어지고 넓어진다");
        board.setWriter("hongkd");
        board.setRegDate(LocalDateTime.now());
        boardList.add(board);

        return new ResponseEntity<>(boardList, HttpStatus.OK);

//        return responseEntity;
    }

}
