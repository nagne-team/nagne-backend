package com.nagne.repository;

import com.nagne.domain.place.entity.Place;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PopularDestinationRepository extends JpaRepository<Place, Long> {
  @Query("SELECT p FROM Place p ORDER BY p.likes DESC")
  List<Place> findTop4ByLikes();
}