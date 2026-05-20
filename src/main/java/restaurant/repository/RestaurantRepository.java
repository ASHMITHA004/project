package restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import restaurant.entity.RestaurantEntity;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Integer> {

}
