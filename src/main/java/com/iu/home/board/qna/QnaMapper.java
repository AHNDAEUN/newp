package com.iu.home.board.qna;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface QnaMapper {

	
	public List<QnaVO>getList(QnaVO qnaVO)throws Exception;

	public int setAdd(QnaVO qnaVO)throws Exception;
}
