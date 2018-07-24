package com.example2.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example2.demo.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category,Integer>{

}