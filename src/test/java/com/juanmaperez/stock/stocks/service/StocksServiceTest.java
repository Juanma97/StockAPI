package com.juanmaperez.stock.stocks.service;

import com.juanmaperez.stock.api.stocks.StockAPI;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;

class StocksServiceTest {

    private final StockAPI stockAPI = Mockito.mock(StockAPI.class);
    private final StocksService sut = new StocksService(stockAPI);

    @Test
    void should_call_api_to_get_stock_from_ticker() {
        final String ticker = "GOOG";
        sut.getStockFromTicker(ticker);

        verify(stockAPI).getStockFromTicker(ticker);
    }

    @Test
    void should_throw_if_ticker_is_null_or_empty() {
        assertThrows(IllegalArgumentException.class, () -> sut.getStockFromTicker(""));
    }
}