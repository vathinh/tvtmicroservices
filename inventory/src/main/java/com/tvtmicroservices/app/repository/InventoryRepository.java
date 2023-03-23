package com.tvtmicroservices.app.repository;

import com.tvtmicroservices.app.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findBySkuCode(List<String> skuCode);
}
