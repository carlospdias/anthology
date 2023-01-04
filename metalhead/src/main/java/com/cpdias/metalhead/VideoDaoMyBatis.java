package com.cpdias.metalhead;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class VideoDaoMyBatis implements VideoDao {
    
    private SqlSession sqlSession;
    
    public VideoDaoMyBatis(SqlSession sqlSession) {
        super();
        this.sqlSession = sqlSession;
    }

    @Override
    public Video findByName(String name) {
        Video video = sqlSession.selectOne("", name);
        
        return video;
    }

    @Override
    public boolean existsByName(String name) {
        Video video = findByName(name);
        
        return video != null;
    }

    @Override
    public List<String> getAllEntryNames() {
        List<String>names = sqlSession.selectList("metalhead.video.selectAllNames");
        if (names != null) return names;
        System.out.println(names);
        System.out.println("************************************");
        return Collections.emptyList();
    }

    @Override
    public void salve(Video video) {
        int result = sqlSession.insert("metalhead.video.insert", video);
        
        if (result < 1) {
            throw new RuntimeException("Falha na inserção de video");
        }
        
    }

}
