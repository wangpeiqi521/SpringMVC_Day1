package com.baizhi.Action;

import com.baizhi.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes({"name","age"})
@RequestMapping("/first")
public class firstAction {

   //同事
    
    @RequestMapping("/A")
    public String A(String username) throws Exception{
        System.out.println("我是SpringMVC的A方法");
        System.out.println(username);
        return "index";
    }


    //零散变量接受数据
    @RequestMapping("/B")
    public String B(@RequestParam(value = "name",defaultValue = "张三") String username, Integer age) throws Exception{
        System.out.println("我是SpringMVC的B方法");
        System.out.println(username);
        System.out.println(age);
        return "index";
    }

    //对象形式接受数据
    @RequestMapping("/C")
    public String C(User user) throws Exception{
        System.out.println("我是SpringMVC的C方法");
        System.out.println(user);
        return "index";
    }

    //数组形式接受数据
    @RequestMapping("/D")
    public String D(Integer[] hobby) throws Exception{
        System.out.println("我是SpringMVC的D方法");
        for (Integer integer : hobby) {
            System.out.println(integer);
        }
        return "index";
    }

    @RequestMapping("/s1")
    public String s1() throws Exception{
        System.out.println("我是SpringMVC的S1方法");
        return "redirect:/index.jsp";
    }

    @RequestMapping("/s2")
    public String s2() throws Exception{
        System.out.println("我是SpringMVC的S2方法");
        return "forward:/first/s3.do?username=zhangsan";
    }

    @RequestMapping("/s3")
    public String s3(String username) throws Exception{
        System.out.println("我是SpringMVC的S3方法");
        System.out.println(username);
        return "index";
    }

    @RequestMapping("/s4")
    public String s4(HttpServletRequest request, HttpSession session) throws Exception{
        request.setAttribute("name","张三");
        session.setAttribute("age",18);
        return "index";
    }

    @RequestMapping("/s5")
    public String s5(Model model, ModelMap modelMap) throws Exception{
        model.addAttribute("name","张三");
        modelMap.addAttribute("age",20);

        return "index";
    }
}
