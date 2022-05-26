/*
 * An XML document type.
 * Localname: ListOfCurrenciesByName
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one ListOfCurrenciesByName(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class ListOfCurrenciesByNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListOfCurrenciesByNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFCURRENCIESBYNAME$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfCurrenciesByName");
    
    
    /**
     * Gets the "ListOfCurrenciesByName" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameDocument.ListOfCurrenciesByName getListOfCurrenciesByName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameDocument.ListOfCurrenciesByName target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameDocument.ListOfCurrenciesByName)get_store().find_element_user(LISTOFCURRENCIESBYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfCurrenciesByName" element
     */
    public void setListOfCurrenciesByName(org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameDocument.ListOfCurrenciesByName listOfCurrenciesByName)
    {
        generatedSetterHelperImpl(listOfCurrenciesByName, LISTOFCURRENCIESBYNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ListOfCurrenciesByName" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameDocument.ListOfCurrenciesByName addNewListOfCurrenciesByName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameDocument.ListOfCurrenciesByName target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameDocument.ListOfCurrenciesByName)get_store().add_element_user(LISTOFCURRENCIESBYNAME$0);
            return target;
        }
    }
    /**
     * An XML ListOfCurrenciesByName(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class ListOfCurrenciesByNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameDocument.ListOfCurrenciesByName
    {
        private static final long serialVersionUID = 1L;
        
        public ListOfCurrenciesByNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
