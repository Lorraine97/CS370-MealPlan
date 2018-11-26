package emory.mealplan;

import java.util.ArrayList;
import com.google.android.gms.maps.GoogleMap;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class PinDrop extends MapsActivity{
    ArrayList poiList;

    public PinDrop(GoogleMap current, ArrayList poiList) {

        drop(current, poiList);
    }


    void drop(GoogleMap currentMap, ArrayList<poi> POI){
        this.poiList=POI;

        for(int i=0; i<poiList.size();i++){
            poi current = poiList.get(i);
            LatLng newMarker = new LatLng(current.getX(),current.getY());
            currentMap.addMarker(new MarkerOptions().position(newMarker).alpha(0.1f));
        }


    }

}

