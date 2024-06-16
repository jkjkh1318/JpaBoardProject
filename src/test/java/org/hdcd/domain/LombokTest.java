package org.hdcd.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class LombokTest {

    @Test
    public void testNoArgsConstructor(){
        Board board = new Board();
        System.out.println("board = " + board);
    }

    @Test
    public void testRequiredConstructor(){
        Board board = new Board("Hello~~");
        System.out.println("board = " + board);
    }

    @Test
    public void testEqualsAndHashcode(){
        Board boardA = new Board();
        boardA.setBoardNo(1);
        boardA.setTitle("A");

        Board boardB = new Board();
        boardB.setBoardNo(1);
        boardB.setTitle("B");

        System.out.println("boardA equals boardB: " + (boardA.equals(boardB)) );
        System.out.println("boardA == boardB: " + (boardA == boardB) );
    }

    @Test
    public void testBoardBuilder(){
        Board board = Board.builder()
                .boardNo(1)
                //생략
                .regDate(LocalDateTime.now())
                .build();

        System.out.println("board = " + board);
    }


}
