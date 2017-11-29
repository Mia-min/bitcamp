package java100.app.control;

import java100.app.control.Request;
import java100.app.control.Response;

public interface Controller {
    void execute(Request request, Response response);
    default void init() {}
    default void destroy() {}
}








