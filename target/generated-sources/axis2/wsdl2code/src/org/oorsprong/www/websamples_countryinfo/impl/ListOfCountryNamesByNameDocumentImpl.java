/*
 * An XML document type.
 * Localname: ListOfCountryNamesByName
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one ListOfCountryNamesByName(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class ListOfCountryNamesByNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListOfCountryNamesByNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFCOUNTRYNAMESBYNAME$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfCountryNamesByName");
    
    
    /**
     * Gets the "ListOfCountryNamesByName" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument.ListOfCountryNamesByName getListOfCountryNamesByName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument.ListOfCountryNamesByName target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument.ListOfCountryNamesByName)get_store().find_element_user(LISTOFCOUNTRYNAMESBYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfCountryNamesByName" element
     */
    public void setListOfCountryNamesByName(org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument.ListOfCountryNamesByName listOfCountryNamesByName)
    {
        generatedSetterHelperImpl(listOfCountryNamesByName, LISTOFCOUNTRYNAMESBYNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ListOfCountryNamesByName" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument.ListOfCountryNamesByName addNewListOfCountryNamesByName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument.ListOfCountryNamesByName target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument.ListOfCountryNamesByName)get_store().add_element_user(LISTOFCOUNTRYNAMESBYNAME$0);
            return target;
        }
    }
    /**
     * An XML ListOfCountryNamesByName(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class ListOfCountryNamesByNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument.ListOfCountryNamesByName
    {
        private static final long serialVersionUID = 1L;
        
        public ListOfCountryNamesByNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
