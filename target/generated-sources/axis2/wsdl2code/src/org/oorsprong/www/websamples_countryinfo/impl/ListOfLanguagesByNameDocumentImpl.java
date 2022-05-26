/*
 * An XML document type.
 * Localname: ListOfLanguagesByName
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one ListOfLanguagesByName(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class ListOfLanguagesByNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListOfLanguagesByNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFLANGUAGESBYNAME$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfLanguagesByName");
    
    
    /**
     * Gets the "ListOfLanguagesByName" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameDocument.ListOfLanguagesByName getListOfLanguagesByName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameDocument.ListOfLanguagesByName target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameDocument.ListOfLanguagesByName)get_store().find_element_user(LISTOFLANGUAGESBYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfLanguagesByName" element
     */
    public void setListOfLanguagesByName(org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameDocument.ListOfLanguagesByName listOfLanguagesByName)
    {
        generatedSetterHelperImpl(listOfLanguagesByName, LISTOFLANGUAGESBYNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ListOfLanguagesByName" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameDocument.ListOfLanguagesByName addNewListOfLanguagesByName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameDocument.ListOfLanguagesByName target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameDocument.ListOfLanguagesByName)get_store().add_element_user(LISTOFLANGUAGESBYNAME$0);
            return target;
        }
    }
    /**
     * An XML ListOfLanguagesByName(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class ListOfLanguagesByNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameDocument.ListOfLanguagesByName
    {
        private static final long serialVersionUID = 1L;
        
        public ListOfLanguagesByNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
