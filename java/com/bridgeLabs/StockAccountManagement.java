package com.bridgeLabs;

import java.util.ArrayList;
import java.util.Scanner;

public class StockAccountManagement {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        StockPortfolio stockPortfolio =  new StockPortfolio();
        while(flag == 0){
            System.out.println("Enter the stock details");
            StockPortfolio.Stock s = new StockPortfolio.Stock();
            System.out.println("Enter company name");
            s.company = sc.next();
            System.out.println("Enter number of shares");
            s.NoOfShares = sc.nextInt();
            System.out.println("Enter price of share");
            s.price = sc.nextDouble();

            stockPortfolio.stocks.add(s);
            System.out.println("Do you want to add more stock? Press 0 for YES or 1 for No");
            flag = sc.nextInt();
        }

        System.out.println("Stock in portfolio are ==> ");
        System.out.println("Stock" + "\t " + "No_of_shares" + "\t " + "Price_per_share" + "\t " + "Total Value");
       for(int i = 0 ;i<stockPortfolio.stocks.size();i++){
           StockPortfolio.Stock stock = stockPortfolio.stocks.get(i);
           System.out.println(stock.company + "\t\t\t " + stock.NoOfShares + "\t\t\t" + stock.price + "\t\t\t" + stockPortfolio.GetStockTotalValue(stock));
       }
        System.out.println("-------------------------------------");
        System.out.println("Stock Portfolio Total Value "+stockPortfolio.GetPortfolioTotalValue());
        System.out.println("-------------------------------------");
    }
}

