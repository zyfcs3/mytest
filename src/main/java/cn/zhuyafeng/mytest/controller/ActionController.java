package cn.zhuyafeng.mytest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.zhuyafeng.mytest.domain.Person;
import cn.zhuyafeng.mytest.service.ActionService;

@RequestMapping("action")
@Controller
public class ActionController {

    @Autowired
    private ActionService actionService;
    
    
    @RequestMapping("save")
    public ModelAndView insertPerson(Person person){
        boolean flag = actionService.insertPerson(person);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("sucess", flag);
        return modelAndView;
    }
    
    @RequestMapping("delete")
    public ModelAndView deleteById(int id){
        
        boolean flag = actionService.deleteById(id);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("sucess", flag);
        return modelAndView;
        
    }
    
    @RequestMapping("queryAll")
    public ModelAndView queryAllPerson(){
        List<Person> persons = actionService.queryAllPerson();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("persons", persons);
        return modelAndView;
        
    }
    @RequestMapping("queryById")
    public ModelAndView  queryById(int id){
        Person person = actionService.queryById(id);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("person", person);
        return modelAndView;
        
    }
    @RequestMapping("updatePerson")
    public ModelAndView updatePerson(Person person){
        boolean flag = actionService.updatePerson(person);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("sucess", flag);
        return modelAndView;
    }
    
}
