package cakeexam;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarRental {

    public static Boolean canScheduleAll(Collection<RentalTime> coll) {

        List<RentalTime> rentalTimes = coll.stream()
                .sorted(Comparator.comparing(RentalTime::getStart))
                .collect(Collectors.toList());

        for(int i=1; i<rentalTimes.size();i++){

            RentalTime prev = rentalTimes.get(i-1);
            RentalTime current = rentalTimes.get(i);
            if(prev.getEnd().isAfter(current.getStart())){
                return false;
            }
        }

        return true;
    }
}
