package sis.pewpew.library;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;


public class MarkerLibrary {
    GoogleMap mMap;

    private LatLng[] points = new LatLng[1000];

    {
        points[0] = new LatLng(56, 89);
        points[1] = new LatLng(76, 89);
        points[2] = new LatLng(78, 56);
    }


}
