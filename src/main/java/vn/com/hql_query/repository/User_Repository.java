package vn.com.hql_query.repository;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import vn.com.hql_query.mvc.AbstractRepository;
import vn.com.entity.User;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
public class User_Repository extends AbstractRepository<User, Long> {
    public User_Repository() {
        super(User.class);
    }

    public List<User> getAllByQuery() {
        Query<User> q = getCurrentSession()
                .createQuery("from " + User.class.getName());
        return q.getResultList();
    }

    public List<User> getAllByCriteriaBuilder() {
        CriteriaBuilder builder = getCurrentSession().getCriteriaBuilder();
        CriteriaQuery<User> cr = builder.createQuery(User.class);
        cr.from(User.class);
        return getCurrentSession().createQuery(cr).getResultList();
    }

}
