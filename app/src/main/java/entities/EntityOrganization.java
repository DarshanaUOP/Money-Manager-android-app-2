package entities;

public class EntityOrganization  {
    int photo;
    String orgName;
    String orgDescription;

    public EntityOrganization(int photo, String orgName, String orgDescription) {
        this.photo = photo;
        this.orgName = orgName;
        this.orgDescription = orgDescription;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgDescription() {
        return orgDescription;
    }

    public void setOrgDescription(String orgDescription) {
        this.orgDescription = orgDescription;
    }
}
