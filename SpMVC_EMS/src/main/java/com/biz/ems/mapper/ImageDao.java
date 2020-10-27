package com.biz.ems.mapper;

import java.util.List;

import com.biz.ems.model.ImageVO;

public interface ImageDao {

	List<ImageVO> findBySeq(long long_seq);

	public int insert_multi(List<ImageVO> fileNames);

}
