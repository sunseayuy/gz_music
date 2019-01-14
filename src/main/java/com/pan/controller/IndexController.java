package com.pan.controller;

import com.pan.entity.Role;
import com.pan.entity.User;
import com.pan.repository.UserRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@CrossOrigin
public class IndexController {

    @Autowired
    private UserRepository userRepository;

    //第一种写法
    @Autowired
    private PasswordEncoder passwordEncoder;

    //第二种写法
    //private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

//    @ResponseBody
//    @RequestMapping("/personal_center")
//    public void login(HttpServletRequest request) {
//        System.out.println("登录成功");
//    }

    @ResponseBody
    @PostMapping("/registry")
    public ModelAndView registry(User user,Model model) {
        com.pan.entity.User dbuser = userRepository.findByUsername(user.getUsername());
        if(dbuser==null)
        {
            userRepository.save(new User(user.getUsername(), passwordEncoder.encode(user.getPassword())));
            System.out.println("注册成功！");
        }
        else{
            System.out.println("用户名存在！");
            return new ModelAndView("registry","userModel",model);
        }
        return new ModelAndView("login");
    }

//    @ResponseBody
//    @GetMapping("/login")
//    public ModelAndView login(String s) {
//        com.pan.entity.User user = userRepository.findByUsername(s);
//        List<Role> role =user.getRoles();
//        System.out.println("登录成功！");
//        userRepository.save(new User(user.getUsername(), passwordEncoder.encode(user.getPassword())));
//        return new ModelAndView("redirect:sign_in");
//    }

//
//    /**
//     * WebMvcConfig类等效内容
//     */
//    @RequestMapping("/sign_in")
//    public String sign_in() {
//        return "login";
//    }
//
//    @RequestMapping("/sign_up")
//    public String sign_up() {
//        return "registry";
//    }
}
