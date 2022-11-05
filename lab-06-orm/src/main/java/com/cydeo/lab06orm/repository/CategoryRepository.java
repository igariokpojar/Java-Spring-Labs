package com.cydeo.lab06orm.repository;

import com.cydeo.lab06orm.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
