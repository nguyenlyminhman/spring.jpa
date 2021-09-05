package vn.com.native_query.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.com.entity.User;
import vn.com.native_query.model.New_User_Model;
import vn.com.native_query.model.UserModel;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "Select usersid, dob, fnm, lnm from public.users", nativeQuery = true)
    List<UserModel> getAllUserInterface();

    @Query(value = "Select usersid, dob, fnm, lnm from public.users", nativeQuery = true)
    List<User> getAllUserEntity();

    @Query(value = "Select usersid, dob, fnm, lnm from public.users where usersid = ?1", nativeQuery = true)
    User getUserById(long id);
}

