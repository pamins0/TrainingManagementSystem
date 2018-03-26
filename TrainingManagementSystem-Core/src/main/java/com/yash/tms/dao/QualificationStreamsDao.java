package com.yash.tms.dao;

import java.util.List;

import com.yash.tms.model.QualificationStreams;
/**
 * QualificationStreamsDao is an interface used to intract with database to perform streams related operations
 * @author Sachin.jain
 *
 */
public interface QualificationStreamsDao {
	/**
	 * this method intract with database to fetch a list of all the QualificationStreams that are available to choose from.
	 * @return
	 */
	public List<QualificationStreams> getAllStreams();
	/**
	 * this method consumes StreamId as a parameter and return single QualificationStreams based on Id.
	 * @param streamId
	 * @return
	 */
	public QualificationStreams getStreamByStreamId(int streamId);
}
