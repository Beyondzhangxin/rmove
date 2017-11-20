/*** 
*<p>Title: UserService</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author  joyu
* @date  2017年11月9日
*/
package cn.com.aiidc.rmove.service;


import javax.annotation.Resource;

import cn.com.aiidc.rmove.entity.User;

import cn.com.aiidc.rmove.dao.UserDao;
import org.springframework.stereotype.Service;
/**
 * @author joyu
 * @date 2017年11月9日
 */
@Service
public class UserService {
	@Resource
	private UserDao dao;
	
	public void delete(Long id) {
		dao.delete(id);
	}
	public User get(Long id) {
		return dao.findOne(id);
	}
}
