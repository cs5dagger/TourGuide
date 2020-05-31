package android.example.tourguide.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.example.tourguide.R;

public class HomeFragment extends Fragment {

    // HOME
    TextView intro;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        intro = root.findViewById(R.id.intro_text);
        intro.setText("Aligarh is a District of Uttar Pradesh, India. The city is located about 90 miles (140 km) southeast of New Delhi. The administrative headquarters of Aligarh District is Aligarh(Koil). It is also commissionary HQ for all four Districts Aligarh itself, Hathras, Kasganj and Etah. It is mostly known as a university town where the famous Aligarh Muslim University is located. It is also well known District intenationally because of its lock industries. The recorded history of Aligarh begins with the establishment of the Aligarh Fort in the 16th century. It is a university town, notable as the seat of Aligarh Muslim University, which was founded here as Muhammadan Anglo-Oriental College in 1875, initiating the Aligarh movement.");

        return root;
    }
}
