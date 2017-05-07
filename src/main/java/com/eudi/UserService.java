package com.eudi;
/** 
 * @author <a href="mailto:zlex.dongliang@gmail.com">梁栋</a> 
 * @since 1.0 
 */  
public interface UserService {  
  
    /** 
     * 获得用户 
     *  
     * @param username 
     *            用户名 
     * @return 
     */  
    User getUser(String username);  
}  