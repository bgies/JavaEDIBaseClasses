/**
 * 
 */
package com.bgies.edi.element;

/**
 * @author Brad
 * BasicElement adds the Value and Version properties and methods to deal with them
 */

abstract class AnsiBasicElement extends AnsiAtomicElement {

    private int MinimumMajorVersion;
    private int MinimumMinorVersion;
    private int MaxMajorVersion;
    private int MaxMinorVersion;


    /**
     * @return the MinimumMajorVersion
     */
    public int getMinimumMajorVersion() {
        return MinimumMajorVersion;
    }

    /**
     * @param MinimumMajorVersion the MinimumMajorVersion to set
     */
    public void setMinimumMajorVersion(int MinimumMajorVersion) {
        this.MinimumMajorVersion = MinimumMajorVersion;
    }

    /**
     * @return the MinimumMinorVersion
     */
    public int getMinimumMinorVersion() {
        return MinimumMinorVersion;
    }

    /**
     * @param MinimumMinorVersion the MinimumMinorVersion to set
     */
    public void setMinimumMinorVersion(int MinimumMinorVersion) {
        this.MinimumMinorVersion = MinimumMinorVersion;
    }

    /**
     * @return the MaxMajorVersion
     */
    public int getMaxMajorVersion() {
        return MaxMajorVersion;
    }

    /**
     * @param MaxMajorVersion the MaxMajorVersion to set
     */
    public void setMaxMajorVersion(int MaxMajorVersion) {
        this.MaxMajorVersion = MaxMajorVersion;
    }

    /**
     * @return the MaxMinorVersion
     */
    public int getMaxMinorVersion() {
        return MaxMinorVersion;
    }

    /**
     * @param MaxMinorVersion the MaxMinorVersion to set
     */
    public void setMaxMinorVersion(int MaxMinorVersion) {
        this.MaxMinorVersion = MaxMinorVersion;
    }


	
	
	
}
