package com.juanmaperez.stock.stocks.service;

import com.juanmaperez.stock.api.stocks.StockAPI;
import com.juanmaperez.stock.stocks.model.Stock;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class StocksService {

    private final StockAPI stockAPI;

    public Stock getStockFromTicker(String ticker) {
        if (ticker.isEmpty()) throw new IllegalArgumentException("Ticker is null or empty");

        return stockAPI.getStockFromTicker(ticker);
    }
}
