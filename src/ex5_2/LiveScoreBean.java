/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_2;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Tinip
 */
public class LiveScoreBean implements Serializable {
    
    public static final String SCORE_LINE_PROPERTY = "scoreLine";
    
    private String scoreLine;
    
    private PropertyChangeSupport propertySupport;
    
    public LiveScoreBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSampleProperty() {
        return scoreLine;
    }
    
    public void setSampleProperty(String value) {
        String oldValue = scoreLine;
        scoreLine = value;
        propertySupport.firePropertyChange(SCORE_LINE_PROPERTY, oldValue, scoreLine);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
