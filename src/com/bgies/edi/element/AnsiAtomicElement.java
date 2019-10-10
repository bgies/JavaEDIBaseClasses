package com.bgies.edi.element;

import com.bgies.edi.sharedtypes.AnsiVersionNumbers;
import com.bgies.edi.sharedtypes.AnsiElementType;

/**
 * @author Brad AtomicElement provides the properties that every element has
 */
abstract class AnsiAtomicElement {

   private String          elementId;
   private String          elementName;
   private AnsiElementType elementType;
   private String          Value;

    /**
     * @return the elementId
     */
    public String getElementId() {
        return elementId;
    }

    /**
     * @param elementId the elementId to set
     */
    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    /**
     * @return the elementName
     */
    public String getElementName() {
        return elementName;
    }

    /**
     * @param elementName the elementName to set
     */
    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    /**
     * @return the elementType
     */
    public AnsiElementType getElementType() {
        return elementType;
    }

    /**
     * @param elementType the elementType to set
     */
    public void setElementType(AnsiElementType elementType) {
        this.elementType = elementType;
    }

    /**
     * @return the Value
     */
    public String getValue() {
        return Value;
    }

    /**
     * @param Value the Value to set
     */
    public void setValue(String Value) {
        this.Value = Value;
    }
   

   
   
   
}
