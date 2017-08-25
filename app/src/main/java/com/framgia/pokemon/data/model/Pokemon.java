package com.framgia.pokemon.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ducpm on 25/08/17.
 */
public class Pokemon  {
    @SerializedName("url")
    private String mImageUrl;

    @SerializedName("name")
    private String mTitle;

    private String mDescription;

    public Pokemon(String imageUrl, String title, String description) {
        mImageUrl = imageUrl;
        mTitle = title;
        mDescription = description;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
