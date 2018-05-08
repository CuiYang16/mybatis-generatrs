package com.cxl.dao;

import com.cxl.entity.EsComment;

public interface EsCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EsComment record);

    int insertSelective(EsComment record);

    EsComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EsComment record);

    int updateByPrimaryKey(EsComment record);
}