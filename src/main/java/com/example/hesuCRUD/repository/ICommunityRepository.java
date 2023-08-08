package com.example.hesuCRUD.repository;


import com.example.hesuCRUD.model.Community;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ICommunityRepository {


    List<Community> selectAllCommunity();

    Community selectACommunity(@Param("no") int no);

    void insertCommunity(@Param("title") String title, @Param("content") String content);

    void updateCommunity(@Param("no") int no, @Param("title") String title, @Param("content") String content);

    void deleteCommunity(@Param("no") int no);

}
