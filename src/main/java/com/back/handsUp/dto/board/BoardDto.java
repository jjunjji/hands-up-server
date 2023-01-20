package com.back.handsUp.dto.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
public class BoardDto {
    @Getter
    @AllArgsConstructor
    @Builder
    public static class GetBoardInfo {
        private String indicateLocation;
        private String location;
        private String content;
        private String tag;
        private int messageDuration;
    }

    @Getter
    @AllArgsConstructor
    @Builder
    public static class SingleBoardRes {
        private String nickname;
        private String location;
        private String content;
        private String tag;
        private String didLike;
        private int messageDuration;
        private LocalDateTime createdAt;
    }
}
