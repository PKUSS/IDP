package org.pku.cms.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.pku.cms.model.security.User;
import org.pku.cms.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Rick
 * 
 */

@ParentPackage(value = "cms")
public class UserCrudAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private List<User> users;
	private User user;
	private SecurityService securityService;

	@Autowired
	public void setSecurityService(SecurityService securityService) {
		this.securityService = securityService;
	}

	@Action(value = "/users", results = { @Result(name = "success", type = "json") })
	public String execute() throws Exception {

		// Search s = new Search(User.class);
		// users = securityService.findUsers(s);
		users = new ArrayList<User>();
		User temp = new User();
		temp.setId(1L);
		temp.setEmail("zhangsan@test.com");
		temp.setName("张三");
		users.add(temp);
		temp = new User();
		temp.setId(2L);
		temp.setEmail("lisi@test.com");
		temp.setName("李四");
		users.add(temp);
		return SUCCESS;
	}

	@Action(value = "/updateUser", results = { @Result(name = "success", type = "json") })
	public String updateUser() {
		User updatingUser = securityService.findUser(this.getUser().getId());
		if (updatingUser != null) {
			updatingUser.setName(user.getName());
			updatingUser.setEmail(user.getEmail());
			securityService.saveUser(updatingUser);
		}
		return SUCCESS;
	}

	@Action(value = "/createUser", results = { @Result(name = "success", type = "json") })
	public String createUser() {
		securityService.saveUser(user);
		return SUCCESS;
	}

	@Action(value = "/deleteUser", results = { @Result(name = "success", type = "json") })
	public String deleteUser() {
		securityService.delete(user.getId());
		return SUCCESS;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
