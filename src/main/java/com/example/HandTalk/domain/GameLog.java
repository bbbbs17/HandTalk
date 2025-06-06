package com.example.HandTalk.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GameLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 연관된 사용자
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    // 문제 수 및 정답 수
    @Column(nullable = false)
    private int correctCount;

    @Column(nullable = false)
    private int totalCount;

    // 정확도 (%)
    @Column(nullable = false)
    private double accuracy;


    @OneToMany(mappedBy = "gameLog", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GameProblem> problems = new ArrayList<>();


    // 플레이 시간
    private LocalDateTime playedAt;
}
