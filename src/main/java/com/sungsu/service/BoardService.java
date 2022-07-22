package com.sungsu.service;

import com.sungsu.dto.Board;
import com.sungsu.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * TODO : service에서 interface와 구현체를 나누는 이유
 */

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardService {

    private final BoardMapper boardMapper;

    //service에서 boardMapper와 연결된 메서드 호출
    public List<Board> boardList(){
        return boardMapper.findAll();
    }

    public Board findById(int num){
        return boardMapper.findById(num);
    }
}


