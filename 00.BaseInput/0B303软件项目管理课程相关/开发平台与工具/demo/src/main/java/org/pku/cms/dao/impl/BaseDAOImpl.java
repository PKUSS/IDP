package org.pku.cms.dao.impl;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.pku.cms.dao.BaseDAO;
import org.pku.cms.model.BaseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.googlecode.genericdao.dao.jpa.GenericDAOImpl;
import com.googlecode.genericdao.search.jpa.JPASearchProcessor;

@Repository
public class BaseDAOImpl<T extends BaseModel,ID extends Serializable> extends GenericDAOImpl<T,ID> implements BaseDAO<T, ID>{
		
	public boolean tempDelete(T entity){
		try {
			entity.setTempDeleted(true);
			save(entity);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	    @Override
		@PersistenceContext
		public void setEntityManager(EntityManager entityManager) {
			super.setEntityManager(entityManager);
		}
		
		@Override
		@Autowired
		public void setSearchProcessor(JPASearchProcessor searchProcessor) {
			super.setSearchProcessor(searchProcessor);
		}


}
