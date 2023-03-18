package com.tvtmicorservices.service.impl;

import com.tvtmicorservices.dto.OrderLineItemsDto;
import com.tvtmicorservices.dto.OrderRequest;
import com.tvtmicorservices.model.Order;
import com.tvtmicorservices.model.OrderLineItems;
import com.tvtmicorservices.repository.OrderRepository;
import com.tvtmicorservices.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
@Service
@RequiredArgsConstructor
@Transactional
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItems = orderRequest.getOrderLineItemsDtoList()
                .stream()
                .map(this::mapDto)
                .toList();
        order.setOrderLineItemsList(orderLineItems);
        orderRepository.save(order);
    }


    private OrderLineItems mapDto(OrderLineItemsDto orderLineItemsDto){
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
        orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
        return orderLineItems;
    }
}
