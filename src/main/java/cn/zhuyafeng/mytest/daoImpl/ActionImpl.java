package cn.zhuyafeng.mytest.daoImpl;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Service;

import cn.zhuyafeng.mytest.dao.IAction;
import cn.zhuyafeng.mytest.domain.Person;
  

@SuppressWarnings("deprecation")
public class ActionImpl extends SqlMapClientDaoSupport implements IAction {  
  
    //添加操作  
    public boolean insertPerson(Person person) {  
        // TODO Auto-generated method stub  
        Object obj = getSqlMapClientTemplate().insert("insertPerson",person); 
        if(obj != null){
            return true;
        }
        return false;  
    }  
      
    //删除操作  
    public boolean deleteById(int id) {  
        // TODO Auto-generated method stub  
        
        int delete = getSqlMapClientTemplate().delete("deleteById", id); 
        
        return false;  
    }  
  
      
  
    //查询全部  
    public List<Person> queryAllPerson() {  
        // TODO Auto-generated method stub  
        List<Person> persons = getSqlMapClientTemplate().queryForList("queryAllPerson");  
        return persons;  
    }  
  
    public Person queryById(int id) {  
       
    return null;  
}  
  

public boolean updatePerson(Person person) {  
    getSqlMapClientTemplate().update("updatePerson",person);
                    //自己添加实现代码  
    return false;  
}  
}