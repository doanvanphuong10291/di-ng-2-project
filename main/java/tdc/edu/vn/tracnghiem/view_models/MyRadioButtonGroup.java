package tdc.edu.vn.tracnghiem.view_models;

import android.view.View;
import android.widget.RadioButton;

import java.util.ArrayList;

public class MyRadioButtonGroup {
    private ArrayList<RadioButton> ArrRbtn ;

    public MyRadioButtonGroup(RadioButton... ArrRbtn)
    {
        this.ArrRbtn = new ArrayList<RadioButton>();
        for (RadioButton rad:ArrRbtn)
        {
            rad.setOnClickListener(onLick);
            this.ArrRbtn.add(rad);
        }
    }

    View.OnClickListener onLick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            for (RadioButton rad:ArrRbtn)
            {
                rad.setChecked(false);
            }
            ((RadioButton) v).setChecked(true);
        }
    };
}
