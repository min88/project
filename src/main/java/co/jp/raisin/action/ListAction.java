package co.jp.raisin.action;

import java.io.IOException;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import co.jp.raisin.bean.MyBean;
import co.jp.raisin.dao.MyBeanDao;

public class ListAction extends ActionSupport {

  List<MyBean> list;

  @Override
  public String execute() throws IOException {
    MyBeanDao dao = new MyBeanDao();
    list = dao.select();

    return SUCCESS;
  }

  public List<MyBean> getList() {
    return list;
  }

  public void setList(List<MyBean> list) {
    this.list = list;
  }

}
