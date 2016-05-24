package kr.hs.emirim.duckbill0316.viewflippertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ViewFlipper viewFlip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butPrev=(Button)findViewById(R.id.but_prev);
        Button butNext=(Button)findViewById(R.id.but_next); // 형변환을 해주어야 한다! (안그러면 view값으로 반환된다!)
        //참조형 변수에 객체를 생성 하였다.

        butPrev.setOnClickListener(this);
        butNext.setOnClickListener(this); //onClickLinstener 실행 : 클릭 후 실행됨!
        viewFlip=(ViewFlipper)findViewById(R.id.view_flip);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.but_prev :
                viewFlip.showPrevious(); //이전 화면 실행
                break;
            case R.id.but_next :
                viewFlip.showNext(); //이후 화면 실행
                break;

        }
    }
}
