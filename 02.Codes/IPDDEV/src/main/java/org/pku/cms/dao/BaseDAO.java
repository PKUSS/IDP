package org.pku.cms.dao;

import java.io.Serializable;

import org.pku.cms.model.BaseModel;

import com.googlecode.genericdao.dao.jpa.GenericDAO;

/**
 * @author Rick
 *
 */
public interface BaseDAO< T extends BaseModel, ID extends Serializable> extends GenericDAO<T, ID>{
	public boolean tempDelete(T entity);
}
