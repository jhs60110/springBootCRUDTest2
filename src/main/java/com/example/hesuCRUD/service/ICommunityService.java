package com.example.hesuCRUD.service;

import com.example.hesuCRUD.model.Community;

import java.util.List;

public interface ICommunityService {
    List<Community> selectAllCommunity();

    Community selectACommunity(int no);

    void insertCommunity(String title, String content);

    void updateCommunity(int no, String title, String content);

    void deleteCommunity(int no);
}
