package com.juanmaperez.stock.stocks.controller;

import com.juanmaperez.stock.stocks.mapper.StockMapper;
import com.juanmaperez.stock.stocks.model.response.StockResponse;
import com.juanmaperez.stock.stocks.service.StocksService;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController("stocks/")
public class StocksController {

    private final StocksService stocksService;
    private final StockMapper stockMapper;

    @GetMapping("{ticker}")
    public StockResponse getStockFromTicker(String ticker) {
        return stockMapper.convertStockToStockResponse(stocksService.getStockFromTicker(ticker));
    }
}
