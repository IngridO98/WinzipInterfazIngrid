package com.example.winzipinterfazingrid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyFilesFragment extends Fragment {

    ArrayList<MyFiles> listaMyFiles;
    private RecyclerView recyclermyfiles;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_myfiles,container,false);
        listaMyFiles =new ArrayList<>();
        recyclermyfiles =(RecyclerView) view.findViewById(R.id.MyFilesRecycler);
        recyclermyfiles.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarPrincipal();
        AdaptadorMyFiles adapter= new AdaptadorMyFiles(listaMyFiles);
        recyclermyfiles.setAdapter(adapter);
        return view;
    }

    public void llenarPrincipal(){
        listaMyFiles.add(new MyFiles("Alarms","0 items 2018-12-31 3:06 p. m."));
        listaMyFiles.add(new MyFiles("Android","4 items 2020-01-27 8:00 p. m."));
        listaMyFiles.add(new MyFiles("Bytedance","2 items 2020-05-1 4:18 p. m."));
        listaMyFiles.add(new MyFiles("ccmini","0 items 2020-01-29 4:08 a. m."));
        listaMyFiles.add(new MyFiles("com.facebook.katana","1 items 2019-10-11 11:03 p. m."));
        listaMyFiles.add(new MyFiles("com.facebook.orca","1 items 2019-08-14 12:50 p. m."));
        listaMyFiles.add(new MyFiles("com.garena.msdk","1 items 20-07-25 3:45 p. m."));
        listaMyFiles.add(new MyFiles("com.lomotif.android","0 items 2019-07-17 10:12 p. m."));
        listaMyFiles.add(new MyFiles("data","0 items 2020-02-11 10:13 p. m."));
        listaMyFiles.add(new MyFiles("DCIM","16 items 2020-05-17 12:043 p. m."));
        listaMyFiles.add(new MyFiles("Documents","1 items 2020-07-25 4:13 p. m."));
        listaMyFiles.add(new MyFiles("Download","190 items 2020-07-20 11:33 p. m."));
        listaMyFiles.add(new MyFiles("FaceApp","4 items 2020-06-18 11:17 p. m."));
        listaMyFiles.add(new MyFiles("HandyGPS","4 items 2020-02-25 7:11 p. m."));
        listaMyFiles.add(new MyFiles("inshot","5 items 2020-07-20 6:36 p. m."));
        listaMyFiles.add(new MyFiles("LazyList","0 items 2020-05-17 6:54 p. m."));
    }
}
