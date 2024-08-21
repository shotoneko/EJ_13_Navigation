package modulo_04.ej_13_navigation;

import static androidx.navigation.Navigation.findNavController;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import modulo_04.ej_13_navigation.databinding.FragmentHellowBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HellowFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HellowFragment extends Fragment {
    TextView tv;
    FragmentHellowBinding bind;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HellowFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HellowFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HellowFragment newInstance(String param1, String param2) {
        HellowFragment fragment = new HellowFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        bind = FragmentHellowBinding.inflate(inflater, container, false);
        return bind.getRoot();
    }
    public void onViewCreated(View view, Bundle savedInstanceState){
        assert getArguments() != null;
        tv = bind.tvHola;
        tv.setText(getArguments().getString("nombreJugador"));

    }
}