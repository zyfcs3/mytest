package cn.zhuyafeng.mytest.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zhuyafeng.mytest.dao.IAction;
import cn.zhuyafeng.mytest.domain.Person;
import cn.zhuyafeng.mytest.service.ActionService;
@Service("actionServiceImpl")
public class ActionServiceImpl implements ActionService{
    
    @Autowired
    private IAction iAction;
    
    public boolean insertPerson(Person person) {
        boolean flag = iAction.insertPerson(person);
        
        return flag;
    }

    public boolean deleteById(int id) {
        boolean flag = iAction.deleteById(id);
        return flag;
    }

    public List<Person> queryAllPerson() {
        List<Person> persons = iAction.queryAllPerson();
        return persons;
    }

    public Person queryById(int id) {
        Person person = iAction.queryById(id);
        return person;
    }

    public boolean updatePerson(Person person) {
        
        return iAction.updatePerson(person);
    }

}
