/*
 * An XML document type.
 * Localname: ListOfContinentsByCodeResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one ListOfContinentsByCodeResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class ListOfContinentsByCodeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListOfContinentsByCodeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFCONTINENTSBYCODERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfContinentsByCodeResponse");
    
    
    /**
     * Gets the "ListOfContinentsByCodeResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeResponseDocument.ListOfContinentsByCodeResponse getListOfContinentsByCodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeResponseDocument.ListOfContinentsByCodeResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeResponseDocument.ListOfContinentsByCodeResponse)get_store().find_element_user(LISTOFCONTINENTSBYCODERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfContinentsByCodeResponse" element
     */
    public void setListOfContinentsByCodeResponse(org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeResponseDocument.ListOfContinentsByCodeResponse listOfContinentsByCodeResponse)
    {
        generatedSetterHelperImpl(listOfContinentsByCodeResponse, LISTOFCONTINENTSBYCODERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ListOfContinentsByCodeResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeResponseDocument.ListOfContinentsByCodeResponse addNewListOfContinentsByCodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeResponseDocument.ListOfContinentsByCodeResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeResponseDocument.ListOfContinentsByCodeResponse)get_store().add_element_user(LISTOFCONTINENTSBYCODERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ListOfContinentsByCodeResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class ListOfContinentsByCodeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeResponseDocument.ListOfContinentsByCodeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ListOfContinentsByCodeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTOFCONTINENTSBYCODERESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfContinentsByCodeResult");
        
        
        /**
         * Gets the "ListOfContinentsByCodeResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftContinent getListOfContinentsByCodeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftContinent target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftContinent)get_store().find_element_user(LISTOFCONTINENTSBYCODERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ListOfContinentsByCodeResult" element
         */
        public void setListOfContinentsByCodeResult(org.oorsprong.www.websamples_countryinfo.ArrayOftContinent listOfContinentsByCodeResult)
        {
            generatedSetterHelperImpl(listOfContinentsByCodeResult, LISTOFCONTINENTSBYCODERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ListOfContinentsByCodeResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftContinent addNewListOfContinentsByCodeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftContinent target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftContinent)get_store().add_element_user(LISTOFCONTINENTSBYCODERESULT$0);
                return target;
            }
        }
    }
}
