package cakeexam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class CarRentalKhel {
    public static Boolean canScheduleAll(Collection<RentalTimeKhel> rentalTimes) {
        ArrayList<RentalTimeKhel> rentalTimesArrayList = rentalTimes.stream().collect(Collectors.toCollection(ArrayList::new));

        rentalTimesArrayList.sort((Comparator.comparing(RentalTimeKhel::getStart)));

        for(int i =0; i<rentalTimesArrayList.size()-1;i++){
            if(rentalTimesArrayList.get(i).getEnd().after(rentalTimesArrayList.get(i+1).getStart()))
                return false;
        }
        return true;
    }
}
