package com.cpdias.metalhead;

import java.util.List;

interface VideoDao {
    Video findByName(String name);

    boolean existsByName(String name);
    
    void salve(Video video);
    
    List<String> getAllEntryNames();

}
