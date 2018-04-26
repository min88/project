package co.jp.raisin.action;

import java.io.IOException;

import com.opensymphony.xwork2.ActionSupport;

import co.jp.raisin.bean.MyBean;
import co.jp.raisin.dao.MyBeanDao;

public class QuestionAction extends ActionSupport {

  private MyBean bean;

  @Override
  public String execute() throws IOException {
    MyBeanDao dao = new MyBeanDao();
    dao.insert(bean);
    System.out.println(bean.getIdx() + "============================idx");
    System.out.println(bean.getId() + "============================id");
    System.out.println(bean.getName() + "============================name");
    System.out.println(bean.getPw() + "============================pw");
    System.out.println(bean.getQuestion() + "============================question");
    System.out.println(bean.getUpdate() + "============================update");
    System.out.println(bean.getWriter() + "============================writer");

    return SUCCESS;
  }

  public MyBean getBean() {
    return bean;
  }

  public void setBean(MyBean bean) {
    this.bean = bean;
  }
}
