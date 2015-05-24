package cn.zhuyafeng.mytest.controller;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhuyafeng.mytest.daoImpl.ActionImpl;
import cn.zhuyafeng.mytest.domain.Person;

  
  
public class ActionImplTest {  
    private static ApplicationContext applicationContext = null;   //提供静态ApplicationContext  
    static{  
        applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml"); //实例化  
    }  
    //添加操作  
    @Test  
    public void testInsertPerson(){  
        ActionImpl s = (ActionImpl)applicationContext.getBean("personDAO");  
        s.insertPerson(new Person(11,"zhangsan",2));  
    }  
      
    //删除操作  
    @Test  
    public void testDeletePerson(){  
        ActionImpl s = (ActionImpl)applicationContext.getBean("personDAO");  
        s.deleteById(1);  
    }  
    
    //update操作  
    @Test  
    public void testUpdatePerson(){  
        ActionImpl s = (ActionImpl)applicationContext.getBean("personDAO");  
        s.updatePerson(new Person(1,"zhang",3)); 
    } 
      
    //查询全部  
    @Test  
    public void testQueryAllPerson(){  
        ActionImpl s = (ActionImpl)applicationContext.getBean("personDAO");  
        List<Person> persons = s.queryAllPerson();  
        //System.out.println(persons.size());  
        Iterator<Person> ite = persons.iterator();  
        while(ite.hasNext()){  
            Person person = ite.next();  
            System.out.print("ID: "+person.getId());  
            System.out.print(" Name: "+person.getName());  
            System.out.print(" Sex: "+person.getSex());  
            System.out.println();  
        }  
    }  
}  