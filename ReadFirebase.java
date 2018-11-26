package emory.mealplan;
import java.util.ArrayList;
import com.google.firebase.*;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class ReadFirebase extends MapsActivity {

    ArrayList<poi> result;

    public ReadFirebase(ArrayList<poi> result){
        this.result = result;
    }




        // Get a reference to our posts
    FirebaseDatabase mFirebase = FirebaseDatabase.getInstance();
    DatabaseReference ref = mFirebase.getReference("https://mealplan-8c4d4.firebaseio.com/");

    //modify this to add queries
    //sample: dinosaursRef.orderByChild("weight").limitToLast(2).addChildEventListener(new ChildEventListener() {
    ref.addValueEventListener(new ValueEventListener() {
        @Override
        public void onDataChange (DataSnapshot dataSnapshot) {
            for(DataSnapshot ds : dataSnapshot.getChildren()) {
                poi mPoi = new poi();
                mPoi.setPoiName(ds.child("name").getValue(String.class)); //set the name
                mPoi.setPoiName(ds.child("X").getValue(Double.class)); //set the X
                mPoi.setPoiName(ds.child("Y").getValue(Double.class)); //set the Y
                result.add(mPoi);
            }
        }

        @Override
        public void onCancelled (DatabaseError databaseError) {
        }
    });

}

