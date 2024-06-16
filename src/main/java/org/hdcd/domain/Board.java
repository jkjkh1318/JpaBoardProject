package org.hdcd.domain;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter @Setter
@EqualsAndHashCode(of="boardNo")
@ToString
@Builder
@AllArgsConstructor
public class Board {

    private int boardNo;
    @NonNull
    private String title;
    private String content;
    private String writer;
    private LocalDateTime regDate;

    /*
    //builder 패턴
    //생성자
    Board(int boardNo, String title, String content, String writer, LocalDateTime regDate){
        super();
        this.boardNo = boardNo;
        //생략
        this.regDate = regDate;
    }

    public static BoardBuilder builder(){
        return new BoardBuilder();
    }

    public static class BoardBuilder{
        private int boardNo;
        private String title;
        private String content;
        private String writer;
        private LocalDateTime regDate;

        //객체 생성 불가
        private BoardBuilder() {}

        public BoardBuilder boardNo(int boardNo){
            this.boardNo = boardNo;
            return this;
        }

        //생략

        public BoardBuilder regDate(LocalDateTime regDate){
            this.regDate = regDate;
            return this;
        }

        public Board build(){
            return new Board(boardNo, title, content, writer, regDate);
        }
    }
     */
}
