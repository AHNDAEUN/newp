package com.iu.home.board.qna;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import lombok.extern.slf4j.Slf4j;


@SpringBootTest
@Slf4j
class QnaMapperTest {

		@Autowired
		private QnaMapper qnaMapper;
		
		@Autowired
		private QnaVO qnaVO;
	
//	@Test
//	void test()throws Exception {
//		List<QnaVO> ar =qnaMapper.getList();
//		log.info("list {}", ar);
//		assertNotEquals(0, ar.size());
//	}
	
	
//	@Test
//	void test1() throws Exception {
//		
//		
//		qnaVO = new QnaVO();
//		qnaVO.setTitle("Title");
//		qnaVO.setWriter("Writer");
//		qnaVO.setCotents("contents");
//		int result = qnaMapper.setAdd(qnaVO);
//		
//	}

//	//@Test
//	void test() throws Exception {
//		List<QnaVO> ar = qnaMapper.getList();
//		log.info("List {} ", ar);
//		assertNotEquals(0, ar.size());
//	
//	}

}
