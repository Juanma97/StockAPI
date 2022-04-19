package com.juanmaperez.stock.stocks.controller;

import com.juanmaperez.stock.stocks.mapper.StockMapper;
import com.juanmaperez.stock.stocks.model.response.StockResponse;
import com.juanmaperez.stock.stocks.service.StocksService;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController("https://api.polygon.io/")
public class StocksController {

    private final StocksService stocksService;
    private final StockMapper stockMapper;

    @RequestMapping("v3/reference/tickers/{ticker}")
    public StockResponse getStockFromSymbol(String ticker) {
        return stockMapper.convertStockToStockResponse(stocksService.getStockFromSymbol(ticker));
    }
}
