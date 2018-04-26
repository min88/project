package co.jp.raisin.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.jp.raisin.bean.MyBean;
import co.jp.raisin.dao.mapper.MyBeanMapper;

public class MyBeanDao extends BaseDao {

  public void insert(MyBean bean) throws IOException {
    SqlSession session = getFactory().openSession();
    try {
      MyBeanMapper mapper = session.getMapper(MyBeanMapper.class);
      int cnt = mapper.insert(bean);

      System.out.println("登録件数=====" + cnt);
      session.commit();

    } finally {
      session.close();
    }
  }

  public List<MyBean> select() throws IOException {

    List<MyBean> list = null;
    SqlSession session = getFactory().openSession();
    try {
      MyBeanMapper mapper = session.getMapper(MyBeanMapper.class);
      list = mapper.select();

      System.out.println("list=====" + list);

      session.commit();
    } finally {
      session.close();

    }
    return list;

  }

}
