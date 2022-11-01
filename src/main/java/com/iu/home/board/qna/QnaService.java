package com.iu.home.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class QnaService {

	@Autowired
	private QnaMapper qnaMapper;
	
	public List<QnaVO> getList(QnaVO qnaVO)throws Exception{
	
		return qnaMapper.getList(qnaVO);
	}
	
	
	public int setAdd(QnaVO qnaVO)throws Exception{
		return qnaMapper.setAdd(qnaVO);
				
		}

}
