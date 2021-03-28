package AbstractFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

class XMLUTil {
    public static String getBrandName(){
        try{
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("XMLUtil.xml"));

            //获取包含品牌名称的文本节点

            NodeList nl = ((Document) doc).getElementsByTagName("brandName");
            Node classNode = nl.item(0).getFirstChild();
            String brandName = ((Node) classNode).getNodeValue().trim();
            return brandName;
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
