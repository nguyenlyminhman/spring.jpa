package vn.com.native_query.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.entity.User;
import vn.com.native_query.model.New_User_Model;
import vn.com.native_query.model.UserDTO;
import vn.com.native_query.model.UserModel;
import vn.com.native_query.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<UserModel> getAllUserInterface() {
        List<UserModel> list = userRepository.getAllUserInterface();
//        ModelMapper modelMapper = new ModelMapper();
//        New_User_Model userDTO = modelMapper.map(list.get(0), New_User_Model.class);
        return list;
    }

    public List<User> getAllUserEntity() {
        List<User> list = userRepository.getAllUserEntity();
        return list;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(UserDTO dto) {
        return userRepository.findById(dto.getUsersId());
    }

    public New_User_Model getUserById(UserDTO dto) {
        User rs = userRepository.getUserById(dto.getUsersId());
        ModelMapper modelMapper = new ModelMapper();
        New_User_Model userDTO = modelMapper.map(rs, New_User_Model.class);
        return userDTO;
    }

}
