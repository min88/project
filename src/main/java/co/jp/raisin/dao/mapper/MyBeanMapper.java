package co.jp.raisin.dao.mapper;

import java.util.List;

import co.jp.raisin.bean.MyBean;

public interface MyBeanMapper {
  int insert(MyBean bean);

  List<MyBean> select();
}
