package com.yash.tms.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.yash.tms.dao.QualificationStreamsDao;
import com.yash.tms.model.QualificationStreams;

@Repository
public class QualificationStreamsDaoImpl implements QualificationStreamsDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	/**
	 * this method is an implementation of getAllStreams()   method from QualificationStreamsDao interface
	 * this method intract with database to fetch a list of all the QualificationStreams that are available to choose from.
	 * @return
	 */
	@Transactional
	public List<QualificationStreams> getAllStreams() {
		return hibernateTemplate.loadAll(QualificationStreams.class);
	}
	
	/**this method intract with database to fetch a QualificationStream
	 * this method consumes StreamId as a parameter and return single QualificationStreams based on Id.
	 * @param streamId
	 * @return
	 */

	public QualificationStreams getStreamByStreamId(int streamId) {
		
		List list= hibernateTemplate.find("from QualificationStreams where id=?", streamId);
		return (QualificationStreams) list.get(0);
	}

}
