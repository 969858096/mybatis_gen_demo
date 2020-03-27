package cn.tx.mapper;

import cn.tx.domain.Testemployee;
import cn.tx.domain.TestemployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestemployeeMapper {
    int countByExample(TestemployeeExample example);

    int deleteByExample(TestemployeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Testemployee record);

    int insertSelective(Testemployee record);

    List<Testemployee> selectByExample(TestemployeeExample example);

    Testemployee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Testemployee record, @Param("example") TestemployeeExample example);

    int updateByExample(@Param("record") Testemployee record, @Param("example") TestemployeeExample example);

    int updateByPrimaryKeySelective(Testemployee record);

    int updateByPrimaryKey(Testemployee record);
}