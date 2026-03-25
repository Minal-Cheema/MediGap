package core;
public class Drug {
    private String genericName;
    private String brandName;
    private String category;

    public Drug(String genericName, String brandName , String category) {
        this.genericName = genericName;
        this.brandName = brandName;
        this.category = category;
    }
    public String getGenericName(){
        return genericName;
    }
    public String getBrandName(){
        return brandName;
    }
    public String category(){
        return category;
    }
    public String toString(){
        return genericName + " (Brand: " + brandName + " , Category: " + category + ")";

    }
}
