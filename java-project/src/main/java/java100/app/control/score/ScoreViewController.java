package java100.app.control.score;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.control.pageController;
import java100.app.dao.ScoreDao;
import java100.app.domain.Score;

@Component("/score/view")
public class ScoreViewController implements pageController {

	@Autowired ScoreDao scoreDao;
	
	@Override
	public String service(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		int no = Integer.parseInt(request.getParameter("no"));
		Score score = scoreDao.selectOne(no);

		// 작업한 결과를 JSP에게 넘겨주기 위해 ServletRequest 보관소에 저장한다.
		request.setAttribute("score", score);

		// 프론트 컨트롤러가 실행할 JSP URL을 등록한다.
		return "/score/view.jsp";
	}
}
