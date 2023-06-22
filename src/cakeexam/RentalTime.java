package cakeexam;

import java.time.LocalDate;
import java.time.LocalDateTime;

class RentalTime {
    private LocalDateTime start, end;

    public RentalTime(LocalDateTime start, LocalDateTime end) {
        this.start = start;
        this.end = end;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "RentalTime{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
