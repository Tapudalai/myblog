package com.myvlog2.reposiroty;

import com.myvlog2.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test,Long> {

}
