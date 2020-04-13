package entities;

public class EntityNewOrganization {
    int photo;
    String orgName,orgAddress,orgEmail,orgPhone;


    public EntityNewOrganization() {
        this.photo = photo;
        this.orgName = orgName;
        this.orgAddress = orgAddress;
        this.orgEmail = orgEmail;
        this.orgPhone = orgPhone;
    }

    public EntityNewOrganization(int photo) {
        this.photo = photo;
    }

    public EntityNewOrganization(int photo, String orgName, String orgAddress, String orgEmail, String orgPhone) {
        this.photo = photo;
        this.orgName = orgName;
        this.orgAddress = orgAddress;
        this.orgEmail = orgEmail;
        this.orgPhone = orgPhone;
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

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }

    public String getOrgEmail() {
        return orgEmail;
    }

    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
    }

    public String getOrgPhone() {
        return orgPhone;
    }

    public void setOrgPhone(String orgPhone) {
        this.orgPhone = orgPhone;
    }
}
