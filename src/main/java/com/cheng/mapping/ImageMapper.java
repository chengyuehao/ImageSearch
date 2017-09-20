package com.cheng.mapping;

import com.cheng.model.Image;

import java.util.List;

public interface ImageMapper {
    List<Image> selectImages();
    void insertImage(Image image);
    List<Image> selectImagByVid(int vid);
}
