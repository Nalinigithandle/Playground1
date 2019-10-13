package com.carmel.bootcamp.carmelbootcampnalini.Model;

import java.io.Serializable;

public class PreviewModel implements Serializable {
    String Description;
    String Documentsize;
    String Profilename;
    String Approvalprofilenames;
    String Approvalprofiledescriptions;

    public String getApprovalprofiledescriptions() {
        return Approvalprofiledescriptions;
    }

    public void setApprovalprofiledescriptions(String approvalprofiledescriptions) {
        Approvalprofiledescriptions = approvalprofiledescriptions;
    }

    public String getApprovalprofilenames() {
        return Approvalprofilenames;
    }

    public void setApprovalprofilenames(String approvalprofilenames) {
        Approvalprofilenames = approvalprofilenames;
    }

    public String getProfilename() {
        return Profilename;
    }

    public void setProfilename(String profilename) {
        Profilename = profilename;
    }

    public String getDocumentsize() {
        return Documentsize;
    }

    public void setDocumentsize(String documentsize) {
        Documentsize = documentsize;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
