package com.iu.home.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/qna/*")
public class QnaCotroller {

	@Autowired
	private QnaService qnaService;
	
	
	
	@GetMapping("list")
	public ModelAndView getList(QnaVO qnaVO)throws Exception{
		ModelAndView mv = new ModelAndView();
		List<QnaVO> ar = qnaService.getList(qnaVO);
		mv.addObject("list", ar);
		mv.setViewName("board/list");
		return mv;
	}
	
	
}
