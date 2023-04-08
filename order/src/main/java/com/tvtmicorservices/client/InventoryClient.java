package com.tvtmicorservices.client;

import com.tvtmicorservices.dto.InventoryResponse;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "inventory")
@Retry(name ="inventory")
public interface InventoryClient {
    @GetMapping("/api/inventory")
    List<InventoryResponse> checkStock(@RequestParam("skuCode") List<String> skuCode);
}
