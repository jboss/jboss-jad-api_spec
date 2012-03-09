package javax.enterprise.deploy.model;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Enumeration;

import javax.enterprise.deploy.model.exceptions.DDBeanCreateException;
import javax.enterprise.deploy.shared.ModuleType;

/**
 * A representation of a deployment module. It provides access to the
 * deployment descriptor and class files.
 * 
 * @author <a href="mailto:adrian@jboss.org">Adrian Brock</a>
 * @version $Revision$
 */
public interface DeployableObject
{
   // Constants -----------------------------------------------------
   
   // Public --------------------------------------------------------

   /**
	 * Get the module type of this deployment module
	 * 
	 * @return the module type
	 */
   ModuleType getType();
   
   /**
    * Get the top level element of the deployment descriptor
    *
    * @return the root of the deployment descriptor
    */
   DDBeanRoot getDDBeanRoot();
   
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
    * Retrieves the specified class from the deployment module
    *
    * @param className the name of the class
    * @return the class
    */
   Class getClassFromScope(String className);
   
   
   /**
    * Get the dtd version
    * 
    * @deprecated use DDBeanRoot.getDDBeanRootVersion
    * @return the dtd version
    */
   String getModuleDTDVersion();
   
   /**
    * Returns a DDBeanRoot for the xml document. This method should be used
    * to return DDBeanRoot for non deployment descriptor xml documents such as WSDL files
    *
    * @param filename the file name of the document
    * @return the root element
    * @throws FileNotFoundException if the file is not found
    * @throws DDBeanCreateException for other errors creating the object
    */
   DDBeanRoot getDDBeanRoot(String filename) throws FileNotFoundException, DDBeanCreateException;
   
   /**
    * Returns an enumeration of file names (as strings) for each file relative to the root
    * of the module
    *
    * @return the enumeration
    */
   Enumeration entries();
   
   /**
    * Get an input stream to the module entry.
    *
    * @param name the name of the module entry
    * @return the input stream to the module entry or null if it does not exist
    */
   InputStream getEntry(String name);
}
