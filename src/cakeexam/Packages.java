package cakeexam;

public class Packages {

    public static int calculatePackages(int items, int availableLargeItems,int availableSmallItems){

        int maxItems = availableLargeItems * 5 + availableSmallItems;

        if(items > maxItems){
            return -1;
        }

        int largePackages = Math.min(items/5,availableLargeItems);

        int smallPackages = Math.min(items - largePackages * 5,availableSmallItems);

        return largePackages + smallPackages;

    }
}
