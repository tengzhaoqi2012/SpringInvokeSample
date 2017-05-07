package com.eudi;

import java.util.Date;

/** 
 * @author <a href="mailto:zlex.dongliang@gmail.com">梁栋</a> 
 * @since 1.0 
 */  
public class UserServiceImpl implements UserService {  
  
    /* 
     * (non-Javadoc) 
     *  
     * @see 
     * org.zlex.spring.httpinvoke.service.UserService#getUser(java.lang.String) 
     */  
    @Override  
    public User getUser(String username) {  
        User user = new User(username, new Date()); 
        user.setAge(18);
        return user;  
    }  
  
}