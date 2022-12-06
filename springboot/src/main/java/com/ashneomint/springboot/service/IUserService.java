package com.ashneomint.springboot.service;

import com.ashneomint.springboot.controller.dto.UserDTO;
import com.ashneomint.springboot.controller.dto.UserPasswordDTO;
import com.ashneomint.springboot.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author
 * @since 2022-01-26
 */
public interface IUserService extends IService<User> {

    UserDTO login(UserDTO userDTO);

    User register(UserDTO userDTO);

    void updatePassword(UserPasswordDTO userPasswordDTO);
}
