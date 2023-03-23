package com.tvtmicroservices.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.transaction.Transactional;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventoryResponse {
   private String skuCode;
   private boolean isInStock;
}
