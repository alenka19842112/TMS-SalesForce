package object;

public class Account {
    private String accountName;
    private String phone;
    private String fax;
    private String webSite;
    private String type;
    private String employees;
    private String industry;
    private String annualRevenue;
    private String description;
    private String billingStreet;
    private String billingCity;
    private String billingStateProvince;
    private String billingZip;
    private String billingCountry;

    public Account(String accountName, String webSite, String type) {
        this.accountName = accountName;
        this.webSite = webSite;
        this.type = type;
    }

    public Account(String accountName, String phone, String fax, String webSite, String type, String employees,
                   String industry, String annualRevenue, String description, String billingStreet, String billingCity,
                   String billingStateProvince, String billingZip, String billingCountry) {
        this.accountName = accountName;
        this.phone = phone;
        this.fax = fax;
        this.webSite = webSite;
        this.type = type;
        this.employees = employees;
        this.industry = industry;
        this.annualRevenue = annualRevenue;
        this.description = description;
        this.billingStreet = billingStreet;
        this.billingCity = billingCity;
        this.billingStateProvince = billingStateProvince;
        this.billingZip = billingZip;
        this.billingCountry = billingCountry;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingStateProvince() {
        return billingStateProvince;
    }

    public void setBillingStateProvince(String billingStateProvince) {
        this.billingStateProvince = billingStateProvince;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }
}
