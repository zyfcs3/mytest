package cn.zhuyafeng.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("page")
@Controller
public class PageController {

    
    @RequestMapping("{path}")
    public ModelAndView toPage(@PathVariable("path")String path){
        
        ModelAndView modelAndView = new ModelAndView(path);
        
        return modelAndView;
    }
    
}
