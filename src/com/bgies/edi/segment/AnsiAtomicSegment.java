/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bgies.edi.segment;

import java.util.List;
import com.bgies.edi.element.AnsiElement;

/**
 *
 * @author Brad AtomicElement provides the properties that every segment has
 */
abstract class AnsiAtomicSegment {
   private String          segmentId;
   private String          segmentName;
   private Boolean         isLoop;
   private List<AnsiElement> segmentElements;
    
   
}

