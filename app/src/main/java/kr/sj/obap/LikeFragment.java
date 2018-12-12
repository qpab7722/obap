package kr.sj.obap;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Date;

public class LikeFragment extends Fragment {

    TextView  tv_mornig,tv_lunch,tv_dinner;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_diary,null);

        ImageView iv_mcam=(ImageView) view.findViewById(R.id.iv_moringcam);
        iv_mcam.setOnClickListener(mCamClickListener);
        ImageView iv_lcam=(ImageView) view.findViewById(R.id.iv_lunchcam);
        iv_lcam.setOnClickListener(mCamClickListener);
        ImageView iv_dcam=(ImageView) view.findViewById(R.id.iv_dinnercam);
        iv_dcam.setOnClickListener(mCamClickListener);

        ImageView iv_mserch=(ImageView) view.findViewById(R.id.iv_moringserch);
        iv_mserch.setOnClickListener(mSerchClickListener);
        ImageView iv_lserch=(ImageView) view.findViewById(R.id.iv_lunchserch);
        iv_lserch.setOnClickListener(mSerchClickListener);
        ImageView iv_dserch=(ImageView) view.findViewById(R.id.iv_dinnerserch);
        iv_dserch.setOnClickListener(mSerchClickListener);


        tv_mornig=(TextView)view.findViewById(R.id.tv_breakfast);
        tv_lunch=(TextView)view.findViewById(R.id.tv_lunch);
        tv_dinner=(TextView)view.findViewById(R.id.tv_dinner);

        MainActivity.dbHelper.insertUserNutColumn(1.1f,2.2f,3.3f,4.4f,5.5f,6.6f,7.8f,8.9f);
        load_values();
        return view;
    }

    Button.OnClickListener mCamClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            ((MainActivity)getActivity()).captureCamera();
        }
    };

    Button.OnClickListener mSerchClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            Log.e("뭐지","ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ");
            //검색하여 입력완료시 실행하면 될듯
            MainActivity.dbHelper.insertUserMealColumn(20181220,"아침",3,1,5.0f);
            MainActivity.dbHelper.insertUserMealColumn(20181220,"점심",7,1,4.0f);
        }
    };

    private void load_values() {
        SQLiteDatabase db =  MainActivity.dbHelper.getReadableDatabase();
        int seldate = 20181214;
        //DBContract.TBL_USER_MEAL 테이블에서 DBContract.COL_DATE 의 콜롬에서 seldate를 찾는다
        //https://stackoverflow.com/questions/9280692/android-sqlite-select-query
        //https://mommoo.tistory.com/31
         Cursor cursor = db.rawQuery(DBContract.SQL_SELECT_USER_MEAL+" where "+DBContract.COL_DATE+" = '"+seldate+"'", null) ;

        while (cursor.moveToNext())  {
            // 값 가져오기.
            int id = cursor.getInt(0) ;
            int date = cursor.getInt(1) ;
            String time = cursor.getString(2) ;
            int foodid = cursor.getInt(3) ;
            int foodnum = cursor.getInt(4) ;
            int foodrate = cursor.getInt(5) ;

                if(time.equals("아침"))
                    tv_mornig.setText(id + " "+date+ " "+foodid+ " "+foodnum+ " "+foodrate);
                if(time.equals("점심"))
                    tv_lunch.setText(id + " "+date+ " "+foodid+ " "+foodnum+ " "+foodrate);
                if(time.equals("저녁"))
                    tv_dinner.setText(id + " "+date+ " "+foodid+ " "+foodnum+ " "+foodrate);


            Log.d("dkdkdkdkd",id + " "+date+ " "+foodid+ " "+foodnum+ " "+foodrate);
        }
        cursor.close();
        db.close();
    }
}
