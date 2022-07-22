package com.sungsu.mapper;

import com.sungsu.dto.Board;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Board(entity)와 DB table 연결
 */

@Repository //스프링 Bean에 등록
@Mapper
public interface BoardMapper {

    List<Board> findAll();

    Board findById(int num);
}
