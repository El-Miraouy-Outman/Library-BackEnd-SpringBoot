package com.miraouy.library.Repository;

import com.miraouy.library.entity.History;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Long> {
    Page<History> findBooksByUserEmail( String userEmail, Pageable pageable);
}
