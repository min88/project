package co.jp.raisin.example;

import java.io.StringWriter;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

public class Controller {
  public static void main(String[] args) {

    StringWriter writer = new StringWriter();
    // MyBean bean = new MyBean(1, "a", "b", "c", "d", "20180202");

    try {
      Properties p = new Properties();
      p.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
      p.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
      Velocity.init(p);
      VelocityContext context = new VelocityContext();
      // context.put("bean", bean);
      Template template = Velocity.getTemplate("question.vm", "UTF-8");
      template.merge(context, writer);
      System.out.println(writer.toString());
      writer.flush();
    } catch (ResourceNotFoundException e) {

    } catch (ParseErrorException e) {

    } catch (MethodInvocationException e) {

    } catch (Exception e) {

    }

  }
}
