package restaurant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import restaurant.entity.RestaurantEntity;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Integer> {
	
	List<RestaurantEntity> findbylocation(String location);

}
