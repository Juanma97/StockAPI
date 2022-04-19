package com.juanmaperez.stock.stocks.controller;

import com.juanmaperez.stock.stocks.mapper.StockMapper;
import com.juanmaperez.stock.stocks.service.StocksService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

class StocksControllerTest {

    private final StocksService stocksService = Mockito.mock(StocksService.class);
    private final StockMapper stockMapper = Mockito.mock(StockMapper.class);
    private final StocksController sut = new StocksController(stocksService, stockMapper);

    @Test
    public void should_call_service_to_get_stock_from_symbol() {
        final String ticker = "GOOG";
        sut.getStockFromSymbol(ticker);

        verify(stocksService).getStockFromSymbol(ticker);
    }

}