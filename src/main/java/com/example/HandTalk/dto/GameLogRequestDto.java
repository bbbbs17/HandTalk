package com.example.HandTalk.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GameLogRequestDto {


    private int correctCount;
    private int totalCount;
    private LocalDateTime playedAt;

    private List<GameProblemLogDto> problems;  // ✅

}
