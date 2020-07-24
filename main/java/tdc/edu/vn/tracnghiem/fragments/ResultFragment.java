package tdc.edu.vn.tracnghiem.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import tdc.edu.vn.tracnghiem.R;
import tdc.edu.vn.tracnghiem.data_models.AbtractQuestion;
import tdc.edu.vn.tracnghiem.data_models.MatchingQuestion;
import tdc.edu.vn.tracnghiem.data_models.Question;


public class ResultFragment extends AbstractsFragment {


    ArrayAdapter<AbtractQuestion> adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentMultil = null;
        fragmentMultil = inflater.inflate(R.layout.result_layout,container,false);

        ListView listResult = fragmentMultil.findViewById(R.id.listResult);

        ArrayList<Question> listdataResult = new ArrayList<Question>();


        adapter = new ArrayAdapter<AbtractQuestion>(inflater.getContext(),android.R.layout.simple_list_item_1,Question.questions);
        listResult.setAdapter(adapter);


        return fragmentMultil;
    }



}
