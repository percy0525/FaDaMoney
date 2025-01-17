package com.example.test;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class TabFragment7 extends Fragment {

    private View v;
    private Button button1;
    private Button button2;
    private Button button3;

    public static TabFragment7 newInstance() {
        TabFragment7 f = new TabFragment7();
        Bundle arg = new Bundle();
        f.setArguments(arg);
        return f;
    }

    public TabFragment7() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.tab_fragment7, container, false);
        SharedPreferences settings = this.getActivity().getSharedPreferences("myPre", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = settings.edit();

        button1 = v.findViewById(R.id.button_cancel);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changefragmet(TabFragment1.newInstance());
            }
        });
        button2 = v.findViewById(R.id.button_zero);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity xxx = (MainActivity) getActivity();
                xxx.score = 0;
                xxx.score_rate = 1;
                xxx.exp = 0;
                xxx.level = 1;
                xxx.fadamoney = 100;
                xxx.sec = 1000;
                xxx.Socre_text.setText("0");
                xxx.textlevel.setText("等級: 1");
                xxx.job = "職位: 無業";
                xxx.job_text.setText(xxx.job);
                xxx.levelpoint = 0;
                /////數值////
                xxx.exaggerate = 1;
                xxx.blame = 1;
                xxx.charm = 1;
                ////站台///
                xxx.binbin = 0;
                xxx.inwen = 0;
                xxx.gwochun = 0;
                xxx.gwenchun = 0;
                xxx.suport1.setVisibility(View.INVISIBLE);
                xxx.suport2.setVisibility(View.INVISIBLE);
                xxx.suport3.setVisibility(View.INVISIBLE);
                xxx.suport4.setVisibility(View.INVISIBLE);
                ///道具///
                xxx.LL = 0;
                xxx.TW = 0;
                xxx.CH = 0;
                xxx.road =0;
                xxx.Inf = 0;
                xxx.cute = 0;
                xxx.setBack(1);
                xxx.background=1;
                xxx.littleback1.setVisibility(View.INVISIBLE);
                xxx.littleback2.setVisibility(View.INVISIBLE);
                xxx.littleback3.setVisibility(View.INVISIBLE);
                xxx.littleback4.setVisibility(View.INVISIBLE);
                xxx.littleback5.setVisibility(View.INVISIBLE);
                xxx.littleback6.setVisibility(View.INVISIBLE);
                xxx.maxexp_view.setMin(0);
                xxx.maxexp_view.setMax(1000);
                ////////////////為了按鍵解鎖//////////////////
                editor.putInt("level", xxx.level).commit();
                editor.putInt("b_able1", 0).commit();
                editor.putInt("b_able2", 0).commit();
                editor.putInt("b_able3", 0).commit();
            }
        });
        button3 = v.findViewById(R.id.onemili);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity xxx = (MainActivity) getActivity();
                xxx.score = xxx.score+1000000;
                xxx.exp = xxx.exp+1000000;
            }
        });
        return v;
    }

    private void changefragmet(android.support.v4.app.Fragment f) {
        android.support.v4.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.layout_fragment, f);
        transaction.commitNowAllowingStateLoss();
    }
}