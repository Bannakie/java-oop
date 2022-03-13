package com.company;

public class Guitar {
    private int numStrings;
    private String brandName;
    private String woodType;


    public int getNumStrings() {
        return numStrings;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getWoodType() {
        return woodType;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    public Guitar() {
        this.setNumStrings(6);
        this.setBrandName("unknown");
        this.setWoodType("unknown");
    }

    public Guitar(String brandName, String woodType) {
        this.setNumStrings(6);
        this.setBrandName(brandName);
        this.setWoodType(woodType);
    }

    public Guitar(int numStrings, String brandName, String woodType) {
        this.setNumStrings(numStrings);
        this.setBrandName(brandName);
        this.setWoodType(woodType);
    }

    public boolean isSixString() {
        return this.numStrings == 6;
    }

    public String strums(int numStrums) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numStrums; i++) {
            result.append("Strum");
        }
        return result.toString();
    }

}
