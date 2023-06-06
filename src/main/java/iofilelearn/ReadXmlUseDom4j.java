package iofilelearn;

import com.sun.prism.shader.DrawSemiRoundRect_LinearGradient_PAD_AlphaTest_Loader;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.net.SocketTimeoutException;
import java.util.List;

/**
 * @author lixiaohu
 * @create 2023-06-05 16:20
 */
public class ReadXmlUseDom4j {
    public static Document readXmlToDoc(String filePath) {
        Document document = null;
        try {
            SAXReader saxReader = new SAXReader();
            document = saxReader.read(new File(filePath)); // 读取XML文件,获得document对象
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return document;
    }

    public static void main(String[] args) {
        SAXReader saxReader = new SAXReader();
        //2.使用解析器对象读取XML文档生成Document对象
        try {
            Document document = saxReader.read(
                    ReadXmlUseDom4j.class.getClassLoader().getResource("pom1.xml"));
//                    ReadXmlUseDom4j.class.getClassLoader().getResource("pom.xml"));
//        Document document = readXmlToDoc("F:\\learn\\spring-dubbo-servicexm.xml");
            Element rootElement = document.getRootElement();
            List<Element> elements = rootElement.elements();
            for (Element element : elements) {
                System.out.println(element.attribute("id").getValue());
                System.out.println(element.attribute("ref").getValue());
                System.out.println(element.attribute("interface").getValue());

                System.out.println(element.getName());
            }
//        Element dependencyManagement = rootElement.element("dependencyManagement");
//        System.out.println(dependencyManagement.getName());
//        List<Element> dependency = dependencyManagement.elements();
//
//        for (Element element : dependency) {
//            System.out.println(element.getName());
//            List<Element> elements = element.elements();
//            for (Element element1 : elements) {
//                System.out.println(element1.getName());
//                List<Element> elements1 = element1.elements();
//
//                for (Element element2 : elements1) {
//                    System.out.println(element2.getName() + ":" + element2.getText());
//                }
//                System.out.println(element1.getText());
//            }
//        }
            System.out.println();
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
    }
}
