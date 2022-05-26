/*
 * An XML document type.
 * Localname: ListOfLanguagesByCode
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one ListOfLanguagesByCode(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class ListOfLanguagesByCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListOfLanguagesByCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFLANGUAGESBYCODE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfLanguagesByCode");
    
    
    /**
     * Gets the "ListOfLanguagesByCode" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeDocument.ListOfLanguagesByCode getListOfLanguagesByCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeDocument.ListOfLanguagesByCode target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeDocument.ListOfLanguagesByCode)get_store().find_element_user(LISTOFLANGUAGESBYCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfLanguagesByCode" element
     */
    public void setListOfLanguagesByCode(org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeDocument.ListOfLanguagesByCode listOfLanguagesByCode)
    {
        generatedSetterHelperImpl(listOfLanguagesByCode, LISTOFLANGUAGESBYCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ListOfLanguagesByCode" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeDocument.ListOfLanguagesByCode addNewListOfLanguagesByCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeDocument.ListOfLanguagesByCode target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeDocument.ListOfLanguagesByCode)get_store().add_element_user(LISTOFLANGUAGESBYCODE$0);
            return target;
        }
    }
    /**
     * An XML ListOfLanguagesByCode(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class ListOfLanguagesByCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeDocument.ListOfLanguagesByCode
    {
        private static final long serialVersionUID = 1L;
        
        public ListOfLanguagesByCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
