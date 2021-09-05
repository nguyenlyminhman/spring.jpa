package vn.com.hql_query.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import vn.com.hql_query.repository.User_Repository;
import vn.com.entity.User;
import vn.com.hql_query.mvc.AbstractService;

import java.util.List;

@Service
public class User_Services extends AbstractService<User, Long> {

    @Autowired
    private final User_Repository userDAO;


    @Autowired
    public User_Services(User_Repository userDAO) {
        super(userDAO);
        this.userDAO = userDAO;
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public User findOne() {
        Long id = Long.valueOf(1);
        User rs = userDAO.findOne(id);
        return rs;
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<User> getAllByQuery() {
        List<User> rs = userDAO.getAllByQuery();
        return rs;
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<User> getAllByCriteriaBuilder() {
        List<User> rs = userDAO.getAllByCriteriaBuilder();
        return rs;
    }

}
