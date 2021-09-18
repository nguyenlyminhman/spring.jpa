package vn.com.hql_query.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.hql_query.service.User_Services;
import vn.com.entity.User;

import java.util.List;

@RestController
@RequestMapping("api/demo/hql/")
public class User_RestController {

    @Autowired
    private User_Services userService;

    @PostMapping("/get-one")
    public User getOneUsers(){
        User rs = null;
        try {
            rs = userService.findOne();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

    @PostMapping("/get-all-by-query")
    public List<User> getAllByQuery(){
        List<User> rs = null;
        try {
            rs = userService.getAllByQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

    @PostMapping("/get-all-by-criteria")
    public List<User> getAllByCriteriaBuilder(){
        List<User> rs = null;
        try {
            rs = userService.getAllByCriteriaBuilder();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    @PostMapping("/get-all-by-sql")
    public List<User> getAllByNativeSQL(){
        List<User> rs = null;
        try {
            rs = userService.getOneByNativeSQL();
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

}
