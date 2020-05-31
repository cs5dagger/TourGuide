package android.example.tourguide.ui.top;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.example.tourguide.R;
import android.widget.TextView;

public class AttractionsFragment extends Fragment {

    // RESTAURANTS
    TextView fort_info;
    TextView amu_info;
    TextView museum_info;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_attractions, container, false);

        fort_info = root.findViewById(R.id.fort_info);
        amu_info = root.findViewById(R.id.amu_info);
        museum_info = root.findViewById(R.id.museum_info);

        fort_info.setText("The Aligarh Fort is an important historical landmark in the city of Aligarh. It was built during the reign of Ibrahim Lodi, during the early 16th century. The fort has been a witness to the various historical upheavals in Aligarh. It played an important part in the battle of Aligarh in 1803 between the French and British forces. The control of the fort was seized by the British forces after the battle. The fort rests on a hilltop. At present, it is under the control of Aligarh Muslim University. The architecture of the fort is attributed to the work of French engineers. It is said to be one of the strongest forts in India."+"\n");
        amu_info.setText("Aligarh Muslim University is a public central university in Aligarh, India, which was originally established by Syed Ahmad Khan as the Muhammadan Anglo-Oriental College in 1875. Muhammadan Anglo-Oriental College became Aligarh Muslim University in 1920, following the Aligarh Muslim University Act. It has three off-campus centres in Malappuram, AMU Murshidabad centre, and Kishanganj Centre. The university offers more than 300 courses in traditional and modern branches of education, and is an institute of national importance, under the declared under seventh schedule of the Constitution of India at its commencement."+"\n");
        museum_info.setText("Centrally located in the heart of AMU, this was the house of the founder, Sir Syed Ahmed Khan.The place gives information about the history of Aligarh Muslim University as well as its founder.Nice to see AMU , maintaining museum for its founder. Though small provides enough information for the place and person.You also come to know about the stalwarts who were linked to this place and institution. Well maintained lush green place with Grand Mosque attached to it."+"\n");
        return root;
    }
}
