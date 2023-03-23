package com.tvtmicroservices.app.service;

import com.tvtmicroservices.app.dto.InventoryResponse;

import java.util.List;

public interface InventoryService {

    public List<InventoryResponse> isInStock(List<String> skuCode);
}
