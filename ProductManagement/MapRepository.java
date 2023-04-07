package com.example.ProductManagement;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MapRepository implements ProductRepository{

    Map<Long, String> database = new HashMap<Long, String>();
    Long id = 1L;

    @Override
    public String add(String val) {
        database.put(id++, val);
        return val;
    }

    @Override
    public String search(Long productId) {
        return database.get(productId);
    }

    @Override
    public void delete(Long productId) {
        database.remove(productId);
    }

    @Override
    public void update(Long productId, String newName) {
        database.replace(productId, newName);
    }

    // database의 HashMap 오브젝트를 한줄씩 문자열로 반환
    @Override
    public String getAllProducts() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < database.size(); i++) {
            sb.append(String.format("%d : %s\n", i, database.get(i)));
        }

        return sb.toString();
    }
}
