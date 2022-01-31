package code.servlet;


import code.pojo.User;
import code.service.UserService;
import code.service.impl.UserServiceImpl;
import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/user/*")
public class UserServlet extends BaseServlet{
    private UserService userService = new UserServiceImpl();

    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = userService.selectAll();

        String jsonString = JSON.toJSONString(users);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }


    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("user add...");
    }
}
