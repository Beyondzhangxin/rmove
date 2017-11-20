/*** 
*<p>Title: UserContorller</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author  joyu
* @date  2017年11月9日
*/
package cn.com.aiidc.rmove.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.aiidc.rmove.entity.User;
import cn.com.aiidc.rmove.service.UserService;
/**
 * @author joyu
 * @date 2017年11月9日
 */
@Controller
@RequestMapping("user")
public class UserContorller {
	@Autowired
	private UserService service;
	
	@RequestMapping(value = "getUser", method = RequestMethod.GET)
	@ResponseBody
	public User  getUser(Long id) {
		return service.get(id);
	}
}
