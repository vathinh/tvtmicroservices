package com.tvtmicorservices.dto;

import com.tvtmicorservices.model.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderRequest {
    private List<OrderLineItemsDto> orderLineItemsDtoList;
}
