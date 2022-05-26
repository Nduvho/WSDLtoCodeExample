/*
 * An XML document type.
 * Localname: ListOfCurrenciesByNameResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one ListOfCurrenciesByNameResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class ListOfCurrenciesByNameResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListOfCurrenciesByNameResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFCURRENCIESBYNAMERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfCurrenciesByNameResponse");
    
    
    /**
     * Gets the "ListOfCurrenciesByNameResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameResponseDocument.ListOfCurrenciesByNameResponse getListOfCurrenciesByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameResponseDocument.ListOfCurrenciesByNameResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameResponseDocument.ListOfCurrenciesByNameResponse)get_store().find_element_user(LISTOFCURRENCIESBYNAMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfCurrenciesByNameResponse" element
     */
    public void setListOfCurrenciesByNameResponse(org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameResponseDocument.ListOfCurrenciesByNameResponse listOfCurrenciesByNameResponse)
    {
        generatedSetterHelperImpl(listOfCurrenciesByNameResponse, LISTOFCURRENCIESBYNAMERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ListOfCurrenciesByNameResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameResponseDocument.ListOfCurrenciesByNameResponse addNewListOfCurrenciesByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameResponseDocument.ListOfCurrenciesByNameResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameResponseDocument.ListOfCurrenciesByNameResponse)get_store().add_element_user(LISTOFCURRENCIESBYNAMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ListOfCurrenciesByNameResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class ListOfCurrenciesByNameResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameResponseDocument.ListOfCurrenciesByNameResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ListOfCurrenciesByNameResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTOFCURRENCIESBYNAMERESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfCurrenciesByNameResult");
        
        
        /**
         * Gets the "ListOfCurrenciesByNameResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftCurrency getListOfCurrenciesByNameResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftCurrency target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftCurrency)get_store().find_element_user(LISTOFCURRENCIESBYNAMERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ListOfCurrenciesByNameResult" element
         */
        public void setListOfCurrenciesByNameResult(org.oorsprong.www.websamples_countryinfo.ArrayOftCurrency listOfCurrenciesByNameResult)
        {
            generatedSetterHelperImpl(listOfCurrenciesByNameResult, LISTOFCURRENCIESBYNAMERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ListOfCurrenciesByNameResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftCurrency addNewListOfCurrenciesByNameResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftCurrency target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftCurrency)get_store().add_element_user(LISTOFCURRENCIESBYNAMERESULT$0);
                return target;
            }
        }
    }
}
