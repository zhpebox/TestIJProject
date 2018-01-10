package example;
import model.TblModule;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TblModuleMapper {
  @Select("SELECT * FROM t_module WHERE module_id = #{id}")
  TblModule selectT(int id);

  @Select("Select * from t_module")
  List<TblModule> selectL();

  @Delete("delete from t_module where module_id = #{mid}")
  int deleteT(int mid);
}