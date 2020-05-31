package android.example.tourguide.ui.events;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.example.tourguide.R;
import android.widget.TextView;

public class EventFragment extends Fragment {

    // PUBLIC EVENTS
    TextView lightShow;
    TextView exhibition;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_events, container, false);

        lightShow = root.findViewById(R.id.light_info);
        exhibition = root.findViewById(R.id.ex_info);

        lightShow.setText("Every sunday evening authorities at AMU tell a story from the past using water fountains, lights and sound effects. A must visit event of AMU."+
                "\n\n"+"7:00 pm"+"\n\n"+"Central Park, AMU"+"\n");

        exhibition.setText("Every year a large group of people organizes the biggest exhibition in Aligarh which is visited by more than half a million people from more than 10 districts and cities. It have rides, food stalls, gift shops and gaming arenas."+
                "\n\n"+"20th Jan - 26th Feb"+"\n\n"+"Exhibition ground"+"\n");
        return root;

    }
}
