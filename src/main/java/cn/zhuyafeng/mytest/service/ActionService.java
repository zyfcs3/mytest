package cn.zhuyafeng.mytest.service;

import java.util.List;

import cn.zhuyafeng.mytest.domain.Person;

public interface ActionService {

    boolean insertPerson(Person person);

    boolean deleteById(int id);

    List<Person> queryAllPerson();

    Person queryById(int id);

    boolean updatePerson(Person person);

}
