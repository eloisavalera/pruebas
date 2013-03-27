package Xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

public class Xml {
  public static String path = "file.xml";
  public static void main(String argv[]) {
    try {
      DOMUtil operacionXml = new DOMUtil();
      
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db;
      db = dbf.newDocumentBuilder();
      Document doc = db.newDocument();
      
      doc = operacionXml.XML2DOM(path);
      
      Element dirTag = doc.createElement("Direccion_entrega");
      Text dirTxt=doc.createTextNode("C/Perdida S/N");
      dirTag.appendChild(dirTxt);
      doc.getDocumentElement().appendChild(dirTag);
      
      operacionXml.DOM2XML(doc, path);
      
      System.out.println();
      
    } catch (Exception ex) {
      System.err.println(ex.getStackTrace());
    }
  }
}
