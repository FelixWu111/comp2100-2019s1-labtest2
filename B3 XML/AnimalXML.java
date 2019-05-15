import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class AnimalXML {
	
	static Document doc;
	
	static void load(String filename) {
		
		
	   try {
		   //TODO: load the xml file and update static variable doc

	      } catch (Exception e) {
	          e.printStackTrace();
	       }
	}

   public static void main(String[] args) {
	   	
	   	load("animals.xml");
         NodeList nList = doc.getElementsByTagName("animal");
         
         for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
               System.out.println("Animal ID : " 
                  + eElement.getAttribute("ID"));
               System.out.println("Name : " 
                  + eElement
                  .getElementsByTagName("name")
                  .item(0)
                  .getTextContent());
               System.out.println("AGE : " 
                  + eElement
                  .getElementsByTagName("age")
                  .item(0)
                  .getTextContent());
               System.out.println("BREED : " 
                       + eElement
                       .getElementsByTagName("breed")
                       .item(0)
                       .getTextContent());
               
            }
         }

   }
}
