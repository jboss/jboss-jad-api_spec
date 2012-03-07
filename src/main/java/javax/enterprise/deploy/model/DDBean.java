package javax.enterprise.deploy.model;

/**
 * A fragment of a standard deployment descriptor.
 *
 * @author <a href="mailto:adrian@jboss.org">Adrian Brock</a>
 * @version $Revision$
 */
public interface DDBean
{
   // Constants -----------------------------------------------------
   
   // Public --------------------------------------------------------

   /**
    * Returns the original xpath string provided by the DConfigBean
    *
    * @return the xpath
    */
   String getXpath();
   
   /**
    * Returns the XML text for this bean
    *
    * @return the text
    */
   String getText();
   
   /**
    * Returns the tool specific attribute ID
    *
    * @return the id or null if there is no id
    */
   String getId();
   
   /**
    * Get the root element
    *
    * @return the root element
    */
   DDBeanRoot getRoot();
   
   /**
    * Get the child elements with the specified xpath
    *
    * @param xpath the xpath of the children
    * @return an array of children or null if there are none
    */
   DDBean[] getChildBean(String xpath);
   
   /**
    * Get the text for the given xpath
    *
    * @param xpath the xpath
    * @return an array of Strings for the xpath or null if there are none
    */
   String[] getText(String xpath);
   
   /**
    * Register a listener for a given xpath
    *
    * @param xpath the xpath
    * @param xpl the listener
    */
   void addXpathListener(String xpath, XpathListener xpl);
   
   /**
    * Unregister a listener for a given xpath
    *
    * @param xpath the xpath
    * @param xpl the listener
    */
   void removeXpathListener(String xpath, XpathListener xpl);
   
   /**
    * Returns the list of attributes associated with this element
    *
    * @return the list of attributes
    */
   String[] getAttributeNames();
   
   /**
    * Get the value for a given attribute
    *
    * @param attrName the attribute name
    * @return the value
    */
   String getAttributeValue(String attrName);
}
