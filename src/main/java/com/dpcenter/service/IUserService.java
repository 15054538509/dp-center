package com.dpcenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dpcenter.dto.LoginFormDTO;
import com.dpcenter.dto.Result;
import com.dpcenter.entity.User;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @since 2021-12-22
 */
public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);

    Result sign();

    Result signCount();

}
