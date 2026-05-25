package fooditem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fooditem.entity.FoodItemEntity;


public interface FoodItemRepository extends JpaRepository<FoodItemEntity, Integer> {
	
	List<FoodItemEntity> findbyrestaurantid(Integer restaurantid);
	List<FoodItemEntity> findbycategory(String category);
	List<FoodItemEntity> findbyavailability(Boolean available);

}
