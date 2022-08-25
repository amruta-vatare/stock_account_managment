package com.bridgeLabs;

import java.util.ArrayList;

public class StockPortfolio {
    ArrayList<Stock> stocks = new ArrayList<>();
    double totalValue = 0;

    static class Stock {
        int NoOfShares;
        String company;
        double price;
    }

    public double GetPortfolioTotalValue(){
        double totalPortfolioValue = 0;
        for(int i = 0 ;i<stocks.size();i++){
            Stock stock = stocks.get(i);
            totalPortfolioValue += stock.price * stock.NoOfShares;
        }
        return totalPortfolioValue;
    }

    public double GetStockTotalValue(Stock s){
        return s.price *s.NoOfShares;
    }
}
