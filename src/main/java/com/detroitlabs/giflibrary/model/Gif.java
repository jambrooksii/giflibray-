package com.detroitlabs.giflibrary.model;

import com.detroitlabs.giflibrary.data.GifRepository;

import java.time.LocalDate;
import java.util.List;

public class Gif{

    String name;
    LocalDate dateUploaded;
     String userName;
     boolean favorite;
     GifRepository gifRepository;
     String gifType;
     int categoryId;

    public GifRepository getGifRepository() {
        return gifRepository;
    }

    public void setGifRepository(GifRepository gifRepository) {
        this.gifRepository = gifRepository;
    }

    public String getGifType() {
        return gifType;
    }

    public void setGifType(String gifType) {
        this.gifType = gifType;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Gif(String name, LocalDate dateUploaded, String userName, boolean favorite, int categoryId) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.userName = userName;
        this.favorite = favorite;
        this.categoryId = categoryId;
    }

    public String ConverStringToAvatar(){
        String avatarGet = getUserName().toLowerCase().replaceAll(" ", "") + ".jpg";
        return avatarGet;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
