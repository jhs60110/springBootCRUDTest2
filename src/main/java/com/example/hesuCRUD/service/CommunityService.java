package com.example.hesuCRUD.service;

import com.example.hesuCRUD.model.Community;
import com.example.hesuCRUD.repository.ICommunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunityService implements ICommunityService {
    @Autowired
    ICommunityRepository communityRepository;

    @Override
    public List<Community> selectAllCommunity() {
        return communityRepository.selectAllCommunity();
    }

    @Override
    public Community selectACommunity(int no) {
        return communityRepository.selectACommunity(no);
    }

    @Override
    public void insertCommunity(String title, String content) {
         communityRepository.insertCommunity(title, content);
    }

    @Override
    public void updateCommunity(int no, String title, String content) {
        communityRepository.updateCommunity(no, title, content);
    }

    @Override
    public void deleteCommunity(int no) {
        communityRepository.deleteCommunity(no);
    }
}
