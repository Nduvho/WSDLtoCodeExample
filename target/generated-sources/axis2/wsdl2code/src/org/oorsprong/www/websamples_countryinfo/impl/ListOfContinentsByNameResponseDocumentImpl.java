/*
 * An XML document type.
 * Localname: ListOfContinentsByNameResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one ListOfContinentsByNameResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class ListOfContinentsByNameResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListOfContinentsByNameResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFCONTINENTSBYNAMERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfContinentsByNameResponse");
    
    
    /**
     * Gets the "ListOfContinentsByNameResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameResponseDocument.ListOfContinentsByNameResponse getListOfContinentsByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameResponseDocument.ListOfContinentsByNameResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameResponseDocument.ListOfContinentsByNameResponse)get_store().find_element_user(LISTOFCONTINENTSBYNAMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfContinentsByNameResponse" element
     */
    public void setListOfContinentsByNameResponse(org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameResponseDocument.ListOfContinentsByNameResponse listOfContinentsByNameResponse)
    {
        generatedSetterHelperImpl(listOfContinentsByNameResponse, LISTOFCONTINENTSBYNAMERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ListOfContinentsByNameResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameResponseDocument.ListOfContinentsByNameResponse addNewListOfContinentsByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameResponseDocument.ListOfContinentsByNameResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameResponseDocument.ListOfContinentsByNameResponse)get_store().add_element_user(LISTOFCONTINENTSBYNAMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ListOfContinentsByNameResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class ListOfContinentsByNameResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameResponseDocument.ListOfContinentsByNameResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ListOfContinentsByNameResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTOFCONTINENTSBYNAMERESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfContinentsByNameResult");
        
        
        /**
         * Gets the "ListOfContinentsByNameResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftContinent getListOfContinentsByNameResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftContinent target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftContinent)get_store().find_element_user(LISTOFCONTINENTSBYNAMERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ListOfContinentsByNameResult" element
         */
        public void setListOfContinentsByNameResult(org.oorsprong.www.websamples_countryinfo.ArrayOftContinent listOfContinentsByNameResult)
        {
            generatedSetterHelperImpl(listOfContinentsByNameResult, LISTOFCONTINENTSBYNAMERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ListOfContinentsByNameResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftContinent addNewListOfContinentsByNameResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftContinent target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftContinent)get_store().add_element_user(LISTOFCONTINENTSBYNAMERESULT$0);
                return target;
            }
        }
    }
}
