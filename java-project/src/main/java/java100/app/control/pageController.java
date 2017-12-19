package java100.app.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface pageController {
	String service(HttpServletRequest request, HttpServletResponse response)
	throws Exception;
}
