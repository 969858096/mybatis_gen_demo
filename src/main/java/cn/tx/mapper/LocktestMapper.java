package cn.tx.mapper;

import cn.tx.domain.Locktest;
import cn.tx.domain.LocktestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LocktestMapper {
    int countByExample(LocktestExample example);

    int deleteByExample(LocktestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Locktest record);

    int insertSelective(Locktest record);

    List<Locktest> selectByExample(LocktestExample example);

    Locktest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Locktest record, @Param("example") LocktestExample example);

    int updateByExample(@Param("record") Locktest record, @Param("example") LocktestExample example);

    int updateByPrimaryKeySelective(Locktest record);

    int updateByPrimaryKey(Locktest record);
}