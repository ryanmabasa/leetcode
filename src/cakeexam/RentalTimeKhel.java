package cakeexam;

import java.util.Date;

public class RentalTimeKhel {
    private Date start, end;

    public RentalTimeKhel(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return this.start;
    }

    public Date getEnd() {
        return this.end;
    }

    @Override
    public String toString() {
        return "RentalTime{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
