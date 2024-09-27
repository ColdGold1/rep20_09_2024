package streamt.terminal;

import java.util.Random;

public record SeatST(char rowMarker, int seatNumber, boolean isReversed) {

    public SeatST(char rowMarker, int seatNumber) {
//        this(rowMarker, seatNumber, new Random().nextBoolean());
        this(rowMarker, seatNumber, false);
    }
}
