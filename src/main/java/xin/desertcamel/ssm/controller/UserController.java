package xin.desertcamel.ssm.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import xin.desertcamel.ssm.bean.User;
import xin.desertcamel.ssm.service.UserService;

/**
 * UserController
 */

@Controller
@RequestMapping(value = "/user")
public class UserController {
    private static Logger logger = LogManager.getLogger();

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User findUserById(@PathVariable("id") Integer id) {
        User user = userService.findUserById(id);
        logger.info(user.toString());
        logger.info("I'm a test log");
        return user;
    }
    
}