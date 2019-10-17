package ishiicai.shohoku.ac.jp.screentransition;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends Activity{
    int count = 1;
    @override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        //ボタンを押したときにイベントを取得できるようにする
        Button button = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @override
            public void onClick(View v){
                if(count == 1){
                    //変更したいレイアウトを取得する
                    LinearLayout layout = (ListenerLayout) findViewById((R.id.listenerlayout1);
                    //ﾚｲｱｳﾄをビューをすべて削除する
                    layout.removeAllViews();
                    //レイアウトをR.layout.sampleに変更する
                    getLayoutInflater().inflate(R.layout.view2, layout);
                    count=2;
                }else if (count == 2){
                    LinearLayout Layout = (LinearLayout) findViewById(R.id.linearlayout2);
                    layout.removeAllViews();
                    getLayoutInflater().Inflater().inflate(R.layout.view1, layout);
                    count=1;
            }
        }
    });
    }
/*
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
*/