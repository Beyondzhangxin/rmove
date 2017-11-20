/*** 
*<p>Title: UserService</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author  joyu
* @date  2017年11月9日
*/
package cn.com.aiidc.rmove.dao;

import org.springframework.stereotype.Repository;

import cn.com.aiidc.rmove.entity.User;


@Repository
public interface UserDao extends BaseDao<User, Long> {

}
