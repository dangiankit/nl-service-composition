package edu.cmu.experiments.apis;

import java.util.Date;

/**
 * Created by oscarr on 8/8/18.
 */
public interface BookHotelService {

    String searchHotel(String destination, Date checkin, Date checkout, Double maxPrice);

    String bookHotel(String destination, Date checkin, Date checkout);
}