package com.robot.trafficofficerrobot;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FeaturesFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FeaturesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FeaturesFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters

    private OnFragmentInteractionListener mListener;

    public FeaturesFragment() {
        // Required empty public constructor
    }


    public static FeaturesFragment newInstance() {
        FeaturesFragment fragment = new FeaturesFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_features, container, false);
        RecyclerView recyclerView=view.findViewById(R.id.recyclerView);
        List<Feature> features= initializeFeatures();
        FeaturesAdapter featuresAdapter= new FeaturesAdapter(getActivity(),features);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(featuresAdapter);

        return view;
    }

    public ArrayList<Feature> initializeFeatures(){
        ArrayList<Feature> features = new ArrayList<>();
        features.add(new Feature("Movements", "- The robot can move left, right, forwards or backwards"));
        features.add(new Feature("Traffic Control","- The robot can pull out traffic signs\n" +
                "- The robot can direct traffic to control heavy traffic\n" +
                "- The robot controls the traffic by hands"));
        features.add(new Feature("Road Maintenance","- The robot can close roads for construction\n" +
                "- The robot can open the roads after the construction is over\n" +
                "- The robot can help removing things that were used for construction"));
        features.add(new Feature("Accidents","- The robot can act as a witness in case of any accident\n" +
                "- The robot can make calls to anyone"));
        features.add(new Feature("Warnings/Tickets","- The robot can write tickets\n" +
                "The robot can issue warnings"));
        features.add(new Feature("Surveillance Device", "- The robot acts as a surveillance device/camera"));
        features.add(new Feature("Voice Command","- The robot can be controlled by voice commands"));

        return features;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }
//
    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
