package cakeexam;

import day1.PivotIndex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        NodeKhel leaf1 = new NodeKhel(null, null);
        NodeKhel leaf2 = new NodeKhel(null, null);
        NodeKhel node = new NodeKhel(leaf1, null);
        NodeKhel root = new NodeKhel(node, leaf2);

        System.out.println("Nodekhel:" + leaf2.height());

        Node l1 = new Node(null, null,4);
        Node l2 = new Node(null, null,2);
        Node n = new Node(l1, null,3);
        Node r = new Node(n, l2,1);

        System.out.println("Nodemon" + l2.getHeight(l2));

        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y H:m");

        ArrayList<RentalTimeKhel> rentalTimesKhel = new ArrayList<RentalTimeKhel>();
        rentalTimesKhel.add(new RentalTimeKhel(sdf.parse("03/05/2020 19:00"), sdf.parse("03/05/2020 20:30")));
        rentalTimesKhel.add(new RentalTimeKhel(sdf.parse("03/05/2020 21:59"), sdf.parse("03/05/2020 22:30")));
        rentalTimesKhel.add(new RentalTimeKhel(sdf.parse("03/05/2020 20:30"), sdf.parse("03/05/2020 22:00")));

        System.out.println(CarRentalKhel.canScheduleAll(rentalTimesKhel));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/y H:m");

        String str1 = "03/05/2020 19:00";
        LocalDateTime dateTime1 = LocalDateTime.parse(str1, formatter);

        String str2 = "03/05/2020 20:30";
        LocalDateTime dateTime2 = LocalDateTime.parse(str2, formatter);

        String str3 = "03/05/2020 21:59";
        LocalDateTime dateTime3 = LocalDateTime.parse(str3, formatter);

        String str4 = "03/05/2020 22:30";
        LocalDateTime dateTime4 = LocalDateTime.parse(str4, formatter);

        String str5 = "03/05/2020 20:30";
        LocalDateTime dateTime5 = LocalDateTime.parse(str5, formatter);

        String str6 = "03/05/2020 22:00";
        LocalDateTime dateTime6 = LocalDateTime.parse(str6, formatter);


        List<RentalTime> a = List.of(
            new RentalTime(dateTime1,dateTime2),
                new RentalTime(dateTime3,dateTime4),
                new RentalTime(dateTime5,dateTime6)
        );

        System.out.println(CarRental.canScheduleAll(a));

        System.out.println(Packages.calculatePackages(16,2,10));

    }


}