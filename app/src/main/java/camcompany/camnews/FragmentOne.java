package camcompany.camnews;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import camcompany.camnews.News;
import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.List;

import camcompany.camnews.DetailsActivity;


public class FragmentOne extends Fragment{

    //ArrayList<News> news;


    List<News> camNews = News.listAll(News.class);

    public FragmentOne() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //News nw = new News("Facebook reports jumps in profit", "lorem ipsum doler ammet", "23 August, 2017");
        //nw.save();
        //System.out.println(nw.getTitle());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //News mainNews = new News(1, "Facebook reports jumps in profit", "lorem ipsum doler ammet", "23 August, 2017");



        View view = inflater.inflate(R.layout.fragment_one, container, false);
        FloatingActionButton plus = (FloatingActionButton) view.findViewById(R.id.plus);
        RecyclerView vNews = (RecyclerView) view.findViewById(R.id.rvNews);
        //news = News.createNewsList();
        NewsAdapter camAdapter = new NewsAdapter(getActivity(), camNews);
        vNews.setAdapter(camAdapter);
        vNews.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;

    }


}
