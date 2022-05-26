/*
 * An XML document type.
 * Localname: ListOfLanguagesByNameResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one ListOfLanguagesByNameResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class ListOfLanguagesByNameResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListOfLanguagesByNameResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFLANGUAGESBYNAMERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfLanguagesByNameResponse");
    
    
    /**
     * Gets the "ListOfLanguagesByNameResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameResponseDocument.ListOfLanguagesByNameResponse getListOfLanguagesByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameResponseDocument.ListOfLanguagesByNameResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameResponseDocument.ListOfLanguagesByNameResponse)get_store().find_element_user(LISTOFLANGUAGESBYNAMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfLanguagesByNameResponse" element
     */
    public void setListOfLanguagesByNameResponse(org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameResponseDocument.ListOfLanguagesByNameResponse listOfLanguagesByNameResponse)
    {
        generatedSetterHelperImpl(listOfLanguagesByNameResponse, LISTOFLANGUAGESBYNAMERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ListOfLanguagesByNameResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameResponseDocument.ListOfLanguagesByNameResponse addNewListOfLanguagesByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameResponseDocument.ListOfLanguagesByNameResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameResponseDocument.ListOfLanguagesByNameResponse)get_store().add_element_user(LISTOFLANGUAGESBYNAMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ListOfLanguagesByNameResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class ListOfLanguagesByNameResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameResponseDocument.ListOfLanguagesByNameResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ListOfLanguagesByNameResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTOFLANGUAGESBYNAMERESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfLanguagesByNameResult");
        
        
        /**
         * Gets the "ListOfLanguagesByNameResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage getListOfLanguagesByNameResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage)get_store().find_element_user(LISTOFLANGUAGESBYNAMERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ListOfLanguagesByNameResult" element
         */
        public void setListOfLanguagesByNameResult(org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage listOfLanguagesByNameResult)
        {
            generatedSetterHelperImpl(listOfLanguagesByNameResult, LISTOFLANGUAGESBYNAMERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ListOfLanguagesByNameResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage addNewListOfLanguagesByNameResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage)get_store().add_element_user(LISTOFLANGUAGESBYNAMERESULT$0);
                return target;
            }
        }
    }
}
