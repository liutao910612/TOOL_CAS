package com.liutao.controller;

import com.liutao.entity.User;
import com.liutao.service.UserService;
import com.wordnik.swagger.annotations.Api;
import org.jasig.cas.client.authentication.AttributePrincipal;
import org.jasig.cas.client.util.AbstractCasFilter;
import org.jasig.cas.client.validation.Assertion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by liutao on 2015/8/27.
 */
@Controller
@Api(value = "test")
@RequestMapping("/liutao")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userServiceImpl;
    @GetMapping(value = "/userInfo")
    public String getUserInfo(@RequestParam("username") String username, HttpServletRequest request, ModelAndView modelAndView) {
        Assertion assertion = (Assertion) request.getSession().getAttribute(AbstractCasFilter.CONST_CAS_ASSERTION);
        AttributePrincipal principal = assertion.getPrincipal();
        String accountName = principal.getName();
        logger.debug("accountName:"+accountName);
        logger.debug("second provider");
        logger.info("username:"+username);
        User user = userServiceImpl.getUserInfo(username);
        modelAndView.addObject("account",accountName);
        if(user!=null){
            logger.info(user.toString());
        }
        return "index";
    }

    @GetMapping(value = "/logout")
    public String logout(HttpSession session){
        logger.debug("enter logout");
        session.invalidate();
        return "redirect:http://localhost:8080/logout?service=http://localhost:8080/login";
    }


}
