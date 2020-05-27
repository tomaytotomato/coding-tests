package tomaytotomato;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HotelDoorsTest
{

    @Test
    public void hotelDoors_ValidInput() {
        assertThat(HotelDoors.hotelDoors(3)).isEqualTo(1);
        assertThat(HotelDoors.hotelDoors(500)).isEqualTo(22);
        assertThat(HotelDoors.hotelDoors(667)).isEqualTo(25);
    }

    @Test
    public void hotelDoors_InvalidInput() {
        assertThat(HotelDoors.hotelDoors(0)).isEqualTo(0);
        assertThat(HotelDoors.hotelDoors(-2)).isEqualTo(0);
    }

    @Test
    public void hotelDoorsOptimised_ValidInput() {
        assertThat(HotelDoors.hotelDoorsOptimised(3)).isEqualTo(1);
        assertThat(HotelDoors.hotelDoorsOptimised(500)).isEqualTo(22);
        assertThat(HotelDoors.hotelDoorsOptimised(667)).isEqualTo(25);
    }

    @Test
    public void hotelDoorsOptimised_InvalidInput() {
        assertThat(HotelDoors.hotelDoorsOptimised(0)).isEqualTo(0);
        assertThat(HotelDoors.hotelDoorsOptimised(-2)).isEqualTo(0);
    }
}
