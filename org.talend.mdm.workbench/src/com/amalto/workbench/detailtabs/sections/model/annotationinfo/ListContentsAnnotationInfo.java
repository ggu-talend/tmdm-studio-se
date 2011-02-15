package com.amalto.workbench.detailtabs.sections.model.annotationinfo;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xsd.XSDComponent;


public abstract class ListContentsAnnotationInfo extends AnnotaionInfo {

    protected List<String> infos = new ArrayList<String>();

    public ListContentsAnnotationInfo(XSDComponent sourceComponent, String[] infos) {
        super(sourceComponent);

        for (String eachInfo : infos) {
            this.infos.add(eachInfo);
        }
    }

    public String[] getInfos() {
        return infos.toArray(new String[0]);
    }

}