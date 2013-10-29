package org.pku.cms.service;

import java.util.List;

import org.pku.cms.dao.UserDAO;
import org.pku.cms.model.security.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.googlecode.genericdao.search.Search;

/**
 * @author Rick
 * 
 */
@Service("securityService")
public class SecurityServiceImpl implements SecurityService {

	private UserDAO userDAO;
	//private static final Log log = LogFactory.getLog(SecurityServiceImpl.class);


	@Autowired
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}	

		/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pku.cms.service.StructureService#saveNode(org.pku.cms.model.structure
	 * .FolderNode)
	 */
	@Override
	@Transactional
	public User saveUser(User user) {
		// TODO create or update user
		return userDAO.save(user);
	}

	@Override
	public List<User> findUsers(Search s) {
		// TODO find users with params
		if(s!=null){
		return userDAO.search(s);
		}else return null;
	}
	//@Override
	@Transactional
	public int countUsers(Search s) {
		// TODO Auto-generated method stub
	 	return userDAO.count(s);
	}

	@Override
	public User findUser(Long id) {
		// TODO Auto-generated method stub
		return userDAO.find(id);
	}

	@Override
	@Transactional
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return userDAO.removeById(id);
	}

	
	

}
