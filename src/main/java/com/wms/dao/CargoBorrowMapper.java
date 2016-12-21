package com.wms.dao;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.wms.commons.utils.PageInfo;
import org.springframework.stereotype.Repository;
import com.wms.bean.CargoBorrow;

import java.util.List;
import java.util.Map;

@Repository
public interface CargoBorrowMapper {
    int deleteByPrimaryKey(Integer cbId);

    int insert(CargoBorrow record);

    int insertSelective(CargoBorrow record);

    CargoBorrow selectByPrimaryKey(Integer cbId);

    List<CargoBorrow> select(Pagination page, Map<String,Object> map);

    int updateByPrimaryKeySelective(CargoBorrow record);

    int updateByPrimaryKey(CargoBorrow record);
}