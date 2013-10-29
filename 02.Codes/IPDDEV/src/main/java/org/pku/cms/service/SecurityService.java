package org.pku.cms.service;

import java.util.List;

import org.pku.cms.model.security.User;

import com.googlecode.genericdao.search.Search;

/**
 * A facade Service to for creating, maintaining the life cycle of content.
 * @author Rick
 *
 */
public interface SecurityService {
	User findUser(Long id);
	List<User> findUsers(Search s);
	User saveUser(User user);
	boolean delete(Long id);
}
