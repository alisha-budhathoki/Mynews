package com.example.androidlibraies.model;

import com.google.gson.annotations.SerializedName;

public class RecentNewsDataModel {
    //            "id": 29284,
//            "categoryId": 93,
//            "headline": "सनराइज बैंकको प्रमुख कार्यकारी अधिकृतमा जनक शर्मा पौड्याल, चार बर्षका लागि पौड्याल नियुक्त",
//            "description": "<p style=\"text-align:justify\"><strong><span style=\"font-size:22px\">असार २९, काठमाडौं ।&nbsp;</span></strong></p>\r\n\r\n<p style=\"text-align:justify\"><span style=\"font-size:22px\">सनराइज बैंकले प्रमुख कार्यकारी अधिकृतमा जनक शर्मा पौड्याललाई नियुक्त गरेको छ।&nbsp;</span><span style=\"font-size:22px\">एक महिनाअघि बैंकले प्रमुख कार्यकारीमा निरज श्रेष्ठलाई नियुक्त गरेको थियो। उनले करारपत्रमा हस्ताक्षर गरेपछि दुई जना सञ्चालकहरुले बिरोध जनाएका थिए।</span></p>\r\n\r\n<p style=\"text-align:justify\"><span style=\"font-size:22px\">एनआइसी स्थापनामा सक्रिय भूमिका खेलेका पौडेलले त्यहाँ पाँच बर्ष काम गरेपछि लक्ष्मी बैक स्थापनाको प्रकृया थाल्न त्यता गए। लक्ष्मी बैंकमा एक बर्ष काम गरेपछि पौड्याल अध्ययनका लागि लण्डन गए। लण्डनमा अध्ययनसँगै त्यहाँको बैंकमा पनि काम गरेको अनुभव पौडेलसँग छ। उनले त्यहाँ साढे चार बर्ष काम गरेका थिए।</span></p>\r\n\r\n<p style=\"text-align:justify\"><span style=\"font-size:22px\">३० बर्षे बैंकिङ क्षेत्रमा बिताएका पौड्यालले नबिल बैंकबाट करियर सुरु गरेका हुन्। उनले सन् १९८७ मा इन्ट्रि लेभलबाट करियर सुरु गरेका हुन्। नबिलमा ११ बर्ष काम गरेपछि उनी एनआइसी बैंक (अहिलेको एनआइसी एसिया) गएका थिए।</span></p>\r\n\r\n<p style=\"text-align:justify\"><span style=\"font-size:22px\">बिरोधका बीच आफू काम गर्न नसक्ने भन्दै उनले अध्यक्षलाई &#39;नआउने&#39; जानकारी गत बिहीबार गराएका थिए। त्यसपछि बैंक सञ्चालक समितिले पौड्याललाई प्रमुख कार्यकारी नियुक्त गरेको हो। चार बर्षका लागि पौड्याल प्रमुख कार्यकारी नियुक्त भएका हुन्।</span></p>",
//            "filename": "1563085310_Janak-Sharma-Paudel_11.jpg",
//            "onDate": "2019-07-14",
//            "modifiedDate": "2019-07-14 12:06:50",
//            "visits": 26,
    @SerializedName("id")
    private int id;
    @SerializedName("categoryId")
    private int categoryId;
    @SerializedName("headline")
    private String headline;
    @SerializedName("description")
    private String description;
    @SerializedName("filename")
    private String filename;
    @SerializedName("onDate")
    private String onDate;
    @SerializedName("modifiedDate")
    private String modifiedDate;
    @SerializedName("visits")
    private int visits;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getOnDate() {
        return onDate;
    }

    public void setOnDate(String onDate) {
        this.onDate = onDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }
}
