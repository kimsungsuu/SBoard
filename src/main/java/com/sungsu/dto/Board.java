package com.sungsu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 계층간 정보를 교환할 수 있도록 DTO 생성
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    private int num;
    private String category;
    private String writer;
    private String title;
    private String text;
    private LocalDateTime createDate;
    private LocalDateTime modDate;
    private String password;
    private int hit;
}
