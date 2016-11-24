package com.agroho.restbarta.restbartamobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.agroho.restbarta.restbartamobile.httpchild.ChildCall;
import com.agroho.restbarta.restbartamobile.httpchild.ChildCallInterface;
import com.agroho.restbarta.restbartamobile.model.Child;
import com.agroho.restbarta.restbartamobile.model.ChildResponseQuestion;
import com.agroho.restbarta.restbartamobile.model.Parent;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    List<Child> children;
    Button button, childSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ChildCallInterface apiService = ChildCall.getClient().create(ChildCallInterface.class);

        button = (Button)findViewById(R.id.button);
        childSubmitButton = (Button)findViewById(R.id.childButton);

        childSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                List<ChildResponseQuestion> childResponseList = new ArrayList<ChildResponseQuestion>();
                childResponseList.add(new ChildResponseQuestion(1, true));
                childResponseList.add(new ChildResponseQuestion(2, true));
                childResponseList.add(new ChildResponseQuestion(3, false));

                Child child = new Child("Neta", 19, childResponseList, new Parent(1L));

                Call<Void> childCall = apiService.submitChildResult(child);

                childCall.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {
                        Log.d("Response status code: ", "Response status code"+response.code());
                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {
                        Log.e("Error in POST", t.getMessage());

                    }
                });
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Call<List<Child>> childCall = apiService.getChildList();

                childCall.enqueue(new Callback<List<Child>>() {
                    @Override
                    public void onResponse(Call<List<Child>> call, Response<List<Child>> response) {
                        children = response.body();
                        Log.d("No of Child: ",""+children.size());
                    }

                    @Override
                    public void onFailure(Call<List<Child>> call, Throwable t) {
                        Log.d("Retrofit Error",t.getMessage());

                    }
                });

              /*  childCall.enqueue(new Callback<ChildList>() {
                    @Override
                    public void onResponse(Call<ChildList> call, Response<ChildList> response) {
                        children = response.body().getChildList();
                        Log.d("Child Response","Child Response: "+children.get(0).getName());
                    }

                    @Override
                    public void onFailure(Call<ChildList> call, Throwable t) {
                        Log.d("Error",t.getMessage());
                    }
                });*/
            }
        });


        Log.d("END","END");
    }
}
