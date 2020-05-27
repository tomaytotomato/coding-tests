package tomaytotomato;

public class Stockprice {

    public static int stockRuns(int[] stockPrices) {

        if (stockPrices == null || stockPrices.length == 0) {
            return 0;
        }
        if (stockPrices.length == 1) {
            return 1;
        }

        int stockRunLength = 1;
        int index = 0;

        while (index + 1 < stockPrices.length) {

            if (stockPrices[index] == stockPrices[index + 1]) {
                index++;
            } else {
                int counter = 1;
                //count number of times stockprice goes up
                if (stockPrices[index] < stockPrices[index + 1]) {
                    while (index + 1 < stockPrices.length && stockPrices[index] < stockPrices[index + 1]) {
                        counter++;
                        index++;
                    }
                } else { //count number of time stockprice goes down
                    while (index + 1 < stockPrices.length && stockPrices[index] > stockPrices[index + 1]) {
                        counter++;
                        index++;
                    }
                }
                stockRunLength = Math.max(stockRunLength, counter);
            }
        }
        return stockRunLength;
    }
}
