/*
 * An XML document type.
 * Localname: ListOfLanguagesByCodeResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one ListOfLanguagesByCodeResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class ListOfLanguagesByCodeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListOfLanguagesByCodeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFLANGUAGESBYCODERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfLanguagesByCodeResponse");
    
    
    /**
     * Gets the "ListOfLanguagesByCodeResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeResponseDocument.ListOfLanguagesByCodeResponse getListOfLanguagesByCodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeResponseDocument.ListOfLanguagesByCodeResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeResponseDocument.ListOfLanguagesByCodeResponse)get_store().find_element_user(LISTOFLANGUAGESBYCODERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfLanguagesByCodeResponse" element
     */
    public void setListOfLanguagesByCodeResponse(org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeResponseDocument.ListOfLanguagesByCodeResponse listOfLanguagesByCodeResponse)
    {
        generatedSetterHelperImpl(listOfLanguagesByCodeResponse, LISTOFLANGUAGESBYCODERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ListOfLanguagesByCodeResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeResponseDocument.ListOfLanguagesByCodeResponse addNewListOfLanguagesByCodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeResponseDocument.ListOfLanguagesByCodeResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeResponseDocument.ListOfLanguagesByCodeResponse)get_store().add_element_user(LISTOFLANGUAGESBYCODERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ListOfLanguagesByCodeResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class ListOfLanguagesByCodeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeResponseDocument.ListOfLanguagesByCodeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ListOfLanguagesByCodeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTOFLANGUAGESBYCODERESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfLanguagesByCodeResult");
        
        
        /**
         * Gets the "ListOfLanguagesByCodeResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage getListOfLanguagesByCodeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage)get_store().find_element_user(LISTOFLANGUAGESBYCODERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ListOfLanguagesByCodeResult" element
         */
        public void setListOfLanguagesByCodeResult(org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage listOfLanguagesByCodeResult)
        {
            generatedSetterHelperImpl(listOfLanguagesByCodeResult, LISTOFLANGUAGESBYCODERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ListOfLanguagesByCodeResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage addNewListOfLanguagesByCodeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage)get_store().add_element_user(LISTOFLANGUAGESBYCODERESULT$0);
                return target;
            }
        }
    }
}
